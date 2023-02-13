package com.cisco.lombok.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.lombok.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
