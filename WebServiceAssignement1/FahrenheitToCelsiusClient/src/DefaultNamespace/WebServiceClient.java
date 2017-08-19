package DefaultNamespace;

import java.util.Scanner;

public class WebServiceClient {
	
	public static double converter(double temp) {
		
		FahrenheitToCelsiusServiceLocator fcsl= new FahrenheitToCelsiusServiceLocator();
		fcsl.setFahrenheitToCelsiusEndpointAddress("http://localhost:8080/FahrenheitToCelsius/services/FahrenheitToCelsius");
	try{		Scanner scanner = new Scanner(System.in);
				boolean flag = true;
				 FahrenheitToCelsius result = fcsl.getFahrenheitToCelsius();
		        while(flag){
				 try{
		        	 if(String.class.isInstance(temp)){
						 throw new IllegalArgumentException();
					 }
					 flag = false;
				 }catch(IllegalArgumentException e){
					 System.out.println("Please Enter vaild  temperature");
				 }
				}
		        double roundOff = result.convertFahrenheitToCelsius(temp);
		        double resultRoundOff = Math.round(roundOff * 100.0) / 100.0;
		        System.out.println("Temperature in deg celsius is : " + resultRoundOff );  
		        return resultRoundOff;
		    } catch (Exception e) {
		        e.printStackTrace();
		        return temp;
		    }
	
		}
}
