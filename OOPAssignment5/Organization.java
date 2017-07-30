package socialNetwork;

/**
 * Organization Class stores data about organization
 *
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-july-2017
 * @project Socail Network
 */
public class Organization extends Entity {

    private String typeOfCompany;

    /**
     *
     * @param name
     * @param emailId
     * @param number
     * @param typeOfCompany
     */
    public Organization(String name, String emailId, String number, String typeOfCompany) {
        /**
         * call super constructor*
         */
        super(name, emailId, number);
        this.typeOfCompany = typeOfCompany;
    }

    /**
     * getTypeOfCompany
     *
     * @return type of company
     */
    public String getTypeOfCompany() {
        return typeOfCompany;
    }

    /**
     * setTypeOfCompany
     *
     * @param typeOfCompany
     */
    public void setTypeOfCompany(String typeOfCompany) {
        this.typeOfCompany = typeOfCompany;
    }

    /**
     * get Record
     *
     * Prints the Information of organization
     */
    @Override
    public void getRecord() {
        super.getRecord();
        System.out.println(this.typeOfCompany + "\t");
    }

}
