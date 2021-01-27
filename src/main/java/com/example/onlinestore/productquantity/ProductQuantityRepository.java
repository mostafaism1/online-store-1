package com.example.onlinestore.productquantity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductQuantityRepository extends JpaRepository<ProductQuantity, Long> {

}
