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

	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is null.
	*/
	@Test
	void testBlendedSearch_NullSearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch(null, "lite");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is empty.
	*/
	@Test
	void testBlendedSearch_EmptySearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("", "lite");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is invalid.
	*/
	@Test
	void testBlendedSearch_InvalidSearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("invalid", "lite");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "lite");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is null.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_NullType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", null);
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is empty.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_EmptyType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is invalid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_InvalidType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "invalid");
		assertNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is valid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_ValidType() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "lite");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is valid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_ValidType2() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "heavy");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is valid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_ValidType3() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "lite");
		assertNotNull(blendedSearch);
	}
	
	/**
	* Test case for {@link A4j#BlendedSearch(String, String)} method.
	* It tests the case when the search term is valid and the type is valid.
	*/
	@Test
	void testBlendedSearch_ValidSearchTerm_ValidType4() {
		A4j a4j = new A4j();
		BlendedSearch blendedSearch = a4j.BlendedSearch("valid", "heavy");
		assertNotNull(blendedSearch);
	}
}

// BlendedSearch.java
package net.kencochrane.a4j.beans;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Search> getSearches() {
        return searches;
    }

    public void setSearches(List<Search> searches) {
        this.searches = searches;
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
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}