// Here's an implementation of the HeroTest class with ten unit test cases for the getAttrValue method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void testGetAttrValueWithValidShortcut() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", 10));
        assertEquals(10, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithInvalidShortcut() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", 10));
        assertEquals(-1, hero.getAttrValue("DEX"));
    }

    @Test
    void testGetAttrValueWithEmptyAttributeList() {
        Hero hero = new Hero();
        assertEquals(-1, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithNullShortcut() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", 10));
        assertThrows(NullPointerException.class, () -> hero.getAttrValue(null));
    }

    @Test
    void testGetAttrValueWithMultipleAttributes() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", 10));
        hero.addAttribute(new Attribute("DEX", 12));
        assertEquals(12, hero.getAttrValue("DEX"));
    }

    @Test
    void testGetAttrValueWithNegativeValue() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", -5));
        assertEquals(-5, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithZeroValue() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", 0));
        assertEquals(0, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithMaxValue() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithMinValue() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", Integer.MIN_VALUE));
        assertEquals(Integer.MIN_VALUE, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithDuplicateShortcuts() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", 10));
        hero.addAttribute(new Attribute("STR", 12));
        assertEquals(12, hero.getAttrValue("STR"));
    }
}