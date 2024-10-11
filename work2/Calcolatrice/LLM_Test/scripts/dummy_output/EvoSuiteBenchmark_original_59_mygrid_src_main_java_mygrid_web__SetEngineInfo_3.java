// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		
    @Test (expected=java.lang.NullPointerException.class)
    public void test(){
        new _SetEngineInfo().setName(null);
    }

    public void test() {
        new _SetEngineInfo().setName("Miguel");
        assertTrue(true);
    }
}