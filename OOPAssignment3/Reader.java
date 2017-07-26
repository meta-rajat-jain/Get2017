import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 * @author Rajat Jain
 * @Date 24-july-2017
 * @version 1.0
 * @project Shopping Store Terminal 
 */
/**
 * The Class Reader for reading the data from CSV's
 */
public class Reader {
	
	/** The list for retrieving information about product. */
	public static List<String> retrieveProduct=null;
	
	/**
	 * Retrieve information from CSV.
	 *
	 * @param fileName the file name
	 * @return the list
	 * @throws Exception the exception
	 */
	public static List<String> retrieveInformationFromCSV(String fileName) throws Exception {
		try{
		retrieveProduct = Files.readAllLines(Paths.get(fileName));
		
		}catch(IOException io) {
			System.out.print("IO Exception");
			io.printStackTrace();
		}catch(NullPointerException nullPoint){
			System.out.println("null pointer Exception");
			nullPoint.printStackTrace();
		}catch(NumberFormatException numFormat){
			System.out.println("number format Exception");
			numFormat.printStackTrace();	
		}
		return retrieveProduct;
	}
}
