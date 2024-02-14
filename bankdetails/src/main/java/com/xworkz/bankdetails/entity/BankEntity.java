package com.xworkz.bankdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="account_details")
public class BankEntity {
	@Id
	@Column(name="customer_id")
	private int id;
	@Column(name="account_holder_name")
	private String name;
	@Column(name="contact_number")
	private long number;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;

}
