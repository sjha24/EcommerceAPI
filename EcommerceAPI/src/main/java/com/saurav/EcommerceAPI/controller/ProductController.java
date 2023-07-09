package com.saurav.EcommerceAPI.controller;
import com.saurav.EcommerceAPI.model.Product;
import com.saurav.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public String addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping("/by/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }

    @DeleteMapping("/{productId}")
    public String deleteProductByProductId(@PathVariable Integer productId){
        return productService.deleteProductByProductId(productId);
    }
}
