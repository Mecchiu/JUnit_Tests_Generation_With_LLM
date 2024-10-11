package dsachat.share.hero;
java
import static org.junit.jupiter.api.Assertions.assertEquals;

class Hero_4Test {

    @Test
    void testGetAttrValue_LEP() {
        Hero hero = new Hero(createDummyDocument());
        assertEquals(10, hero.getAttrValue("LEP"));
    }

    @Test
    void testGetAttrValue_AUP() {
        Hero hero = new Hero(createDummyDocument());
        assertEquals(5, hero.getAttrValue("AUP"));
    }

    @Test
    void testGetAttrValue_ASP() {
        Hero hero = new Hero(createDummyDocument());
        assertEquals(8, hero.getAttrValue("ASP"));
    }

    @Test
    void testGetAttrValue_KAP() {
        Hero hero = new Hero(createDummyDocument());
        assertEquals(3, hero.getAttrValue("KAP"));
    }

    // Add more test cases for other attributes if needed

    private Document createDummyDocument() {
        // Create a dummy document for testing
        return null;
    }
}
