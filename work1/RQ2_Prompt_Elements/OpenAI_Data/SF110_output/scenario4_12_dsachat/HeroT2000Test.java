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
* It contains ten unit test cases for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {

		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "MU"
		 * </p>
		 */
		@Test
		void testGetAttrValueMU() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("MU"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "KL"
		 * </p>
		 */
		@Test
		void testGetAttrValueKL() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("KL"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "IN"
		 * </p>
		 */
		@Test
		void testGetAttrValueIN() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("IN"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "CH"
		 * </p>
		 */
		@Test
		void testGetAttrValueCH() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("CH"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "FF"
		 * </p>
		 */
		@Test
		void testGetAttrValueFF() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("FF"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "GE"
		 * </p>
		 */
		@Test
		void testGetAttrValueGE() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("GE"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "KO"
		 * </p>
		 */
		@Test
		void testGetAttrValueKO() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("KO"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "KK"
		 * </p>
		 */
		@Test
		void testGetAttrValueKK() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("KK"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "LE"
		 * </p>
		 */
		@Test
		void testGetAttrValueLE() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("LE"), 0);
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test case for the attribute "MR"
		 * </p>
		 */
		@Test
		void testGetAttrValueMR() {
				Hero hero = new Hero();
				assertEquals(hero.getAttrValue("MR"), 0);
		}
}