// ClassInfo_8Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		
	/**
	 * Tests {@link ClassInfo#getClass(String)}.
	 * This method always throws a ClassNotFoundException.
	 *
	 * @throws Exception a general error. Print a message and a test failed.
	*/
	@Test
	void testGetClass( ) throws ClassNotFoundException {
		
		ClassInfo ci = new ClassInfo_8Test();
		ci.println("ClassInfo");
		try {
			Class foundClass = ci.getClass( "MyClass" );
			assertNotNull( foundClass );
		}
		catch( ClassNotFoundException cne ) {
			fail( "Can't find myclass");
		}
		
		ClassInfo_8Test.classInfo = null;
		
		foundClass = ci.getClass( "MyClass" );
		assertTrue( foundClass.isLocalClass() );
		
		foundClass = ci.getClass( "MyLocalClass" );
		assertTrue( ci.getKnownPackages().contains( "Other" ));
}
}