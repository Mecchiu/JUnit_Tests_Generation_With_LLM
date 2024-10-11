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
		
	/**
	 * Test for <a href="http://www.ics.uci.edu/~dagitari/Documents/papers/s_attributes.pdf"> http://www.ics.uci.edu/~dagitari/Documents/papers/s_attributes.pdf </a>
	 */
	@Test
	public void getAttrValueTest() {
		
		final Hero hero = new Hero();
		final HeroTest test = this;
		
		// get all attributes
		Vector<Test.Attribute> attrVec = new Vector<>();
		assertNotNull(attrVec);
		Iterator<Attribute> attrIter = test.getAttrs().iterator();
		while (attrIter.hasNext()) {
			String n = attrIter.next().toString();
			attrVec.add(n);
		}
		assertEquals("attributes in test", "AttrValue", attrVec.get(0).toString());
		
		HeroAttrsTestAttr testAttr = new HeroAttrsTestAttr();
		Element attr = testAttr.createAttrElement(new Element("id.set-" + "test.testAttrId"));
		attr.add(attrIter.next().createElement());
		test.getAttrs().add(attr);
		assertEquals("attributes name in testAttr, test.testAttrId", "test.testAttrId", testAttr.getTestAttr().toString());
		assertEquals("attributes value in testAttr, test.testAttrId", 3, testAttr.getValue());
	
		testAttr.resetAndTestValue(1, 3);
		assertEquals("attributes value in testAttr, test.testAttrId", 3, testAttr.getValue());
	}
	
	public class Test {
		public void testAttrElement(Element e) {
			Vector<Test.Attribute> attrVec = new Vector<>();
			assertNotNull(attrVec);
			Iterator<Attribute> attrIter = e.elementIterator("attr");
			while (attrIter.hasNext()) {
				Attribute a = attrIter.next();
				attrVec.add(a);
			}
			Iterator<Attribute> attrIter2 = e.elementIterator("attr");
			assertEquals(1, attrVec.size());
			Test.Attribute testIt = attrVec.get(0);
			assertEquals(2, testIt.size());
			assertEquals("set", testIt.getName().toUpperCase());
			//
			assertTrue(testIt.getName().contains("testAttrId"));
			Element attrValue = e.elementIterator("value");
			assertTrue(testIt.getValue().size() > 0);
			Element valValue = testIt.getValue().iterator().next();
			assertEquals("2", valValue.toString());
		}
	}
	
	private class HeroAttrsTestAttr extends HeroAttrsTest {
		private HeroAttrs testAttr;
		private HeroAttrsTestAttr() {
			Element attrValue = new Element("id.test.id");
			testAttr = new Test.TestAttr();
			testAttr.testAttr.setTestAttr(attrValue);
		}
		private Element createAttrElement(Element e) {
			Element attrValue = new Element("id.test.id");
			testAttr.testAttrValue.setTestAttr(attrValue);
			return attrValue;
		}
	}
	
	public class TestAttr implements Serializable {
		String testAttrName;
		String testAttrValue;
		public String getTestAttr() {
			return testAttrName;
		}
		public void setTestAttr(String testAttr) {
			testAttrName = testAttr;
		}
		public String getTestAttrValue() {
			return testAttrValue;
		}
		public void setTestAttrValue(String testAttrValue) {
			testAttrValue = testAttrValue;
		}
	}
}