package com.mymart.service;
import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;

public class ProductService 
{
	private static ProductDAO pDAO=new ProductDAO();
	   
	public boolean addProductService(Product p1) {
		boolean addStatus=pDAO.addProduct(p1);
		return addStatus;
	}
	}

