package ecommerce;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

import order.Cart;
import order.Order;
import productdetails.Catalogue;
import productdetails.Product;
import users.Customer;
import users.Seller;

public class Store {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Ecommerce Store !");
		System.out.println("which user are you ? 1.customer 2.seller 3. Admin ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeofUser;
		
// ****** ******* ******* ******* *****CUSTOMER CODE ****** ******* ******* ******* ******** ****** ****** ******* 
		if (choice == 1) {
			typeofUser = "customer";
			Customer current = new Customer();
			System.out.println("What is your UserId ?");
			sc.nextLine();
			current.setuserId(sc.nextLine());
			System.out.println("What is your Password ?");
			sc.nextLine();
			System.out.println("click submit to proceed... (or) please click enter");
			current.setPassword(sc.nextLine());
			
			if (current.verifyUser() == true)
				System.out.println("User verified !");
			while (true) {
				
// CUSTOMER SELECTION 
				System.out.println("Do you want 1. veiw products 2. veiw cart 3. contact us  4.exit");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("choose category");
// CATEGORY SELECTION					
					Catalogue catalogue = new Catalogue();
					Product[] allproducts = catalogue.getListofAllproducts();
					System.out.println("1. Electronics 2.Biscuits 3.Milkshakes");
					sc.nextLine();
					int choosecategory = sc.nextInt();
					String selected = " ";
					if (choosecategory == 1) {
						System.out.println("Electronic iteam highlighted below: ");
						System.out.println();
						selected = "Electronics";
					}

					else if (choosecategory == 2) {
						System.out.println("Biscuits iteam highlighted below: ");
						System.out.println();
						selected = "Biscuits";
					} else if (choosecategory == 3) {
						System.out.println("Milkshake iteam highlighted below: ");
						System.out.println();
						selected = "Milkshakes";
					}
				
					for (int i = 0; i < allproducts.length; i++) {
						System.out.println(allproducts[i].getCategory().getCategoryName());

						if (allproducts[i].getCategory().getCategoryName() == selected)
							System.out.println(allproducts[i].getProductId() + " " + allproducts[i].getProductName()
									+ " " + allproducts[i].getCost());

					}
// ADD TO CART					
					System.out.println("Do you want to add any product to the cart? Y/N");
					sc.nextLine();
					String addToCart = sc.nextLine();

					if (addToCart.equals("Y")) {
						
						System.out.println("Input the product Id which you want to Add to cart ");
						String productId = sc.nextLine();
						Product[] cartProducts = new Product[1];
						for (int i = 0; i < allproducts.length; i++) {
							if (allproducts[i].getProductId().equals(productId))
								cartProducts[0] = allproducts[i];
						}

						Cart cart = new Cart();
						cart.setCartId("Cart products details");
						cart.setListofProducts(cartProducts);
						current.setCart(cart);
						System.out.println("The product is successfully added to the cart ");
					 
					}
// Exception handling using 					
				} 
				else if (choice == 2) {
					try {
						Product[] cartProducts = current.getCart().getListofProducts();
						System.out.println(current.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {

							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName() + " "
								+ cartProducts[i].getCost());
						}
					}catch(Exception e) {
						System.out.println("Cart is Empty ");
						continue;
						
					}
					System.out.println("Do you want to checkout? Y/N ");
					sc.nextLine();
					String checkout = sc.nextLine();
					if (checkout.equals("Y"))
						
						if (current.getCart().checkout()) {
							Order ordercheck =new Order();
							ordercheck.setUser(current);
							ordercheck.setOrderId("001");
							System.out.println("Confirm your Order..!  ");
							
							System.out.println("Your order Id is :"+ordercheck.getOrderId()+" for the products Id: "+ordercheck.getUser().getUserId()+"is successfully added to the bill");
							System.out.println("Click Enter to Confirm..");
							sc.nextLine();
							String customerId = ordercheck.getUser().getUserId();
							System.out.println("Creating recipt...");
							
							
// BW USING 							
							File f=new File(customerId+".txt" );
							try {
								BufferedWriter bw= new BufferedWriter(new FileWriter(f,true));
								bw.write("your order Id is :"+ordercheck.getOrderId());
								bw.newLine();
								bw.write("For the user "+ordercheck.getUser().getUserId());
								bw.write("thank you ");
								System.out.println("Your order is placed successfully ");
								System.out.println("Thank you..! your order recipt created..!  Press 1 to veiw delivery details  ");
								int delivery = sc.nextInt();
								if(delivery==1) {
									
									
									Date date =new Date(System.currentTimeMillis());
									System.out.println("dispached on today ("+(date)+")");
									System.out.println();
									System.out.println(" YOUR Products delivered at Tommorow Morning ");
									System.out.println();
									System.out.println(" Thank you keep shopping....!");
									
									
									
								}
								
								
							}catch(IOException e) {
								System.out.println(" problem..! while creating bill...");
								e.printStackTrace();
								
							}
							
							
							
							
							
							
						}

				} else if (choice == 3) {
					System.out.println("To contact us");
					System.out.println(" **********     E COMMERCE STORE Contact details     ************ ");
					System.out.println("                      ABC COMPANY           ");
					System.out.println("                      Online shoping website           ");
					System.out.println("                      www.ecommerce.co.in                     ");
					System.out.println("                      INDIA         ");
					System.out.println("                      E-mail on supermartonline@gmail.com  ");
					System.out.println("                      Telephone No: 001-002-001");

				} else if (choice == 4)
					break;
				else
					System.out.println("Invalid choice , please put a correct option..! ");

			}
			}
		
// ******* ******** ******** ****** ***** SELLER CODE ****** ****** ****** ****** ******* ****** *********		

