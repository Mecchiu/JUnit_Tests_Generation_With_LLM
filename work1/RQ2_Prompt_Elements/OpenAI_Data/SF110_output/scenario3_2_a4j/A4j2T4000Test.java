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
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4jTest {
		
	@Test
	void testActorSearch() {
		A4j a4j = new A4j();
		ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
		assertNotNull(productInfo);
		assertEquals(productInfo.getActorName(), "Tom Hanks");
		assertEquals(productInfo.getMode(), "dvd");
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
     * Search for an actor
     *
     * @since 1.0
     * @param actorName - actor or actresses name to search for
     * @param mode (dvd, vhs, video)
     * @param page 1 2 3 etc
     * @return ProductInfo
     */
    public ProductInfo ActorSearch(String actorName, String mode, String page) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setActorName(actorName);
        productInfo.setMode(mode);
        productInfo.setPage(page);
        return productInfo;
    }
}

// A4jTest.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane