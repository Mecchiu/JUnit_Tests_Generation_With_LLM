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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {

	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
	}
}

// A4j.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class A4j {

    /**
     * Search for an artist
     *
     * @since 1.0
     * @param artistName - artist name to search for.
     * @param mode (music, classical)
     * @param page 1 2 3 etc.
     * @return ProductInfo
     */
    public ProductInfo ArtistSearch(String artistName, String mode, String page) {
        Search search = new Search();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setArtistName(artistName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        productInfo.setProducts(search.ArtistSearch(artistName, mode, page));
        return productInfo;
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
		assertEquals(productInfo.getProducts().size(), 10);
	}
}

// A4j.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class A4j {

    /**
     * Search for an artist
     *
     * @since 1.0
     * @param artistName - artist name to search for.
     * @param mode (music, classical)
     * @param page 1 2 3 etc.
     * @return ProductInfo
     */
    public ProductInfo ArtistSearch(String artistName, String mode, String page) {
        Search search = new Search();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setArtistName(artistName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        productInfo.setProducts(search.ArtistSearch(artistName, mode, page));
        return productInfo;
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
		assertEquals(productInfo.getProducts().size(), 10);
		assertEquals(productInfo.getProducts().get(0).getArtistName(), "The Beatles");
	}
}

// A4j.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class A4j {

    /**
     * Search for an artist
     *
     * @since 1.0
     * @param artistName - artist name to search for.
     * @param mode (music, classical)
     * @param page 1 2 3 etc.
     * @return ProductInfo
     */
    public ProductInfo ArtistSearch(String artistName, String mode, String page) {
        Search search = new Search();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setArtistName(artistName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        productInfo.setProducts(search.ArtistSearch(artistName, mode, page));
        return productInfo;
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
		assertEquals(productInfo.getProducts().size(), 10);
		assertEquals(productInfo.getProducts().get(0).getArtistName(), "The Beatles");
		assertEquals(productInfo.getProducts().get(0).getProductName(), "The Beatles (The White Album) (Remastered)");
	}
}

// A4j.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class A4j {

    /**
     * Search for an artist
     *
     * @since 1.0
     * @param artistName - artist name to search for.
     * @param mode (music, classical)
     * @param page 1 2 3 etc.
     * @return ProductInfo
     */
    public ProductInfo ArtistSearch(String artistName, String mode, String page) {
        Search search = new Search();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setArtistName(artistName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        productInfo.setProducts(search.ArtistSearch(artistName, mode, page));
        return productInfo;
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
		assertEquals(productInfo.getProducts().size(), 10);
		assertEquals(productInfo.getProducts().get(0).getArtistName(), "The Beatles");
		assertEquals(productInfo.getProducts().get(0).getProductName(), "The Beatles (The White Album) (Remastered)");
		assertEquals(productInfo.getProducts().get(0).getProductId(), "B000002J0B");
	}
}

// A4j.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class A4j {

    /**
     * Search for an artist
     *
     * @since 1.0
     * @param artistName - artist name to search for.
     * @param mode (music, classical)
     * @param page 1 2 3 etc.
     * @return ProductInfo
     */
    public ProductInfo ArtistSearch(String artistName, String mode, String page) {
        Search search = new Search();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setArtistName(artistName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        productInfo.setProducts(search.ArtistSearch(artistName, mode, page));
        return productInfo;
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo.getArtistName(), "The Beatles");
		assertEquals(productInfo.getMode(), "music");
		assertEquals(productInfo.getPage(), "1");
		assertEquals(productInfo.getProducts().size(), 10);
		assertEquals(productInfo.getProducts().get(0).getArtistName(), "The Beatles");
		assertEquals(productInfo.getProducts().get(0).getProductName(), "The Beatles (The White Album) (Remastered)");
		assertEquals(productInfo.getProducts().get(0).getProductId(), "B000002J0B");
		assertEquals(productInfo.getProducts().get(0).getPrice(), "11.99");
	}
}

// A4j.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class A4j {

    /**
     * Search for an artist
     *
     * @since 1.0
     * @param artistName - artist name to search for.
     * @param mode (music, classical)
     * @param page 1 2 3 etc.
     * @return ProductInfo
     */
    public ProductInfo ArtistSearch(String artistName, String mode, String page) {
        Search search = new Search();
        ProductInfo productInfo = new ProductInfo();
        productInfo.setArtistName(artistName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        productInfo.setProducts(search.ArtistSearch(artistName, mode, page));
        return productInfo;
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testArtistSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
		assertEquals(productInfo