/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */

import java.util.Scanner;

import com.metacube.view.DisplayInput;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		DisplayInput inp = new DisplayInput();
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		boolean flag;
		while(true){
		inp.displayMenu();
		flag = true;
		while(flag){
			try{
				choice = Integer.parseInt(scanner.nextLine());
				if(choice>6 && choice<1){
					throw new Exception();
				}
				flag = false;
			}catch(Exception e){
				System.out.println("Enter a valid choice"+e);
			}
		}
		switch(choice){
		case 1:{
			inp.printAllProducts();
			break;
		}
		case 2:{
			inp.getInput();
			break;
		 }
		case 3:{
			inp.printCart();
			break;
		 }
		case 4:{
			inp.generateBill();
			break;
		}
		case 5:{
			inp.deleteItem();
			break;
		}
		case 6:{
			System.exit(0);
		}
		}
	}

	}

}
