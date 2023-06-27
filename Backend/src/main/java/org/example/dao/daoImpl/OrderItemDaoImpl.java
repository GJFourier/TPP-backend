package org.example.dao.daoImpl;

import org.example.dao.OrderItemDao;
import org.example.entity.OrderItem;
import org.example.repository.OrderItemRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderItemDaoImpl implements OrderItemDao {
    private final OrderItemRepository orderItemRepository;

    public OrderItemDaoImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public void save(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }

    @Override
    public void delete(OrderItem orderItem) {
        orderItemRepository.delete(orderItem);
    }
}
