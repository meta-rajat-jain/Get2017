package socialNetwork;

import java.util.HashSet;

/**
 * This class is super class of application
 *
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-july-2017
 * @project Socail Network
 */
public class Node implements Record {

    /**
     * Friends Set of entity
     */
    public HashSet<Entity> friends = new HashSet<>();

    /**
     * Method to print Record of entities
     */
    @Override
    public void getRecord() {
    }
}
