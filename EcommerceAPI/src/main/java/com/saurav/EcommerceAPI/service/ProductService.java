package com.saurav.EcommerceAPI.service;
import com.saurav.EcommerceAPI.model.Product;
import com.saurav.EcommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
    public String addProducts(List<Product> productList) {
        if(productList != null){
            productRepo.saveAll(productList);
            return "Product added successful";
        }
        return "Product not added";
    }

    public List<Product> getProductByCategory(String category) {
        return productRepo.findByProductCategory(category);
    }

    public String deleteProductByProductId(Integer productId) {
         if(productId != null){
             productRepo.deleteById(productId);
             return "This product id "+productId+" is removed from our database";
         }
         return "Not deleted !!!";
    }
}