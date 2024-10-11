// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		
    @Test
    public void test() {
        String name = "GetName";
        float cpu = 10.0F;
        float ram = 20.0F;
        java.lang.String os = "Mac OS X";
        _SetEngineInfo obj = new _SetEngineInfo();

        // assertOneTimeProperty()
        assertEquals("name", obj.getName(), name);
        assertEquals(10.0F, obj.getCpu(), 0.0F);
        assertEquals(20.0F, obj.getRam(), 0.0F);
        assertEquals(java.lang.String.valueOf(os), obj.getOs(), 0.0F);
    }

}