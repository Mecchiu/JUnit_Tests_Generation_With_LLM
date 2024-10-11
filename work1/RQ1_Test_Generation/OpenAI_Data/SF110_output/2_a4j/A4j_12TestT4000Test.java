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

		private A4j a4j = new A4j();
		
		@Test
		void testAddtoCart_1() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "1");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("1", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_2() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "2");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("2", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_3() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "3");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("3", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_4() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "4");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("4", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_5() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "5");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("5", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_6() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "6");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("6", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_7() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "7");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("7", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_8() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "8");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("8", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_9() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "9");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("9", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_10() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "10");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("10", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
}

// A4j_13Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#addToExistingCart(String, String, String, String)} method.
*/
class A4j_13Test {
		
		private A4j a4j = new A4j();
		
		@Test
		void testaddToExistingCart_1() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "1");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("1", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_2() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "2");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("2", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_3() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "3");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("3", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_4() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "4");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("4", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_5() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "5");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("5", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_6() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "6");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("6", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_7() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "7");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("7", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_8() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "8");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("8", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_9() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "9");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("9", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
		@Test
		void testaddToExistingCart_10() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("1234567890", "1234567890", "B00005JKJI", "10");
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().getCartItem().get(0).getASIN());
				assertEquals("10", shoppingCart.getCart().getCartItems().getCartItem().get(0).getQuantity());
		}
		
}

// A4j_14Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#clearCart(String, String)} method.
*/
class A4j_14Test {
		
		private A4j a4j = new A4j();
		
		@Test
		void testclearCart_1() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_2() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_3() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_4() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_5() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_6() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_7() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_8() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_9() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
		@Test
		void testclearCart_10() {
				ShoppingCart shoppingCart = a4j.clearCart("1234567890", "1234567890");
				assertEquals("0", shoppingCart.getCart().getCartItems().getSubTotal().getAmount());
		}
		
}

// A4j_15Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api