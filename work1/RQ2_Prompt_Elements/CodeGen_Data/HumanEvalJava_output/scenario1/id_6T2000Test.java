// ParseNestedParensTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseNestedParens}.
* It contains one unit test case for the {@link ParseNestedParens#parseNestedParens(String)} method.
*/
class ParseNestedParensTest {

    @Test
    void test1() {
        //Given
        String parenString = "(1, (1, (2, (3, (4, (5)))), (6, (7)), (8, (9), (10, (11))), (12, (13, (14))))" ;
        //Then
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);
        expectedResult.add(7);
        expectedResult.add(8);
        expectedResult.add(9);
        expectedResult.add(10);
        expectedResult.add(11);
        expectedResult.add(12);
        expectedResult.add(13);
        expectedResult.add(14);
        
        List<Integer> result = ParseNestedParens.parseNestedParens(parenString);
        
        //Comparison
        System.out.println("\nThe actual result: ");
        result.toString();
        System.out.println("\n\n");
        
        assertEquals(expectedResult, result);
        /*
        { for (int i = 0; i < result.size(); i++)
            System.out.println(
                    "\nThe actual result: " + result.get(i) + "\n");
            System.out.println("\n\n");
        }
        */
    }
    
	@Test
    void test2() {
        // Given
        String parenString = "(1, (1, (2, (3, (4, (5)))), (6, (7)), (8, (9), (10, (11))), (12, (13, (14))) (5, (14, (15))), (6, (15, (16))), (7, (17)), (10, (11)) (3), (9) (11))";
        // Given
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);
        expectedResult.add(7);
        expectedResult.add(8);
        expectedResult.add(9);
        expectedResult.add(10);
        expectedResult.add(12);
        expectedResult.add(13);
        expectedResult.add(14);
        expectedResult.add(5);
        expectedResult.add(14);
        
        List<Integer> result = ParseNestedParens.parseNestedParens(parenString);
        
        // Comparison
        System.out.println("\nThe actual result: ");
        result.toString();
        System.out.println("\n\n");
        
        assertEquals(expectedResult, result);
        /*
        { for (int i = 0; i < result.size(); i++)
            System.out.println(
                    "\nThe actual result: " + result.get(i) + "\n");
            System.out.println("\n\n");
        }
        */
    }
	
	@Test
    void test3() {
        // Given
        String parenString = "(a, (a, (a, (b, (c, (d, (e, (f, (g, (h, (i, (j, (k, (l, (m, (n)))), (o, (p), (q
            ))))))))))))";
        // Given
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(3);
        expectedResult.add(1);
        expectedResult.add(5);
        expectedResult.add(8);
        expectedResult.add(7);
        expectedResult.add(9);
        expectedResult.add(5);
        expectedResult.add(9);
        
        List<Integer> result = ParseNestedParens.parseNestedParens(parenString);
        
        // Comparison
        System.out.println("\nThe actual result: ");
        result.toString();
        System.out.println("\n\n");
        
        assertEquals(expectedResult, result);
        /*
        { for (int i = 0; i < result.size(); i++)
            System.out.println(
                    "\nThe actual result: " + result.get(i) + "\n");
            System.out.println("\n\n");
        }
        */
    }
    
}