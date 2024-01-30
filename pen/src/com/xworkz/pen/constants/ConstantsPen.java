package com.xworkz.pen.constants;

public enum ConstantsPen {
	URL("jdbc:mysql://localhost:3306/pen1"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private String value;

	private ConstantsPen(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	
	

}
