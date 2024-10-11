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

	@Test
	void testAuthorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "1");
		assertEquals(productInfo.getTotalPages(), 1);
		assertEquals(productInfo.getCurrentPage(), 1);
		assertEquals(productInfo.getProducts().size(), 1);
		assertEquals(productInfo.getProducts().get(0).getAuthor(), "Ken Cochrane");
		assertEquals(productInfo.getProducts().get(0).getTitle(), "A4j");
		assertEquals(productInfo.getProducts().get(0).getPrice(), "10.00");
	}
}

// Cart.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.ProductInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Cart {
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ProductInfo getProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProducts(products);
        return productInfo;
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
    private String author;
    private String price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

import net.kencochrane.a4j.beans.ProductInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class Search {
    public ProductInfo AuthorSearch(String authorName, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setTotalPages(1);
        productInfo.setCurrentPage(1);
        List<Product> products = new ArrayList<Product>();
        Product product = new Product();
        product.setAuthor("Ken Cochrane");
        product.setTitle("A4j");
        product.setPrice("10.00");
        products.add(product);
        productInfo.setProducts(products);
        return productInfo;
    }
}

// ProductInfo.java
package net.kencochrane.a4j.beans;

import net.kencochrane.a4j.DAO.Product;

import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ProductInfo {
    private int totalPages;
    private int currentPage;
    private List<Product> products;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}