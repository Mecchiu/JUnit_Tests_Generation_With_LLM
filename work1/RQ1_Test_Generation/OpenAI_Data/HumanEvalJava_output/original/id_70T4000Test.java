// StrangeSortListTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(9);
		expected.add(6);
		expected.add(8);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList3() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(9);
		expected.add(5);
		expected.add(8);
		expected.add(6);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(5);
		lst.add(5);
		lst.add(5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(5);
		expected.add(5);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList6() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(8);
		expected.add(2);
		expected.add(7);
		expected.add(3);
		expected.add(6);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(0);
		lst.add(2);
		lst.add(2);
		lst.add(2);
		lst.add(5);
		lst.add(5);
		lst.add(-5);
		lst.add(-5);
		List<Object> expected = new ArrayList<Object>();
		expected.add(-5);
		expected.add(5);
		expected.add(-5);
		expected.add(5);
		expected.add(0);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(111111);
		List<Object> expected = new ArrayList<Object>();
		expected.add(111111);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
	
	/**
	* Test case for {@link StrangeSortList#strangeSortList(List)} method.
	* It tests the method with a list of integers.
	*/
	@Test
	void testStrangeSortList10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(10);
		lst.add(11);
		lst.add(12);
		lst.add(13);
		lst.add(14);
		lst.add(15);
		lst.add(16);
		lst.add(17);
		lst.add(18);
		lst.add(19);
		lst.add(20);
		lst.add(21);
		lst.add(22);
		lst.add(23);
		lst.add(24);
		lst.add(25);
		lst.add(26);
		lst.add(27);
		lst.add(28);
		lst.add(29);
		lst.add(30);
		lst.add(31);
		lst.add(32);
		lst.add(33);
		lst.add(34);
		lst.add(35);
		lst.add(36);
		lst.add(37);
		lst.add(38);
		lst.add(39);
		lst.add(40);
		lst.add(41);
		lst.add(42);
		lst.add(43);
		lst.add(44);
		lst.add(45);
		lst.add(46);
		lst.add(47);
		lst.add(48);
		lst.add(49);
		lst.add(50);
		lst.add(51);
		lst.add(52);
		lst.add(53);
		lst.add(54);
		lst.add(55);
		lst.add(56);
		lst.add(57);
		lst.add(58);
		lst.add(59);
		lst.add(60);
		lst.add(61);
		lst.add(62);
		lst.add(63);
		lst.add(64);
		lst.add(65);
		lst.add(66);
		lst.add(67);
		lst.add(68);
		lst.add(69);
		lst.add(70);
		lst.add(71);
		lst.add(72);
		lst.add(73);
		lst.add(74);
		lst.add(75);
		lst.add(76);
		lst.add(77);
		lst.add(78);
		lst.add(79);
		lst.add(80);
		lst.add(81);
		lst.add(82);
		lst.add(83);
		lst.add(84);
		lst.add(85);
		lst.add(86);
		lst.add(87);
		lst.add(88);
		lst.add(89);
		lst.add(90);
		lst.add(91);
		lst.add(92);
		lst.add(93);
		lst.add(94);
		lst.add(95);
		lst.add(96);
		lst.add(97);
		lst.add(98);
		lst.add(99);
		lst.add(100);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(100);
		expected.add(2);
		expected.add(99);
		expected.add(3);
		expected.add(98);
		expected.add(4);
		expected.add(97);
		expected.add(5);
		expected.add(96);
		expected.add(6);
		expected.add(95);
		expected.add(7);
		expected.add(94);
		expected.add(8);
		expected.add(93);
		expected.add(9);
		expected.add(92);
		expected.add(10);
		expected.add(91);
		expected.add(11);
		expected.add(90);
		expected.add(12);
		expected.add(89);
		expected.add(13);
		expected.add(88);
		expected.add(14);
		expected.add(87);
		expected.add(15);
		expected.add(86);
		expected.add(16);
		expected.add(85);
		expected.add(17);
		expected.add(84);
		expected.add(18);
		expected.add(83);
		expected.add(19);
		expected.add(82);
		expected.add(20);
		expected.add(81);
		expected.add(21);
		expected.add(80);
		expected.add(22);
		expected.add(79);
		expected.add(23);
		expected.add(78);
		expected.add(24);
		expected.add(77);
		expected.add(25);
		expected.add(76);
		expected.add(26);
		expected.add(75);
		expected.add(27);
		expected.add(74);
		expected.add(28);
		expected.add(73);
		expected.add(29);
		expected.add(72);
		expected.add(30);
		expected.add(71);
		expected.add(31);
		expected.add(70);
		expected.add(32);
		expected.add(69);
		expected.add(33);
		expected.add(68);
		expected.add(34);
		expected.add(67);
		expected.add(35);
		expected.add(66);
		expected.add(36);
		expected.add(65);
		expected.add(37);
		expected.add(64);
		expected.add(38);
		expected.add(63);
		expected.add(39);
		expected.add(62);
		expected.add(40);
		expected.add(61);
		expected.add(41);
		expected.add(60);
		expected.add(42);
		expected.add(59);
		expected.add(43);
		expected.add(58);
		expected.add(44);
		expected.add(57);
		expected.add(45);
		expected.add(56);
		expected.add(46);
		expected.add(55);
		expected.add(47);
		expected.add(54);
		expected.add(48);
		expected.add(53);
		expected.add(49);
		expected.add(52);
		expected.add(50);
		expected.add(51);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
}