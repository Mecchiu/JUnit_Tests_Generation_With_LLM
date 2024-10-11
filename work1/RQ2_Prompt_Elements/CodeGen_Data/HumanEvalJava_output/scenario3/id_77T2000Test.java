// IscubeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains one unit test case for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

	/**
    * Test method for
    * {@link Iscube#iscube(int)}.
    * 
    * The test cases for this method are the 
    * following 3:
    * [1] http://www.open-man-foundation.org/publications/n1467_ISCROBLEX_15.pdf
    * [2] http://www.open-man-foundation.org/publications/N1570_ISC27.pdf
    * [3] http://www.open-man-foundation.org/publications/N1467_ISCROBLEX_7.pdf
    *
    * @throws Exception
    tests
    */
    @Test
    public void test1() throws Exception {
        checkIscube(2);    
    }
    
    /**
    * Test method for
    * {@link Iscube#iscube(int)}.
    * 
    * The test cases for this method are the 
    * following 3:
    * [4] http://www.open-man-foundation.org/publications/N1468_ISCROBLEX_50.pdf
    * [5] http://www.open-man-foundation.org/publications/N1570_ISC27.pdf
    * [6] http://www.open-man-foundation.org/publications/N1467_ISCROBLEX_7.pdf
    *
    * @throws Exception
    tests
    */
    @Test
    public void test2() throws Exception {
        checkIscube(0);    
    }
    
    /**
    * Test method for
    * {@link Iscube#iscube(int)}.
    * 
    * The test cases for this method are the 
    * following 3:
    * [7] http://www.open-man-foundation.org/publications/N1608_ISCROBLEX_20.pdf
    * [7] http://www.open-man-foundation.org/publications/N1570_ISC27.pdf
    * [8] http://www.open-man-foundation.org/publications/N1467_ISCROBLEX_7.pdf
    *
    * @throws Exception
    tests
    */
    @Test
    public void test3() throws Exception {
        checkIscube(67);    
    }
    
    private void checkIscube(int checkValue) {
        if(checkValue > 0)
        {
            assertTrue(iscube(checkValue));
        }
        else {
            assertFalse(iscube(0));
        }
    }
    
}
