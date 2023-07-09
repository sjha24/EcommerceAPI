package com.saurav.EcommerceAPI.repository;

import com.saurav.EcommerceAPI.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface IOrderRepo extends CrudRepository<Order,Integer> {
}
