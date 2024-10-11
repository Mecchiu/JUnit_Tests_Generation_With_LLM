// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
		
    // Field
    private java.lang.Boolean completeResult;

    /**
     * Test Method
     * 
     */
    @Test
    public void testCompleteResult() {
        this.completeResult = true;
        assertEquals(java.lang.Boolean.valueOf(true), this.completeResult);
    }

}

class _CompleteResponseTest2 {
     java.lang.String _typeDesc;


        /**
     * 
     *
     * @return
     *     The typeDesc
     */
    public java.lang.String get_typeDesc() {
        return _typeDesc;
    }

    /**
     * 
     *
     * @param value
     *     The typeDesc
     */
    public void set_typeDesc(java.lang.String value) {
        this.typeDesc = value;
    }

    java.lang.Boolean
    get_completeResult() {
        return completeResult;
    }

    /**
     * 
     *
     * @param value
     *     The completeResult
     */
    public void set_completeResult(java.lang.Boolean value) {
        completeResult = value;
    }

}