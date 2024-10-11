// ClassInfo_5Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {

	/**
	 * Default empty constructor for ClassInfo_5Test.
	 */
	public ClassInfo_5Test() {
	}
	
	/**
	 * Tests for class information.
	 * The class info is obtained from a private array of Class
	 * objects.
	 *
	 * @throws Exception some class error
	 */
void testClassInfo() throws Exception {
		
		String cname = ClassInfo_5Test.class.getName();
		
		// Tests
		
		ClassInfo_5Test.printArray(new Class[]{javax.swing.JInternalFrame.Type.PANEL, javax.swing.JInternalFrame.Type.MENU}
		, null
		);
	
	
		ClassInfo_5Test.printArray(new Class[]{javax.swing.JInternalFrame.Type.PANEL, javax.swing.JInternalFrame.Type.MENU}, null
		, "a"
		);
		
//TODO: add tests to this
	
