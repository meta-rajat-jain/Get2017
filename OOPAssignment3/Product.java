/**
 * @author Rajat Jain
 * @Date 24-july-2017
 * @version 1.0
 * @project Shopping Store Terminal 
 */
/**
 * The Class Product.
 */
public class Product{
	
	/** The product id. */
	private String productId;
    
    /** The product name. */
    private String productName;
    
    /** The product price. */
    private double productPrice;
    
    /** The discounted price. */
    private double discountedPrice;
   
    /**
     * Gets the product id.
     *
     * @return the product id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the product id.
     *
     * @param productId the new product id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the product name.
     *
     * @param productName the new product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    /**
     * Gets the product price.
     *
     * @return the product price
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the product price.
     *
     * @param productPrice the new product price
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    /**
     * Gets the discounted price.
     *
     * @return the discounted price
     */
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    /**
     * Sets the discounted price.
     *
     * @param DiscountedProductPrice the new discounted price
     */
    public void setDiscountedPrice(double DiscountedProductPrice) {
        this.discountedPrice = discountedPrice;
    }
}
