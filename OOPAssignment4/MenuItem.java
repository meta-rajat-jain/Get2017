/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-july-2017
 * @project Menu Driven Application
 */
/**
 * The Class Action.

 */
public interface MenuItem {

    /**
     * Display.
     */
    public void display();

    /**
     * Take action.
     *
     * @param i the i
     * @param matrix the matrix
     * @param noRows the no rows
     * @param noCols the no cols
     */
    public void takeAction(int i,Matrix matrix,int noRows,int noCols);
}
