package bierse.model;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Drink_1Test {

    @Test
    void testSaveNotNull() {
        Drink drink = new Drink("TestDrink", new Model());
        File file = drink.save();
        assertNotNull(file);
    }

    @Test
    void testSaveFileExists() {
        Drink drink = new Drink("TestDrink", new Model());
        File file = drink.save();
        assertTrue(file.exists());
    }

    @Test
    void testSaveFileName() {
        Drink drink = new Drink("TestDrink", new Model());
        File file = drink.save();
        assertEquals("TestDrink.xml", file.getName());
    }

    @Test
    void testSaveMinPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setMinPrice(50);
        drink.save();
        assertEquals(50, drink.getMinPrice());
    }

    @Test
    void testSaveMaxPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setMaxPrice(150);
        drink.save();
        assertEquals(150, drink.getMaxPrice());
    }

    @Test
    void testSaveStartPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setStartPrice(100);
        drink.save();
        assertEquals(100, drink.getStartPrice());
    }

    @Test
    void testSaveTargetAmount() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setTargetAmount(30);
        drink.save();
        assertEquals(30, drink.getTargetAmount());
    }

    @Test
    void testSaveDeltaAmount() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setDeltaAmount(10);
        drink.save();
        assertEquals(10, drink.getDeltaAmount());
    }

    @Test
    void testSaveMaxStep() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setMaxStep(25);
        drink.save();
        assertEquals(25, drink.getMaxStep());
    }

    @Test
    void testSaveUsed() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setUsed(false);
        drink.save();
        assertFalse(drink.isUsed());
    }

    @Test
    void testSaveKey() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setKey(KeyEvent.VK_F2);
        drink.save();
        assertEquals(KeyEvent.VK_F2, drink.getKey());
    }
}
