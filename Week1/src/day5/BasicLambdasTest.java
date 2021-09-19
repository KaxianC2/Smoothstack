package day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;


class BasicLambdasTest {
	private String[] testcases = {"b","c","e","ex","a","f"};
	private Integer[] testnum = {4,33};
	BasicLambdas l = new BasicLambdas();

	@Test
	void testAscending() {
		String[] t1= {"a","b","c","e","ex","f"};
		assertArrayEquals(l.smallestToBiggest(testcases),t1);
	}
	
	@Test
	void testDescending() {
		String[] t1= {"f","ex","e","c","b","a"};
		assertArrayEquals(l.biggestToSmallest(testcases),t1);
	}
	
	@Test
	void testFirstLetter() {
		String[] t1= {"a","b","c","e","ex","f"};
		assertArrayEquals(l.byFirstLetter(testcases),t1);
	}
	
	@Test
	void testByE() {
		String[] t1= {"e","ex","b","c","a","f"};
		assertArrayEquals(l.sortByE(testcases),t1);
	}
	
	@Test
	void testOE() {
		String[] t1= {"e4","o33"};
		assertArrayEquals(l.isNumOddOrEven(testnum).toArray(),t1);
	}
	
	@Test
	void testFil() {
		String[] t1= {"aaa","axa"};
		String[] t2= {"aaa","aabx","bab","axa"};
		assertArrayEquals(l.fil(t2).toArray(),t1);
	}
	
	

}
