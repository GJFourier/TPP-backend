package org.example.service;

import org.example.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrderByUserId(Long id);

    Order checkout(Long screeningId, Long userId, List<Long> seatIds);

    List<Order> getOrder(Long userId);

    Boolean cancelOrder(Long orderId);
}
