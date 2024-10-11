java
package bierse.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Drink_0Test {

    @Test
    void testRecalculate_NewPriceEqualsCurrentPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        int currentPrice = drink.getCurrentPrice();
        int newPrice = drink.recalculate();
        assertEquals(currentPrice, newPrice);
    }

    @Test
    void testRecalculate_DirectPriceSet() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setDirectPrice(150);
        int newPrice = drink.recalculate();
        assertEquals(150, newPrice);
    }

    @Test
    void testRecalculate_KeepPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.setKeepPrice(true);
        int newPrice = drink.recalculate();
        assertEquals(drink.getCurrentPrice(), newPrice);
    }

    @Test
    void testRecalculate_PriceChangeWithinMaxStep() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(25);
        int newPrice = drink.recalculate();
        assertTrue(Math.abs(newPrice - drink.getCurrentPrice()) <= drink.getMaxStep());
    }

    @Test
    void testRecalculate_PriceChangeAboveMaxPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(50);
        drink.setDirectPrice(200);
        int newPrice = drink.recalculate();
        assertEquals(drink.getMaxPrice(), newPrice);
    }

    @Test
    void testRecalculate_PriceChangeBelowMinPrice() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(5);
        drink.setDirectPrice(50);
        int newPrice = drink.recalculate();
        assertEquals(drink.getMinPrice(), newPrice);
    }

    @Test
    void testRecalculate_InverseLogic() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(30);
        drink.setDirectPrice(150);
        drink.getModel().getSettings().setStandardLogic(false);
        int newPrice = drink.recalculate();
        assertEquals(120, newPrice);
    }

    @Test
    void testRecalculate_FactorZero() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(20);
        int newPrice = drink.recalculate();
        assertEquals(drink.getCurrentPrice(), newPrice);
    }

    @Test
    void testRecalculate_FactorNegative() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(10);
        int newPrice = drink.recalculate();
        assertTrue(newPrice < drink.getCurrentPrice());
    }

    @Test
    void testRecalculate_FactorPositive() {
        Drink drink = new Drink("TestDrink", new Model());
        drink.sell(30);
        int newPrice = drink.recalculate();
        assertTrue(newPrice > drink.getCurrentPrice());
    }
}
