package com.example.onlinestore.productquantity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.onlinestore.product.Product;

import lombok.Data;

@Data
@Entity
public class ProductQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne(targetEntity = Product.class)
    Product product;

    double price;

    int quantity;
}
