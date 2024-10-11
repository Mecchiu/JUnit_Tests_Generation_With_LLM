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
		* Constructor for A4j_2Test.
		* @param testName
		* @throws Exception
		*/
	A4j_2Test(String testName) {
		class ClassForTest {
			@Test
			void ActorSearchTest() throws Exception {
				assertNotNull(String.valueOf(ActorSearch("Arthur", "p", "1")), Search.ActorSearch("Arthur", "p", "1"));
				assertNotNull(String.valueOf(ActorSearch("Arthur", "p", "2")), Search.ActorSearch("Arthur", "p", "2"));
				assertNull(String.valueOf(ActorSearch("Arthur", "p", "3")), Search.ActorSearch("Arthur", "p", ""));
				assertNull(String.valueOf(ActorSearch("Arthur", "p", "4")), Search.ActorSearch("Arthur", "p", "4"));
				assertNull(String.valueOf(ActorSearch("Arthur", "p", "5")), Search.ActorSearch("Arthur", "p", "5"));
				assertNull(String.valueOf(ActorSearch("Arthur", "p", "6")), Search.ActorSearch("Arthur", "p", "6"));
				assertNull(String.valueOf(ActorSearch("Arthur", "p", "7")), Search.ActorSearch("Arthur", "p", "7"));
				assertTrue(String.valueOf(
						Search.ActorSearch("Arthur", "p", "1").getClass().getCanonicalName().endsWith("DvdNth")));
				assertNull(String.valueOf(Search.ActorSearch("Arthur", "p", "1").getClass().getCanonicalName()));
				assertTrue(String.valueOf(
						Search.ActorSearch("Arthur", "p", "2").getClass().getCanonicalName().endsWith("VH1")));
				assertNull(String.valueOf(Search.ActorSearch("Arthur", "p", "2").getClass().getCanonicalName()));
				assertTrue(String.valueOf(
						Search.ActorSearch("Arthur", "p", "3").getClass().getCanonicalName().endsWith("VHS")));
				assertNull(String.valueOf(Search.ActorSearch("Arthur", "p", "3").getClass().getCanonicalName()));
				assertNull(String.valueOf(
						Search.ActorSearch("Arthur", "p", "4").getClass().getCanonicalName().endsWith("VIDEO")));
				assertNull(String.valueOf(Search.ActorSearch("Arthur", "p", "4").getClass().getCanonicalName()));
			}
		}

		class MyClassWithSearch extends ClassForTest{
		}
		assertSame(ClassForTest.class, MyClassWithSearch.getClass());


		Class.forName("net.kencochrane.a4j.A4JBinaryCodec");
		Class.forName("A4j.Cart");
		Class.forName("A4j.Product");
		Class.forName("A4j.Search");
		Class.forName("A4j.DAO.Cart");
		Class.forName("A4j.DAO.Product");
		Class.forName("A4j.DAO.Search");
	}

	/**
	* Run all methods of A4J_2Test that do not return a test class.
	* @throws Exception
	*/
	@Test
	public void Tests() throws Exception {
		A4j.Log.trace("Running all methods of A4J_2Test that do not return a test class.");
		A4j.Log.debug("Classes:");
		Class.forName("net.kencochrane.a4j.A4JBinaryCodec");
		Class.forName("A4j.Cart");
		Class.forName("A4j.Product");
		Class.forName("A4j.Search");
		Class.forName("A4j.DAO.Cart");
		Class.forName("A4j.DAO.Product");
		Class.forName("A4j.DAO.Search");

		A4j.Log.debug("Calls:");
		assertNotNull(String.valueOf(
				DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "1"))))
				.setStackTrace(String.valueOf(new Exception()));

		A4j.Log.info("Calls:");
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "1"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "2"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "3"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "4"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "5"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "6"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "7"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "8"))))
				.setStackTrace(String.valueOf(new Exception()));
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "8"))))
				.setStackTrace(String.valueOf(new Exception()));

		A4j.Log.info("Calls:");
		assertNotNull(String.valueOf(DAO.ActorSearch("Arthur", "p", Search.ActorSearch("Arthur", "p", "1"))))
				.setStackTrace(String.valueOf(new Exception()));
}
}