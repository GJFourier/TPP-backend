package org.example.controller;

import jakarta.transaction.Transactional;
import org.example.dto.OrderDTO;
import org.example.entity.Order;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Transactional
public class OrderController {
    private final org.example.service.OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/api/order/checkout", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:3000")
    public Order checkout(@RequestParam("screeningId") Long screeningId, @RequestParam("userId") Long userId, @RequestBody List<Long> seatIds){
        return orderService.checkout(screeningId, userId, seatIds);
    }

    @RequestMapping(value = "/api/order/get", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<OrderDTO> getOrder(@RequestParam("userId") Long userId){
        return orderService.getOrder(userId).stream().map(OrderDTO::new).collect(Collectors.toList());
    }

    @RequestMapping(value = "/api/order/cancel", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:3000")
    public Boolean cancelOrder(@RequestParam("orderId") Long orderId){
        return orderService.cancelOrder(orderId);
    }
}