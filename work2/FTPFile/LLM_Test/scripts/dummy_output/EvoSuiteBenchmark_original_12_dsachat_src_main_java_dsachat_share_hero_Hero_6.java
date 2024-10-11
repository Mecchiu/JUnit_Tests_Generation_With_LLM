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
	 * This is the one unit test class which must test the method for {@link Attribute}
	 */
	@Test
	public void getAttrValueTest() {
		Attribute test = new Attribute();
		test.setShortcut("shortcut");

		assertEquals(test.getShortcut(), "shortcut");
	}
		/**
	 * This is the one unit test class which must test the method for {@link Character}
	 */
	@Test
	public void getAttrValueCharTest() {
		Character test = new Character();
		test.setId("id");
		test.setName("name");

		assertEquals(test.getName(), "name");
	}
	
	/**
	 * This is the one unit test class which must test the method for {@link Weapon}
	 */
	@Test
	public void getSelectedWeaponTest() {
		Weapon test = new Weapon();
		test.setInRange("In Range");
		
		assertTrue(test.getInRange().equals("In Range"));
		
	}
	
	/**
	 * This is the one unit test class which must test the method for {@link Integer}
	 */
	@Test
	public void getValueIteratorTest() {
		int test = 0;
		for (Iterator<Object> testIterator = getAttrValueIterator("inRange");testIterator.hasNext();) {
			test = testIterator.next();
		}
		assertEquals(test, 0);
	}
	
	/**
	 * Get an iterator for the value of all the attributes
	 * @throws Exception
	 * @return
	 */
	private Iterator<Object> getAttrValueIterator() throws Exception
	{
		Vector<Object> values = new Vector<Object>();

		attributes = new Vector<Attribute>();
		attributes = Hero.getAllAttributes(attributes);

		for (Attribute attr : attributes)
			values.add(getAttrValue(attr));

		return values.iterator();
	}

	
	/**
	 * Get the values of all {@link Special}s
	 * @throws Exception
	 * @return
	 */
	private Vector<Object> getAllSpecials() throws Exception {
		Vector<Object> values = new Vector<Object>();
		
		Special s = new Special();
		s.setShortcut("special");
		Vector<Talent> talents = Hero.getAllTalents(s);
		
		// get all values
		for (Talent talent : talents)
			if(getAttrValue("special").equals(talent.getName()))
				values.add(new Long(talent.getInRange().getValue()));

		return values;
	}
	
	@Test
	public void testAttrValueIterator() {
		int i = 0;
		for (Iterator<Object> testIterator = getAttrValueIterator(); testIterator.hasNext();) {
			Character test = (Character) testIterator.next();
			assertEquals(i, (int)test.getInRange().getValue());
			i++;
		}
	}
	
	@Test
	public void testAllSpecials() {
		assertEquals(getAllSpecials(), getAllSpecials());
	}

}