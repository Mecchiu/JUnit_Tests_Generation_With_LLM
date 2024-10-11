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
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "MU".
	*/
	@Test
	void testGetAttrValueMU() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute mu = new Attribute();
		mu.setShortcut("MU");
		mu.setValue(10);
		hero.attributes.add(mu);
		assertEquals(10, hero.getAttrValue("MU"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "KL".
	*/
	@Test
	void testGetAttrValueKL() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute kl = new Attribute();
		kl.setShortcut("KL");
		kl.setValue(10);
		hero.attributes.add(kl);
		assertEquals(10, hero.getAttrValue("KL"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "IN".
	*/
	@Test
	void testGetAttrValueIN() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute in = new Attribute();
		in.setShortcut("IN");
		in.setValue(10);
		hero.attributes.add(in);
		assertEquals(10, hero.getAttrValue("IN"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "CH".
	*/
	@Test
	void testGetAttrValueCH() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute ch = new Attribute();
		ch.setShortcut("CH");
		ch.setValue(10);
		hero.attributes.add(ch);
		assertEquals(10, hero.getAttrValue("CH"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "FF".
	*/
	@Test
	void testGetAttrValueFF() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute ff = new Attribute();
		ff.setShortcut("FF");
		ff.setValue(10);
		hero.attributes.add(ff);
		assertEquals(10, hero.getAttrValue("FF"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "GE".
	*/
	@Test
	void testGetAttrValueGE() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute ge = new Attribute();
		ge.setShortcut("GE");
		ge.setValue(10);
		hero.attributes.add(ge);
		assertEquals(10, hero.getAttrValue("GE"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "KO".
	*/
	@Test
	void testGetAttrValueKO() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute ko = new Attribute();
		ko.setShortcut("KO");
		ko.setValue(10);
		hero.attributes.add(ko);
		assertEquals(10, hero.getAttrValue("KO"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "KK".
	*/
	@Test
	void testGetAttrValueKK() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute kk = new Attribute();
		kk.setShortcut("KK");
		kk.setValue(10);
		hero.attributes.add(kk);
		assertEquals(10, hero.getAttrValue("KK"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "SO".
	*/
	@Test
	void testGetAttrValueSO() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute so = new Attribute();
		so.setShortcut("SO");
		so.setValue(10);
		hero.attributes.add(so);
		assertEquals(10, hero.getAttrValue("SO"));
	}
	
	/**
	* Test case for {@link Hero#getAttrValue(String)}.
	* It tests if the method returns the correct value for the attribute "IN".
	*/
	@Test
	void testGetAttrValueIN2() {
		Hero hero = new Hero();
		hero.attributes = new Vector<Attribute>();
		Attribute in = new Attribute();
		in.setShortcut("IN");
		in.setValue(10);
		hero.attributes.add(in);
		assertEquals(10, hero.getAttrValue("IN"));
	}
}