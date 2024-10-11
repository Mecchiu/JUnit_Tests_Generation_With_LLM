// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains one unit test case for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {
		
	/**
	* Test of getTypeDesc method, of class mygrid.web.Engine.
	*/
	@Test
    public void testGetTypeDesc() throws Exception {
        System.out.println("@Test");
        String name = "mygrid.web.Engine";
        Engine instance = Engine.getInstance("0-1-2-3-4-5-6-7-8-9-10");
        try {
            assertNotNull(instance.getTypeDesc());
        } catch (org.apache.axis.AxisFault e) {
            assertTrue(e.getMessage().contains("Cannot marshal type descriptor to XML. Is your version of MyGrid deployed correctly?"));
            e.printStackTrace();
        }
    }

	/**
	* Test of getTypeDesc method, of class mygrid.web.Engine.
	*/
	@Test
    public void testGetTypeDesc1() throws Exception {
        System.out.println("@Test");
        String name = "mygrid.web.Engine";
        Engine instance = Engine.getInstance(name);
        try {
            instance.getTypeDesc();
        } catch (org.apache.axis.AxisFault e) {
            assertTrue(e.getMessage().contains("XSD Error (type id: java.lang.String)"));
            e.printStackTrace();
        }
    }

	/**
	* Test of getTypeDesc method, of class mygrid.web.Engine.
	*/
	@Test
    public void testGetTypeDesc2() throws Exception {
        System.out.println("@Test");
        String name = "mygrid.web.Engine";
        Engine instance = Engine.getInstance();
        String s = instance.getTypeDesc();
        assertEquals(name, s);
    }

	/**
	* Test of getTypeDesc method, of class mygrid.web.Engine.
	*/
	@Test
    public void testGetTypeDesc3() throws Exception {
        System.out.println("@Test");
        String name = "mygrid.web.Engine-3-0-0-2-3-4-5-6";
        Engine instance = Engine.getInstance(name);
        String s = instance.getTypeDesc();
        assertEquals(name, s);
    }

	/**
	* Test of getTypeDesc method, of class mygrid.web.Engine.
	*/
	@Test
    public void testGetTypeDesc4() throws Exception {
        System.out.println("@Test");
        String name = "mygrid.web.Engine-5-15-40-45-54-58-61-6-10";
        Engine instance = Engine.getInstance(name);
        String s = instance.getTypeDesc();
        assertEquals(name, s);
    }
}