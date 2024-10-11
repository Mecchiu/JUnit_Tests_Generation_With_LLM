// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
		
    private static _GetEngine bean;
    
    static {
        bean = new _GetEngine();
    }
    
    // test case for getTypeDesc() method
    @Test
    public void test() {
        java.lang.String s1 = bean.getTypeDescription();
        // No exception thrown
    }

}