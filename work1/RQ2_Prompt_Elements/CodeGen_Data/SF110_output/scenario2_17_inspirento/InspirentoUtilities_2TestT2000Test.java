// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {

		public Vector<String> do_test(String s, String v) {
			StringBuffer b = new StringBuffer();
			b.append(s);
			String s2 = b.toString().replaceAll("abc", "");
			
			assert(s2.equals(v));
			return new Vector<String>();
		}
		
		
		
		
		/**
		 * Test method for {@link InspirentoUtilities.do_test(java.lang, java.lang.String)}.
		*/
		@Test
		public void test1() {
			String s = "hello, world";
			StringBuffer b = new StringBuffer();
			b.append(s);
			String s2 = b.toString().replaceAll("abc", "");
			assert(s2.equals("hello,world"));
		}
		
		
		
		
		
		/**
		 * Test method for {@link InspirentoUtilities.do_test(java.lang, java.lang.String)}.
		*/
		@Test
		public void test2() {
			String s = "hello, world";
			StringBuffer b = new StringBuffer();
			b.append(s);
			String s2 = b.toString().replaceAll("abc", "");
			assert(s2.equals("hello, world"));
		}
		
		
		/**
		 * Test method for {@link InspirentoUtilities.do_test(java.lang, java.lang.String)}.
		*/
		@Test
		public void test3() {
			String s = "hello, world";
			StringBuffer b = new StringBuffer();
			b.append(s);
			String s2 = b.toString().replaceAll("bbc", "bbc");
			assert(!s2.equals("hello, world"));
		}
		


		@Test
		public void test4() {
			String s = "hello, world";
			String s2 = "world";
			String s3 = "";
			StringTokenizer st = new StringTokenizer(s3, ",");
			while (st.hasMoreTokens()) {
				
			}
		}
	/**
	 * Example test using {@link String} for tokenization.
	 */
		@Test
		public void test5() {
			String s = "hello, world";
			String s2 = "";
			String s3 = "";
			StringTokenizer st = new StringTokenizer(s2, ",\r\n\t ");
			while (st.hasMoreTokens()) {
				
				s3 += st.nextToken().replaceAll("[^\r\n]", "").replaceAll("[^\r]", "");
			}
			

		}
		
		
		
	
	
	
	
	
	// InspirentoUtilities.java
	
	
	
	
	
	// String utils
	@Test
	public void test6() {
	
	}
}