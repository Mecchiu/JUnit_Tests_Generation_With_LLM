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
		assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", doc.stringify());
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
		doc.procText.