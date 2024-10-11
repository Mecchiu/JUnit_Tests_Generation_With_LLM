// AtRobotCompilerOutput_0Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains one unit test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutput_0Test {
		
    @Test
    void createRobotFactory1Test() {
            
        AtRobotCompilerOutput.assertHasElements(true);

        Program prog = Program.createEqualTo("", Program_.FAMILY_PROGRAM);
        
        AtRobotCompilerOutput.createRobotFactory("test", prog);
        
        AtRobotCompilerOutput.assertOneElementAdded(true);

    }

	@Test
	void createRobotFactory2Test() {
		AtRobotCompilerOutput.assertHasElements(false);

		HardwareSpecification spec = new HardwareSpecification();
		
		spec.setCoreSpeed("100m");
		
        Program oprog = Program.createEqualTo("", Program_.FAMILY_OPROGRAM);
        
        AtRobotCompilerOutput.createRobotFactory("test", oprog);
        
        AtRobotCompilerOutput.assertOneElementAdded(true);
	}
    @Test
    void createRobotFactory3Test() {
            
    }

    @Test
    void testHasElements1Test() {
            
        AtRobotCompilerOutput.assertHasElements(false);

        Program oprog = Program.createEqualTo("", Program_.FAMILY_OPROGRAM);
        
        AtRobotCompilerOutput.assertOneElementAdded(true);
    }

    @Test
    void testGetMaxProcessorSpeed1Test() {
            
        AtRobotCompilerOutput.assertMaxProcessorSpeed(100);

        Program oprog = Program.createEqualTo("", Program_.FAMILY_OPROGRAM);
        
        AtRobotCompilerOutput.assertOneElementAdded(true);
    }

    @Test
    void testGetMaxProcessorSpeed2Test() {
            
    }

	@Test
	void testHasElements2Test() {
	}

    @Test
    void testHasElements3Test() {
    }

}