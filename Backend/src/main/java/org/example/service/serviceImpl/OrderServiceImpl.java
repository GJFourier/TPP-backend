package org.example.service.serviceImpl;

import org.example.dao.*;
import org.example.entity.*;
import org.example.service.OrderService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;
    private final OrderItemDao orderItemDao;
    private final SeatDao seatDao;
    private final ScreeningDao screeningDao;
    private final UserDao userDao;

    public OrderServiceImpl(OrderDao orderDao, OrderItemDao orderItemDao, SeatDao seatDao, ScreeningDao screeningDao, UserDao userDao) {
        this.orderDao = orderDao;
        this.orderItemDao = orderItemDao;
        this.seatDao = seatDao;
        this.screeningDao = screeningDao;
        this.userDao = userDao;
    }


    @Override
    public List<Order> getOrderByUserId(Long id) {
        return orderDao.getOrderByUserId(id);
    }

    @Override
    public Order checkout(Long screeningId, Long userId, List<Long> seatIds) {

        //create order
        Screening screening = screeningDao.getScreeningById(screeningId);
        User user = userDao.getUserById(userId);
        if(screening == null || user == null) {
            return null;
        }
        Order order = new Order();



        order.setScreening(screening);
        order.setUser(user);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date purchaseDate = new Date(System.currentTimeMillis());
        order.setPurchaseTime(purchaseDate);

        Double totalPrice = screening.getPrice() * seatIds.size();
        order.setTotalPrice(totalPrice);

        orderDao.save(order);


        for(Long seatId : seatIds) {
            OrderItem orderItem = new OrderItem();
            orderItem.setSeat(seatDao.getSeatById(seatId));
            orderItem.setOrder(order);
            orderItemDao.save(orderItem);
        }
        List<Seat> seats = new ArrayList<>();
        for(Long seatId : seatIds) {
            seats.add(seatDao.getSeatById(seatId));
        }


        //set seat status to occupied
        for (Long seatId : seatIds) {
            Seat seat = seatDao.getSeatById(seatId);
            seat.setIsSold(true);
//            seat.setOrder(order);
            seatDao.save(seat);
        }

        return order;
    }

    @Override
    public List<Order> getOrder(Long userId) {
        return orderDao.getOrderByUserId(userId);
    }

    @Override
    public Boolean cancelOrder(Long orderId) {
        Order order = orderDao.getOrderById(orderId);
        if(order == null) {
            return false;
        }
//        List<Seat> seats = order.getSeats();
//        for(Seat seat : seats) {
//            seat.setIsSold(false);
//            seatDao.save(seat);
//        }
        List<OrderItem> orderItems = order.getOrderItems();
        for(OrderItem orderItem:orderItems){
            Seat seat = orderItem.getSeat();
            seat.setIsSold(false);
            seatDao.save(seat);
            orderItemDao.delete(orderItem);
        }


        orderDao.delete(order);

        return true;
    }
}
