// _GetEngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngineTest {
 
    final String TESTMSG = "Test msg 1";
    final String TESTKEY = "KEY 123";
    final String TESTDATA = "Data for test";

    /**
     * The default constructor of {@link _GetEngineTest}
     * This is a utility method for returning class initializer.
     */
    static _GetEngineTest newInitializedTest() {
        return new _GetEngineTest();
    }
	
    /**
     * Test method that executes tests on an instance of {@link _GetEngineTest}
     *
     * @throws Exception
     */
    @Test
    public void testConstructor() throws Exception {
        _GetEngineTest test = this.newInitializedTest();
        assertEquivalentDataToTestData(test, 
        		TESTMSG + TESTKEY, 
        		TESTDATA);
    }
    
    /**
     * Test method that executes tests on an instance of {@link _GetEngineTest}
     *
     * @throws Exception
     */
    @Test
    public void testSerializeSerialize() throws Exception {
        this.newInitializedTest().testSerialize(this);
    }
    
    private void assertEquivalentDataToTestData( _GetEngineTest test, 
    		String expectedMsg, String expectedKey)  {
        assertEquals(expectedMsg, test.TESTMSG);
        assertEquals(expectedKey, test.TESTKEY);
        assertEquals(expectedData, test.TESTDATA);
    }
}
