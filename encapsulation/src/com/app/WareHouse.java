package com.app;

public class WareHouse
{
	public Product[] addProducts()
	{
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Laptop");
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Mobile");
		
		Product[] products = new Product[2];
		products[0] = p1;
		products[1] = p2;
		
		return products;
	}
}
