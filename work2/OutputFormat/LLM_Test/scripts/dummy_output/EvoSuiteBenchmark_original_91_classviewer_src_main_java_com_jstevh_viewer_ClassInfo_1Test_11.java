// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		private ClassInfo ci = new ClassInfo();
		
		/**
		 * Prints out class details
		 *
		 * @return         none
		 */
		public void printClassDetails()
		{
			assertNotNull( ci);
			
			System.out.println("\t" + ci.getClassName());
		}
	
	/**
	 * Tests if an anonymous inner class works.
	 *
	 * @param  args                  the command line arguments
	 *
	 * @return                   none
	 */
	private ClassInfo_1_1_1 args(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		for ( String s : args) {
			if ( s.equals( "--") || s.equals("-test") ) {
				continue;
			}
			l.add(s);
		}
		return args(l);
	}
}