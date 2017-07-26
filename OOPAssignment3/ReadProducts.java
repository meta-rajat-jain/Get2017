import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/**
 * @author Rajat Jain
 * @Date 24-july-2017
 * @version 1.0
 * @project Shopping Store Terminal 
 */
/**
 * The Class for Reading Products.
 */
public class ReadProducts extends Reader {
	
	/** The product detail. */
	public String productDetail[];
	
	/** The product id. */
	public String productId;
	
	/** The product name. */
	public String productName;
	
	/** The product price. */
	public String productPrice;
	
	/** The all products. */
	static List<Product> allProducts = new ArrayList<Product>();
	
	/** The p. */
	Product p;
	
	/**
	 * Read products.
	 *
	 * @param readProduct the read product
	 */
	public void readProducts(List<String> readProduct) {
		System.out.println("product id \t product name \t product price ");
		for (String x : readProduct) {
			int index = 0;
			retrieveSingleProduct(index, x);
			index++;
		}
	}

	/**
	 * Read individual product.
	 *
	 * @param index the index
	 * @param str the str
	 */
	public void retrieveSingleProduct(int index, String str) {
		p = new Product();
		productDetail = str.split(",");

		productId = productDetail[0];
		p.setProductId(productId);

		productName = productDetail[1];
		p.setProductName(productName);

		productPrice = productDetail[2];
		p.setProductPrice(Double.parseDouble(productPrice));

		allProducts.add(p);

		System.out.println("\t" + productId + "\t" + productName + "\t"
				+ productPrice);
	}

}
