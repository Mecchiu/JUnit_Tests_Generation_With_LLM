// A4j_2Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_2Test {
		/**
		* Create unit test for {@link A4j#ActorSearch(String, String, String)}
		*
		* @since 1.0
		*/
		@Test
		public void actorSearch() {
                assertEquals("a4j.ActorSearch() should return a ProductInfo object",
                    "a4j.ActorSearch() should return a ProductInfo object", new A4j().ActorSearch("testActor",
                        "DVD", "TestPage"));
		}
    }