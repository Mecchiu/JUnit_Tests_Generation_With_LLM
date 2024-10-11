// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {
		int value;
	
	@Test
    public void test_getTypeDesc() {
        if(mygrid.web.webType!=null)
        {
            assertEquals("Type", _Progress.class.getName(), mygrid.web.webType.getName());			
        }
    }
}