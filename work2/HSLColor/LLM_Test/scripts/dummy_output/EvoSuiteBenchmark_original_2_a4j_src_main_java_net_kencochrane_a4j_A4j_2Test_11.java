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
		
	@Test
		public void ActorSearch( ) throws Exception {
			A4JBeanFactory.resetInstance();
			new A4JBean("A4JBean.A");
			
			assertEquals("Cart", new A4JBean("A").Type.CART);
			assertEquals("Product", new A4JBean("A").Type.PRODUCT);
			
			assertEquals("2/2/2", A4JBeanFactory.getInstance(A4JBeanFactory.CAMPAIGN).getCurrent(A4JBeanFactory.CART) );
		}
}