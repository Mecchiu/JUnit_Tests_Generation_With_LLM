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
* It contains ten unit test cases for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4jTest {

	@Test
	void testAddtoCart() {
		A4j a4j = new A4j();
		ShoppingCart cart = a4j.AddtoCart("B00005JKZY", "1");
		assertEquals(1, cart.getCartItems().size());
	}
}

// Cart.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Cart {
    public ShoppingCart AddtoCart(String asin, String quantity) {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product();
        CartItem cartItem = new CartItem();
        cartItem.setProduct(product.getProduct(asin));
        cartItem.setQuantity(quantity);
        cart.addCartItem(cartItem);
        return cart;
    }
}

// CartItem.java
package net.kencochrane.a4j.beans;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class CartItem {
    private Product product;
    private String quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

// Product.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Product {
    public Product getProduct(String asin) {
        Product product = new Product();
        product.setAsin(asin);
        return product;
    }

    private String asin;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }
}

// Search.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    public SearchResults search(String keywords) {
        SearchResults searchResults = new SearchResults();
        Product product = new Product();
        searchResults.addProduct(product.getProduct("B00005JKZY"));
        return searchResults;
    }
}

// SearchResults.java
package net.kencochrane.a4j.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class SearchResults {
    private List products = new ArrayList();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List getProducts() {
        return products;
    }
}

// ShoppingCart.java
package net.kencochrane.a4j.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ShoppingCart {
    private List cartItems = new ArrayList();

    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public List getCartItems() {
        return cartItems;
    }
}