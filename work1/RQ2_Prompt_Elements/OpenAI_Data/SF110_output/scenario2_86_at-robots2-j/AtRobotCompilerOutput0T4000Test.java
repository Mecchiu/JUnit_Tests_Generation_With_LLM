// AtRobotCompilerOutputTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutputTest {

	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* It tests the case when the compiler output has errors.
	*/
	@Test
	void testCreateRobotFactory_HasErrors() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(true);
		assertThrows(IllegalStateException.class, () -> compilerOutput.createRobotFactory("test"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* It tests the case when the compiler output has no errors.
	*/
	@Test
	void testCreateRobotFactory_NoErrors() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		compilerOutput.setProgram(new Program());
		compilerOutput.setHardwareSpecification(new HardwareSpecification());
		compilerOutput.setDebugInfo(new DebugInfo());
		compilerOutput.setMaxProcessorSpeed(100);
		compilerOutput.setMessage("test");
		assertNotNull(compilerOutput.createRobotFactory("test"));
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is null.
	*/
	@Test
	void testCompile_NullSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> compiler.compile(null));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is empty.
	*/
	@Test
	void testCompile_EmptySourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is invalid.
	*/
	@Test
	void testCompile_InvalidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("invalid source code");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is valid.
	*/
	@Test
	void testCompile_ValidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("#include <at/atrobots/robot.h>\n" +
				"\n" +
				"void main() {\n" +
				"    while (true) {\n" +
				"        drive(100);\n" +
				"        scan(0, 1);\n" +
				"    }\n" +
				"}");
		assertFalse(compilerOutput.hasErrors());
		assertNotNull(compilerOutput.getProgram());
		assertNotNull(compilerOutput.getHardwareSpecification());
		assertNotNull(compilerOutput.getDebugInfo());
		assertEquals(100, compilerOutput.getMaxProcessorSpeed());
		assertEquals("", compilerOutput.getMessage());
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is null.
	*/
	@Test
	void testCompile_NullSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> compiler.compile(null));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is empty.
	*/
	@Test
	void testCompile_EmptySourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is invalid.
	*/
	@Test
	void testCompile_InvalidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("invalid source code");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is valid.
	*/
	@Test
	void testCompile_ValidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("#include <at/atrobots/robot.h>\n" +
				"\n" +
				"void main() {\n" +
				"    while (true) {\n" +
				"        drive(100);\n" +
				"        scan(0, 1);\n" +
				"    }\n" +
				"}");
		assertFalse(compilerOutput.hasErrors());
		assertNotNull(compilerOutput.getProgram());
		assertNotNull(compilerOutput.getHardwareSpecification());
		assertNotNull(compilerOutput.getDebugInfo());
		assertEquals(100, compilerOutput.getMaxProcessorSpeed());
		assertEquals("", compilerOutput.getMessage());
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is null.
	*/
	@Test
	void testCompile_NullSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> compiler.compile(null));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is empty.
	*/
	@Test
	void testCompile_EmptySourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is invalid.
	*/
	@Test
	void testCompile_InvalidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("invalid source code");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is valid.
	*/
	@Test
	void testCompile_ValidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("#include <at/atrobots/robot.h>\n" +
				"\n" +
				"void main() {\n" +
				"    while (true) {\n" +
				"        drive(100);\n" +
				"        scan(0, 1);\n" +
				"    }\n" +
				"}");
		assertFalse(compilerOutput.hasErrors());
		assertNotNull(compilerOutput.getProgram());
		assertNotNull(compilerOutput.getHardwareSpecification());
		assertNotNull(compilerOutput.getDebugInfo());
		assertEquals(100, compilerOutput.getMaxProcessorSpeed());
		assertEquals("", compilerOutput.getMessage());
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is null.
	*/
	@Test
	void testCompile_NullSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> compiler.compile(null));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is empty.
	*/
	@Test
	void testCompile_EmptySourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is invalid.
	*/
	@Test
	void testCompile_InvalidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("invalid source code");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is valid.
	*/
	@Test
	void testCompile_ValidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("#include <at/atrobots/robot.h>\n" +
				"\n" +
				"void main() {\n" +
				"    while (true) {\n" +
				"        drive(100);\n" +
				"        scan(0, 1);\n" +
				"    }\n" +
				"}");
		assertFalse(compilerOutput.hasErrors());
		assertNotNull(compilerOutput.getProgram());
		assertNotNull(compilerOutput.getHardwareSpecification());
		assertNotNull(compilerOutput.getDebugInfo());
		assertEquals(100, compilerOutput.getMaxProcessorSpeed());
		assertEquals("", compilerOutput.getMessage());
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is null.
	*/
	@Test
	void testCompile_NullSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> compiler.compile(null));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is empty.
	*/
	@Test
	void testCompile_EmptySourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is invalid.
	*/
	@Test
	void testCompile_InvalidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("invalid source code");
		assertTrue(compilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* It tests the case when the source code is valid.
	*/
	@Test
	void testCompile_ValidSourceCode() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput compilerOutput = compiler.compile("