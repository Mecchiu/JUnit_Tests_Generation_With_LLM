// Here is the source code for the HeroTest class with ten unit test cases for the getAttrValue method.

import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroTest {

    private Hero hero;

    @BeforeEach
    void setUp() {
        // create a new hero with some attributes
        hero = new Hero(null);
        Vector<Attribute> attributes = new Vector<>();
        attributes.add(new Attribute("MU", 10));
        attributes.add(new Attribute("KL", 12));
        attributes.add(new Attribute("IN", 14));
        attributes.add(new Attribute("CH", 8));
        attributes.add(new Attribute("FF", 11));
        attributes.add(new Attribute("GE", 13));
        attributes.add(new Attribute("KO", 15));
        attributes.add(new Attribute("KK", 9));
        hero.setAttributes(attributes);
    }

    @Test
    void testGetAttrValueMU() {
        assertEquals(10, hero.getAttrValue("MU"));
    }

    @Test
    void testGetAttrValueKL() {
        assertEquals(12, hero.getAttrValue("KL"));
    }

    @Test
    void testGetAttrValueIN() {
        assertEquals(14, hero.getAttrValue("IN"));
    }

    @Test
    void testGetAttrValueCH() {
        assertEquals(8, hero.getAttrValue("CH"));
    }

    @Test
    void testGetAttrValueFF() {
        assertEquals(11, hero.getAttrValue("FF"));
    }

    @Test
    void testGetAttrValueGE() {
        assertEquals(13, hero.getAttrValue("GE"));
    }

    @Test
    void testGetAttrValueKO() {
        assertEquals(15, hero.getAttrValue("KO"));
    }

    @Test
    void testGetAttrValueKK() {
        assertEquals(9, hero.getAttrValue("KK"));
    }

    @Test
    void testGetAttrValueInvalidShortcut() {
        assertEquals(-1, hero.getAttrValue("invalid"));
    }
}