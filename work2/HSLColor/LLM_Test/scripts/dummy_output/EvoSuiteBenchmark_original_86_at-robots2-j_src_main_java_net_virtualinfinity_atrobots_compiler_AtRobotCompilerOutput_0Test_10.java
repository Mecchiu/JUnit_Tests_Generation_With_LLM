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
		  {program=Program.createEmptySimulatorAndRegister("TestDriver");}
		
		  @Test
		  public void testCreateRobotFactory() {
		  	String name= "New";
		  	AtrobotFactory factory = AtRobotCompilerOutput.createRobotFactory(name);
		  	assertNotNull(factory);
		  	assertEquals(name, factory.toString());
		  	
		  	Program program= Program.createSimulatedSimulator(name, program.getDriverFactory());
		  	factory= AtRobotCompilerOutput.createRobotFactory(name);
		  	
		  }
		
  @Test
  void testHasErrors() {
  	 assertTrue(AtRobotCompilerOutput.hasErrors());
  }
  @Test
  void testGetProgram() {
  	assertNotNull(AtRobotCompilerOutput.getProgram());
  	
  	Program program= AtRobotCompilerOutput.getProgram();
  	
  	assertEquals("TestDriver", program.getName());
  }
  @Test
  void testGetHardwareSpecification() {
  	 assertNotNull(AtRobotCompilerOutput.getHardwareSpecification());
  }
  @Test
  void testGetMaxProcessorSpeed() {
  	assertEquals(1024, AtRobotCompilerOutput.getMaxProcessorSpeed(), 0.0001);
  }
  @Test
  void testGetDebugInfo() {
  	assertNotNull(AtRobotCompilerOutput.getDebugInfo());
  }
  @Test
  void testGetMessage() {
 	 assertNotNull(AtRobotCompilerOutput.getMessage());
}
@Test
public void testObjectToString() {
    String output = AtRobotCompilerOutput.toString(null);
}
}