package com.saurav.EcommerceAPI.controller;
import com.saurav.EcommerceAPI.model.Order;
import com.saurav.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("add")
    public String addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrderById(@PathVariable Integer id){
        return orderService.deleteOrderById(id);
    }

    @GetMapping("/by/{orderId}")
    public Optional<Order> getOrderById(@PathVariable Integer orderId){
        return orderService.getOrderById(orderId);
    }
}
