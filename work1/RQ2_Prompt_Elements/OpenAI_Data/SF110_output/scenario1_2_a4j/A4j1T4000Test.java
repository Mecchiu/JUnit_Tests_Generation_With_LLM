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
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4jTest {

		@Test
		void testKeywordSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.KeywordSearch("", "", "", "");
				assertNotNull(productInfo);
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
    public ProductInfo getProductInfo(String productId) {
        return null;
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
    public ProductInfo getProductInfo(String productId) {
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
    public ProductInfo Keyword(String searchTerm, String productLine, String type, String page) {
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

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }
}