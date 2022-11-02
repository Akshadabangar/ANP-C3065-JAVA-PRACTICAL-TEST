package demo.dao;

import demo.model.Product;

public class ProductDAO {
	Product productArr[] = new Product[3];

	public void setProduct(Product product) {
		for (int i = 0; i < productArr.length; i++) {
			if (productArr[i] == null) {
				productArr[i] = product;
				break;
			}

		}

	}

	public Product[] getProducts() {

		return productArr;
	}

}