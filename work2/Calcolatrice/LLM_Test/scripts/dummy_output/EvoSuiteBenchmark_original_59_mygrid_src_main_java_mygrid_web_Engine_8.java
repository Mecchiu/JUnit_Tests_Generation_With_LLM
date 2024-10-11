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
     * Test of createMethod, of class mygrid.web.Engine with all parameter
     * values.
     */
    @Test
    public void createMethodWith_parameters() {
        System.out.println("createMethodWith");
        Engine engine = null;
        
        java.lang.Integer id = new java.lang.Integer(0);
        
        java.lang.Integer name = null;
        java.lang.String ram = null;
        java.lang.String cpu = null;
        java.lang.String os = null;

        engine = mygrid.web.Engine.createMethod(true, id, name, ram, cpu, os);
        
        // use the type argument to ensure the paramerers are set correctly.
        // The tested constructor returns engine, not the expected instance.
        assertNotNull(engine);
        System.out.println("engine.getTypeDesc() = " + engine.getTypeDesc());
        assertEquals(Engine.class, engine.getTypeDesc().getClassType());
    }
    
    /**
     * Test of createMethod when there is only a single argument.
     */
    @Test
    public void createMethodWith_singleArg() {
        System.out.println("createMethodWith");
        Engine engine = null;
        
        java.lang.Integer id = new java.lang.Integer(0);

        engine = mygrid.web.Engine.createMethod(true, id, null);
        
        // use the type argument to ensure the paramerers are set correctly.
        // The tested constructor returns engine, not the expected instance.
        assertNotNull(engine);
        System.out.println("engine.getTypeDesc() = " + engine.getTypeDesc());
        assertEquals(Engine.class, engine.getTypeDesc().getClassType());
    }
}