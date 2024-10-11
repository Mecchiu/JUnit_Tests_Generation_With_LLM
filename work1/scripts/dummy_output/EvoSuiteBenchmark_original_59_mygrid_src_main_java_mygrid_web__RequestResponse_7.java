// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {
		private final String result = new String();

    /**
     * Test case for {@link _RequestResponse#getTypeDesc()}.
     */
    @Test
    public void testTypeDesc() throws Exception {
        final _MockMessageHandler mockMessageHandler = new _MockMessageHandler(result);
        final mygrid.web.Grid grid = Mock.grid = mockMessageHandler;
        new mygrid.web.GridController(grid).getTypeDesc();
        assertTrue(result.equals(mockMessageHandler.getReceiveType()));
    }
}