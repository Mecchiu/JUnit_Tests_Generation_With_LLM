// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {
		
	/**
	 * Test the {@link Wildcard#instantiateWildcard(String, String)} method.
	 * The tests are executed in the following order: 
	 * * <ol>
	 *   <li>instantiatePattern();</li>
	 *   <li>matchFiles();</li>
	 *   <li>matchPatterns();</li>
	 * </ol>
	 */
	@Test
	public void testInstantiateWildcard() {
		// Instantiate pattern.
		String pattern = "*";
		
		// Test if pattern is valid and contains wildcard chars.
		assertTrue("Pattern must be valid and contains wildcard chars.", pattern
				.matches("^[a-z]*$"));
				
		// Match files using pattern.
		String filePattern = "*";
		assertTrue("File must be valid and matches pattern.",
				filePattern.matches("^[^/]+$"));
				
		// Match patterns using pattern.
		String filePartPattern = "*";
		assertTrue("Part must be valid and matches pattern.",
				filePartPattern.matches("^[^/.]+$"));
				
		// Match parts of pattern using pattern.
		String filePartPattern2 = "*";
		assertTrue("Part must be valid and matches pattern.",
				filePartPattern2.matches("^[^/.]+[^*]$"));
	}	

	/**
	* Test the {@link Wildcard#matchWildcard(Pattern)} method.
	* The tests are executed in the following order: 
	* * <ol>
	*   <li>matchFilePattern();</li>
	*   <li>matchFiles();</li>
	*   <li>matchPatterns();</li>
	* </ol>
	*/
	@Test
	public void testMatchWildcard() {
		// Instantiate pattern.
		String pattern = "^[a-Z]*$";
		
		// Test if pattern is valid and contains wildcard chars.
		assertTrue("Pattern must be valid and contains wildcard chars.", pattern.matches("([^/]+))"));
				
		// Match file using pattern.
		String filePattern = "^[A-Z]*$";
		assertTrue("File must be valid and matches pattern.", 
				filePattern.matches("([^/]+))"));
				
		// Match files using pattern.
		String filePartPattern = "^[A-Z]*[^/]$";
		assertTrue("File must be valid and matches pattern.",
				filePartPattern.matches("([^/]+))"));
				
		// Match parts of pattern using pattern.
		String filePartPattern2 = "^[A-Z]*[^/]$";
		assertTrue("Part must be valid and matches pattern.",
				filePartPattern2.matches("([^/]+))"));

	}
		
	/**
	* Test the {@link Wildcard#matchFiles(Pattern)} method.
	* The tests are executed in the following order: 
	* * <ol>
	*   <li>matchFilePattern();</li>
	*   <li>matchPatterns();</li>
	* </ol>
	*/
	@Test
	public void testMatchFiles() {
		// Instantiate pattern.
		String pattern = "^[A-Z]*$";
		
		// Test if pattern is valid and contains wildcard chars.
		assertTrue("Pattern must be valid and contains wildcard chars.", pattern.matches("([^/]+))"));
				
		// Match files using pattern.
		String filePattern = "^[A-Z]*[^/]$";
		assertTrue("File must be valid and matches pattern.",
				filePattern.matches("([^/]+))"));
				
		// Match files using pattern.
		String filePartPattern = "^[A-Z]*[^/]$";
		assertTrue("File must be valid and matches pattern.",
				filePartPattern.matches("([^/]+))"));
				
		// Match parts of pattern using pattern.
		String filePartPattern2 = "^[A-Z]*[^/]$";
		assertTrue("Part must be valid and matches pattern.",
				filePartPattern2.matches("([^/]+))"));

	}
	
	/**
	* Test the {@link Wildcard#matchPatterns(Pattern)} method.
	* The tests are executed in the following order: 
	* * <ol>
	*   <li>matchFilePattern();</li>
	*   <li>matchPatterns();</li>
	* </ol>
	*/ 
		public void testMatchPatterns() {
		// Instantiate pattern.
		String part1 = "^[a-z]*$"; 
		
		// Test if pattern is valid and contains wildcard chars.
		assertTrue("Pattern must be valid and contains wildcard chars.", part1.matches(part1));
		
		// Test part1 of wildcard.
		String part2 = "^[a-z]*[^/]$";
		
		// Test if part1 and part2 match.
		assertTrue("Part1 and part2 must match.", 
				part1.matches(part2)); 
		
		// Test if the first of part1 of part2 match.
		assertTrue("Part1 must match.", 
				part1.matches("[^/]"));
		
		// Test if the first of part1 of part2 match.
		assertTrue("Part1 must match.", 
				part1.matches("[^/]")); 
		
		// Test part1 of pattern.
		assertTrue("Part1 must not match.", 
				part1.matches("^[^/]"));
		
		// Test if part1 contains part2.
		assertTrue("Part1 must contain part2.", part1.contains(part2));
		
		// Test part1 of wildcard.
		assertTrue("Part1 must not match.", 
				part1.matches("^[^/]" + part2));		
		
		// Test if part2 contains part1.
		assertTrue("Part2 must contain part1.", 
				part2.contains(part1));		
		
		
		// Test part1 of pattern.
		assertTrue("Part1 must not match.", 
				part1.matches("^[^/]"));
		
		// Test part1 of wildcard.
		assertTrue("Part1 must not match.", 
				part1.matches("^[^/]"));
		
		// Test part2 of pattern.
		assertTrue("Part2 must not match.", 
				part2.matches("^[^/]"));
		
		// Test part2 of wildcard.
		assertTrue("Part2 must not match.", 
				part2.matches("^[^/]"));
		
		// Test part2 of pattern.
		assertTrue("Part2 must not match.", 
				part2.matches("^[^/]"));
		
		// Test part2 of wildcard.
		assertTrue("Part2 must not match.", 
				part2.matches("^[^/]"));		


		// Test part1 of pattern
}
}