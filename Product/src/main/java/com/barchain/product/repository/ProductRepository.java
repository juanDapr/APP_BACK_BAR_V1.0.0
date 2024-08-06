package com.barchain.product.repository;


import com.barchain.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JuanD
 */
public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
