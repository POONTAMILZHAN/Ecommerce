package productdetails;

public class Category {
	private String categoryName;
	private Category [] subCategories;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category[] getSubCatogories() {
		return subCategories;
	}
	public void setSubCatogories(Category[] subCategories) {
		this.subCategories = subCategories;
	}

}
