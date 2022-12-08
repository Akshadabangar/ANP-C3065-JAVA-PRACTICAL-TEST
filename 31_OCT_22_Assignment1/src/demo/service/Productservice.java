package demo.service;
import demo.model.Product;
import demo.dao.ProductDAO;

	
		public class Productservice {
			ProductDAO productDAO;
			public Productservice() {
				productDAO=new ProductDAO();
			}
			
			public void setProduct(Product product) {
				productDAO.setProduct(product);
			}
			public Product[] getProducts() {
			Product productArr[]=productDAO.getProduct();
			return productArr;	
			//return productDAO.getProducts();
			}

		}

	



