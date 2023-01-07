package order;
import productdetails.Product;

public class Cart {
	private String cartId;
	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private Product [] listofProducts;
	

	public Product[] getListofProducts() {
		return listofProducts;
	}

	public void setListofProducts(Product[] listofProducts) {
		this.listofProducts = listofProducts;
	}
	public boolean checkout() {
		return true;
	}

}
