package org.example.dao;

import org.example.entity.OrderItem;
import org.example.repository.OrderItemRepository;

public interface OrderItemDao {
    void save(OrderItem orderItem);

    void delete(OrderItem orderItem);
}
