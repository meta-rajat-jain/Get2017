import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.lang.Math.*;
/**
 * @author Rajat Jain
 * @Date 24-july-2017
 * @version 1.0
 * @project Shopping Store Terminal 
 */
/**
 * The Class for computing Order Promotion.
 */
public class OrderPromo  {

	/** The order detail. */
	public static String orderDetail[];

	/** The promotion type. */
	public static String promotionType;

	/** The discount amount. */
	public static String discountAmount;

	/** The threshold. */
	public static String threshold;

	/** The minimum value. */
	public double minimumValue[] = new double[100];

	/** The sub discount. */
	public double subDiscount[] = new double[100];

	/** The amt discount. */
	public double amtDiscount[] = new double[100];

	/** The type order promotion. */
	public String typeOrderPromotion[] = new String[100];

	/**
	 * Read order promos.
	 *
	 * @param orderPromo the order promo
	 */
	public  void readOrderPromos(List<String> orderPromo){
		System.out.println();  
		int index =0;
		for(String x: orderPromo){

			retrieveSingleOrderPromo(index,x);
			index++;
		}
	}

	/**
	 * Read individual order promos.
	 *
	 * @param index the index
	 * @param str the str
	 */
	public void retrieveSingleOrderPromo(int index,String str){
		int id = index;

		orderDetail = str.split(",");

		promotionType=orderDetail[0];
		typeOrderPromotion[id] = promotionType;
		discountAmount=orderDetail[1];
		amtDiscount[id] = Double.parseDouble(discountAmount);
		threshold=orderDetail[2];
		minimumValue[id] = Double.parseDouble(threshold);
		System.out.println("" );
		System.out.println(" " + promotionType + "\t" + discountAmount + "\t" + threshold );
	}

	/**
	 * Gets the discount.
	 *
	 * @param total the total
	 * @return the discount
	 */
	public double getDiscount(double total){
		int in=0;
		
		for(int index=0;index < orderDetail.length ; index++){
			if( total > minimumValue[index] ){
				if("OrderFixedAmountPromotion".equalsIgnoreCase(typeOrderPromotion[index])){
					subDiscount[in] = total - amtDiscount[index] ;
					in++;
				}
				else if("OrderFixedPercentPromotion".equalsIgnoreCase(typeOrderPromotion[index])){
					amtDiscount[index]=(amtDiscount[index] * total)/100;
					subDiscount[in] = total - amtDiscount[index] ;
						in++;
				}
			}
			else {
				return total;
			}
		}





		double minDiscount=subDiscount[0];
		
		int count=0;
		for (int i = 0; i < orderDetail.length; i++) {
			if (subDiscount[i] < minDiscount) {
				minDiscount = subDiscount[i];
				count = i;
			}
		}
		System.out.println("Total order discount Offered is " + amtDiscount[count]);
		System.out.println("Discount of type : " + typeOrderPromotion[count] + "  applied for subtotal greater than " + minimumValue[count] );
		return minDiscount;

	}




}
