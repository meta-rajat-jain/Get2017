import java.util.Scanner;
/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-july-2017
 * @project Menu Driven Application
 */
/**
 * The Class ActionableMenuItem.
 */


public class ActionableMenuItem implements MenuItem {
    
    /** The action. */
    // object of Action class
	Action action;
    
    /** The display text. */
    // String  to display text
    String displayText;
    
    
    /**
     * Instantiates a new actionable menu item.
     */
    /*
	 * parameterized constructor
	 * @param dsplayText is the text which will display on console
     */
    ActionableMenuItem() {
     
    }
    
    /**
     * Instantiates a new actionable menu item.
     *
     * @param displayText the display text
     */
    ActionableMenuItem(String displayText) {
        this.displayText = displayText;
    }
    //display text of option

    /* 
     * @see MenuItem#display()
     */
    public void display() {
        System.out.println(displayText);
    }

    // takes the choice and performs the action
   
  
    
    /* 
     * @see MenuItem#takeAction(int, Matrix, int, int)
     */
    public void takeAction(int choice,Matrix matrix,int noRows,int noCols){
	 Action action = new Action(choice);
	   action.performAction(matrix,noRows,noCols);
   }


}
