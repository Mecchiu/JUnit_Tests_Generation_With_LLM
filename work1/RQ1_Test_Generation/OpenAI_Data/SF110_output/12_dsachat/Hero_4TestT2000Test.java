// Hero_4Test.java
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
* It contains ten unit test cases for the {@link Hero#getAttrValue(String)} method.
*/
class Hero_4Test {

		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "MU".
		 * </p>
		 */
		@Test
		void testGetAttrValue_MU() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 12));
				assertEquals(12, hero.getAttrValue("MU"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "KL".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KL() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Klugheit", "KL", 12));
				assertEquals(12, hero.getAttrValue("KL"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "IN".
		 * </p>
		 */
		@Test
		void testGetAttrValue_IN() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Intuition", "IN", 12));
				assertEquals(12, hero.getAttrValue("IN"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "CH".
		 * </p>
		 */
		@Test
		void testGetAttrValue_CH() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Charisma", "CH", 12));
				assertEquals(12, hero.getAttrValue("CH"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "FF".
		 * </p>
		 */
		@Test
		void testGetAttrValue_FF() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Fingerfertigkeit", "FF", 12));
				assertEquals(12, hero.getAttrValue("FF"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "GE".
		 * </p>
		 */
		@Test
		void testGetAttrValue_GE() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Gewandtheit", "GE", 12));
				assertEquals(12, hero.getAttrValue("GE"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "KO".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KO() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Konstitution", "KO", 12));
				assertEquals(12, hero.getAttrValue("KO"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "KK".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KK() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("K�rperkraft", "KK", 12));
				assertEquals(12, hero.getAttrValue("KK"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "LEP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_LEP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Lebensenergie", "LEP", 12));
				assertEquals(12, hero.getAttrValue("LEP"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case tests the method with the attribute "AUP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_AUP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Ausdauer", "AUP", 12));
				assertEquals(12, hero.getAttr