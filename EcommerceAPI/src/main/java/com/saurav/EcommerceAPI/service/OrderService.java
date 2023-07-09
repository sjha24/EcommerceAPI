package com.saurav.EcommerceAPI.service;

import com.saurav.EcommerceAPI.model.Order;
import com.saurav.EcommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public String addOrder(Order order) {
        if(order != null){
            orderRepo.save(order);
            return "Your order is received";
        }
        return "Order Not received!!!";
    }

    public String deleteOrderById(Integer id) {
        if(id != null){
            orderRepo.deleteById(id);
            return "Order deleted successful";
        }
        return "Not deleted";
    }

    public Optional<Order> getOrderById(Integer orderId) {
        if(orderId != null){
            return orderRepo.findById(orderId);
        }
        return null;
    }
}
