// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {
		
    @Test
    public void getTypeDescTest() {
        
        if(Engine.getTypeDesc().hasSerializers()) {
            StringBuffer sb = new StringBuffer();
            sb.append(getTypeDesc().getSerializer().getTypeName());
            assertEquals(sb.toString(), "java.lang.String");
        }
    }
}