package com.springboot.w3_pt.data.repository;

import com.springboot.w3_pt.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
