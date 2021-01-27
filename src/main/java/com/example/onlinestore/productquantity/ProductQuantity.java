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
    private long id;

    @ManyToOne(targetEntity = Product.class)
    private Product product;

    private double price;

    private int quantity;
}
