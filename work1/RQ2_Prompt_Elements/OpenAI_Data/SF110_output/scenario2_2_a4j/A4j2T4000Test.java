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

	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "1"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch1() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "2"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch2() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "2");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "3"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch3() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "3");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "4"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch4() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "4");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "5"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch5() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "5");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "6"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch6() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "6");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "7"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch7() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "7");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "8"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch8() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "8");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "9"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch9() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "9");
		assertNotNull(productInfo);
	}
	
	/**
	* Test case for the {@link A4j#ActorSearch(String, String, String)} method.
	* It tests the method with the following parameters:
	* <ul>
	* <li>actorName: "Tom Hanks"</li>
	* <li>mode: "dvd"</li>
	* <li>page: "10"</li>
	* </ul>
	* The expected result is that the method returns a {@link ProductInfo} object.
	*/
	@Test
	public void testActorSearch10() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "10");
		assertNotNull(productInfo);
	}
}

// Cart.java
package net.kencochrane.a4j.DAO;

import net.kencochrane.a4j.beans.*;

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
     * Add a product to the cart
     *
     * @since 1.0
     * @param productId - product to add
     * @return CartInfo
     */
    public CartInfo AddProduct(String productId) {
        CartInfo cartInfo = new CartInfo();
        cartInfo.setCartId("12345");
        cartInfo.setCartTotal("$10.00");
        cartInfo.setCartItems(new ArrayList());
        return cartInfo;
    }

    /**
     * Remove a product from the cart
     *
     * @since 1.0
     * @param productId - product to remove
     * @return CartInfo
     */
    public CartInfo RemoveProduct(String productId) {
        CartInfo cartInfo = new CartInfo();
        cartInfo.setCartId("12345");
        cartInfo.setCartTotal("$10.00");
        cartInfo.setCartItems(new ArrayList());
        return cartInfo;
    }

    /**
     * Get the cart
     *
     * @since 1.0
     * @return CartInfo
     */
    public CartInfo GetCart() {
        CartInfo cartInfo = new CartInfo();
        cartInfo.setCartId("12345");
        cartInfo.setCartTotal("$10.00");
        cartInfo.setCartItems(new ArrayList());
        return cartInfo;
    }
}

// CartInfo.java
package net.kencochrane.a4j.beans;

import java.util.List;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class CartInfo {
    private String cartId;
    private String cartTotal;
    private List cartItems;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(String cartTotal) {
        this.cartTotal = cartTotal;
    }

    public List getCartItems() {
        return cartItems;
    }

    public void setCartItems(List cartItems) {
        this.cartItems = cartItems;
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
    private String productId;
    private String productName;
    private String productPrice;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
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

    /**
     * Get a product
     *
     * @since 1.0
     * @param productId - product to get
     * @return ProductInfo
     */
    public ProductInfo GetProduct(String productId) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("The Matrix");
        productInfo.setProductPrice("$10.00");
        productInfo.setProductDescription("The Matrix is a 1999 science fiction action film written and directed by The Wachowski Brothers, starring Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, Hugo Weaving, and Joe Pantoliano. It was first released in the USA on March 31, 1999, and is the first part of The Matrix series of films, comics and video games. The film's premise was both original and influential, and the film was generally well-received by critics. It was successful at the box office, and won and was nominated for several awards. The film's mainstream success had a strong influence on popular culture, and it is often regarded as one of the greatest science fiction films of all time. The film has had a strong influence on action films and science fiction films that were released thereafter. The Matrix franchise was further expanded through the production of comic books, video games and animated short films, with which the Wachowski Brothers were heavily involved. The Matrix itself has been added to the Library of Congress' National Film Registry for being culturally, historically and aesthetically significant. The success of the film led to the release of two feature film sequels, both written and directed by the Wachowski Brothers: The Matrix Reloaded and The Matrix Revolutions. The Matrix franchise was further expanded through the production of comic books, video games and animated short films, with which the Wachowski Brothers were heavily involved. The Matrix itself has been added to the Library of Congress' National Film Registry for being culturally, historically and aesthetically significant. The success of the film led to the release of two feature film sequels, both written and directed by the Wachowski Brothers: The Matrix Reloaded and The Matrix Revolutions.");
        productInfo.setProductActors(new ArrayList());
        return productInfo;
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
    private String productId;
    private String productName;
    private String productPrice;
    private String productDescription;
    private List productActors;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public List getProductActors() {
        return productActors;
    }

    public void setProductActors(List productActors) {
        this.productActors = productActors;
    }
}

// ProductActor.java
package net.kencochrane.a4j.beans;

/**
 * http://www.KenCochrane.net
 * User: Ken Cochrane
 * Date: Aug 1, 2003
 * Time: 7:39:44 PM
 */
public class ProductActor {
    private String actorId;
    private String actorName;

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
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

    /**
     * Search for a product
     *
     * @since 1.0
     *