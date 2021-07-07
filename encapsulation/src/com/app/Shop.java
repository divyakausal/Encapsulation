package com.app;

public class Shop 
{
	public static void main(String[] args)
	{
		WareHouse wh = new WareHouse();
		Product[] products = wh.addProducts();
		
		for (Product product : products) 
		{
			System.out.println(product.getId()+"\t"+product.getName());
		}
	}
}
/*output:
		1	Laptop
		2	Mobile
*/
