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
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#hasErrors()} method returns true.
	*/
	@Test
	void testCreateRobotFactory_hasErrors() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(true);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getProgram()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_getProgram() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getHardwareSpecification()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_getHardwareSpecification() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getDebugInfo()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_getDebugInfo() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMaxProcessorSpeed()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_getMaxProcessorSpeed() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_getMessage() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage(null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory(null));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_empty() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory(""));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_whitespace() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory(" "));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_tab() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory("\t"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_newline() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory("\n"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_carriageReturn() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory("\r"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_formFeed() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory("\f"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)}
	*
	* Test if the method throws an {@link IllegalStateException} if the {@link AtRobotCompilerOutput#getMessage()} method returns null.
	*/
	@Test
	void testCreateRobotFactory_name_backspace() {
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput();
		atRobotCompilerOutput.setHasErrors(false);
		atRobotCompilerOutput.setProgram(new Program());
		atRobotCompilerOutput.setHardwareSpecification(new HardwareSpecification());
		atRobotCompilerOutput.setDebugInfo(new DebugInfo());
		atRobotCompilerOutput.setMaxProcessorSpeed(new Integer(0));
		atRobotCompilerOutput.setMessage("");
		assertThrows(IllegalArgumentException.class, () -> atRobotCompilerOutput.createRobotFactory("\b"));
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
	* Test case for {@link AtRobotCompiler#compile(String)}
	*
	* Test if the method throws an {@link IllegalArgumentException} if the {@link AtRobotCompiler#compile(String)} method is called with null.
	*/
	@Test
	void testCompile_null() {
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> atRobotCompiler.compile(null));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)}
	*
	* Test if the method throws an {@link IllegalArgumentException} if the {@link AtRobotCompiler#compile(String)} method is called with an empty string.
	*/
	@Test
	void testCompile_empty() {
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> atRobotCompiler.compile(""));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)}
	*
	* Test if the method throws an {@link IllegalArgumentException} if the {@link AtRobotCompiler#compile(String)} method is called with a string containing only whitespace.
	*/
	@Test
	void testCompile_whitespace() {
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> atRobotCompiler.compile(" "));
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)}
	*
	* Test if the method throws an {@link IllegalArgumentException} if the {@link AtRobotCompiler#compile(String)} method is called with a string containing only a tab.
	*/
	@Test
	void testCompile_tab() {
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		assertThrows(IllegalArgumentException.class, () -> atRobotCompiler.compile("\t"));
	}
	
	/**
	* Test case for {@link AtRobotComp