// GetPositiveTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains one unit test case for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

    /**
     * Test case for the {@link GetPositive#getPositive(List)} method.
     */
    @Test
    void test_getPositive_List_correctlyReturnsCorrectValues() {
        List<Object> testList = new ArrayList<Object>();
        testList
               .add(11)
               .add(8)
               .add(3)
               .add(44)
               .add(-5)
               .add(0)
               .add(1);
        List<Object> expectedList = new ArrayList<Object>();
        expectedList.add(18);
        expectedList.add(1);
        expectedList.add(44);
        expectedList.add(-5);
        expectedList.add(0);
        expectedList.add(3);
        expectedList.add(11);
        expectedList.add(44);
        expectedList.add(-5);
        expectedList.add(0);
        expectedList.add(3);
        expectedList.add(55);
        expectedList.add(-5);
        expectedList.add(0);
        List<Object> result = GetPositive.getPositive(testList);
        assertNotNull(result);
        assertEquals(expectedList, result);
    }
    
    /**
     * Test case for the {@link GetPositive#getPositive(List)} method.
     */
    @Test
    void test_getPositive_List_correctlyReturnsListOfCorrectValues() {
        List<Object> testList = new ArrayList<Object>();
        testList
               .add(11)
               .add(8)
               .add(3)
               .add(44)
               .add(-5)
               .add(0)
               .add(1);
        List<Object> expectedList = new ArrayList<Object>();
        expectedList.add(18);
        expectedList.add(1);
        expectedList.add(44);
        expectedList.add(-5);
        expectedList.add(0);
        expectedList.add(3);
        expectedList.add(11);
        expectedList.add(44);
        expectedList.add(-5);
        expectedList.add(0);
        expectedList.add(3);
        expectedList.add(55);
        expectedList.add(-5);
        expectedList.add(0);
        expectedList.add(3);
        expectedList.add(3);
        expectedList.add(123);
        expectedList.add(1);
        expectedList.add(44);
        expectedList.add(-5);
        expectedList.add(0);
        expectedList.add(2);
        
        List<Object> result = GetPositive.getPositive(testList);
        assertNotNull(result);
        assertEquals(expectedList, result);
    }
    
    /**
     * Test case for the {@link GetPositive#getPositive(List)} method.
     */
    @Test
    void test_getPositive_ArrayOfList_throwsIllegalArgumentException() {
       List<Object> testList = new ArrayList<Object>();
       testList.add(3);
       testList.add(-5);
       testList = null;
       List<Object> result = GetPositive.getPositive(testList);
       assertNotNull(result);
       assertEquals(16, result.size());
    }
    

}
