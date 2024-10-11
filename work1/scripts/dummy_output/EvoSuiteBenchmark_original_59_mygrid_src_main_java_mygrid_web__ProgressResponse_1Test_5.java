// _ProgressResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponse_1Test {
		
    private static final String DATA = "{\"type\":\"int\",\"value\":6}";
    private _ProgressResponse _myGridWebService;


    /**
     * Constructor for _ProgressResponse_1Test.
     */
    public _ProgressResponse_1Test() {
        super();
        this._myGridWebService = new _ProgressResponse();
    }

    /**
     * Test of getTypeDesc method, of class mygrid.web._ProgressResponse.
     */
    @Test
    public void testGetTypeDesc() {
        System.out.println("getTypeDesc");
        java.lang.String expResult = "int { type=\"int\", value=\"6\" }";
        java.lang.String result = ((_myGridWebService).getTypeDesc()) /* getTypeDesc() */;
        assertEquals(expResult, result);

    }

    /**
     * Test of setTypeDesc method, of class mygrid.web._ProgressResponse.
     */
    @Test
    public void testSetTypeDesc() {
        System.out.println("setTypeDesc");
        java.lang.String expexpResult = "{type:\"int\",value:\"6\"}";
        java.lang.String result = ((_myGridWebService).setTypeDesc(DATA)) /* setTypeDesc(java.lang.String dat) */;
        assertEquals(expexpResult, result);

    }

    /**
     * Test of setTypeDesc method, of class mygrid.web._ProgressResponse.
     */
    @Test
    public void testSetTypDesc() {
        System.out.println("setTypDesc");
        java.lang.String expexxpResult = "{type:\"int\",value:\"6\"}";
        java.lang.String result = ((_myGridWebService).setTypDesc(DATA)) /* setTypDesc(java.lang.String dat) */;
        assertEquals(expexxpResult, result);

    }

}