package com.saurav.EcommerceAPI.repository;
import com.saurav.EcommerceAPI.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findByProductCategory(String category);
}
