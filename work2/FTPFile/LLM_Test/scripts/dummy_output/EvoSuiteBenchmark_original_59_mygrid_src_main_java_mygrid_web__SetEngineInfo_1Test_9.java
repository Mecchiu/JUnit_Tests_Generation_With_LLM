// _SetEngineInfo_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfo_1Test {
		
    
    @Test
    public void testSerConst01() {
        assertNotNull(new String(""));
    }

    @Test
    public void test_1() {
	_SetEngineInfo un = _SetEngineInfo.newInstance();
	un.getTypeDesc();
	assertNotNull(un.getName());
    }
}