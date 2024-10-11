// A4j_2Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains one unit test case for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_2Test {

	private A4j dao;
				
	/**
	* Init of test case A4j_2Test that contains one unit test.
	*/
	public A4j_2Test() {
		dao = new A4j();
	}
	
	/**
	* Sets the dao instance for both tests.
	* @param dao the instance of A4j
	*/
	public void setDAO(A4j dao) {
		this.dao = dao;
	}
	
	/**
	* Gets dao instance for both tests.
	*/
	private A4j getDAO() {
		return dao;
	}
	
	/**
	* Test case of {@link A4j#ActorSearch(String, String, String)}.
	*/
	@Test
	public void testActorSearch() {
		String a1 = "Jasper";
		String a2 = "Majordomo";
		String a3 ="Omar";
		String a4 = "Jim";
		DAO.ProductInfo b1 = dao.ActorSearch(a1, 2, "D");
		DAO.CartCoupon b2 = dao.ActorSearch(b1, "D", "D");
		DAO.CartCoupon b3 = dao.ActorSearch(b2, "D");
		assertEquals(b1, b2);
		assertEquals("D", b3.couponTypeName);
		assertNull(b3.couponPrice);
		
		DAO.CartCart b4 = null;
		b4 = dao.ActorSearch(b2, "D", "J");
		assertEquals(b2, b4);
		
		DAO.CartCoupon b5 = null;
		b5 = dao.CartCouponSearch(b1, "D", "J");
		assertEquals(b1, b5);
		
		DAO.Cart C = dao.ActorSearch("T", "C", "A");
		assertEquals("E", C.userTypeName);
		assertNull(C.couponTypeName);
		DAO.ProductInfo c1 = dao.ActorSearch(b1, "D", "A");
		assertEquals("", c1.userTypeName);
		DAO.CartCoupon c2 = dao.ActorSearch(c1, "D");
		assertEquals("A", c2.couponTypeName);
		assertNull(c2.couponPrice);		
		
		DAO.ProductInfo d1 = dao.ActorSearch("B", "D");
		ProductInfo a1 = dao.ActorSearch("A", "D");
		assertEquals(b1, a1);
		assertEquals(10, a1.totalPrice);
		assertEquals("", a1.currencyCode);
		assertNull(a1.userTypeName);
		DAO.CartCoupon a2 = dao.ActorSearch(a1, "D");
		ProductInfo r1 = dao.ActorSearch("", "D");
		assertEquals(10, r1.totalPrice);
		assertEquals("", r1.currencyCode);
		assertNull(r1.userTypeName);
		
		DAO.CartCoupon x1 = dao.CartCouponSearch("M", "D");
		assertEquals(c1, x1.from)
		assertEquals(b4.couponTypeName, x1.to);
		
		return;
	}
}