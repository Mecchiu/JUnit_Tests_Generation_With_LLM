// AtRobotCompilerOutput_1Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains one unit test case for the {@link AtRobotCompilerOutput#hasErrors()} method.
*/
class AtRobotCompilerOutput_1Test {
		private final Class[] params;

				private String name = null;
				private boolean hasErrors = false;
				public AtRobotCompilerOutput_1Test( Class[] params, String name, boolean hasErrors, RobotFactory factory ) {
					this.params = params;
					this.name = name;
					this.hasErrors = hasErrors;
					this.factory = factory;
				}

		/**
		 * Check for errors.
		 *
		 * @throws IllegalStateException if there are compiler errors.
		 */
		@Test
		public void hasErrors() {

				program = factory.createProgram(Program.Robotics);
				assertTrue( "Failed to compile program!", hasErrors );
				assertTrue( "Program has no name", name!= null );
				assertTrue( hasErrors );
				System.out.println( "Trying compile with name " + name );
				program = factory.createProgram( name );
				System.out.println( "Program now has name " + name );
				assertTrue( "Failed to compile program!", hasErrors );
				assertTrue( "Program has no name", name!= null );
				//assertEquals("Wrong program", program, factory.createRobotSpecification( "Robotics").createProgram( Program.Robotics ));
				//assertTrue( "Robot specification has no name", name!= null );
}
}