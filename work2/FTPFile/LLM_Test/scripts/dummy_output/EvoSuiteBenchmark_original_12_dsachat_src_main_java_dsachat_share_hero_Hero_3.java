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
	 * test {@link Hero#getAttrValue(String)} method.
	*/
	@Test
	public void testGetAttrValue() {
		assertEquals(0,   getAttrValue("Name"));
		assertEquals(25, getAttrValue("Name"));
		assertTrue(new Hero("Lennon").isPriest());
		assertEquals(1,   getAttrValue("Name"));
		assertTrue(new Hero("Lennon").isPriest());
		assertEquals(25, getAttrValue(new CharacterMark("A")));
		assertTrue(new Hero("Lennon").isPriest());
		assertEquals(33,getAttrValue(new CharacterMark("A")));
		assertTrue(new Hero("Lennon").isPriest());
		assertEquals(-1,   getAttrValue(new CharacterMark("J")));
	}
	
	/**
	 * test {@link Hero#getAUP(boolean)} method.
	*/
	@Test
	public void testGetAUP() {
		// test for null element
		assertTrue(getAUP(true).equals(null));
		Vector<Tuple> res = getAUP(false);
		// test for empty vector 
		assertEquals(0,  getAUP(true).size());
		res.addElement(new Tuple(11, new int[]{6,5}));
		res.addElement(new Tuple(12, new int[]{7,5}));
		res.addElement(new Tuple(13, new int[]{8,5}));
		assertEquals(2,  res.size());
		
		// test for non-null element
		assertTrue(getAUP(true).equals(new Tuple(12, new int[]{6,5})));
		res = getAUP(true);
	}
	
	/**
	 * test {@link Hero#isAUP().getLEP} method.
	*/
	@Test
	public void testIsAUP() {
		// test for null element
		assertTrue(getAUP(false).equals(null));
		Vector<Tuple> res =  getAUP(true);
		// test for empty vector 
		assertEquals(0,  res.size());
		//test for null
		assertTrue(getAUP().getLEP().equals(null));
		res = getAUP(true);
		// test for non-null element
		assertTrue(getAUP(true).equals(new Tuple(12, new int[]{6,5})));
	}

	/**
	 * test {@link Hero#getAUP().getAUP} method.
	*/
	@Test
	public void testGetAUPTwice() {
		Vector<Tuple> res = getAUP(false);
		// test for empty vector 
		assertEquals(0,  res.size());
		res = getAUP(true);
		assertTrue(res.equals(getAUP()));
		
		//test for non-null element
		assertTrue(getAUP().equals(new Tuple(12, new int[]{6,5})));
	}
	
	/**
	 * test for {@link Hero#getCurrLEP() the lep} element.
	 */
	@Test
	public void testGetCurrLEP() {
		// default value
		assertEquals(200,   getCurrLEP());
		// non-default value
		assertEquals(0,   getCurrLEP());
		// set value
        setLEP(10);
		// test for non-null element
		assertTrue(getCurrLEP() != 0);
	}
	
	/**
	 * test for {@link Hero#getCurrLEP() the lep} element.
	 */
	@Test
	public void testGetCurrLEPMax() {
		// default value
		assertEquals(200,   getCurrLEP());
		// non-default value
		assertEquals(10,   getCurrLEP());
		// set value
    setLEP(2);
        // test for non-null element
        assertTrue(getCurrLEP() != 2);
	}
	
	/**
	 * test for {@link Hero#getCurrLEP() the lep} element.
	 */
	@Test
	public void testGetCurrLEPMax() {
		// default value
		assertEquals(100,   getCurrLEP());
}
}