package day5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Part2Test {
	private Part2 x = new Part2();

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void testOE() {
		x.oddOrEven(2);
		assertEquals("EVEN", outputStreamCaptor.toString()
			      .trim());
	}
	
	@Test
	void testPrime() {
		x.isPrime(2);
		assertEquals("Prime", outputStreamCaptor.toString()
			      .trim());
	}
	
	@Test
	void testpala() {
		x.isPala(212);
		assertEquals("Palindrome", outputStreamCaptor.toString()
			      .trim());
	}
	
	@Test
	void testRightmost()
	{
		Integer[] temp = {12,13,14,15,16,1111,11123333,555};
        List<Integer> a= Arrays.asList(temp);
        a=x.rightMostDigit(a);
        Integer[] testcase = {2,3,4,5,6,1,3,5};
        assertArrayEquals(a.toArray(), testcase);
	}
	
	@Test
	void testremoveX()
	{
		String[] asd = {"a","bx","cxx","dxxa","exxxc"};
        List<String> asdd= Arrays.asList(asd);
        asdd = x.removeX(asdd);
        String[] testcase = {"a","b","c","da","ec"};
        assertArrayEquals(asdd.toArray(), testcase);
	}
	
	@Test
	void testGroupSum()
	{
		int[] testing = {2,4,4,8};
        assertFalse(x.groupSumWrapper(0, testing, 14));
        assertTrue(x.groupSumWrapper(0, testing, 16));
	}

}
