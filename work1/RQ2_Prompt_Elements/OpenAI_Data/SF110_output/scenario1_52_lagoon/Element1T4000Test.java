// ElementTest.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfAttributes()} method.
*/
class ElementTest {

	/**
	* Test case 1 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes1() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		assertEquals(3, element.numberOfAttributes());
	}
	
	/**
	* Test case 2 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes2() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
		element.addAttribute("name10", "value10");
		assertEquals(10, element.numberOfAttributes());
	}
	
	/**
	* Test case 3 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes3() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
		element.addAttribute("name10", "value10");
		element.addAttribute("name11", "value11");
		element.addAttribute("name12", "value12");
		element.addAttribute("name13", "value13");
		element.addAttribute("name14", "value14");
		element.addAttribute("name15", "value15");
		element.addAttribute("name16", "value16");
		element.addAttribute("name17", "value17");
		element.addAttribute("name18", "value18");
		element.addAttribute("name19", "value19");
		element.addAttribute("name20", "value20");
		assertEquals(20, element.numberOfAttributes());
	}
	
	/**
	* Test case 4 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes4() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
		element.addAttribute("name10", "value10");
		element.addAttribute("name11", "value11");
		element.addAttribute("name12", "value12");
		element.addAttribute("name13", "value13");
		element.addAttribute("name14", "value14");
		element.addAttribute("name15", "value15");
		element.addAttribute("name16", "value16");
		element.addAttribute("name17", "value17");
		element.addAttribute("name18", "value18");
		element.addAttribute("name19", "value19");
		element.addAttribute("name20", "value20");
		element.addAttribute("name21", "value21");
		element.addAttribute("name22", "value22");
		element.addAttribute("name23", "value23");
		element.addAttribute("name24", "value24");
		element.addAttribute("name25", "value25");
		element.addAttribute("name26", "value26");
		element.addAttribute("name27", "value27");
		element.addAttribute("name28", "value28");
		element.addAttribute("name29", "value29");
		element.addAttribute("name30", "value30");
		assertEquals(30, element.numberOfAttributes());
	}
	
	/**
	* Test case 5 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes5() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
		element.addAttribute("name10", "value10");
		element.addAttribute("name11", "value11");
		element.addAttribute("name12", "value12");
		element.addAttribute("name13", "value13");
		element.addAttribute("name14", "value14");
		element.addAttribute("name15", "value15");
		element.addAttribute("name16", "value16");
		element.addAttribute("name17", "value17");
		element.addAttribute("name18", "value18");
		element.addAttribute("name19", "value19");
		element.addAttribute("name20", "value20");
		element.addAttribute("name21", "value21");
		element.addAttribute("name22", "value22");
		element.addAttribute("name23", "value23");
		element.addAttribute("name24", "value24");
		element.addAttribute("name25", "value25");
		element.addAttribute("name26", "value26");
		element.addAttribute("name27", "value27");
		element.addAttribute("name28", "value28");
		element.addAttribute("name29", "value29");
		element.addAttribute("name30", "value30");
		element.addAttribute("name31", "value31");
		element.addAttribute("name32", "value32");
		element.addAttribute("name33", "value33");
		element.addAttribute("name34", "value34");
		element.addAttribute("name35", "value35");
		element.addAttribute("name36", "value36");
		element.addAttribute("name37", "value37");
		element.addAttribute("name38", "value38");
		element.addAttribute("name39", "value39");
		element.addAttribute("name40", "value40");
		assertEquals(40, element.numberOfAttributes());
	}
	
	/**
	* Test case 6 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes6() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
		element.addAttribute("name10", "value10");
		element.addAttribute("name11", "value11");
		element.addAttribute("name12", "value12");
		element.addAttribute("name13", "value13");
		element.addAttribute("name14", "value14");
		element.addAttribute("name15", "value15");
		element.addAttribute("name16", "value16");
		element.addAttribute("name17", "value17");
		element.addAttribute("name18", "value18");
		element.addAttribute("name19", "value19");
		element.addAttribute("name20", "value20");
		element.addAttribute("name21", "value21");
		element.addAttribute("name22", "value22");
		element.addAttribute("name23", "value23");
		element.addAttribute("name24", "value24");
		element.addAttribute("name25", "value25");
		element.addAttribute("name26", "value26");
		element.addAttribute("name27", "value27");
		element.addAttribute("name28", "value28");
		element.addAttribute("name29", "value29");
		element.addAttribute("name30", "value30");
		element.addAttribute("name31", "value31");
		element.addAttribute("name32", "value32");
		element.addAttribute("name33", "value33");
		element.addAttribute("name34", "value34");
		element.addAttribute("name35", "value35");
		element.addAttribute("name36", "value36");
		element.addAttribute("name37", "value37");
		element.addAttribute("name38", "value38");
		element.addAttribute("name39", "value39");
		element.addAttribute("name40", "value40");
		element.addAttribute("name41", "value41");
		element.addAttribute("name42", "value42");
		element.addAttribute("name43", "value43");
		element.addAttribute("name44", "value44");
		element.addAttribute("name45", "value45");
		element.addAttribute("name46", "value46");
		element.addAttribute("name47", "value47");
		element.addAttribute("name48", "value48");
		element.addAttribute("name49", "value49");
		element.addAttribute("name50", "value50");
		assertEquals(50, element.numberOfAttributes());
	}
	
	/**
	* Test case 7 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes7() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
		element.addAttribute("name10", "value10");
		element.addAttribute("name11", "value11");
		element.addAttribute("name12", "value12");
		element.addAttribute("name13", "value13");
		element.addAttribute("name14", "value14");
		element.addAttribute("name15", "value15");
		element.addAttribute("name16", "value16");
		element.addAttribute("name17", "value17");
		element.addAttribute("name18", "value18");
		element.addAttribute("name19", "value19");
		element.addAttribute("name20", "value20");
		element.addAttribute("name21", "value21");
		element.addAttribute("name22", "value22");
		element.addAttribute("name23", "value23");
		element.addAttribute("name24", "value24");
		element.addAttribute("name25", "value25");
		element.addAttribute("name26", "value26");
		element.addAttribute("name27", "value27");
		element.addAttribute("name28", "value28");
		element.addAttribute("name29", "value29");
		element.addAttribute("name30", "value30");
		element.addAttribute("name31", "value31");
		element.addAttribute("name32", "value32");
		element.addAttribute("name33", "value33");
		element.addAttribute("name34", "value34");
		element.addAttribute("name35", "value35");
		element.addAttribute("name36", "value36");
		element.addAttribute("name37", "value37");
		element.addAttribute("name38", "value38");
		element.addAttribute("name39", "value39");
		element.addAttribute("name40", "value40");
		element.addAttribute("name41", "value41");
		element.addAttribute("name42", "value42");
		element.addAttribute("name43", "value43");
		element.addAttribute("name44", "value44");
		element.addAttribute("name45", "value45");
		element.addAttribute("name46", "value46");
		element.addAttribute("name47", "value47");
		element.addAttribute("name48", "value48");
		element.addAttribute("name49", "value49");
		element.addAttribute("name50", "value50");
		element.addAttribute("name51", "value51");
		element.addAttribute("name52", "value52");
		element.addAttribute("name53", "value53");
		element.addAttribute("name54", "value54");
		element.addAttribute("name55", "value55");
		element.addAttribute("name56", "value56");
		element.addAttribute("name57", "value57");
		element.addAttribute("name58", "value58");
		element.addAttribute("name59", "value59");
		element.addAttribute("name60", "value60");
		assertEquals(60, element.numberOfAttributes());
	}
	
	/**
	* Test case 8 for {@link Element#numberOfAttributes()}.
	* It tests the method with a valid input.
	*/
	@Test
	void testNumberOfAttributes8() {
		Element element = new Element("name", "uri", "prefix");
		element.addAttribute("name1", "value1");
		element.addAttribute("name2", "value2");
		element.addAttribute("name3", "value3");
		element.addAttribute("name4", "value4");
		element.addAttribute("name5", "value5");
		element.addAttribute("name6", "value6");
		element.addAttribute("name7", "value7");
		element.addAttribute("name8", "value8");
		element.addAttribute("name9", "value9");
	