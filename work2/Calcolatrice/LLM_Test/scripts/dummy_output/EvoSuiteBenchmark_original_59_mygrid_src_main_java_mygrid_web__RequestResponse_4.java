// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		
    /**
     * Test of the constructor of MyGrid.RequestResponse with no args.
     */
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Disabled
    void testNoArgsConstructor1() {
        
        _RequestResponse obj1 = new MyGrid.RequestResponse();
        
    }

    /**
     * Test of the constructor of MyGrid.RequestResponse with an arg of type java.lang.String.
     */
    @Test
    void testArgsString1() {
        System.out.println("myGrid.web.RequestResponse.testArgsString 1");
        {
            String testStr = "";
            // BEGIN android-note: Disable unnecessary/unbounded array creation
            MyGrid.RequestResponse obj1 = new MyGrid.RequestResponse(testStr);
            // END android-note: Disable unnecessary/unbounded array creation

            // BEGIN android-note: Disable unnecessary/unbounded array creation
            MyGrid.RequestResponse obj2 = new MyGrid.RequestResponse(testStr,testStr);
            // END android-note: Disable unnecessary/unbounded array creation
            assertEquals(testStr, obj1.toString());
        }
    }

}