// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {
		/**
		* Unit test to check wildcard can possibly match multiple files.
		*/
//		@Test
		public final void testWithSimplePattern() {
				// The pattern: "*"
				// The resulting results: true
				assertTrue(isWildcard(pattern = "*"));

				// The pattern: "/*"
				// The resulting results: false
				assertFalse(isWildcard(pattern = "/*"));
		}
		
		/**
		* Unit test to check wildcard can possibly match multiple files in one path.
		*/
//		@Test
		public final void testWithSinglePathSeparator() {
				// The pattern: "*"
				// The resulting results: true
				assertTrue(isWildcard(pattern = "*"));

				// The pattern: "/path/*?"
				// The resulting results: false
				assertFalse(isWildcard(pattern = "/path/*"));
		}
		
		/**
		* Unit test to check wildcard can possibly match more than one file.
		*/
//		@Test
		public final void testWithAllFilePathSeparators() {
				// The pattern: "*"
				// The resulting results: true
				assertTrue(isWildcard(pattern = "**"));

				// The pattern: "*.java"
				// The resulting results: false
				assertFalse(isWildcard(pattern = ".java"));
		}
		
		// All files test is optional. To make JUnit happy when it tests for non-falsiness
		@Test
		public final void testWithAllFilesSeparators(){
				// The pattern: "*"
				// The resulting results: true
				assertTrue(isWildcard(pattern = "**"));

				// The pattern: ".java"
				// The resulting results: false
				assertFalse(isWildcard(pattern = ".java"));
		}
		
}