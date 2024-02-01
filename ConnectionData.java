package com.xworkz.country.constants;

public enum ConnectionData {
	URL("jdbc:mysql://localhost:3306/country_table"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	 private String value;

	private ConnectionData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	

}

