
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-july-2017
 * @project Menu Driven Application
 */

/**
 * The Class Action.

 */

public class Menu {
	
	
	/** The items. */
	// List of menu
	List<MenuItem> items = new ArrayList<>();
	
	/** The scan. */
	private Scanner scan  = new Scanner(System.in);
	
	/**
	 * Adds the menu item.
	 *
	 * @param item the item
	 */
	public void addMenuItem(MenuItem item)
	{
		items.add(item);
	}
	
	/**
	 * Display.
	 */
	// Display the menu item 
	public void display()
	{ 
		System.out.println("Enter the row and column for Matrix");
		Scanner scanner = new Scanner(System.in);
		int noRows = scanner.nextInt();
		int noCols = scanner.nextInt();
		//If entered row or column is not in correct form
		try{
			if(noRows<0 || noCols<0){
				throw new IllegalArgumentException("Illegal Array Size");

			}
		}catch(IllegalArgumentException e){
			System.out.print(e.getMessage());
			System.exit(0);
		}
		
		Matrix matrix = new Matrix(noRows,noCols);
		while (true) 
		{
			// For printing
			for (MenuItem i : items) 
			{
				i.display();
			}

			int choice = 0;
			boolean flag = true;
			do {
				try {
				      choice = scan.nextInt();
				      if(choice<1 || choice>5) {
				    	  throw new InputMismatchException("Value should be in between 1 to 5");
				      }
				      flag = false;
				   }catch(InputMismatchException e) {
					   System.out.println("Enter valid choice");
				   }
			}while(flag);

			


			MenuItem i = items.get(choice - 1) ;
			i.takeAction(choice,matrix,noRows,noCols);
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		SubMenu object=new SubMenu();

	}
}
