package socialNetwork;

/**
 * Class Person this class stores the data of Person
 *
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-july-2017
 * @project Socail Network
 */
public class Person extends Entity {

    private String nativeCity;

    /**
     *
     * @param name
     * @param emailId
     * @param number
     * @param nativeCity
     */
    public Person(String name, String emailId, String number, String nativeCity) {
        super(name, emailId, number);
        this.nativeCity = nativeCity;
    }

    /**
     *
     * @return native city of Person
     */
    public String getNativeCity() {
        return nativeCity;
    }

    /**
     *
     * @param nativeCity
     */
    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    /**
     * get Record Method
     *
     * prints the information about Person
     */
    @Override
    public void getRecord() {
        super.getRecord();
        System.out.println(this.nativeCity + "\t");
    }
}
