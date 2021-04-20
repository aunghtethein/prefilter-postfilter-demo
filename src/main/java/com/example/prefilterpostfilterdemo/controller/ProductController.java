package com.example.prefilterpostfilterdemo.controller;

import com.example.prefilterpostfilterdemo.model.Product;
import com.example.prefilterpostfilterdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    //curl -u john:1234 localhost:8080/sell
    @GetMapping("/sell")
    public List<Product> sellProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("books","john"));
        products.add(new Product("candy","john"));
        products.add(new Product("chocolate","emma"));

        return service.sellProducts(products);
    }
}
