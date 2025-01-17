package com.sathya.orm.mapper;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sathya.orm.Repositry.ProductRepository;
import com.sathya.orm.entity.Product;
import com.sathya.orm.model.ProductDetails;

@Component
public class ProductClient implements CommandLineRunner {
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductMapper mapper;

	@Override
	public void run(String... args) throws Exception {
		//model class data : having the values
		
		ProductDetails productDetails = new ProductDetails();
		
		productDetails.setProid(1001);
		productDetails.setProname("chinthapandu");
		productDetails.setProprice(220);
		
		//conversion of model class data to entity
		Product product = mapper.modelToEntityConvertion(productDetails);
		
		//conversion process
		 productRepository.save(product);
		 
		 
		 //saveall method
			ProductDetails p1 = new ProductDetails();
			
			p1.setProid(1002);
			p1.setProname("sugar");
			p1.setProprice(200);
			
			ProductDetails p2 = new ProductDetails();
			
			p2.setProid(1003);
			p2.setProname("salt");
			p2.setProprice(100);
			
			List<ProductDetails> proDetails = List.of(p1,p2);					
	
			//conversion of model class data to entity
		
			List<Product> products = mapper.modelToEntityListConvertion(proDetails);
			
			//convertion process
			productRepository.saveAll(products);
			

			Optional<Product>pr=productRepository.findById(1002);
			if(pr.isPresent())
			{
				System.out.println(pr);
			}
			else
			{
				System.out.println("your record is not present");
			}
			List<Product>pr1=productRepository.findAll();
			System.out.println(pr1);
			
			long count=productRepository.count();
			System.out.println("your records are....."+count);
			
			System.out.println("your record is "+" "+productRepository.existsById(100)+" "+"existed");
			
			productRepository.deleteById(1002);
			
			productRepository.deleteAll();
			
	}
 
}
