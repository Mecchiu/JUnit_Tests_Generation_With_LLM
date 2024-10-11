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

	// TODO implement to test compile() method.
	
    @Test
	public void test1()
		throws IOException {
		
		assertNotNull(AtRobotCompiler.load("data/test1/input.txt"));
		assertNull(AtRobotCompiler.load("data/test1/empty.txt"));
		assertNull(AtRobotCompiler.load("data/test1/no_data.txt"));
		
	}
	
	@Test
	public void test2()
		throws IOException {
		
		assertNull(AtRobotCompiler.load("data/test2/empty.txt"));
		assertNotNull(AtRobotCompiler.load("data/test2/input.txt"));
		assertNotNull(AtRobotCompiler.load("data/test2/no_data.txt"));
		assertNull(AtRobotCompiler.load("data/test2/missing.txt"));
		
	}
	
	@Test
	public void test3()
		throws IOException {
		
		assertNull(AtRobotCompiler.load("data/test3/empty.txt"));
		assertNotNull(AtRobotCompiler.load("data/test3/input.txt"));
		assertNotNull(AtRobotCompiler.load("data/test3/no_data.txt"));
		assertNotNull(AtRobotCompiler.load("data/test3/missing.txt"));
		assertNotNull(AtRobotCompiler.load("data/test3/invalid.txt"));
		
	}
	
	@Test
	public void test4()
		throws IOException {
		
		assertNull(AtRobotCompiler.load("data/test4/empty.txt"));
		assertNotNull(AtRobotCompiler.load("data/test4/input.txt"));
		assertNotNull(AtRobotCompiler.load("data/test4/no_data.txt"));
		assertNotNull(AtRobotCompiler.load("data/test4/missing.txt"));
		assertNotNull(AtRobotCompiler.load("data/test4/invalid.txt"));
		
	}
	
}
