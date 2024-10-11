// SortedListSumTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains one unit test case for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

    // Test cases, the original input data is a list of strings
	@Test
	void testSortedListSum(List<String> list)
	{
        SortedListSum.sortedListSum(list);
		
		// Test if the list has all words with the same length
		assertGetListSorted(list, "cba");
		
		// Test if the list doesn't contain duplicates
		assertGetListSorted(list, "aaa");
	}
	
	// Test cases, the original input data is an array of integers
	@Test
	void testSortedListSum(ArrayList<Integer> list)
	{
        SortedListSum.sortedListSum(list);
		
		// Test if the list has all words with the same length
		assertGetListSorted(list, "aaaa");
		
		// Test if the list doesn't contain duplicates
		assertGetListSorted(list, "cbbba");
	}
	
	// Test cases, the original input data is an array of strings
	@Test
	void testSortedListSum2(ArrayList<String> list)
	{
        SortedListSum.sortedListSum(list);
		
		// Test if the list has all words with the same length
		assertGetListSorted(list, "ccccbbb");
		
		// Test if the list doesn't contain duplicates
		assertGetListSorted(list, "aabbbcba");	        
	}
	
	// Test cases, the original input data is a list of numbers
	@Test
	void testSortedListSum3(List<Float> list)
	{
        SortedListSum.sortedListSum(list);
		
		// Test if the list has all words with the same length
		assertGetListSorted(list, "abcd");
		
		// Test if the list doesn't contain duplicates
		assertGetListSorted(list, "aebda");            
	}
	
	// Test cases, the original input data is an array of numbers
	@Test
	 void testSortedListSum4(ArrayList<Float> list)
	{
        SortedListSum.sortedListSum(list);
		
		// Test if the list has all words with the same length
		assertGetListSorted(list, "aaaabbbbbababbbcbbb");	        
		
		// Test if the list doesn't contain duplicates
		assertGetListSorted(list, "aaaaaaaaaaaaaaaa");            
	}  	
}