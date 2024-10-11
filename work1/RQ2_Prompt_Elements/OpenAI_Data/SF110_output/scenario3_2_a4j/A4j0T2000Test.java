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
		BlendedSearch bs = a4j.BlendedSearch("test", "lite");
		assertNotNull(bs);
	}
}

// BlendedSearch.java
package net.kencochrane.a4j.beans;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class BlendedSearch {
    private Search[] search;
    private Product[] product;
    private Cart[] cart;

    public BlendedSearch(Search[] search, Product[] product, Cart[] cart) {
        this.search = search;
        this.product = product;
        this.cart = cart;
    }

    public Search[] getSearch() {
        return search;
    }

    public Product[] getProduct() {
        return product;
    }

    public Cart[] getCart() {
        return cart;
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
    private String title;
    private String url;
    private String price;
    private String image;
    private String description;

    public Cart(String title, String url, String price, String image, String description) {
        this.title = title;
        this.url = url;
        this.price = price;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
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
    private String title;
    private String url;
    private String price;
    private String image;
    private String description;

    public Product(String title, String url, String price, String image, String description) {
        this.title = title;
        this.url = url;
        this.price = price;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}

// Search.java
package net.kencochrane.a4j.DAO;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    private String title;
    private String url;
    private String price;
    private String image;
    private String description;

    public Search(String title, String url, String price, String image, String description) {
        this.title = title;
        this.url = url;
        this.price = price;
        this.image = image;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}