// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {
		
    final static int __name = 1;
    final static String __content = "content";

    @Test
    void getTypeDesc_2_1() throws Exception {
        assertEquals(javax.xml.types.SchemaType.INTEGER_STRING, ContextElement.getTypeDesc(__name));
    }

    @Test
    void getTypeDesc_2_2() throws Exception {
        assertEquals(javax.xml.types.SchemaType.INTEGER_STRING, ContextElement.getTypeDesc(__content, __name));
    }

    static {
        try {
        	Class.forName("mygrid.web.web-ws");
        } catch(Exception e){
            // TODO: Auto-generated catch block
            printLine(e.getLocalizedMessage());
        }
    }
}