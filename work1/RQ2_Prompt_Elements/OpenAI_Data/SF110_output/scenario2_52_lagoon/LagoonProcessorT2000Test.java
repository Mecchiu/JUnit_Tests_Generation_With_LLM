// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains ten unit test cases for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {

		/**
		* Test case 1 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild1() throws IOException {
				// Test case 1
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
		}
		
		/**
		* Test case 2 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild2() throws IOException {
				// Test case 2
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
		}
		
		/**
		* Test case 3 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild3() throws IOException {
				// Test case 3
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
				lp.build(false);
		}
		
		/**
		* Test case 4 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild4() throws IOException {
				// Test case 4
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
				lp.build(true);
		}
		
		/**
		* Test case 5 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild5() throws IOException {
				// Test case 5
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
				lp.build(true);
		}
		
		/**
		* Test case 6 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild6() throws IOException {
				// Test case 6
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
				lp.build(false);
		}
		
		/**
		* Test case 7 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild7() throws IOException {
				// Test case 7
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
				lp.build(false);
				lp.build(true);
		}
		
		/**
		* Test case 8 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild8() throws IOException {
				// Test case 8
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
				lp.build(true);
				lp.build(false);
		}
		
		/**
		* Test case 9 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild9() throws IOException {
				// Test case 9
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
				lp.build(true);
				lp.build(true);
		}
		
		/**
		* Test case 10 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild10() throws IOException {
				// Test case 10
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
				lp.build(false);
				lp.build(false);
		}
}

// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains ten unit test cases for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		
		/**
		* Test case 1 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild1() throws IOException {
				// Test case 1
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
		}
		
		/**
		* Test case 2 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild2() throws IOException {
				// Test case 2
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
		}
		
		/**
		* Test case 3 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild3() throws IOException {
				// Test case 3
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
				lp.build(false);
		}
		
		/**
		* Test case 4 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild4() throws IOException {
				// Test case 4
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(false);
				lp.build(true);
		}
		
		/**
		* Test case 5 for method {@link LagoonProcessor#build(boolean)}.
		*
		* @throws IOException if any fatal error occur
		*/
		@Test
		public void testBuild5() throws IOException {
				// Test case 5
				LagoonProcessor lp = new LagoonProcessor();
				lp.build(true);
				lp.build(true