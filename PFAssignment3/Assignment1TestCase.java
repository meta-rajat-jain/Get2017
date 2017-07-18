import static org.junit.Assert.*;

import org.junit.Test;
public class Assignment1TestCase {
	
	
	@Test
	public void remainder() {
		int outputExpected = 1;
		int outputActual = Assignment1.rem(100,3);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void whenDividedByZero() {
		try{
		int outputExpected = 1;
		int outputActual = Assignment1.rem(100,0);
		assertEquals(outputExpected,outputActual);
		}catch(Exception e){
			System.out.print("divison by 0");
		}
	}
	@Test
	public void gcdNormal() {
		int outputExpected = 1;
		int outputActual = Assignment1.gcd(100, 3);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void gcdAGreater() {
		int outputExpected = 1;
		int outputActual = Assignment1.gcd(2,1);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void gcdBGreater() {
		int outputExpected = 6;
		int outputActual = Assignment1.gcd(12, 18);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void largestDigit() {
		int outputExpected = 2;
		int outputActual = Assignment1.largestDigit(2);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void largestDigit1() {
		int outputExpected = 9;
		int outputActual = Assignment1.largestDigit(1257369);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void largestDigit2(){
		int outputExpected = 4;
		int outputActual = Assignment1.largestDigit(444);
		assertEquals(outputExpected,outputActual);
	}

}
