package com.example.onlinestore.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.onlinestore.product.Product;
import com.example.onlinestore.users.User;

import lombok.Data;

@Data
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int rating;

    private String comment;

    @ManyToOne(targetEntity = Product.class)
    private Product product;

    @ManyToOne(targetEntity = User.class)
    private User user;

}
