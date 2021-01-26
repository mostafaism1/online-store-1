package com.example.onlinestore.orders;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.example.onlinestore.productquantity.ProductQuantity;
import com.example.onlinestore.users.User;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Temporal(TemporalType.DATE)
    Date placedAt;

    @ManyToOne(targetEntity = User.class)
    User user;

    @ManyToMany(targetEntity = ProductQuantity.class)
    @Size(min = 1)
    List<ProductQuantity> productQuantities;

}
