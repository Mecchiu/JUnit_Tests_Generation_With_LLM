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
	 * @since 1.0
	 * @param args
	 * @throws Exception
	*/
	public static void main(String[] args) throws Exception {
		A4j_2Test a4j_2Test = new A4j_2Test();
		a4j_2Test.setUp();
		a4j_2Test.run();//Test case
		a4j_2Test.tearDown();
	}

	/**
	 * @since 1.0
	 * @throws Exception
	*/
	public void run() throws Exception {

		A4j_3.start();

		A4j_3.setPageSize(26);

        //TODO
//        int max_products = A4j.DEFAULT_CART.getMax();

        Search search_3 = new Search("user", "test", "", null,
                A4j.DEFAULT_CART.getPage())
               .setCriteria("user", "test", "", (int) max_products);
		ArticleInfo first3 = A4j.executeSearch(search_3);
		System.out.println(first3);

		Search search_4 = new Search("user", "test", "", (int)max_products);
		ArticleInfo first4 = A4j.executeSearch(search_4);
		System.out.println(first4);

		search_4.getCriteria();
		search_4.select().execute(result -> {
			System.out.println(result);
			System.out.println(result == null);
		});

		Search search_5 = new Search("user", "test", "user", null,
				(int) A4j.DEFAULT_CART.getPage())
				.addPaginatedSearch("user", "test", "", (int) max_products);
		ArticleInfo first5 = A4j.executeSearch(search_5);
		System.out.println(first5);

//		if (first5==null) {
//			throw new Exception("No article found.");
//		}
//		try (Cargo cargo = first5.getCargo()){
//			for(Product prod: cargo.getProducts().getProducts()){
//				System.out.println(prod.getType());
//				System.out.println("   -  " + prod.getName());
//			}
//		}


	}

	/**
	 * Sets up the test case.
	 *
	 * @throws Exception
	 * @since 1.0
	*/
	public void setUp() throws Exception {
		A4j_1.start();

		DAO dao_test = new DAO();
		final String url = "localhost:9999";
		dao_test.createConnection(url, "", "",
				"org.junit.jupiter.api.Test");
	}

	/**
	 * Tear down the test case.
	 *
	 * @throws Exception
	 * @since 1.0
	*/
	public void tearDown() throws Exception {
		A4j_1.tearDown();

		A4j_1 = null;
	}

}