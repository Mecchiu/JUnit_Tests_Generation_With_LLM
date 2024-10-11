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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {

	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("", "", "");
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
    public ProductInfo getCart() {
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
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
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
    private int totalProducts;
    private int totalPages;
    private int currentPage;
    private int pageSize;
    private String searchString;
    private String searchType;
    private String searchMode;

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchMode() {
        return searchMode;
    }

    public void setSearchMode(String searchMode) {
        this.searchMode = searchMode;
    }
}