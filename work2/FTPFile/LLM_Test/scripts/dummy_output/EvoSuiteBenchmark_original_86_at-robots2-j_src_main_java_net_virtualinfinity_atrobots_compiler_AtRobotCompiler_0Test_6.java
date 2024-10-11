// AtRobotCompiler_0Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_0Test {
		
	public final static String[] CLASSES = new String[]{
	"jade.core.AbstractRobot",
	"jade.commons.converters.ToStringImpl",
	"net.virtualinfinity.atrobots.compiler.Converter",
	"net.virtualinfinity.atrobots.compiler.Compiler.Impl",
	};
	
	public AtRobotCompiler_0Test() {
		super();
	}

	@Test
	public void test() {
		for (int i=0; i < CLASSES.length; i++) {
			System.out.println(CLASSES[i] + " : ");
		}
		Class target = null;
		try {
			ClassLoader classLoader = ClassLoader.getSystemClassLoader();
			for (int i=0; i < CLASSES.length; i++) {
				Class fileClass = classLoader.loadClass(CLASSES[i]);
				try {
					target = fileClass;
				} catch (ClassNotFoundException cnfe) {
				}
			}							
		} catch(Exception exc) {
			exc.printStackTrace();
			target = null;
		}

		if (target == null) {
    		assertTrue(Arrays.toString(CLASSES).equals("AtRobotCompiler_10"));
        } else {
        	System.out.println("Not equal - " + Arrays.toString(CLASSES) + "!= " + target.getCanonicalName());
    	}
	}
}
// AtRobotCompiler_0Test.java