package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User{
	@Id
	@GeneratedValue
	private String id;
	
	private String name;
	
	private String email;
	
	public User(String id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
}