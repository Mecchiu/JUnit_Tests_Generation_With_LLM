// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {

	
	
    private _Request _1;
    private String _2;
    private int _3;
    private double _4;
    
    
    /**
     * It does nothing.
     */
    @Test
    public void test_set_type(){

        _1 = new _Request();
        assertEquals(typeDesc, _1.getTypeDesc());
    }
    
    /**
     * It does nothing.
     */
    @Test
    public void test_getType(){

        _2 = new String("getType");
        assertEquals(String.class, _1.getTypeDesc().getNewTypeDesc(String.class).getClass());
    }
    
    /**
     * It does nothing.
     */
    @Test
    public void test_getType(){

        _0();
        assertEquals(typeDesc, _1.getTypeDesc());
    }



	

    
}
