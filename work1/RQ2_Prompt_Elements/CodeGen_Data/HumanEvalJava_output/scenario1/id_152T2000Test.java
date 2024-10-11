// CompareTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains one unit test case for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

    private static final int TEST_GAMETYPE = 1;
    private static final int TEST_DIGIT = 2;
    private static final int TEST_CHAR = 3;
    
    @Test
    void testCompare() {
        List<Character> test = new ArrayList<>();
        test.add(Character.valueOf("a"));
        test.add(Character.valueOf("b"));
        test.add(Character.valueOf("c"));
        test.add(Character.valueOf("d"));
        test.add(Character.valueOf("e"));
        
        List<Character> expected = new ArrayList<>();
        expected.add(Character.valueOf("a"));
        expected.add(Character.valueOf("b"));
        expected.add(Character.valueOf("c"));
        expected.add(Character.valueOf("d"));
        expected.add(Character.valueOf("e"));
        
        List<Character> actual = new ArrayList<>();
        actual.add(Character.valueOf("abc"));
        actual.add(Character.valueOf("def"));
        actual.add(Character.valueOf("ghi"));

        assertEquals("Should return the expected result.", expected, compare(test, actual));

    }
		
}


@Test
class CompareTest2 {
		
    private static final int TEST1 = 1;
    private static final int TEST2 = 2;

    @Test
    void testCompare() {
        List<Character> test = new ArrayList<>();
        test.add(Character.valueOf("a"));
        test.add(Character.valueOf("b"));
        test.add(Character.valueOf("c"));
        test.add(Character.valueOf("d"));
        test.add(Character.valueOf("e"));
        
        List<Character> expected = new ArrayList<>();
        expected.add(Character.valueOf("a"));
        expected.add(Character.valueOf("b"));
        expected.add(Character.valueOf("c"));
        expected.add(Character.valueOf("d"));
        expected.add(Character.valueOf("e"));
        
        assertEquals("Should return the expected result.", expected, compare(test, TEST1, TEST2));

    }
		
}

