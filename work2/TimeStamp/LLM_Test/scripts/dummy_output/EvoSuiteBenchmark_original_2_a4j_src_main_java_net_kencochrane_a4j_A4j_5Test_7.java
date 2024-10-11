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
		 * Test method for
		 * {@link net.kencochrane.a4j.DAO#AddtoCart(String, String)}.
		 * @throws Exception
		 */
	@Test
		public void AddtoCartTest_2() throws Exception {
		A4jDAO dao = new A4jDAO();
		A4j amazon = new A4j();
		A4j products = new A4j();
		A4jStore productsStore = new A4jStore();

		Cart cart = new Cart();

        AddtoCartTest.doTest(amazonList(amazon), products, productsStore, cart);
		//assertEquals(amazon.getA("product", String.class).size(), 3);
	}
	
		/**
		 * Test method for
		 * {@link net.kencochrane.a4j.DAO#AddtoCart(String, String)}.
		 * @throws Exception
		 */
	@Test
		public void AddtoCartTest_3() throws Exception {
		A4jDAO dao = new A4jDAO();
		A4j amazon = new A4j();
		A4j products = new A4j();
		A4jStore productsStore = new A4jStore();

		Cart cart = new Cart();

        AddtoCartTest.doTest(amazonList("amazon1", "amazon5"), products, productsStore, cart);
		//assertEquals(amazon.getA("product", "").size(), 1);
	}

		/**
		 * Test method for
		 * {@link net.kencochrane.a4j.DAO#AddtoCart(String, String)}.
		 * @throws Exception
		 */
	@Test
        public void AddtoCartTest_4() throws Exception {
		A4jDAO dao = new A4jDAO();
		A4j amazon1 = new A4j();
		A4j amazon2 = new A4j();
		A4j amazon3 = new A4j();
		A4j products = new A4j();
		A4j products1 = new A4j();
		A4j products2 = new A4j();
		A4j products3 = new A4j();
		A4j cart = new Cart();

        AddtoCartTest.doTest(amazonList("amazon1", "amazon1", "amazon2", "amazon3", "amazon4"));
        AddtoCartTest.doTest(amazonList("amazon2", "amazon2", "amazon1", "amazon1", "amazon2"));
        AddtoCartTest.doTest(amazonList("amazon2", "amazon2", "amazon3", "amazon4", "amazon1"));
		//assertEquals(amazon.getA("product", "").getM("amazon1").size(), 2);
	}

		/**
		 * Test method for
		 * {@link net.kencochrane.a4j.DAO#AddtoCart(String, String)}.
		 * @throws Exception
		 */
	@Test
        public void AddtoCartTest_5() throws Exception {
		A4jDAO dao = new A4jDAO();
		A4j amazon1 = new A4j();
		A4j amazon2 = new A4j();
		A4j amazon3 = new A4j();
		A4j products = new A4j();
		A4j products1 = new A4j();
		A4j products2 = new A4j();
		A4j products3 = new A4j();
		A4j cart = new Cart();

        AddtoCartTest.doTest(amazonList("amazon1", "amazon1", "amazon2", "amazon3", "amazon4"));
        AddtoCartTest.doTest(amazonList("amazon1", "amazon3", "amazon1", "amazon1"));
        AddtoCartTest.doTest(amazonList("amazon2", "amazon1", "amazon2"));
		//assertEquals(amazon.getA("product", "").getM("amazon2").size(), 1);
	}

public class A4jDAO {
	private static final A4jDAO dao = new A4jDAO();
	static public A4jDAO getInstance() throws Exception {
		return dao;
	}

	private Object[] object = new Object[5];
	private boolean flag = true;

	@Test
	public void AddtoCartTest_1() throws Exception {
		A4jDAO dao = getInstance();
		Object products = new Object();
		dao.AddtoCart(
		"amazon",
		"amazon1",
		"amazon2",
		"amazon3"
		);
	}
	
	@Test
	public void AddtoCartTest_2() throws Exception {
		A4jDAO dao = getInstance();
		Object products = new Object();
		dao.AddtoCart(
		"amazon",
		"amazon1", 
		"amazon2", 
		"amazon3"
		);
	}

	@Test
	public void AddtoCartTest_3() throws Exception {
		A4jDAO dao = getInstance();
		Object products = new Object();
		cart.setProducts(products);
		dao.AddtoCart(
		"amazon",
		"amazon1", 
		"amazon2", 
		"amazon3"
		);
	}

	/**
	 * @param products
	 * @return
	 */
	private Object[] amazonList(A4jObject object) {
		return object.findObject("amazon", "amazon", true);
	}
	
	/**
	 * @param object
	 * @return
	 */
	private <T extends Object> boolean isEmpty(T[] object) {
		for (T value : object)	return value.size() == 0;
		return true;

	}

}
}