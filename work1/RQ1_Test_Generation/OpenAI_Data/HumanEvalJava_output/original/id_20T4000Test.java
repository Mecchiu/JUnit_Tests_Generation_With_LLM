// FindClosestElementsTest.java
package original;

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
		numbers.add(3.9);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(2.2);
		List<Double> expected = new ArrayList<Double>();
		expected.add(3.9);
		expected.add(4.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
	}
	
	@Test
	void testFindClosestElements2() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(5.9);
		numbers.add(4.0);
		numbers.add(5.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(5.0);
		expected.add(5.9);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
	}
	
	@Test
	void testFindClosestElements3() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(2.2);
		List<Double> expected = new ArrayList<Double>();
		expected.add(2.0);
		expected.add(2.2);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
	}
	
	@Test
	void testFindClosestElements4() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(2.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(2.0);
		expected.add(2.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
	}
	
	@Test
	void testFindClosestElements5() {
		List<Double> numbers = new ArrayList<Double>();
		numbers.add(1.1);
		numbers.add(2.2);
		numbers.add(3.1);
		numbers.add(4.1);
		numbers.add(5.1);
		List<Double> expected = new ArrayList<Double>();
		expected.add(2.2);
		expected.add(3.1);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
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
		numbers.add(61.0);
		numbers.add(62.0);
		numbers.add(63.0);
		numbers.add(64.0);
		numbers.add(65.0);
		numbers.add(66.0);
		numbers.add(67.0);
		numbers.add(68.0);
		numbers.add(69.0);
		numbers.add(70.0);
		numbers.add(71.0);
		numbers.add(72.0);
		numbers.add(73.0);
		numbers.add(74.0);
		numbers.add(75.0);
		numbers.add(76.0);
		numbers.add(77.0);
		numbers.add(78.0);
		numbers.add(79.0);
		numbers.add(80.0);
		numbers.add(81.0);
		numbers.add(82.0);
		numbers.add(83.0);
		numbers.add(84.0);
		numbers.add(85.0);
		numbers.add(86.0);
		numbers.add(87.0);
		numbers.add(88.0);
		numbers.add(89.0);
		numbers.add(90.0);
		numbers.add(91.0);
		numbers.add(92.0);
		numbers.add(93.0);
		numbers.add(94.0);
		numbers.add(95.0);
		numbers.add(96.0);
		numbers.add(97.0);
		numbers.add(98.0);
		numbers.add(99.0);
		numbers.add(100.0);
		List<Double> expected = new ArrayList<Double>();
		expected.add(1.0);
		expected.add(2.0);
		assertEquals(expected, FindClosestElements.findClosestElements(numbers));
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
		numbers.add(66.0);
		numbers.add(67.0);
		numbers.add(68.0);
		numbers.add(69.0);
		numbers.add(70.0);
		numbers.add(71.0);
		numbers.add(72.0);
		numbers.add(73.0);
		numbers.add(74.0);
		numbers.add(75.0);
		numbers.add(76.0);
		numbers.add(77.0);
		numbers.add(78.0);
		numbers.add(79.0);
		numbers.add(80.0);
		numbers.add(81.0);
		numbers.add(82.0);
		numbers.add(83.0);
		numbers.add(84.0);
		numbers.add(85.0);
		numbers.add(86.0);
		numbers.add(87.0);
		numbers.add(88.0);
		numbers.add(89.0);
		numbers.add(90.0);
		numbers.add(91.0);
		numbers.add(92.0);
		numbers.add(93.0);
		numbers.add(94.0);
		numbers.add(95.0);
		numbers.add(96.0);
		numbers.add(97.0);
		numbers.add(98.0);
		numbers.add(99.0);
		numbers.add(100.0);
		numbers.add(101.0);
		numbers.add(102.0);
		numbers.add(103.0);
		numbers.add(104.0);
		numbers.add(105.0);
		numbers.add(106.0);
		numbers.add(107.0);
		numbers.add(108.0);
		numbers.add(109.0);
		numbers.add(110.0);
		numbers.add(111.0);
		numbers.add(112.0);
		numbers.add(113.0);
		numbers.add(114.0);
		numbers.add(115.0);
		numbers.add(116.0);
		numbers.add(117.0);
		numbers.add(118.0);
		numbers.add(119.0);
		numbers.add(120.0);
		numbers.add(121.0);
		numbers.add(122.0);
		numbers.add(123.0);
		numbers.add(124.0);
		numbers.add(125.0);
		numbers.add(126.0);
		numbers.add(127.0);
		numbers.add(128.0);
		numbers.add(129.0);
		numbers.add(130.0);
		numbers.add(131.0);
		numbers.add(132.0);
		numbers.add(133.0);
		numbers.add(134.0);
		numbers.add(135.0);
		numbers.add(136.0);
		numbers.add(137.0);
		numbers.add(138.0);
		numbers.add(139.0);
		numbers.add(140.0);
		numbers.add(141.0);
		numbers.add(142.0);
		numbers.add(143.0);
		numbers.add(144.0);
		numbers.add(145.0);
		numbers.add(146.0);
		numbers.add(147.0);
		numbers.add(148.0);
		numbers.add(149.0);
		numbers.add(150.0);
		numbers.add(151.0);
		numbers.add(