package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="OfferDetails")
public class Offer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int offerId;
	private String offerCode;
	private String offerDescription;
	private Date startDate;
	private Date endDate;
	
	

}
