package com.sathya.orm.mapper;

import java.time.LocalDateTime;
import java.util.*;
import org.springframework.stereotype.Component;

import com.sathya.orm.entity.Product;
import com.sathya.orm.model.ProductDetails;

@Component
public class ProductMapper {
	
	//this method taking model class as a input and entity class as output
	public Product modelToEntityConvertion(ProductDetails productDetails)
	{
		//read the data from model class set to entity class
		
		Product product = new Product();
		product.setProid(productDetails.getProid());
		product.setProname(productDetails.getProname());
		product.setProprice(productDetails.getProprice());
		product.setCreateAt(LocalDateTime.now());
		product.setCreateBy(System.getProperty("user.name"));
		
		return product;
	}
	
	public List<Product> modelToEntityListConvertion(List<ProductDetails> productDetails)
	{
		List<Product> products = new ArrayList<Product>();
		
		//reading the data from model class and setting the data to entity class
		
		for(ProductDetails proDetail:productDetails)
		{
			Product product = new Product();
			
			product.setProid(proDetail.getProid());
			product.setProname(proDetail.getProname());
			product.setProprice(proDetail.getProprice());
			product.setCreateAt(LocalDateTime.now());
			product.setCreateBy(System.getProperty("user.name"));
			
			products.add(product);
			
		}
		return products;
	}
	
	

}
