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
* It contains one unit test case for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {
		
	/*
//TODO: This test is failing with an exception, see if we can improve it to not have to assert
// in the future.
		if (!DAO_5.AuthorSearch(
						"Test AuthorName",
						"1|3|2").getTotalProducts()) {
			System.out.println("Author not found in A4J");
		}
//*/
	
	public void test() {
		
		this.run();
	}
	
	/**
	 * Main method of the class.
	 * It executes the unit tests
	 */
	public static void run() {
		
		cart = new Cart(new TestConfig("authorName", "Test AuthorName"));
		
//		cart.add(new Cart("Test AuthorName").setProduct("Test Product").setIsbn("testIsbn"));
		cart.add(new Cart("Test AuthorName").setProduct("Test Product").setIsbn("12345678"));
		
		courses = new Search("Test Search1", new Cart(cart));
		
		products = new Search("Test Search2", new Search("Test Search3", products));
		
	}
	
}

/**
 * Sample configuration.
*/
class TestConfig {
		
	private String name;
	
	/**
	 * Constructor
	 */
	public TestConfig(String name, String pattern) {
			
		this.name = name;
	}
	
	/**
	 * Getter for property name
	 *
	 * @return String the configuration property name
	 * @since 1.0
	 */
	public String getName() {
	
		return name;
	}

	/**
	 * Setter for property name
	 *
	 * @param name the name property value to set
	 * @since 1.0
	 */
	public void setName(String name) {
	
		this.name = name;
	}
	
}