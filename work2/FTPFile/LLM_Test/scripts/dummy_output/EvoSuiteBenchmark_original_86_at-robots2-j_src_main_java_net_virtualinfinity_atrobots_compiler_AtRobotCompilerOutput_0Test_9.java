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
		
	/**
	 * Test of the createRobotFactory method.
	 */
	@Test
    public void testCreateRobotFactory_1() {
				
		AtRobotCompilerOutput ob = null;
		String name="AtRobotCompilerOutput"+System.nanoTime();
		try {
			ob = AtRobotCompilerOutput.createRobotFactory(name);
			assertEquals(name,new TestAtRobotCompilerOutput().getName());
		} catch(UnsupportedEncodingException exception) {
			fail();
		}
	}
	
	/**
	 * Test of the createRobot methods.
	 */
	@Test
	public void testCreateRobot_2() {

		AtRobotCompilerOutput ob = null;
		String name="AtRobotCompilerOutput"+System.nanoTime();
		Program p = new DebugInfo(name);
		HardwareSpecification hs = new HardwareSpecification();

		ob = AtRobotCompilerOutput.createRobot(p, hs);

		String fqn = p.getClass().getCanonicalName();
		ob.createRobotFactory(fqn);
		atRobotInit(p);
		assertEquals(hs,ob.getHardwareSpecification());
	
	}
	
	private void atRobotInit(Program p) {
		p.compareTo(10000, 1000);
		while(null!= p) {
			if(p.getTimeCompleted() - 10000 >= 1000 || p.getTimeCompleted() == 1000)
				break;
			p = new DebugInfo(p.getClass().getCanonicalName());
		}
	}


	@Test
	public void testOutput_3() {
		AtRobotCompilerOutput ob = null;
		String name="AtRobotCompilerOutput"+System.nanoTime();
		String expectedMessage;
		try {
			ob = AtRobotCompilerOutput.createRobotFactory(name);
			expectedMessage=(String) ob.getMessage();
		} catch(IllegalStateException e) {
			e.printStackTrace();
			fail();
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
			fail();
		}
		String fqn = ob.getProgram().getClass().getCanonicalName();
		assertTrue(expectedMessage.startsWith(fqn + " at"));
	}

	@Test
	public void testOutput_4() {
		atRobotInit(new Program());
		AtRobotCompilerOutput ob = AtRobotCompilerOutput.createRobot();

		String message = ob.getMessage();
		assertTrue(expectedMessage.startsWith("AtRobotCompilerOutput: "));
		
	}
	
	@Test
	public void testOutput_5() {

		AtRobotCompilerOutput ob = AtRobotCompilerOutput.createRobot(new DebugInfo(DebugInfo.class.getCanonicalName()));

		String message = ob.getMessage();
		assertTrue(expectedMessage.startsWith("AtRobotCompilerOutput: "));
	}
}