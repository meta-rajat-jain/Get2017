import java.util.List;
/**
 * @author Rajat Jain
 * @Date 24-july-2017
 * @version 1.0
 * @project Shopping Store Terminal 
 */
/**
 * The Interface Promotion.
 */
public interface Promotion {
	
	
	/**
	 * Checks if is applicable.
	 *
	 * @param productId the product id
	 * @return true, if is applicable
	 */
	public boolean isApplicable(String productId) ;
	
	/**
	 * Gets the discount.
	 *
	 * @param productId the product id
	 * @param p the p
	 * @return the discount
	 */
	public double getDiscount(String productId,List<Product> p);
	
	
}
