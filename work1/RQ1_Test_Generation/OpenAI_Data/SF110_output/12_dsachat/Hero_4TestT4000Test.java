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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "MU".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "KL".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "IN".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "CH".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "FF".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "GE".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "KO".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "KK".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "LEP".
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
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "AUP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_AUP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Ausdauer", "AUP", 12));
				assertEquals(12, hero.getAttrValue("AUP"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "ASP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_ASP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Astralenergie", "ASP", 12));
				assertEquals(12, hero.getAttrValue("ASP"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "KAP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KAP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Karmaenergie", "KAP", 12));
				assertEquals(12, hero.getAttrValue("KAP"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "INI".
		 * </p>
		 */
		@Test
		void testGetAttrValue_INI() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("ini", "INI", 12));
				assertEquals(12, hero.getAttrValue("INI"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "MU".
		 * </p>
		 */
		@Test
		void testGetAttrValue_MU_2() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 12));
				hero.attributes.addElement(new Attribute("Klugheit", "KL", 12));
				hero.attributes.addElement(new Attribute("Intuition", "IN", 12));
				hero.attributes.addElement(new Attribute("Charisma", "CH", 12));
				hero.attributes.addElement(new Attribute("Fingerfertigkeit", "FF", 12));
				hero.attributes.addElement(new Attribute("Gewandtheit", "GE", 12));
				hero.attributes.addElement(new Attribute("Konstitution", "KO", 12));
				hero.attributes.addElement(new Attribute("K�rperkraft", "KK", 12));
				hero.attributes.addElement(new Attribute("Lebensenergie", "LEP", 12));
				hero.attributes.addElement(new Attribute("Ausdauer", "AUP", 12));
				hero.attributes.addElement(new Attribute("Astralenergie", "ASP", 12));
				hero.attributes.addElement(new Attribute("Karmaenergie", "KAP", 12));
				hero.attributes.addElement(new Attribute("ini", "INI", 12));
				assertEquals(12, hero.getAttrValue("MU"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "KL".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KL_2() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 12));
				hero.attributes.addElement(new Attribute("Klugheit", "KL", 12));
				hero.attributes.addElement(new Attribute("Intuition", "IN", 12));
				hero.attributes.addElement(new Attribute("Charisma", "CH", 12));
				hero.attributes.addElement(new Attribute("Fingerfertigkeit", "FF", 12));
				hero.attributes.addElement(new Attribute("Gewandtheit", "GE", 12));
				hero.attributes.addElement(new Attribute("Konstitution", "KO", 12));
				hero.attributes.addElement(new Attribute("K�rperkraft", "KK", 12));
				hero.attributes.addElement(new Attribute("Lebensenergie", "LEP", 12));
				hero.attributes.addElement(new Attribute("Ausdauer", "AUP", 12));
				hero.attributes.addElement(new Attribute("Astralenergie", "ASP", 12));
				hero.attributes.addElement(new Attribute("Karmaenergie", "KAP", 12));
				hero.attributes.addElement(new Attribute("ini", "INI", 12));
				assertEquals(12, hero.getAttrValue("KL"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute
		 * with the shortcut "IN".
		 * </p>
		 */
		@Test
		void testGetAttrValue_IN_2() {
				Hero hero = new Hero(new