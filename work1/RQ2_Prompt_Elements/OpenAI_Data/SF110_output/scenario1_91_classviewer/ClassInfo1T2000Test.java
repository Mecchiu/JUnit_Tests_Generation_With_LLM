// ClassInfoTest.java
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
* It contains ten unit test cases for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfoTest {

		@Test
		void testPrintMethods() {
				ClassInfo ci = new ClassInfo();
				String[] tempArray = ci.printMethods();
				assertEquals(tempArray[0], "public void com.jstevh.viewer.ClassInfo.printMethods()");
				assertEquals(tempArray[1], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.String[])");
				assertEquals(tempArray[2], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.Object[])");
				assertEquals(tempArray[3], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Constructor[])");
				assertEquals(tempArray[4], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Field[])");
				assertEquals(tempArray[5], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Method[])");
				assertEquals(tempArray[6], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.Class[])");
				assertEquals(tempArray[7], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[])");
				assertEquals(tempArray[8], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[])");
				assertEquals(tempArray[9], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[])");
				assertEquals(tempArray[10], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[])");
				assertEquals(tempArray[11], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[])");
				assertEquals(tempArray[12], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[])");
				assertEquals(tempArray[13], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[])");
				assertEquals(tempArray[14], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[])");
				assertEquals(tempArray[15], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[])");
				assertEquals(tempArray[16], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[])");
				assertEquals(tempArray[17], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][])");
				assertEquals(tempArray[18], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][])");
				assertEquals(tempArray[19], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][])");
				assertEquals(tempArray[20], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][])");
				assertEquals(tempArray[21], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][])");
				assertEquals(tempArray[22], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][])");
				assertEquals(tempArray[23], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][])");
				assertEquals(tempArray[24], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[][])");
				assertEquals(tempArray[25], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[][])");
				assertEquals(tempArray[26], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[][])");
				assertEquals(tempArray[27], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][][])");
				assertEquals(tempArray[28], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][][])");
				assertEquals(tempArray[29], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][][])");
				assertEquals(tempArray[30], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][][])");
				assertEquals(tempArray[31], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][][])");
				assertEquals(tempArray[32], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][][])");
				assertEquals(tempArray[33], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][][])");
				assertEquals(tempArray[34], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[][][])");
				assertEquals(tempArray[35], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[][][])");
				assertEquals(tempArray[36], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[][][])");
				assertEquals(tempArray[37], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][][][])");
				assertEquals(tempArray[38], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][][][])");
				assertEquals(tempArray[39], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][][][])");
				assertEquals(tempArray[40], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][][][])");
				assertEquals(tempArray[41], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][][][])");
				assertEquals(tempArray[42], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][][][])");
				assertEquals(tempArray[43], "public void com.jstevh.viewer