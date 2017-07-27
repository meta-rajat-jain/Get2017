import java.util.Scanner;


/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-july-2017
 * @project Menu Driven Application
 */
/**
 * The Class SubMenu.

 */


public class SubMenu {
    
    /**
     * Instantiates a new sub menu.
     */
    //adds the menu
	SubMenu() {
	
		Menu menu = new Menu();
		ActionableMenuItem item1 = new ActionableMenuItem("\nPress 1 for Addition of elements into Matrix");
		ActionableMenuItem item2 = new ActionableMenuItem("Press 2 for Matrix Transpose");
		ActionableMenuItem item3 = new ActionableMenuItem("Press 3 for Multiplication");
		ActionableMenuItem item4 = new ActionableMenuItem("Press 4 to show Matrix");
        ActionableMenuItem item5 = new ActionableMenuItem("Press 5 for exit");
		menu.addMenuItem(item1);
		menu.addMenuItem(item2);
		menu.addMenuItem(item3);
		menu.addMenuItem(item4);
		menu.addMenuItem(item5);
		menu.display();
	}

}
