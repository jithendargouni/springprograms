package com.sathya.orm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {
	
	private int proid;
	private String proname;
	private double proprice;
}
