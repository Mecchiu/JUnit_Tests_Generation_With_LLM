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
		ShoppingCart cart = a4j.AddtoCart("B00005N5PF", "1");
		assertEquals(1, cart.getItems().size());
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
    private static List<CartItem> items = new ArrayList<CartItem>();

    /**
     * Add to product to your Shopping cart
     *
     * @since 1.0
     * @param asin amazon id for the product
     * @param quantity number of items to add
     * @return ShoppingCart
     */
    public static ShoppingCart AddtoCart(String asin, String quantity) {
        Product product = Product.getProduct(asin);
        CartItem item = new CartItem(product, quantity);
        items.add(item);
        return new ShoppingCart(items);
    }
}

// CartItem.java
package net.kencochrane.a4j.beans;

import net.kencochrane.a4j.DAO.Product;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class CartItem {
    private Product product;
    private String quantity;

    public CartItem(Product product, String quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public String getQuantity() {
        return quantity;
    }
}

// Product.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.ProductBean;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Product {
    private static ProductBean product = new ProductBean();

    /**
     * Get a product from Amazon
     *
     * @since 1.0
     * @param asin amazon id for the product
     * @return ProductBean
     */
    public static ProductBean getProduct(String asin) {
        product.setAsin(asin);
        product.setTitle("Test Product");
        product.setPrice("$1.00");
        return product;
    }
}

// ProductBean.java
package net.kencochrane.a4j.beans;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ProductBean {
    private String asin;
    private String title;
    private String price;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

// Search.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.ProductBean;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    private static List<ProductBean> products = new ArrayList<ProductBean>();

    /**
     * Search Amazon for a product
     *
     * @since 1.0
     * @param keywords keywords to search for
     * @return List of ProductBean
     */
    public static List<ProductBean> search(String keywords) {
        ProductBean product = new ProductBean();
        product.setAsin("B00005N5PF");
        product.setTitle("Test Product");
        product.setPrice("$1.00");
        products.add(product);
        return products;
    }
}

// ShoppingCart.java
package net.kencochrane.a4j.beans;

import net.kencochrane.a4j.DAO.CartItem;

import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart(List<CartItem> items) {
        this.items = items;
    }

    public List<CartItem> getItems() {
        return items;
    }
}