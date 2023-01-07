package users;
import productdetails.Product;

public class Seller extends User{
	private Product [] ProductsListed;

	public Product[] getProductsListed() {
		return ProductsListed;
	}

	public void setProductsListed(Product[] productsListed) {
		ProductsListed = productsListed;
	}

	@Override
	public boolean verifyUser() {
		return true;
	}
	

}
