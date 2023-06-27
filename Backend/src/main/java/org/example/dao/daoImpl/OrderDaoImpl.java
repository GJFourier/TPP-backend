package org.example.dao.daoImpl;

import org.example.dao.OrderDao;
import org.example.entity.Order;
import org.example.entity.Seat;
import org.example.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    private final OrderRepository orderRepository;

    public OrderDaoImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrderByUserId(Long id) {
        return orderRepository.getOrderByUserId(id);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.getOrderById(orderId);
    }

    @Override
    public void delete(Order order) {
        orderRepository.delete(order);
    }
}
