package productdetails;
import users.Seller;

public class Product {
private String ProductId;
private String cost;
private String ProductName;
private Seller seller;
private Category category; 



public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Seller getSeller() {
	return seller;
}
public void setSeller(Seller seller) {
	this.seller = seller;
}
public String getProductId() {
	return ProductId;
}
public void setProductId(String productId) {
	ProductId = productId;
}
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}

}
