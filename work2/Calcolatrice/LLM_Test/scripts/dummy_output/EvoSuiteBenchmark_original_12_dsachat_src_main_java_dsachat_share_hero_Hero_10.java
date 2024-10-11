// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains one unit test case for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {
		
	@Test
	void test() {
		// a test set of attributes:
		// 0 = a name
		// 1 = a dexterity
		// 2 = a constitution
		// 3 = a life
		
		Vector<Attribute> v = new Vector<Attribute>() {};
		
		// no extra field is defined for the attribute
		assertEquals(v.get(0).getName(), v.get(0).getShortName());
		assertEquals(v.get(0).getDex(), v.get(0).getDexValue());
		assertEquals(v.get(0).getCon(), v.get(0).getConValue());
		assertEquals(v.get(0).getLife(), v.get(0).getLifeValue());
		
		Attribute attribute = v.get(0);
		assertEquals(v.get(1).getName(), attribute.getName());
		assertEquals(v.get(1).getDex(), attribute.getDexValue());
		assertEquals(v.get(1).getCon(), attribute.getConValue());
		assertEquals(v.get(1).getLife(), attribute.getLifeValue());
		
		// extra field is defined
		AttributeAttributeTable att = new AttributeAttributeTable(v,0);
		assertEquals(v.get(2).getName(), att.getAttribute(0).getName());
		assertEquals(v.get(2).getDex(), att.get(0).getDexValue());
		assertEquals(v.get(2).getCon(), att.get(0).getConValue());
		assertEquals(v.get(2).getLife(), att.get(0).getLifeValue());
		
		// default name
		assertNull(v.get(3).getName());
		// extra field is not defined
		assertNull(v.get(4).getName());
	}
}