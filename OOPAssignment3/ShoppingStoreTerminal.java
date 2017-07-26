import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ShoppingStoreTerminal {

	public void getOrder() throws IOException {
		Scanner scanner = new Scanner(System.in);
		Reader reader = new Reader();
		ReadProducts readProduct = new ReadProducts();
		ReadProductPromo readPromo = new ReadProductPromo();
		OrderPromo orderPromo = new OrderPromo();
		//productCart readCart = new productCart();
		
		List<String> readPro = new ArrayList<String>();
		try {
			readPro = reader.retrieveInformationFromCSV("./ProductList.csv");
		} catch (Exception e) {
			e.printStackTrace();
		}
		readProduct.readProducts(readPro);

		List<String> readProPromo = new ArrayList<String>();
		try {
			readProPromo = reader.retrieveInformationFromCSV("./ProductPromo.csv");
		} catch (Exception e) {
			e.printStackTrace();
		}
		readPromo.readProductPromos(readProPromo);

		List<String> readOrderPromo = new ArrayList<String>();
		try {
			readOrderPromo = reader.retrieveInformationFromCSV("./OrderPromo.csv");
		} catch (Exception e) {
			e.printStackTrace();
		}
		orderPromo.readOrderPromos(readOrderPromo);

		
		//readCart.getCartDetails();
		double productPrice;
		String productName;
		System.out.println("Enter the number of different products you wish to enter");
		int noOfDifferentProducts = scanner.nextInt();

		String ppid[] = new String[noOfDifferentProducts];
		int quantity[] = new int[noOfDifferentProducts];
		double[] discountedPrice = new double[noOfDifferentProducts];
		double[] totalPrice = new double[noOfDifferentProducts];
		try{
		for (int index = 0; index < noOfDifferentProducts; index++) {
			System.out.println("Enter the product id");
			ppid[index] = scanner.next();
			System.out.println("Enter the product quantity");
			quantity[index] = scanner.nextInt();
			}
		}catch(InputMismatchException e){
			System.out.print("Invalid Input");
			getOrder();
		}

		

		System.out
				.println("#####################################################");
		System.out.println("YOUR ORDER : ");
		System.out
				.println("#####################################################");
		System.out.println();
		System.out.println();
		System.out.println("Purchased Product: ");
		
		
		double totalCost=0;
	
		for(int index=0;index<ppid.length;index++){
			for(Product x : ReadProducts.allProducts ){
				if(ppid[index].equals(x.getProductId())){
					System.out.print("Product is : ");
					System.out.print(x.getProductId() + " - ");
					System.out.println(x.getProductName());
					totalCost += (x.getProductPrice() * quantity[index]);
					System.out.println("Cost" + x.getProductPrice() + " * " + quantity[index]);
					System.out.println();
					
						
				}
			}
		}
		for (int index = 0; index < noOfDifferentProducts; index++) {
			if (readPromo.isApplicable(ppid[index])) {
				double finalPrice = readPromo.getDiscount(ppid[index],
						readProduct.allProducts);
				double subTotal = (finalPrice * quantity[index]);
				System.out.println("Promotion: " + ppid[index] +  " - Discount Offered on each quantity is : " + readPromo.discountedAmount);
				double discountSubTotal = (readPromo.discountedAmount * quantity[index]);
				discountedPrice[index] = (discountSubTotal);
				totalPrice[index] = subTotal;
	} else {
				System.out.print(ppid[index]);
				System.out.println("Not valid for discount");
			}
		}
		double discountTotal = 0, total = 0;
			for (int disindex = 0; disindex < discountedPrice.length; disindex++) {
			discountTotal += discountedPrice[disindex];
			total += totalPrice[disindex];
		}
		System.out.println();
		System.out.println("Total Cost of product is : " + totalCost);
		System.out.println("Total discount offered on product is : "
				+ discountTotal);	
		System.out.println("SubTotal Price   : " + total);
	
		double totalOrderDiscount = orderPromo.getDiscount(total);
		System.out.println();
		
		System.out.println("Total bill is of rupees  : INR " + totalOrderDiscount);
		
		
		System.out.println();
		System.out.println();

	}
}
