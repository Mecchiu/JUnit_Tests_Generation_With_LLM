// A4jTest.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4jTest {

	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is null.
	*/
	@Test
	void testAuthorSearch_1() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch(null, "1");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is empty.
	*/
	@Test
	void testAuthorSearch_2() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("", "1");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is null.
	*/
	@Test
	void testAuthorSearch_3() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", null);
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is empty.
	*/
	@Test
	void testAuthorSearch_4() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is not empty.
	*/
	@Test
	void testAuthorSearch_5() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "1");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is not empty.
	*/
	@Test
	void testAuthorSearch_6() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "2");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is not empty.
	*/
	@Test
	void testAuthorSearch_7() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "3");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is not empty.
	*/
	@Test
	void testAuthorSearch_8() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "4");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is not empty.
	*/
	@Test
	void testAuthorSearch_9() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "5");
		assertEquals(0, productInfo.getTotalResults());
	}
	
	/**
	* Test case for the {@link A4j#AuthorSearch(String, String)} method.
	* It tests the case when the author name is not empty and the page number is not empty.
	*/
	@Test
	void testAuthorSearch_10() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "6");
		assertEquals(0, productInfo.getTotalResults());
	}
}

// Cart.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.ProductInfo;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Cart {
    public Cart() {
    }

    public ProductInfo getCart() {
        return null;
    }

    public void addToCart(String productId) {
    }

    public void removeFromCart(String productId) {
    }
}

// Product.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.ProductInfo;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Product {
    public Product() {
    }

    public ProductInfo getProduct(String productId) {
        return null;
    }
}

// Search.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.ProductInfo;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    public Search() {
    }

    public ProductInfo AuthorSearch(String authorName, String page) {
        return null;
    }
}

// ProductInfo.java
package net.kencochrane.a4j.beans;

import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ProductInfo {
    private List products;
    private int totalResults;

    public ProductInfo() {
    }

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}