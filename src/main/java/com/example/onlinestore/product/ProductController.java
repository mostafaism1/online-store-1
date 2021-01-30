package com.example.onlinestore.product;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/products/", produces = "application/json")
@CrossOrigin
public class ProductController {

    private final ProductRepository productRepo;

    @GetMapping(produces = "application/json")
    public List<Product> getAllProducts() {
        List<Product> products = productRepo.findAll();
        return products;
    }

}
