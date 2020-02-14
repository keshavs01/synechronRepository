package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="UserDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRegistration {
	
	
	  @Id	  
	  @GeneratedValue(strategy=GenerationType.AUTO) 
	  private int id;	 
	
	
	private String userId;
	
	private String password;
	
	private String fullName;
	private String email_id;
	private long ph_number;
	private boolean isAdmin;
	

}
