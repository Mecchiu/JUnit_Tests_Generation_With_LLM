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
		* Test method for {@link net.kencochrane.a4j.A4j#ActorSearch(String, String, String)}.
		* Tests the result of {@link C4j#ActorSearch(String, String, String)}.
		*/
		@Test
		void testActorSearch() {
				ActorInfo actorInfo = getActor(DAO.DAO_CONN);
				assertTrue(actorInfo.isActorNameProvided());
		}

		/**
		* Test method for {@link net.kencochrane.a4j.A4j#ActorSearch(String, String, String)}.
		* Tests the result of {@link C4j#ActorSearch(String, String, String)}.
		*/
		@Test
		void testActorSearchMode() {
				String mode = null;
				assertTrue(getActor(DAO.DAO_CONN).getMode().equals(mode));
		}

		/**
		* Test method for {@link net.kencochrane.a4j.A4j#ActorSearch(String, String, String)}.
		* Tests the result of {@link C4j#ActorSearch(String, String, String)}.
		*/
		@Test
		void testActorSearchPage() {
				String page = null;
				assertTrue(getActor(DAO.DAO_CONN).getPage().equals(page));
		}

		/**
		* Test method for {@link C4j#C4j(DAO)C4j(DAO)}.
		* Tests the result of {@link C4j#C4j(DAO)C4j(DAO)}.
		*/
		@Test
		public void testC4j_C4j() {
				DAO.DAO_CONN.findByActorQueryParam("");
				DAO.DAO_CONN.findByModeParam("");
				DAO.DAO_CONN.findBypageParam("");
		}
}