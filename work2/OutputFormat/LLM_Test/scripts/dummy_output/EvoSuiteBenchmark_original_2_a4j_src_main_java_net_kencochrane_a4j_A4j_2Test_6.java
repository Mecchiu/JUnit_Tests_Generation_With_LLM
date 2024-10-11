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
		/**

		  test method for ActorName.
		  @throws {
			  {@link A4jException#NULL_PARAMETER ERROR.<CL>
			  }
			  
		  @Test
		  void ActorName.Exception(
		      int expected){
			  
			  {
				  if (expected == 4) {
					  throw new A4jException("Test 2");
				  }
				  
			  } 
		  }
		  
	  */
	@Test
	void ActorName(){
		
		// 1st test case
		A4j.ActorName(null, null);
		
		// 2nd test case
		A4j.ActorName("Kevin", "Doe");
		
		// 3rd test case
		A4j.ActorName(
			"Kevin", 
			"Doe"
		);
		
		// 4th test case
		A4j.ActorName("Kevin", "Doe", 6);
	}
}