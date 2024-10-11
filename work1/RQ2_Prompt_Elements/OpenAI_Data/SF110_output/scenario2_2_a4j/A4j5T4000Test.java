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
		ShoppingCart cart = a4j.AddtoCart("B00005JKJI", "1");
		assertNotNull(cart);
		assertEquals(1, cart.getCartItems().size());
		assertEquals("B00005JKJI", cart.getCartItems().get(0).getAsin());
		assertEquals("1", cart.getCartItems().get(0).getQuantity());
	}
}

// Cart.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.CartItem;
import net.kencochrane.a4j.beans.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Cart {
    /**
     * Add to product to your Shopping cart
     *
     * @since 1.0
     * @param asin amazon id for the product
     * @param quantity number of items to add
     * @return ShoppingCart
     */
    public ShoppingCart AddtoCart(String asin, String quantity) {
        ShoppingCart cart = new ShoppingCart();
        List<CartItem> cartItems = new ArrayList<CartItem>();
        CartItem cartItem = new CartItem();
        cartItem.setAsin(asin);
        cartItem.setQuantity(quantity);
        cartItems.add(cartItem);
        cart.setCartItems(cartItems);
        return cart;
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
    /**
     * Get product information
     *
     * @since 1.0
     * @param asin amazon id for the product
     * @return ProductInfo
     */
    public ProductInfo GetProductInfo(String asin) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setAsin(asin);
        return productInfo;
    }
}

// Search.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.SearchResults;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    /**
     * Search for products
     *
     * @since 1.0
     * @param keywords keywords to search for
     * @return SearchResults
     */
    public SearchResults Search(String keywords) {
        SearchResults searchResults = new SearchResults();
        searchResults.setKeywords(keywords);
        return searchResults;
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
    private String asin;
    private String quantity;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

// ProductInfo.java
package net.kencochrane.a4j.beans;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ProductInfo {
    private String asin;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }
}

// SearchResults.java
package net.kencochrane.a4j.beans;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class SearchResults {
    private String keywords;

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}

// ShoppingCart.java
package net.kencochrane.a4j.beans;

import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ShoppingCart {
    private List<CartItem> cartItems;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}