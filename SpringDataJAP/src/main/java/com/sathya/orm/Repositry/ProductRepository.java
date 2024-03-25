package com.sathya.orm.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.orm.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
