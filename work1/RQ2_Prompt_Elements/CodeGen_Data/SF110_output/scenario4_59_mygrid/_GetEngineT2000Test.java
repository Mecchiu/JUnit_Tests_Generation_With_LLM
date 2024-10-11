// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {

    @Test
    public void testMethod1(){
		String s = new _GetEngine().getTypeDesc();
		assertTrue(_equals(s.length(), 3),s.length());
    }
    
}
