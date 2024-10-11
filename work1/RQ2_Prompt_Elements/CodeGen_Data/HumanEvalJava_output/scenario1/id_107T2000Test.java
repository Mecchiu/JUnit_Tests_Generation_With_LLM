// EvenOddPalindromeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains one unit test case for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
public static void test() {
			List<Integer> result = new ArrayList<Integer>();
            List<Integer> evenOdd = new ArrayList<Integer>();
            evenOdd.add(20);
            evenOdd.add(19);
            evenOdd.add(7);
            evenOdd.add(6);
            List<Integer> oddOdd = new ArrayList<Integer>();
            oddOdd.add(20);
            oddOdd.add(9);
            oddOdd.add(13);
            oddOdd.add(10);
            oddOdd.add(7);
			 
			EvenOddPalindrome.evenOddPalindrome(8);
			EvenOddPalindrome.evenOddPalindrome(6);
			EvenOddPalindrome.evenOddPalindrome(5);
			EvenOddPalindrome.evenOddPalindrome(8);
			EvenOddPalindrome.oddOddPalindrome(7);
			EvenOddPalindrome.oddOddPalindrome(6);
			EvenOddPalindrome.oddOddPalindrome(5);
			EvenOddPalindrome.oddOddPalindrome(8);
			EvenOddPalindrome.oddOddPalindrome(6);

			List<Integer> oddEven = new ArrayList<Integer>();
			oddEven.add(10);
			oddEven.add(8);
			oddEven.add(7);
			oddEven.add(6);
			List<Integer> evenEven = new ArrayList<Integer>();
			evenEven.add(19);
			evenEven.add(10);
			evenEven.add(9);
			evenEven.add(8);
			evenEven.add(7);
			evenEven.add(6);
			List<Integer> evenOddEven = new ArrayList<Integer>();
			evenOddEven.add(10);
			evenOddEven.add(9);
			evenOddEven.add(8);
			evenOddEven.add(7);
			evenOddEven.add(6);
			evenOddEven.add(5);

			List<Integer> evenOddEven = new ArrayList<Integer>();
			evenOddEven.add(10);
			evenOddEven.add(9);
			evenOddEven.add(8);
			evenOddEven.add(7);
			evenOddEven.add(6);
			evenOddEven.add(5);

			List<Integer> oddEvenEven = new ArrayList<Integer>();
			oddEvenEven.add(10);
			oddEvenEven.add(8);
			oddEvenEven.add(9);
			oddEvenEven.add(10);
			oddEvenEven.add(12);
			oddEvenEven.add(13);

			List<Integer> oddOddEven = new ArrayList<Integer>();
			oddOddEven.add(10);
			oddOddEven.add(9);
			oddOddEven.add(8);
			oddOddEven.add(7);
			oddOddEven.add(6);
			oddOddEven.add(5);

			evenOddEven.add(7);

			evenOddEven.add(6);

			evenOddEven.add(5);
			
			evenOddEven.add(10);
	
			oddEvenEven.add(11);
	
			int resultArr[] = new int[result.size()];
            resultArr = result.toArray(resultArr);
			assertArrayEquals(evenOdd, resultArr);
			
			int evenOddArr[] = new int[evenOddEven.size()];
            evenOddArr = evenOddEven.toArray(evenOddArr);
			assertArrayEquals(evenOdd, evenOddArr);
	
			int oddEvenArr[] = new int[oddEvenEven.size()];
            oddEvenArr = oddEvenEven.toArray(oddEvenArr);
			assertArrayEquals(oddOdd, oddEvenArr);
			
			int evenOddArr[] = new int[evenOddEven.size()];
            evenOddArr = evenOddEven.toArray(evenOddArr);
			assertArrayEquals(evenOdd, evenOddArr);

			List<Integer> oddEvenEven = new ArrayList<Integer>();
            oddEvenEven.add(3);
            oddEvenEven.add(2);
			oddEvenEven.add(4);
			List<Integer> oddOddEven = new ArrayList<Integer>();
            oddOddEven.add(3);
            oddOddEven.add(2);

			oddOddEven.add(3);

			oddOddEven.add(2);
            oddOddEven.add(4);
            List<Integer> oddOddEvenV = new ArrayList<Integer>();
            oddOddEvenV.add(3);
            oddOddEvenV.add(2);
            oddOddEvenV.add(4);
            List<Integer> oddOddEvenV2 = new ArrayList<Integer>();
            oddOddEvenV2.add(3);
            oddOddEvenV2.add(2);
		
			oddEvenEven.add(3);
			oddEvenEven.add(4);

			oddEvenEven.add(2);
			oddEvenOddEven.add(5);

			oddEvenEven.add(4);
			
			oddEvenOddEven.add(2);
		
			List<Integer> oddEvenEven = new ArrayList<Integer>();
			oddEvenEven.add(1);
			oddEvenEven.add(2);

        	oddEvenEven.add(3);
        	oddEvenEven.add(4);

        	List<Integer> oddEvenOddEven = new ArrayList<Integer>();
			oddEvenOddEven.add(1);
			oddEvenOddEven.add(2);

			List<Integer> oddEvenOddOddEven = new ArrayList<Integer>();
			oddEvenOddOddEven.add(1);
			oddEvenOddOddEven.add(2);

	    	oddEvenOddEven.add(3);

			oddEvenOddEven.add(4);
		
			List<Integer> evenEvenOddOddEven = new ArrayList<Integer>();
			
			if (oddEvenEvenEven.size() == 2) {
				List<Integer> evenEvenOddEvenOddEven = new ArrayList<Integer>();
				evenEvenOddEvenOddEven.add(1);
				evenEvenOddEvenOddEven.add(2);
				List<Integer> oddOddEvenOddEven = new ArrayList<Integer>();
                oddOddEvenOddEven.add(1);

            	oddOddEvenOddEven.add(2);
        	
                if (oddEvenOddO