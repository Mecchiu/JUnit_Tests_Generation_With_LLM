// A4j_3Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_3Test {
	/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "vhs", "1");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "video", "1");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "2");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "vhs", "2");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "video", "2");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "3");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "vhs", "3");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "video", "3");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ActorSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testActorSearch10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "4");
				assertNotNull(productInfo);
			}
}

// A4j_4Test.java
package net.kencochrane.a4j;

import net.kenc