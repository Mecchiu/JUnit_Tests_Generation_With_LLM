// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {

    @Test
    public void test() {
	assertEquals(
		"{http://mygrid.web/mygrid/mygrid/mygrid/mygrid/mygrid/grid/mygrid/grid}test",
		"{http://mygrid.web/mygrid/mygrid/mygrid/mygrid/mygrid/grid/mygrid/grid}test",
		_Request.getTypeDesc()
	);
    }
}