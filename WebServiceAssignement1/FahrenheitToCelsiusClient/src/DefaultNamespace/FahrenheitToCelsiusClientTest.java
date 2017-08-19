package DefaultNamespace;

import static org.junit.Assert.*;

import org.junit.Test;

public class FahrenheitToCelsiusClientTest {
	WebServiceClient convert = new WebServiceClient();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		double d = convert.converter(32);
		assertEquals(0.0, d,DELTA);
	}
	

	@Test
	public void testMain() {

	double d = convert.converter(98.6);
	assertEquals(37.0, d, DELTA);
	}

	@Test
	public void testMain1() {

	double d = convert.converter(32.0);
	assertEquals(0, d, DELTA);
	}

	@Test
	public void testMain2() {

	double d =convert.converter(-12.2);
	assertEquals(-24.56, d, DELTA);
	}

	@Test
	public void testMain3() {

	double d = convert.converter(0.0);
	assertEquals(-17.78, d, DELTA);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMain4() {

	double d = convert.converter(Double.parseDouble("ram"));
	}

	@Test
	public void testMain5() {

	double d = convert.converter(Double.parseDouble("12"));
	assertEquals(-11.11, d, DELTA);
	}
	}

