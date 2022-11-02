package demo.model;

public class Product 
{
	//Member Variables
	int productId;      
	String productName;
	double productPrice;
	
	public Product() //Non-Parameterised Constructor
	{
		
	}
	public Product(int pId,String pName, double pPrice) //Parameterised Constructor
	{
		productId=pId;
		productName=pName;
		productPrice=pPrice;
	}
	
	//Set Method
	public void setProductId(int pId)
	{
		productId=pId;
	}
	public void setProductName(String pName) {
		productName=pName;
	}
	public void setProductPrice(double pPrice) {
		productPrice=pPrice;
	}
	
	//Get Method
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}

