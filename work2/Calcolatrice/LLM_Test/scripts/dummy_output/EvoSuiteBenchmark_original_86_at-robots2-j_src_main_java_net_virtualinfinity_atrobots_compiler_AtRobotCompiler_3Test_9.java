// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {
		
	private File sourceFile;
	private String sourceCode;
	private CompilerOutput compilerOutput;
	private AtRobotCompiler atRobotCompiler;
	
	public AtRobotCompiler_3Test() {
		sourceFile = new File("example.txt");
		sourceCode = atRobotCompiler.load(sourceFile);
		
		compilerOutput = atRobotCompiler.compile(new LineNumberReader(new StringReader(sourceCode)));
		
		assertNotNull("C-Compiler doesn't seem to work correctly.", compilerOutput);
		assertTrue("C-Compiler doesn't seem to work correctly.", compilerOutput.hasErrors());
	}
	
	@Test
	public void testCompileSuccessfully() throws IOException {
		assertFalse("C-Compiler doesn't seem to work correctly.", atRobotCompiler.compile(new StringReader(sourceCode)).hasErrors());
		
		try {
			atRobotCompiler.compile(new StringReader(sourceCode));
			fail("Should have thrown an {@link IllegalArgumentException}.");
		}
		catch (IllegalArgumentException expected) { }
	}
	
	@Test
	public void testCompileFromReaderSuccess() throws IOException {
		assertFalse("C-Compiler doesn't seem to work correctly.", atRobotCompiler.compile(new LineNumberReader(new StringReader(sourceCode))).hasErrors());
		
		try {
			AtRobotCompiler_3Test.this.atRobotCompiler = atRobotCompiler.compile(new ReaderInputStream(new StringReader(sourceCode)));
			fail("Should have thrown an {@link IllegalArgumentException}.");
		}
		catch (IllegalArgumentException expected) {
			// expected
		}
	}
	
	@Test
	public void testCompileFromReaderFailure1() throws IOException {
		try {
			AtRobotCompiler_3Test.this.atRobotCompiler = atRobotCompiler.compile(new LineNumberReader(new StringReader(sourceCode)));
			fail("Should have thrown an {@link IllegalArgumentException}.");
		}
		catch (IllegalArgumentException expected) {
			// expected
		}
	}
	
	@Test
	public void testCompileFromReaderFailure2() throws IOException {
		try {
			AtRobotCompiler_3Test.this.atRobotCompiler = atRobotCompiler.compile(new ReaderInputStream(new StringReader(sourceCode)));
			fail("Should have thrown an {@link IllegalArgumentException}.");
		}
		catch (IllegalArgumentException expected) {
			// expected
		}
	}
}