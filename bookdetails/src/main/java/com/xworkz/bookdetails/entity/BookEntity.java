package com.xworkz.bookdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bookinfo")
public class BookEntity {
	
	@Id
	@Column(name="Book_Id")
  private int id;
	@Column(name="Book_Name")
  private String name;
	@Column(name="author")
  private String author;
	@Column(name="published_by")
  private String published;	
	@Column(name="published_year")
  private int year;
	@Column(name="cost")
  private float cost;
  
}
