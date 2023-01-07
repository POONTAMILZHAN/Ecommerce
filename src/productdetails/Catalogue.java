package productdetails;

public class Catalogue {
	private Product [] listofAllproducts;
	private Product [] SellerProduct;
	
	
	Category cat =new Category();
	Category cat2 =new Category();
	Category cat3 =new Category();

	public Product[] getListofAllproducts() {
		cat.setCategoryName("Electronics");
		cat2.setCategoryName("Biscuits");
		cat3.setCategoryName("Milkshakes");
		
		
		Product product1 =new Product();
		product1.setProductId("001");
		product1.setProductName("Laptop");
		product1.setCost("30000");
		product1.setCategory(cat);
		
		Product product2 =new Product();
		product2.setProductId("002");
		product2.setProductName("Mobile");
		product2.setCost("20000");
		product2.setCategory(cat);
		
		Product product3 =new Product();
		product3.setProductId("003");
		product3.setProductName("Led tv ");
		product3.setCost("15000");
		product3.setCategory(cat);
		
		
		
		Product product4 =new Product();
		product4.setProductId("004");
		product4.setProductName("Happy Happy ");
		product4.setCost("10");
		product4.setCategory(cat2);
		
		Product product5 =new Product();
		product5.setProductId("005");
		product5.setProductName("Marie gold ");
		product5.setCost("30");
		product5.setCategory(cat2);
		
		Product product6 =new Product();
		product6.setProductId("006");
		product6.setProductName("Hide & seek ");
		product6.setCost("30");
		product6.setCategory(cat2);
		
		
		Product product7 =new Product();
		product7.setProductId("007");
		product7.setProductName("Vanila Milkshake");
		product7.setCost("35");
		product7.setCategory(cat3);
		
		Product product8 =new Product();
		product8.setProductId("008");
		product8.setProductName("Chocolate Milkshake");
		product8.setCost("35");
		product8.setCategory(cat3);
		
		Product product9 =new Product();
		product9.setProductId("009");
		product9.setProductName("Strawberry");
		product9.setCost("35");
		product9.setCategory(cat3);
		
		
		listofAllproducts=new Product[9];
		
		
		listofAllproducts[0]=product1;
		listofAllproducts[1]=product2;
		listofAllproducts[2]=product3;
		listofAllproducts[3]=product4;
		listofAllproducts[4]=product5;
		listofAllproducts[5]=product6;
		listofAllproducts[6]=product7;
		listofAllproducts[7]=product8;
		listofAllproducts[8]=product9;
		
		return listofAllproducts;
	}
	public Product [] getSellerProducts() {
		Product product1=new Product();
		Product product11 =new Product();
		product11.setProductId("001");
		product11.setProductName("Laptop");
		product11.setCost("30000");
		product11.setCategory(cat);
		
		Product product2 =new Product();
		product2.setProductId("002");
		product2.setProductName("Mobile");
		product2.setCost("20000");
		product2.setCategory(cat);
		
		Product product3 =new Product();
		product3.setProductId("003");
		product3.setProductName("Led tv ");
		product3.setCost("15000");
		product3.setCategory(cat);
		
		Product product4 =new Product();
		product4.setProductId("004");
		product4.setProductName("Happy Happy ");
		product4.setCost("10");
		product4.setCategory(cat2);
		
		Product product5 =new Product();
		product5.setProductId("005");
		product5.setProductName("Marie gold ");
		product5.setCost("30");
		product5.setCategory(cat2);
		
		Product product6 =new Product();
		product6.setProductId("006");
		product6.setProductName("Hide & seek ");
		product6.setCost("30");
		product6.setCategory(cat2);
		
		
		Product product7 =new Product();
		product7.setProductId("007");
		product7.setProductName("Vanila Milkshake");
		product7.setCost("35");
		product7.setCategory(cat3);
		
		Product product8 =new Product();
		product8.setProductId("008");
		product8.setProductName("Chocolate Milkshake");
		product8.setCost("35");
		product8.setCategory(cat3);
		
		Product product9 =new Product();
		product9.setProductId("009");
		product9.setProductName("Strawberry");
		product9.setCost("35");
		product9.setCategory(cat3);
		
		SellerProduct=new Product[9];
		
		SellerProduct[0]=product11;
		SellerProduct[1]=product2;
		SellerProduct[2]=product3;
		SellerProduct[3]=product4;
		SellerProduct[4]=product5;
		SellerProduct[5]=product6;
		SellerProduct[6]=product7;
		SellerProduct[7]=product8;
		SellerProduct[8]=product9;
		
		
		
		
		return SellerProduct;	
	}

public void setListofAllProducts(Product[] listofAllproducts) {
	this.listofAllproducts= listofAllproducts;
}
}

	
