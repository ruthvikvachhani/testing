package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator ;
	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println(calculator.getClass());
	}
	@Test
	void testAdd() {
		int result = calculator.add(1,3);// act	
		assertEquals(4, result);//assert
	}
	
	@Test
	void testAddOneNegative() {
		
		int result = calculator.add(-1,3);// act	
		assertEquals(2, result);//assert
	}
	
	@Test
	void testAddTwoNegative() {
		
		int result = calculator.add(-1,-3);// act	
		assertEquals(-4, result);//assert
	}
	
	@Test
	void testDivide() {
		
		float result = calculator.divide(1,2);// act	
		assertEquals(0.0f, result);//assert
	}
	
	@Test
	void testDivideByZero() {
		
		try {
			calculator.divide(2, 2);
		} catch (Exception e) {
			// TODO: handle exception
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}
	
	@Test
	void testAddFloat() {
		
		float result = calculator.add(2.2f,3.1f);// act	
		assertEquals(5.3f,result,"Test failed");//assert
	}

}
