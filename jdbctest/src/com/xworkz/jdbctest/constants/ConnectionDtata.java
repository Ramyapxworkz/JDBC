package com.xworkz.jdbctest.constants;

public enum ConnectionDtata {
URL("jdbc:mysql://localhost:3306/jdbc_test"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private String value;

	public String getValue() {
		return value;
	}

	

	private ConnectionDtata(String value) {
		this.value = value;
	}
	
}
