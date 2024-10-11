// Maximum1Test.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

		/**
		* Test case 1.
		* The input array is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<Integer> arr = new ArrayList<Integer>();
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(0, res.size());
		}
		
		/**
		* Test case 2.
		* The input array is not empty.
		* The input k is 0.
		* The expected result is an empty list.
		*/
		@Test
		void testCase2() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 0;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(0, res.size());
		}
		
		/**
		* Test case 3.
		* The input array is not empty.
		* The input k is greater than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase3() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				int k = 4;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(1, res.get(0));
				assertEquals(2, res.get(1));
				assertEquals(3, res.get(2));
		}
		
		/**
		* Test case 4.
		* The input array is not empty.
		* The input k is less than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase4() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(3, res.get(0));
				assertEquals(4, res.get(1));
				assertEquals(5, res.get(2));
		}
		
		/**
		* Test case 5.
		* The input array is not empty.
		* The input k is equal to the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase5() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				int k = 5;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(5, res.size());
				assertEquals(1, res.get(0));
				assertEquals(2, res.get(1));
				assertEquals(3, res.get(2));
				assertEquals(4, res.get(3));
				assertEquals(5, res.get(4));
		}
		
		/**
		* Test case 6.
		* The input array is not empty.
		* The input k is less than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase6() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(4);
				arr.add(3);
				arr.add(2);
				arr.add(1);
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(3, res.get(0));
				assertEquals(4, res.get(1));
				assertEquals(5, res.get(2));
		}
		
		/**
		* Test case 7.
		* The input array is not empty.
		* The input k is less than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase7() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(4);
				arr.add(3);
				arr.add(2);
				arr.add(1);
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(3, res.get(0));
				assertEquals(4, res.get(1));
				assertEquals(5, res.get(2));
		}
		
		/**
		* Test case 8.
		* The input array is not empty.
		* The input k is less than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase8() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(4);
				arr.add(3);
				arr.add(2);
				arr.add(1);
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(3, res.get(0));
				assertEquals(4, res.get(1));
				assertEquals(5, res.get(2));
		}
		
		/**
		* Test case 9.
		* The input array is not empty.
		* The input k is less than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase9() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(4);
				arr.add(3);
				arr.add(2);
				arr.add(1);
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(3, res.get(0));
				assertEquals(4, res.get(1));
				assertEquals(5, res.get(2));
		}
		
		/**
		* Test case 10.
		* The input array is not empty.
		* The input k is less than the size of the input array.
		* The expected result is the sorted input array.
		*/
		@Test
		void testCase10() {
				List<Integer> arr = new ArrayList<Integer>();
				arr.add(5);
				arr.add(4);
				arr.add(3);
				arr.add(2);
				arr.add(1);
				int k = 3;
				List<Object> res = Maximum1.maximum(arr, k);
				assertEquals(3, res.size());
				assertEquals(3, res.get(0));
				assertEquals(4, res.get(1));
				assertEquals(5, res.get(2));
		}
}