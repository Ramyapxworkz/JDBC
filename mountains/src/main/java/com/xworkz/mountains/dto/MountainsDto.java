package com.xworkz.mountains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MountainsDto {
	private String name;
    private double height;
    private String country;
    private String range;
    private int prominence;
    

}
