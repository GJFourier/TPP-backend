package org.example.dao;

import org.example.entity.Order;

import java.util.List;

public interface OrderDao {

    List<Order> getOrderByUserId(Long id);

    void save(Order order);

    Order getOrderById(Long orderId);

    void delete(Order order);
}
