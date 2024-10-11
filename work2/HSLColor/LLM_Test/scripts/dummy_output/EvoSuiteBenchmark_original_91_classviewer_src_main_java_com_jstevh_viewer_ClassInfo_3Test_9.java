// ClassInfo_3Test.java
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
* It contains one unit test case for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {
		public ClassInfo_3Test() {
		}

	@Test
	public void test() {
		ClassInfo.setDebug(true);
        ClassInfo_1.setDebug(true);
        ClassInfo.printArray(new ClassInfo_1().createArray());

		ClassInfo.setDebug(false);

        ClassInfo_1.setDebug(true);
        ClassInfo_2.setDebug(true);
        ClassInfo.printArray(new ClassInfo_2().createArray());

		ClassInfo.setDebug(true);
        ClassInfo_3.setDebug(true);
        ClassInfo_4.setDebug(true);
        ClassInfo_5.setDebug(true);
        ClassInfo_6.setDebug(true);
        ClassInfo_7.setDebug(true);

        ClassInfo_3.printMethods();

        ClassInfo.setDebug(false);

        ClassInfo_6.setDebug(true);
        ClassInfo_7.setDebug(true);
        ClassInfo_5.setDebug(true);
}
}