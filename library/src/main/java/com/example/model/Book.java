package com.example.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Book {

   @Id

   @GeneratedValue

   @NotNull
   private Long id;

   private String title;

   private String description;

   public Book(String title, String description) {

      this.title = title;

      this.description = description;

   }

}