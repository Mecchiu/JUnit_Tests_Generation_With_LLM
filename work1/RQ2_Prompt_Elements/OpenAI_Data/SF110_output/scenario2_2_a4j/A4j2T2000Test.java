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
 * Time