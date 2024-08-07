/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barchain.product.controller;

import com.barchain.product.entities.Product;
import com.barchain.product.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JuanD
 */
@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    ProductRepository ProductRepository;
    
    @GetMapping()
    public List<Product> list(){
        return ProductRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Product get (@PathVariable(name = "id") long id){
        return ProductRepository.findById(id).get();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity <?> put (@PathVariable(name = "id")long id, @RequestBody Product input){
        Product find = ProductRepository.findById(id).get();
        if (find != null) {
            find.setCode(input.getCode());
            find.setName(input.getCode());
            find.setPrice(input.getPrice());
        }
        Product save = ProductRepository.save(find);
        return ResponseEntity.ok(save);
    }
    
    @PostMapping
    public ResponseEntity<?> post (@RequestBody Product input){
        Product save = ProductRepository.save(input);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping
    public ResponseEntity<?> delete (@PathVariable(name ="id") long id ){
        Optional<Product> findById = ProductRepository.findById(id);
        if (findById.get() != null) {
            ProductRepository.delete(findById.get());
        }
        return ResponseEntity.ok().build();
    }
}
