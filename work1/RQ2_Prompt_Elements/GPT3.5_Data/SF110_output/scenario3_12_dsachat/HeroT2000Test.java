// Here is an example implementation of the HeroTest class with ten unit test cases for the getAttrValue method.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void testGetAttrValueWithValidShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(10, hero.getAttrValue("str"));
    }

    @Test
    void testGetAttrValueWithInvalidShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(-1, hero.getAttrValue("invalid"));
    }

    @Test
    void testGetAttrValueWithNullShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(-1, hero.getAttrValue(null));
    }

    @Test
    void testGetAttrValueWithEmptyShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(-1, hero.getAttrValue(""));
    }

    @Test
    void testGetAttrValueWithUpperCaseShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(10, hero.getAttrValue("STR"));
    }

    @Test
    void testGetAttrValueWithLowerCaseShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(10, hero.getAttrValue("str"));
    }

    @Test
    void testGetAttrValueWithMixedCaseShortcut() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(10, hero.getAttrValue("StR"));
    }

    @Test
    void testGetAttrValueWithNegativeValue() {
        Hero hero = new Hero();
        hero.setAttrValue("str", -10);
        assertEquals(-10, hero.getAttrValue("str"));
    }

    @Test
    void testGetAttrValueWithZeroValue() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 0);
        assertEquals(0, hero.getAttrValue("str"));
    }

    @Test
    void testGetAttrValueWithPositiveValue() {
        Hero hero = new Hero();
        hero.setAttrValue("str", 10);
        assertEquals(10, hero.getAttrValue("str"));
    }
}