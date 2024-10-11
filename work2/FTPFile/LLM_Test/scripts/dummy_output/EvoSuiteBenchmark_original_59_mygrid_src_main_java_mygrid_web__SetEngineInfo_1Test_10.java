// _SetEngineInfo_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfo_1Test {
		
    private static final float TOTAL_TOTAL_CPU = 25.0f;
    private static final float TOTAL_RAM = 500.0f;
    private static final String TOTAL_OS = "windows";
    
    @Test
    public void testGetTypeDesc() {
    	assertEquals("float", _SetEngineInfo.getTypeDesc());
    }

    @Test
    public void testAll(java.lang.Object object1, java.lang.Object object2, java.lang.Object object3) {
    	assertSame(object1, _SetEngineInfo.get(null, TOTAL_TOTAL_CPU, TOTAL_OS, object2));
	}

    @Test
    public void testZeroArg(java.lang.Object object1) {
    	assertSame(object1, _SetEngineInfo.get(null, TOTAL_TOTAL_CPU));
    }
    
    @Test
    public void testOneArg(java.lang.Object object1) {
    	assertSame(object1, _SetEngineInfo.get(object1, TOTAL_RAM));
    }
    
    @Test
    public void testTwoArg(java.lang.Object object1, java.lang.Object object2) {
    	assertSame(object1, _SetEngineInfo.get(object1, TOTAL_RAM));
	}


    
}