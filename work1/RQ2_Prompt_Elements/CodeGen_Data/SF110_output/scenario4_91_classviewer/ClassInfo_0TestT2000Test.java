// ClassInfo_0Test.java
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
* It contains one unit test case for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {
 static void main(String[] args) throws Exception {
				 ClassInfo classInfo = new ClassInfo(new String[] {"javax.swing.Border.lineStyle"});
				 assertTrue(classInfo.isAbstract());
				 //assertTrue(classInfo.isInterface());
				 assertFalse(classInfo.isAbstract() | classInfo.isInterface());
				 assertFalse(classInfo.isAbstract() | classInfo.isInterface(&getClass("javax.swing.border")));
		}
}
// ClassInfo.java