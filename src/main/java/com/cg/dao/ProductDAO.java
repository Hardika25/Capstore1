package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.Product;

public interface ProductDAO extends JpaRepository<Product,Integer> {

}
