package com.xworkz.bank.runner;

import java.time.LocalDate;

import com.xworkz.bankaccount.constans.ConnectionData;
import com.xworkz.bankaccount.dto.BankAcoountDto;
import com.xworkz.bankaccount.service.BankAcoountService;
import com.xworkz.bankaccount.service.BankAcoountServiceImpl;

public class BankRunner {
	public static void main(String[] args) {
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/bank_database");
		ConnectionData.USER_NAME.setValue("root");
		ConnectionData.PASSWORD.setValue("Xworkzodc@123");
		BankAcoountService service=new BankAcoountServiceImpl();
		BankAcoountDto dto=new BankAcoountDto();
		dto.setCustomer_Name("Ramya");
		dto.setAccount_no(1234567893);
		dto.setDob(LocalDate.now());
		dto.setPhone(9876543211l);
		dto.setEmail("ramyap@gmail.com");
		dto.setAdress("Davanagere");
		dto.setBankName("Canara");
		dto.setIfsc("CNRB097533");
		dto.setBranch_Code(1234);
		dto.setBranch_name("Tanigere");
		service.save(dto);
		
	}
	

}
