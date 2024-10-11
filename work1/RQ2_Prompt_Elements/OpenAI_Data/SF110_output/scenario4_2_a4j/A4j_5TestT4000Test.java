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
* It contains ten unit test cases for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_5Test {

		private A4j a4j = new A4j();
		
		@Test
		void testAddtoCart_1() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "1");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("1", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_2() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "2");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("2", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_3() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "3");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("3", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_4() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "4");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("4", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_5() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "5");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("5", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_6() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "6");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("6", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_7() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "7");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("7", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_8() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "8");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("8", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_9() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "9");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("9", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_10() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "10");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("10", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
}

// A4j_6Test.java
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
class A4j_6Test {
		
		private A4j a4j = new A4j();
		
		@Test
		void testAddtoCart_1() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "1");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("1", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_2() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "2");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("2", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_3() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "3");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("3", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_4() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "4");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("4", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_5() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "5");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("5", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_6() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "6");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("6", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_7() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "7");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("7", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_8() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "8");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("8", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_9() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "9");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("9", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_10() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "10");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("10", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
}

// A4j_7Test.java
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
class A4j_7Test {
		
		private A4j a4j = new A4j();
		
		@Test
		void testAddtoCart_1() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "1");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("1", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_2() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "2");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("2", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_3() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "3");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("3", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_4() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "4");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("4", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_5() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "5");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("B00005JKJI", shoppingCart.getCart().getCartItems().get(0).getAsin());
				assertEquals("5", shoppingCart.getCart().getCartItems().get(0).getQuantity());
		}
		
		@Test
		void testAddtoCart_6() {
				ShoppingCart shoppingCart = a4j.AddtoCart("B00005JKJI", "6");
				assertEquals(1, shoppingCart.getCart().getCartItems().size());
				assertEquals("