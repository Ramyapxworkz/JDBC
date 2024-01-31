package com.xworkz.books.constants;

public enum ConstantData {
   URL("jdbc:mysql://localhost:3306/Books"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private String value;
	

	public String getValue() {
		return value;
	}

	private ConstantData(String value) {
		this.value = value;
	}
	
	
	
}
