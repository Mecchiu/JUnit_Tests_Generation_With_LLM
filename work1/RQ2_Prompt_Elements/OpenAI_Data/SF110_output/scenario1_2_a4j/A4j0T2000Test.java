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
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4jTest {

	@Test
	void testBlendedSearch() {
		A4j a4j = new A4j();
		BlendedSearch bs = a4j.BlendedSearch("test", "test");
		assertNotNull(bs);
	}
}

// BlendedSearch.java
package net.kencochrane.a4j.beans;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class BlendedSearch {
    private List<Product> products = new ArrayList<Product>();
    private List<Cart> carts = new ArrayList<Cart>();
    private List<Search> searches = new ArrayList<Search>();

    public BlendedSearch(List<Product> products, List<Cart> carts, List<Search> searches) {
        this.products = products;
        this.carts = carts;
        this.searches = searches;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public List<Search> getSearches() {
        return searches;
    }
}

// Cart.java
package net.kencochrane.a4j.DAO;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Cart {
    private String name;
    private String description;

    public Cart(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

// Product.java
package net.kencochrane.a4j.DAO;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Product {
    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

// Search.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.BlendedSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    private List<Product> products = new ArrayList<Product>();
    private List<Cart> carts = new ArrayList<Cart>();
    private List<Search> searches = new ArrayList<Search>();

    public BlendedSearch Blended(String searchTerm, String type) {
        return new BlendedSearch(products, carts, searches);
    }
}