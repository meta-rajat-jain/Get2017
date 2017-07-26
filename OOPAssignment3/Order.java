import java.io.IOException;
import java.util.Scanner;
/**
 * @author Rajat Jain
 * @Date 24-july-2017
 * @version 1.0
 * @project Shopping Store Terminal 
 */


/**
 * The Class to build and print Order.
 */
public class Order {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){
		ShoppingStoreTerminal orderDetail = new ShoppingStoreTerminal();
		try {
			orderDetail.getOrder();
		} catch (IOException e) {
			
			System.out.println("Error");
		}
	}
	}
