package socialNetwork;

/**
 * Main class of the application
 * 
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-july-2017
 * @project Socail Network
 */
public class Main {

    private Reader read;

    /**
     *
     * @param args the command Line arguments
     */
    public static void main(String[] args) {
        SocialNetwork obj = new SocialNetwork();
        /**
         * Read from person List and add it to exist Node*
         */
        for (Person p : SocialNetwork.personSet) {
            obj.addNode(p);
        }
        /**
         * Read From Organization List and add it to existNode*
         */
        for (Organization o : SocialNetwork.organizationSet) {
            obj.addNode(o);
        }

        /**
         * Prints the menu*
         */
        obj.printMenu();
    }

}
