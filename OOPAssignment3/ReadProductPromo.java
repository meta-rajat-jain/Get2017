import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
// TODO: Auto-generated Javadoc

/**
 * The Class ReadProductPromo.
 *
 * @author Rajat Jain
 * @version 1.0
 * @Date 24-july-2017
 * @project Shopping Store Terminal
 */
/**
 * The Class ReadProductPromo.
 */
public class ReadProductPromo implements Promotion {
	
	/** The promo detail. */
	public static String promoDetail[];
	
	
	/** The promotion type. */
	public static String promotionType;
	
	/** The discount promotion. */
	public static String discountPromotion;
	
	/** The discount amount. */
	public static String discountAmount;
	
	/** The discountAmount and productId map. */
	HashMap<String,String> map =new HashMap<String,String>();
	
	/** The discountType and productId map. */
	HashMap<String,String> dismap = new HashMap<String,String>();
	/** The applicable products. */
	public static String applicableProducts[];
	
	/** The stored product. */
	public static String storedProduct[];
	
	/** The discounted price. */
	private double discountedPrice;
	
	/** The discounted amount. */
	public double discountedAmount;
	
	/** The id. */
	int id;
	
	/** The product. */
	Product product;
	

	/**
	 * Instantiates a new read product promotions.
	 */
	public ReadProductPromo() {
		product = new Product();
		storedProduct = new String[100];
	}
	
	/** The total no of product. */
	int totalNoOfProduct=0;
	/**
	 * Read product promotions.
	 *
	 * @param productPromo the product promotions
	 */
	public void readProductPromos(List<String> productPromo) {
		int index = 0;
		for (String x : productPromo) {
			retrieveSingleProductPromo(index, x);
			index++;
			
		}
	}

	/**
	 * Read individual product.
	 *
	 * @param ind the index
	 * @param str the string
	 */
	public void retrieveSingleProductPromo(int ind, String str) {
		int id=ind;
		System.out.println();
		promoDetail = str.split(",");
		promotionType = promoDetail[0];
		discountAmount = promoDetail[1];
		applicableProducts = promoDetail[2].split(";");
		
		System.out.print("\t" + promotionType + "\t"
				+ discountAmount + " ");
		
		for(int index=0;index<applicableProducts.length;index++){
			System.out.print( applicableProducts[index] + " ; ");
			storedProduct[totalNoOfProduct]=applicableProducts[index];
			map.put(storedProduct[totalNoOfProduct],discountAmount);
			dismap.put(storedProduct[totalNoOfProduct], promotionType);
			totalNoOfProduct++;
		}
	}
	/* 
	 * @see Promotion#isApplicable(java.lang.String)
	 */
	@Override
	public boolean isApplicable(String productId) {
		
	 
		int flag=0;
		for (int index = 0; index < totalNoOfProduct; index++) {
			if (productId.equals(storedProduct[index])) {
				flag++;
			}
		}
		if(flag==0){
			return false;
		}
		else{
			return true;
		}
		
	}

	
	/* 
	 * @see Promotion#getDiscount(java.lang.String, java.lang.String)
	 */
	@Override
	public double getDiscount(String idProduct,List<Product> allProducts) {
		double productPrice ;
		
		discountedAmount = Double.parseDouble(map.get(idProduct));
		discountPromotion = dismap.get(idProduct);
		for(Product x : allProducts ){
			if(idProduct.equals(x.getProductId())){
				productPrice=x.getProductPrice();
				if("ProductFixedAmountPromotion".equalsIgnoreCase(discountPromotion)){
				discountedPrice = productPrice - discountedAmount;
				x.setDiscountedPrice(discountedPrice);
				}
				else if("ProductFixedPercentPromotion".equalsIgnoreCase(discountPromotion)){
					discountedAmount = (discountedAmount * productPrice)/100;
					discountedPrice = productPrice - discountedAmount ;
					x.setDiscountedPrice(discountedPrice);
				}
				else{
					System.out.println("Discount is not applicable");
				}
				
				
				return discountedPrice;
			}
		}
			return 0.0;
		}
	}
