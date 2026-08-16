package Exceptions;

public class Product {
	
	int OrderQuanitity;
	int availabe;
	
	
//	public Product(int OrderQuanitity,	int availabe)
//	{
//		this.OrderQuanitity=OrderQuanitity;
//		this.availabe=availabe;
//	}
	public void Inventary(int OrderQuanitity,	int availabe )
	{
		if(OrderQuanitity > availabe)
		{
			throw new OutofStockException("product is not availabe .....");
		}
		else
		{
			System.out.println("done........");
		}
	}
}
