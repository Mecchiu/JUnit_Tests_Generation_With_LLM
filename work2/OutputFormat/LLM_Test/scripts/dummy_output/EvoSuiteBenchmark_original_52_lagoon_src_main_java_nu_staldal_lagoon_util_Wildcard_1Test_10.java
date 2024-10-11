// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {
		private String filePattern = "*.java";
		private String folderPattern = "*.tar";
		private String pattern = ".*";
		private String filenameTest = "./mypath/package"; // in test directory
		private String filename = "./mypath/my-class.java"; // no filename test in test directory
    	@Test
		public void testMatchWildcard(){
			String wildcardRegexPattern = pattern;
			Pattern patternToReturn = null;
			String result = null;
            wildcardRegexPattern = matchWildcard(wildcardRegexPattern, filename);
            result = matchWildcard(wildcardRegexPattern, filenameTest);
			assertEquals(filenameTest, result);
        }
}