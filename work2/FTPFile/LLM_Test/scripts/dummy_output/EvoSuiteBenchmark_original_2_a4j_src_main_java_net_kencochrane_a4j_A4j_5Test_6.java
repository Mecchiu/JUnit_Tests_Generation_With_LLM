// A4j_5Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_5Test {
		/**
     * Unit testing method.
     * @throws Exception
     */
    @Test
    public void checkForProductTryingToAddToCart() throws Exception {
        Product model = createExampleObject();
        assertEquals(null, null, "Check that no exception is thrown");
        assertEquals("", "", model.toString());
        addToCart(model);
        assertTrue(model.toString().contains("add to cart"));
        assertEquals("[1] = add to cart", model.toString());
    }


    /**
     * This empty constructor is necessary to create empty tests case.
     */
    public A4j_5Test() {
    }


    private Product createExampleObject() {
        Product model = new Product();
        model.setName("The name");
        model.addQuantity(new BigDecimal(2));

        return model;
    }

    /**
     * Unit testing method for {@link A4j#AddtoCart(String, String)}.
     * @param newValue A new customer's id in the new cart model attribute
     * @throws Exception
     */
    @Test
    public void addToCart_withNewCart(String newValue) throws Exception {
        Product model = A4j.AddtoCart("1234", "1");
        assertTrue(model.getCart().isPresent());
        boolean alreadyPresent = A4j.AddtoCart(newValue, model.getName());
        assertFalse(alreadyPresent);
        model = A4j.AddtoCart(newValue, model.getName());
        assertTrue(alreadyPresent);
    }
}
// A4j_5Test.java