package com.eshop.order.OrderService.controller;

import com.eshop.order.OrderService.model.Order;
import com.eshop.order.OrderService.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/eshop")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/addOrder")
    public Order addUser(@RequestBody Order order) {
        log.debug("Add Order : {}", order);
        return orderRepository.save(order);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> findAll() {
        log.debug("Get all orders ");
        List<Order> orderList = orderRepository.findAll();
        return ResponseEntity.ok(orderList);
    }
}
