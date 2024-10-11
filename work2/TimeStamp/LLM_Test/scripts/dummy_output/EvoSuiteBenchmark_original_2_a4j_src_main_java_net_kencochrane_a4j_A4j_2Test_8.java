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
		 * Test the {@link A4j#ProductInfo#ActorSearch(String, String, String)} method.
		 *
		 * @throws Exception if the tests failed
		 */
		@Test
        public void ActorSearch() throws Exception {
                assertNotNull(Cart._instance);
                assertNotNull(DAO._instance);
                assertNotNull(DAO._instance);
                assertNotNull(DAO._instance);
                assertNotNull(DAO._instance);

                assertEquals("A4J-1054",DAO._instance.ActorSearch("A4J-1054", "", "")); // No actors
                assertEquals("A4JS.22",DAO._instance.ActorSearch("A4JS.22","Dvd", "vhs")); // No DVDs
                assertEquals("A4JS.22",DAO._instance.ActorSearch("A4JS.22","Vhs", "")); // No DVDs
                assertEquals("A4J-1054",DAO._instance.ActorSearch("A4J-1054", "Video", "1")); // 1 episode
                assertEquals("A4J-1056",DAO._instance.ActorSearch("A4J-1056", "TV", "1")); // 1 episode
                assertEquals("",DAO._instance.ActorSearch("", "Video", "1")); // No videos
                assertEquals("A3.21",DAO._instance.ActorSearch("A3.21","Dvd", "dvd")); // No DVDs
                assertEquals("A3.21",DAO._instance.ActorSearch("A3.21","Dvd", "vhs")); // No DVDs
                assertEquals("A4J-1056",DAO._instance.ActorSearch("A4J-1056", "TV", "1")); // 1 episode
                assertEquals("A4J-1055",DAO._instance.ActorSearch("A4J-1055", "TV", "2")); // 1 episode
                assertEquals("A4J-1056",DAO._instance.ActorSearch("A4J-1056", "TV", "3")); // 2 episodes
              
                assertEquals("",DAO._instance.ActorSearch("", ""));
                assertEquals("A4J-1056",DAO._instance.ActorSearch("A4J-1056", "", ""));
                assertEquals("A3.21",DAO._instance.ActorSearch("A3.21","VID", "3"));
                assertEquals("A3.21",DAO._instance.ActorSearch("A3.21","TV", "3"));


        }

		/**
		 * The constructor is a one-time-execute-method.
		 * Use this constructor to test the constructor
		 * @param a0
		 * @param a1
		 * @param a2
		 * @param a3
		 * @param a4
		 * @param a5
		 * @param a6
		 */
		static public A4j_2Test construct(String a0, String a1, String a2, String a3, String a4,
				String a5, String a6) {
                A4j_2Test d = new A4j_2Test();
		
		    d._test0 = a0;
		    d._test1 = a1;
		    d._test2 = a2;
		    d._test3 = a3;
		    d._test4 = a4;
		    d._test5 = a5;
		    d._test6 = a6;
		

		   return d;             
		}
		
		static void test0(){
		    assertEquals("A4J-1054",A4j._instance.ActorSearch("A4J-1054", "Dvd", "vhs")); 
		    assertEquals("A4JS.22",A4j._instance.ActorSearch("A4JS.22","Dvd", "vhs")); 
		    assertNull(A4j._instance.ActorSearch("A4J-1056", "Dvd", "vhs")); 
		    assertEquals("A8.07",A4j._instance.ActorSearch("A8.07","Dvd","dvd")); 
		    assertEquals("A9.21",A4j._instance.ActorSearch("A9.21","Dvd","dvd")); 

		}
		static void test1(){
		    assertNull(A4j._instance.ActorSearch("A4J-1054","Dvd", "")); 
		    assertEquals("A10.03",A4j._instance.ActorSearch("A10.03","Dvd", "dvd")); 
		    assertEquals("",A4j._instance.ActorSearch("A8.07", "Dvd", "dvd")); 

		}
		static void test2(){
		    assertNull(A4j._instance.ActorSearch("A4J-1012","VID", "3")); 
		    assertEquals("A5.02",A4j._instance.ActorSearch("A5.02","VID", "3")); 
		    assertEquals("A5.26",A4j._instance.ActorSearch("A5.26","VID", "3")); 
		    assertEquals("A5.27",A4j._instance.ActorSearch("A5.27","VID", "3")); 
		    assertEquals("A5.28",A4j._instance.ActorSearch("A5.28","VID", "3")); 
		    assertEquals("A5.29",A4j._instance.ActorSearch("A5.29","VID", "3")); 
		    
		}
		static void test3(){
		    assertEquals("A4J-1056",A4j._instance.ActorSearch("A4J-1016","TV", "1")); 
		    
		}
		static void test4(){
		    assertEquals("A3.21",A4j._instance.ActorSearch("A3.21","TV", "1")); 
		    assertEquals("A8.07",A4j._instance.ActorSearch("A8.07","VID", "3")); 
		    assertEquals("",A4j._instance.ActorSearch("A16.21","VID", "3")); 

		}
		static void test5(){
		    assertEquals("A8.07",A4j._instance.ActorSearch("A8.07","VID", "100")); 
		    assertEquals("",A4j._instance.ActorSearch("A16.22","VID", "100"));
		}
		static void test6(){
		    assertNull(A4j._instance.ActorSearch("A16.22","VID", "100")); 
		    
		}
}