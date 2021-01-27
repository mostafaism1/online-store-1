package com.example.onlinestore.reviews;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ReviewRepository extends JpaRepository<Review, Long> {

}
