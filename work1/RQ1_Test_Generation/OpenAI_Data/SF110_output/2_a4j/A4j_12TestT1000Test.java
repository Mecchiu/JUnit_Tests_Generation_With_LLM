// A4j_12Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_12Test {
	/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a null asin.
			*/
			@Test
			void testAddtoCartNullAsin() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart(null, "1");
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a null quantity.
			*/
			@Test
			void testAddtoCartNullQuantity() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", null);
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with an empty asin.
			*/
			@Test
			void testAddtoCartEmptyAsin() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("", "1");
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with an empty quantity.
			*/
			@Test
			void testAddtoCartEmptyQuantity() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "");
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a negative quantity.
			*/
			@Test
			void testAddtoCartNegativeQuantity() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "-1");
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a zero quantity.
			*/
			@Test
			void testAddtoCartZeroQuantity() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "0");
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a non-numeric quantity.
			*/
			@Test
			void testAddtoCartNonNumericQuantity() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "abc");
				assertNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a valid asin and quantity.
			*/
			@Test
			void testAddtoCartValidAsinAndQuantity() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "1");
				assertNotNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a valid asin and a quantity greater than 1.
			*/
			@Test
			void testAddtoCartValidAsinAndQuantityGreaterThan1() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "2");
				assertNotNull(shoppingCart);
			}

			/**
			* Test case for {@link A4j#AddtoCart(String, String)}.
			* It tests the method with a valid asin and a quantity greater than 1.
			*/
			@Test
			void testAddtoCartValidAsinAndQuantityGreaterThan1() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005N5PF", "2");
