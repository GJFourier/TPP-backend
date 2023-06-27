package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.Order;
import org.example.entity.OrderItem;
import org.example.entity.Seat;

import java.util.*;

@Getter
@Setter
public class OrderDTO {
    private Long id;
    private Date time;
    private String filmName;
    private String filmImage;
    private String cinemaName;
    private List<SeatDTO> seats;
    private Map<Long,String> customText;
    private Double price;
    public OrderDTO(Order order){
        this.id = order.getId();
        this.time = order.getScreening().getStartTime();
        this.filmName = order.getScreening().getFilm().getName();
        this.filmImage = order.getScreening().getFilm().getImage();
        this.cinemaName = order.getScreening().getCinema().getName();
        this.price = order.getTotalPrice();
        this.seats=new ArrayList<SeatDTO>();
//        for(Seat seat:order.getSeats()){
//            this.seats.add(new SeatDTO(seat));
//        }
        for(OrderItem orderItem:order.getOrderItems()){
            this.seats.add(new SeatDTO(orderItem.getSeat()));
        }
        this.customText=new HashMap<>();
    }
}
