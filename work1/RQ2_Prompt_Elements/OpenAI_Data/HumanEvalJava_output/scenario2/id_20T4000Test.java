// FindClosestElementsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

	@Test
	void testFindClosestElements() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertEquals(2, result.size());
		assertEquals(1.0, result.get(0));
		assertEquals(2.0, result.get(1));
	}
	
	@Test
	void testFindClosestElements2() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		numbers.add(16.0);
		numbers.add(17.0);
		numbers.add(18.0);
		numbers.add(19.0);
		numbers.add(20.0);
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertEquals(2, result.size());
		assertEquals(1.0, result.get(0));
		assertEquals(2.0, result.get(1));
	}
	
	@Test
	void testFindClosestElements3() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		numbers.add(16.0);
		numbers.add(17.0);
		numbers.add(18.0);
		numbers.add(19.0);
		numbers.add(20.0);
		numbers.add(21.0);
		numbers.add(22.0);
		numbers.add(23.0);
		numbers.add(24.0);
		numbers.add(25.0);
		numbers.add(26.0);
		numbers.add(27.0);
		numbers.add(28.0);
		numbers.add(29.0);
		numbers.add(30.0);
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertEquals(2, result.size());
		assertEquals(1.0, result.get(0));
		assertEquals(2.0, result.get(1));
	}
	
	@Test
	void testFindClosestElements4() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		numbers.add(16.0);
		numbers.add(17.0);
		numbers.add(18.0);
		numbers.add(19.0);
		numbers.add(20.0);
		numbers.add(21.0);
		numbers.add(22.0);
		numbers.add(23.0);
		numbers.add(24.0);
		numbers.add(25.0);
		numbers.add(26.0);
		numbers.add(27.0);
		numbers.add(28.0);
		numbers.add(29.0);
		numbers.add(30.0);
		numbers.add(31.0);
		numbers.add(32.0);
		numbers.add(33.0);
		numbers.add(34.0);
		numbers.add(35.0);
		numbers.add(36.0);
		numbers.add(37.0);
		numbers.add(38.0);
		numbers.add(39.0);
		numbers.add(40.0);
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertEquals(2, result.size());
		assertEquals(1.0, result.get(0));
		assertEquals(2.0, result.get(1));
	}
	
	@Test
	void testFindClosestElements5() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		numbers.add(16.0);
		numbers.add(17.0);
		numbers.add(18.0);
		numbers.add(19.0);
		numbers.add(20.0);
		numbers.add(21.0);
		numbers.add(22.0);
		numbers.add(23.0);
		numbers.add(24.0);
		numbers.add(25.0);
		numbers.add(26.0);
		numbers.add(27.0);
		numbers.add(28.0);
		numbers.add(29.0);
		numbers.add(30.0);
		numbers.add(31.0);
		numbers.add(32.0);
		numbers.add(33.0);
		numbers.add(34.0);
		numbers.add(35.0);
		numbers.add(36.0);
		numbers.add(37.0);
		numbers.add(38.0);
		numbers.add(39.0);
		numbers.add(40.0);
		numbers.add(41.0);
		numbers.add(42.0);
		numbers.add(43.0);
		numbers.add(44.0);
		numbers.add(45.0);
		numbers.add(46.0);
		numbers.add(47.0);
		numbers.add(48.0);
		numbers.add(49.0);
		numbers.add(50.0);
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertEquals(2, result.size());
		assertEquals(1.0, result.get(0));
		assertEquals(2.0, result.get(1));
	}
	
	@Test
	void testFindClosestElements6() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		numbers.add(16.0);
		numbers.add(17.0);
		numbers.add(18.0);
		numbers.add(19.0);
		numbers.add(20.0);
		numbers.add(21.0);
		numbers.add(22.0);
		numbers.add(23.0);
		numbers.add(24.0);
		numbers.add(25.0);
		numbers.add(26.0);
		numbers.add(27.0);
		numbers.add(28.0);
		numbers.add(29.0);
		numbers.add(30.0);
		numbers.add(31.0);
		numbers.add(32.0);
		numbers.add(33.0);
		numbers.add(34.0);
		numbers.add(35.0);
		numbers.add(36.0);
		numbers.add(37.0);
		numbers.add(38.0);
		numbers.add(39.0);
		numbers.add(40.0);
		numbers.add(41.0);
		numbers.add(42.0);
		numbers.add(43.0);
		numbers.add(44.0);
		numbers.add(45.0);
		numbers.add(46.0);
		numbers.add(47.0);
		numbers.add(48.0);
		numbers.add(49.0);
		numbers.add(50.0);
		numbers.add(51.0);
		numbers.add(52.0);
		numbers.add(53.0);
		numbers.add(54.0);
		numbers.add(55.0);
		numbers.add(56.0);
		numbers.add(57.0);
		numbers.add(58.0);
		numbers.add(59.0);
		numbers.add(60.0);
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertEquals(2, result.size());
		assertEquals(1.0, result.get(0));
		assertEquals(2.0, result.get(1));
	}
	
	@Test
	void testFindClosestElements7() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(6.0);
		numbers.add(7.0);
		numbers.add(8.0);
		numbers.add(9.0);
		numbers.add(10.0);
		numbers.add(11.0);
		numbers.add(12.0);
		numbers.add(13.0);
		numbers.add(14.0);
		numbers.add(15.0);
		numbers.add(16.0);
		numbers.add(17.0);
		numbers.add(18.0);
		numbers.add(19.0);
		numbers.add(20.0);
		numbers.add(21.0);
		numbers.add(22.0);
		numbers.add(23.0);
		numbers.add(24.0);
		numbers.add(25.0);
		numbers.add(26.0);
		numbers.add(27.0);
		numbers.add(28.0);
		numbers.add(29.0);
		numbers.add(30.0);
		numbers.add(31.0);
		numbers.add(32.0);
		numbers.add(33.0);
		numbers.add(34.0);
		numbers.add(35.0);
		numbers.add(36.0);
		numbers.add(37.0);
		numbers.add(38.0);
		numbers.add(39.0);
		numbers.add(40.0);
		numbers.add(41.0);
		numbers.add(42.0);
		numbers.add(43.0);
		numbers.add(44.0);
		numbers.add(45.0);
		numbers.add(46.0);
		numbers.add(47.0);
		numbers.add(48.0);
		numbers.add(49.0);
		numbers.add(50.0);
		numbers.add(51.0);
		numbers.add(52.0);
		numbers.add(53.0);
		numbers.add(54.0);
		numbers.add(55.0);
		numbers.add(56.0);
		numbers.add(57.0);
		numbers.add(58.0);
		numbers.add(59.0);
		numbers.add(60.0);
		numbers.add(61.0);
		numbers.add(62.0);
		numbers.add(63.0);
		numbers.add(64.0);
		numbers.add(65.0);
	