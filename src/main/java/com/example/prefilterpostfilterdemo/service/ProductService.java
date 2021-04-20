package com.example.prefilterpostfilterdemo.service;

import com.example.prefilterpostfilterdemo.model.Product;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @PreFilter("filterObject.owner == authentication.name")
    public List<Product> sellProducts(List<Product> products){
        return products;
    }

}
