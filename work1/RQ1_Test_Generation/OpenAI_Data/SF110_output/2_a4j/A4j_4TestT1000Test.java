// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_4Test {
	/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "music", "1");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "classical", "1");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "music", "2");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "classical", "2");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "music", "3");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "classical", "3");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "music", "4");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "classical", "4");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "music", "5");
				assertNotNull(productInfo);
			}

			/**
			* Test case for {@link A4j#ArtistSearch(String, String, String)}.
			* It verifies that the method returns a non-null value.
			*/
			@Test
			void testArtistSearch10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("Madonna", "classical", "5");
				assertNotNull(productInfo);
			}
}

// A4j_5Test.java
package net.kencochrane.a4j;

import net.kencochr