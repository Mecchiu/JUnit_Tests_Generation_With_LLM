// Here is an example implementation of the HeroTest class with ten unit test cases for the getAttrValue method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void testGetAttrValue() {
        Hero hero = new Hero();
        hero.addAttribute(new Attribute("STR", "Strength", 10));
        hero.addAttribute(new Attribute("DEX", "Dexterity", 15));
        hero.addAttribute(new Attribute("CON", "Constitution", 12));
        hero.addAttribute(new Attribute("INT", "Intelligence", 8));
        hero.addAttribute(new Attribute("WIS", "Wisdom", 14));
        hero.addAttribute(new Attribute("CHA", "Charisma", 16));

        assertEquals(10, hero.getAttrValue("STR"));
        assertEquals(15, hero.getAttrValue("DEX"));
        assertEquals(12, hero.getAttrValue("CON"));
        assertEquals(8, hero.getAttrValue("INT"));
        assertEquals(14, hero.getAttrValue("WIS"));
        assertEquals(16, hero.getAttrValue("CHA"));

        assertEquals(-1, hero.getAttrValue("NONEXISTENT"));
        assertEquals(-1, hero.getAttrValue(""));
        assertEquals(-1, hero.getAttrValue(null));
    }
}