		else if (choice == 2) { 
			typeofUser = "seller";
		    Seller current = new Seller();
		    System.out.println("What is your UserId ?");
		    sc.nextLine();
		    current.setUserId(sc.nextLine());
		    System.out.println("What is your Password ?");
		    sc.nextLine();
		    System.out.println("click submit to proceed... (or) please click enter");
		    current.setPassword(sc.nextLine());
		if (current.verifyUser() == true) 
			System.out.println("User verified !");
		
		while(true) {
			System.out.println("Do you want to - 1. view  your products  2. ADD product   3. contact as 4. Exit");
			choice =sc.nextInt();
			if(choice==1) {
				Catalogue catalogue1= new Catalogue();
				Product [] SellerProduct =catalogue1.getSellerProducts();
				for (int i = 0; i < SellerProduct.length; i++) {
					System.out.println(SellerProduct[i].getProductId() + " " + SellerProduct[i].getProductName()
							+ " " + SellerProduct[i].getCost());
					
				}	
			}
		
			else if(choice==2) {
				System.out.println("Select product id which you want to add a Bill ");
				int getId=sc.nextInt();
				
				sc.nextLine();
				
				
				Catalogue catalogueS2= new Catalogue();
				
				Product [] SellerProduct =catalogueS2.getSellerProducts();
				Product [] SellerAddedProduct =new Product[1];
				for (int i = 0; i < SellerAddedProduct.length; i++) {
					if(SellerProduct[i].getProductId().equals(getId)) {
						SellerAddedProduct[0] =SellerProduct[i];
					}
					current.setProductsListed(SellerAddedProduct);
					
					
					System.out.println("Product successfully added ");	
				}
				
			}
			
			else if(choice==3) {
				System.out.println(" **********Seller contact details************ ");
				System.out.println("             ABC Distributors            ");
				System.out.println("             123\7 nehru street,            ");
				System.out.println("             chennai-456987            ");
				System.out.println("             Tamilnadu-33          ");
			}
			
		
	        else if (choice == 4) {
			break;
	        }
	    
		    else
		    	
			    System.out.println("Invalid choice , please put a correct option..! ");
		}
		
		}
	
	

		
			
// *************** ************* ***********ADMIN********** ************ *********** ***********		
		
		
		else if (choice ==3) {
				typeofUser = "Admin";
				
				
				while(true) {
		    	 
					System.out.println("Do you want all products: 1.Veiw Products details  2. Veiw Seller product list  ");
					int choiceAdmin=sc.nextInt();

					if (choiceAdmin==1) { 
						Catalogue catalogue3=new Catalogue();
		    		 Product [] show =catalogue3.getListofAllproducts();
		    		 System.out.println("All products details");
		    		 for(int i=0;i<show.length;i++) 
		    		 {
		    			 System.out.println();
		    			 System.out.println("Code :"+ show[i].getProductId()+"  Product Name : "+show[i].getProductName()+ "      Cost :"+ show[i].getCost());	
		    		 }
					}
		    		 
		    		 
		    		else if(choiceAdmin==2) {
		    			Catalogue catalogue3=new Catalogue();
		    			Product [] show2 =catalogue3.getListofAllproducts();
		    			System.out.println("Seller products details");
		    			for(int i=0;i<show2.length;i++) {
		    				System.out.println();
		    			    System.out.println(""+ show2[i].getProductId()+" "+show2[i].getProductName()+" "+show2[i].getCost());		
		    		 }
		    		}
	    		 
		    	 
			
		    	 	else
		    	 		System.out.println("Invalid choice");
		     }
         }
			}

	

}
	
	



		
		
	

		
	
		
		

		
		
		
		

		
	 
			
			
		
		
		

	
	

		
			


					
		
			
    
		
	


