package com.mymart.dao;
import java.util.LinkedList;
import com.mymart.model.Product;
public class ProductDAO {
 private static LinkedList<Product> list=new LinkedList<>();
 
 public boolean addProduct(Product p1) {
	 boolean addStatus=false;
	 list.add(p1);
	 addStatus=true;
	 return addStatus;
 }
 LinkedList<Product>  getAllProducts(){
	 return list;
 }
}
