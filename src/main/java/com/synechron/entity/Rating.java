package com.synechron.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rating {

	@Id
	@GeneratedValue()
	private String ratingId;
	private Float rating;

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", rating=" + rating + "]";
	}

}
