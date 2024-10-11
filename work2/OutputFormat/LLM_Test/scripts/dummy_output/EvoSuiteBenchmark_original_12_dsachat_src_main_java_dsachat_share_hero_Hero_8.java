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
	* test of {@link Hero#getAttrValue(String)} method.
	*/
	@Test
	public void a() {
		new Hero(loadXML("Hero")).getAttrValue("heroClasses");
	}
	/**
	* test of {@link Hero#getAttrValue(String)} method.
	*/
	@Test
	public void b() {
		Vector<String> vArr = new Vector<String>();
		new Hero(loadXML("Hero"), vArr, true).getAttrValue("heroClasses");
	}
	/** test of {@link Hero#getAttr(Element} method. */
	@Test
	public void c() {
		Document document = loadXML("HerOtns");
		Element elem = document.createElement("elem");
		new Hero(document).getAttributes();
	}
	/** test of {@link Hero#searchFVElemAttrName(String)} method. */
	@Test
	public void d() {
		Vector<String> vArr = new Vector<String>();
		new Hero(loadXML("Hero"), vArr, true).searchFVElemAttrName("heroClasses");
	}
	/** set test of {@link Hero#searchFVelemAttrName(String)} method. */
	@Test
	@SuppressWarnings("unused")
	public void e() {
		Hero h = new Hero(loadXML("Hero"), true);
		String res = h.searchFVelemAttrName("heroClasses");
	}
	/** test of {@link Hero#getCombat()} method. */
	@Test
	public void f() {
		String res = new Hero(loadXML("Hero"), false).getCombat();
	}
	/** test of {@link Hero#getClass(Vector<String>)} method.
	*/
	@Test
	public void g() {
		Vector<String> v = new Vector<String>();
		new Hero(loadXML("Hero"), v).getClass(v);
	}
	/** test of {@link Hero#getCustomClass(String)} method. */
	@Test
	public void h() {
		new Hero(loadXML("Hero"), true);
		String res = new Hero(loadXML("Hero"), false).getCustomClass("HERO");
	}
	/** test of {@link Hero#getSpecial(Vector<String>)} method. */
	@Test
	@SuppressWarnings("unused")
	public void i() {
		String res = new Hero(loadXML("Hero"), true);
	}
	/** test of {@link Hero#getValue(Element)} method.
	*/
	@Test
	public void j() {
		Element elem = new Element("elem");
		new Hero(loadXML("Hero"), elem);
		FightValue res = new Hero(loadXML("Hero"), elem).getValue("heroClasses");
	}
	/** test of {@link Hero#getValue(Element)} method.
	*/
	@Test
	public void k() {
		Element elem = new Element("elem");
		new Hero(loadXML("Hero"), elem);
		FightValue res = new Hero(loadXML("Hero"), elem).getValue("heroClasses");
	}

        /** test of {@link Hero#getValue(String)} method. */
        @Test
        public void l() {
                Element elem = new Element("elem");
                res = new Hero(loadXML("Hero"), elem).getValue("heroClasses");
        }
    /** @} */

}
/** @} */