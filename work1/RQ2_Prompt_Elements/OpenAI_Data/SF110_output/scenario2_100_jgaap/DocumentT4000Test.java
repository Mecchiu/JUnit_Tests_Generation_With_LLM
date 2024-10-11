// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#stringify()} method.
*/
class DocumentTest {

	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify() {
		Document doc = new Document();
		doc.procText = new Vector<Integer>();
		doc.procText.add(97);
		doc.procText.add(98);
		doc.procText.add(99);
		assertEquals("abc", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify2() {
		Document doc = new Document();
		doc.procText = new Vector<Integer>();
		doc.procText.add(97);
		doc.procText.add(98);
		doc.procText.add(99);
		doc.procText.add(100);
		doc.procText.add(101);
		doc.procText.add(102);
		doc.procText.add(103);
		doc.procText.add(104);
		doc.procText.add(105);
		doc.procText.add(106);
		assertEquals("abcdefghij", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify3() {
		Document doc = new Document();
		doc.procText = new Vector<Integer>();
		doc.procText.add(97);
		doc.procText.add(98);
		doc.procText.add(99);
		doc.procText.add(100);
		doc.procText.add(101);
		doc.procText.add(102);
		doc.procText.add(103);
		doc.procText.add(104);
		doc.procText.add(105);
		doc.procText.add(106);
		doc.procText.add(107);
		doc.procText.add(108);
		doc.procText.add(109);
		doc.procText.add(110);
		doc.procText.add(111);
		doc.procText.add(112);
		doc.procText.add(113);
		doc.procText.add(114);
		doc.procText.add(115);
		doc.procText.add(116);
		doc.procText.add(117);
		doc.procText.add(118);
		doc.procText.add(119);
		doc.procText.add(120);
		doc.procText.add(121);
		doc.procText.add(122);
		assertEquals("abcdefghijklmnopqrstuvwxyz", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify4() {
		Document doc = new Document();
		doc.procText = new Vector<Integer>();
		doc.procText.add(97);
		doc.procText.add(98);
		doc.procText.add(99);
		doc.procText.add(100);
		doc.procText.add(101);
		doc.procText.add(102);
		doc.procText.add(103);
		doc.procText.add(104);
		doc.procText.add(105);
		doc.procText.add(106);
		doc.procText.add(107);
		doc.procText.add(108);
		doc.procText.add(109);
		doc.procText.add(110);
		doc.procText.add(111);
		doc.procText.add(112);
		doc.procText.add(113);
		doc.procText.add(114);
		doc.procText.add(115);
		doc.procText.add(116);
		doc.procText.add(117);
		doc.procText.add(118);
		doc.procText.add(119);
		doc.procText.add(120);
		doc.procText.add(121);
		doc.procText.add(122);
		doc.procText.add(65);
		doc.procText.add(66);
		doc.procText.add(67);
		doc.procText.add(68);
		doc.procText.add(69);
		doc.procText.add(70);
		doc.procText.add(71);
		doc.procText.add(72);
		doc.procText.add(73);
		doc.procText.add(74);
		doc.procText.add(75);
		doc.procText.add(76);
		doc.procText.add(77);
		doc.procText.add(78);
		doc.procText.add(79);
		doc.procText.add(80);
		doc.procText.add(81);
		doc.procText.add(82);
		doc.procText.add(83);
		doc.procText.add(84);
		doc.procText.add(85);
		doc.procText.add(86);
		doc.procText.add(87);
		doc.procText.add(88);
		doc.procText.add(89);
		doc.procText.add(90);
		assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify5() {
		Document doc = new Document();
		doc.procText = new Vector<Integer>();
		doc.procText.add(97);
		doc.procText.add(98);
		doc.procText.add(99);
		doc.procText.add(100);
		doc.procText.add(101);
		doc.procText.add(102);
		doc.procText.add(103);
		doc.procText.add(104);
		doc.procText.add(105);
		doc.procText.add(106);
		doc.procText.add(107);
		doc.procText.add(108);
		doc.procText.add(109);
		doc.procText.add(110);
		doc.procText.add(111);
		doc.procText.add(112);
		doc.procText.add(113);
		doc.procText.add(114);
		doc.procText.add(115);
		doc.procText.add(116);
		doc.procText.add(117);
		doc.procText.add(118);
		doc.procText.add(119);
		doc.procText.add(120);
		doc.procText.add(121);
		doc.procText.add(122);
		doc.procText.add(65);
		doc.procText.add(66);
		doc.procText.add(67);
		doc.procText.add(68);
		doc.procText.add(69);
		doc.procText.add(70);
		doc.procText.add(71);
		doc.procText.add(72);
		doc.procText.add(73);
		doc.procText.add(74);
		doc.procText.add(75);
		doc.procText.add(76);
		doc.procText.add(77);
		doc.procText.add(78);
		doc.procText.add(79);
		doc.procText.add(80);
		doc.procText.add(81);
		doc.procText.add(82);
		doc.procText.add(83);
		doc.procText.add(84);
		doc.procText.add(85);
		doc.procText.add(86);
		doc.procText.add(87);
		doc.procText.add(88);
		doc.procText.add(89);
		doc.procText.add(90);
		doc.procText.add(48);
		doc.procText.add(49);
		doc.procText.add(50);
		doc.procText.add(51);
		doc.procText.add(52);
		doc.procText.add(53);
		doc.procText.add(54);
		doc.procText.add(55);
		doc.procText.add(56);
		doc.procText.add(57);
		assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", doc.stringify());
	}
	
	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify6() {
		Document doc = new Document();
		doc.procText = new Vector<Integer>();
		doc.procText.add(97);
		doc.procText.add(98);
		doc.procText.add(99);
		doc.procText.add(100);
		doc.procText.add(101);
		doc.procText.add(102);
		doc.procText.add(103);
		doc.procText.add(104);
		doc.procText.add(105);
		doc.procText.add(106);
		doc.procText.add(107);
		doc.procText.add(108);
		doc.procText.add(109);
		doc.procText.add(110);
		doc.procText.add(111);
		doc.procText.add(112);
		doc.procText.add(113);
		doc.procText.add(114);
		doc.procText.add(115);
		doc.procText.add(116);
		doc.procText.add(117);
		doc.procText.add(118);
		doc.procText.add(119);
		doc.procText.add(120);
		doc.procText.add(121);
		doc.procText.add(122);
		doc.procText.add(65);
		doc.procText.add(66);
		doc.procText.add(67);
		doc.procText.add(68);
		doc.procText.add(69);
		doc.procText.add(70);
		doc.procText.add(71);
		doc.procText.add(72);
		doc.procText.add(73);
		doc.procText.add(74);
		doc.procText.add(75);
		doc.procText.add(76);
		doc.procText.add(77);
		doc.procText.add(78);
		doc.procText.add(79);
		doc.procText.add(80);
		doc.procText.add(81);
		doc.procText.add(82);
		doc.procText.add(83);
		doc.procText.add(84);
		doc.procText.add(85);
		doc.procText.add(86);
		doc.procText.add(87);
		doc.procText.add(88);
		doc.procText.add(89);
		doc.procText.add(90);
		doc.procText.add(48);
		doc.procText.add(49);
		doc.procText.add(50);
		doc.procText.add(51);
		doc.procText.add(52);
		doc.procText.add(53);
		doc.procText.add(54);
		doc.procText.add(55);
		doc.procText.add(56);
		doc.procText.add(57);
		doc.procText.add(32);
		doc.procText.add(33);
		doc.procText.add(34);
		doc.procText.add(35);
		doc.procText.add(36);
		doc.procText.add(37);
		doc.procText.add(38);
		doc.procText.add(39);
		doc.procText.add(40);
		doc.procText.add(41);
		doc.procText.add(42);
		doc.procText.add(43);
		doc.procText.add(44);
		doc.procText.add(45);
		doc.procText.add(46);
		doc.procText.add(47);
		doc.procText.add(58);
		doc.procText.add(59);
		doc.procText.add(60);
		doc.procText.add(61);
		doc.procText.add(62);
		doc.procText.add(63);
		doc.procText.add(64);
		doc.procText.add(91);
		doc.procText.add(92);
		doc.procText.add(93);
		doc.procText.add(94);
		doc.procText.add(95);
		doc.procText.add(96);
		doc.procText.add(123);
		doc.procText.add(124);
		doc.procText.add(125);
		doc.procText.add(126);
		doc.procText.add(127);
		doc.procText.add(128);
		doc.procText.add(129);
		doc.procText.add(130);
		doc.procText.add(131);
		doc.procText.add(132);
		doc.procText.add(133);
		doc.procText.add(134);
		doc.procText.add(135);
		doc.procText.add(136);
		doc.procText.add(137);
		doc.procText.add(138);
		doc.procText.add(139);
		doc.procText.add(140);
		doc.procText.add(141);
		doc.procText.add(142);
		doc.procText.add(143);
		doc.procText.add(144);
		doc.procText.add(145);
		doc.procText.add(146);
		doc.procText.add(147);
		doc.procText.add(148);
		doc.procText.add(149);
		doc.procText.add(150);
		doc.procText.add(151);
		doc.procText.add(152);
		doc.procText.add(153);
		doc.procText.add(154);
		doc.procText.add(155);
		doc.procText.add(156);
		doc.procText.add(157);
		doc.procText.add(158);
		doc.procText.add(159);
		doc.procText.add(160);
		doc.procText.add(161);
		doc.procText.add(162);
