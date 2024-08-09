/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barchain.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author JuanD
 */

@Entity
@Data
public class Product {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   private String name;
   private String code;
   private String price;
   private String description;
}
