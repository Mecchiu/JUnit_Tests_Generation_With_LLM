// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

	@Test
	void testSumProduct() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductEmpty() {
		List<Object> numbers = new ArrayList<Object>();
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(0, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void testSumProductOne() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(3, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void testSumProductZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(100);
		numbers.add(0);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(100, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void testSumProductThree() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(15, result.get(0));
		assertEquals(105, result.get(1));
	}
	
	@Test
	void testSumProductSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(10);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(10, result.get(1));
	}
	
	@Test
	void testSumProductNegative() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		numbers.add(-2);
		numbers.add(-3);
		numbers.add(-4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductNegativeOne() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		numbers.add(-1);
		numbers.add(-1);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-3, result.get(0));
		assertEquals(-1, result.get(1));
	}
	
	@Test
	void testSumProductNegativeZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-100);
		numbers.add(0);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-100, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void testSumProductNegativeThree() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-3);
		numbers.add(-5);
		numbers.add(-7);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-15, result.get(0));
		assertEquals(-105, result.get(1));
	}
	
	@Test
	void testSumProductNegativeSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-10);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-10, result.get(0));
		assertEquals(-10, result.get(1));
	}
}

// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
		
	@Test
	void testSumProduct() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductEmpty() {
		List<Object> numbers = new ArrayList<Object>();
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(0, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void testSumProductOne() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(3, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void testSumProductZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(100);
		numbers.add(0);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(100, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void testSumProductThree() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(15, result.get(0));
		assertEquals(105, result.get(1));
	}
	
	@Test
	void testSumProductSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(10);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(10, result.get(1));
	}
	
	@Test
	void testSumProductNegative() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		numbers.add(-2);
		numbers.add(-3);
		numbers.add(-4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductNegativeOne() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		numbers.add(-1);
		numbers.add(-1);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-3, result.get(0));
		assertEquals(-1, result.get(1));
	}
	
	@Test
	void testSumProductNegativeZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-100);
		numbers.add(0);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-100, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void testSumProductNegativeThree() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-3);
		numbers.add(-5);
		numbers.add(-7);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-15, result.get(0));
		assertEquals(-105, result.get(1));
	}
	
	@Test
	void testSumProductNegativeSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-10);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-10, result.get(0));
		assertEquals(-10, result.get(1));
	}
}

// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
		
	@Test
	void testSumProduct() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductEmpty() {
		List<Object> numbers = new ArrayList<Object>();
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(0, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void testSumProductOne() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(3, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void testSumProductZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(100);
		numbers.add(0);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(100, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void testSumProductThree() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(15, result.get(0));
		assertEquals(105, result.get(1));
	}
	
	@Test
	void testSumProductSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(10);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(10, result.get(1));
	}
	
	@Test
	void testSumProductNegative() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		numbers.add(-2);
		numbers.add(-3);
		numbers.add(-4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductNegativeOne() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-1);
		numbers.add(-1);
		numbers.add(-1);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-3, result.get(0));
		assertEquals(-1, result.get(1));
	}
	
	@Test
	void testSumProductNegativeZero() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-100);
		numbers.add(0);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-100, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void testSumProductNegativeThree() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-3);
		numbers.add(-5);
		numbers.add(-7);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-15, result.get(0));
		assertEquals(-105, result.get(1));
	}
	
	@Test
	void testSumProductNegativeSingle() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(-10);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(-10, result.get(0));
		assertEquals(-10, result.get(1));
	}
}

// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains ten unit test cases for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
		
	@Test
	void testSumProduct() {
		List<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		List<Integer> result = SumProduct.sumProduct(numbers);
		assertEquals(10, result.get(0));
		assertEquals(24, result.get(1));
	}
	
	@Test
	void testSumProductEmpty() {
		List<Object> numbers = new ArrayList<Object>();
		List<Integer> result = Sum