import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FahrenheitToCelsius {
	@WebMethod
	public double convertFahrenheitToCelsius(double fahrenheit ){
		double celsius;
		celsius = ((( fahrenheit - 32 ) * 5)/9);
		return celsius;
	}
}
