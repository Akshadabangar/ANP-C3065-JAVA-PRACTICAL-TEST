package com.mymart.dao;
import java.util.*;
public class Product implements Comparable<Product>{
	public int productId;
	public String productName;
	public double productPrice;
	
	public Product(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public void setProductId(int prodId) {
		productId=prodId;
	}
	public void setProductName(String prodName) {
		productName=prodName;
	}
	public void setProductPrice(float prodPrice) {
		productPrice=prodPrice;
	}
	
	int getProductId() {
		return productId;
	}
	String getProductName() {
		return productName;
	}
	double getProductPrice() {
		return productPrice;
	}
	
//	public String toString() {
//		   return this.productId + " " +this.productName + " " +this.productPrice;
//	}
	
	public boolean equals(Product o) {
		if(this==o)
			return true;
		else
		return false;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	public int hashCode(int productId2, String productName2, double productPrice2) {
		int hash=0;
		Product h=new Product(hash, productName2, productPrice2);
		h.hashCode(productId,productName,productPrice);
		return hash;
	}
	@Override
	public int compareTo(Product o) {
				return 0;
	}
}
