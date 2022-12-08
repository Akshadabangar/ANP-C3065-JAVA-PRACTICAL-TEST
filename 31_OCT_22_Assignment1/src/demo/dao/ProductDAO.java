package demo.dao;

import demo.model.Product;

public class ProductDAO {

	Product[] array = new Product[3];

	public void setProduct(Product product) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == null) {
				array[index] = product;
				break;
			}
		}
	}

	public Product[] getProduct() {

		return array;
	}

}
