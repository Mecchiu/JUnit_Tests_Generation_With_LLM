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
				assertEquals(tempArray[43], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][][][])");
				assertEquals(tempArray[44], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[][][][])");
				assertEquals(tempArray[45], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[][][][])");
				assertEquals(tempArray[46], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[][][][])");
				assertEquals(tempArray[47], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][][][][])");
				assertEquals(tempArray[48], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][][][][])");
				assertEquals(tempArray[49], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][][][][])");
				assertEquals(tempArray[50], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][][][][])");
				assertEquals(tempArray[51], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][][][][])");
				assertEquals(tempArray[52], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][][][][])");
				assertEquals(tempArray[53], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][][][][])");
				assertEquals(tempArray[54], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[][][][][])");
				assertEquals(tempArray[55], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[][][][][])");
				assertEquals(tempArray[56], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[][][][][])");
				assertEquals(tempArray[57], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][][][][][])");
				assertEquals(tempArray[58], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][][][][][])");
				assertEquals(tempArray[59], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][][][][][])");
				assertEquals(tempArray[60], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][][][][][])");
				assertEquals(tempArray[61], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][][][][][])");
				assertEquals(tempArray[62], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][][][][][])");
				assertEquals(tempArray[63], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][][][][][])");
				assertEquals(tempArray[64], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[][][][][][])");
				assertEquals(tempArray[65], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[][][][][][])");
				assertEquals(tempArray[66], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[][][][][][])");
				assertEquals(tempArray[67], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][][][][][][])");
				assertEquals(tempArray[68], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][][][][][][])");
				assertEquals(tempArray[69], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][][][][][][])");
				assertEquals(tempArray[70], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][][][][][][])");
				assertEquals(tempArray[71], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][][][][][][])");
				assertEquals(tempArray[72], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][][][][][][])");
				assertEquals(tempArray[73], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][][][][][][])");
				assertEquals(tempArray[74], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Member[][][][][][][])");
				assertEquals(tempArray[75], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AccessibleObject[][][][][][][])");
				assertEquals(tempArray[76], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Modifier[][][][][][][])");
				assertEquals(tempArray[77], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Type[][][][][][][][])");
				assertEquals(tempArray[78], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.TypeVariable[][][][][][][][])");
				assertEquals(tempArray[79], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Parameter[][][][][][][][])");
				assertEquals(tempArray[80], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedType[][][][][][][][])");
				assertEquals(tempArray[81], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.Annotation[][][][][][][][])");
				assertEquals(tempArray[82], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.AnnotatedElement[][][][][][][][])");
				assertEquals(tempArray[83], "public void com.jstevh.viewer.ClassInfo.printArray(java.lang.reflect.GenericDeclaration[][][][][][][][