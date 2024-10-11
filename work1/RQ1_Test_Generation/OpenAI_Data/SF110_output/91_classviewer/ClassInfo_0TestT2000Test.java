// ClassInfo_0Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {

		@Test
		void testPrintFields() {
				ClassInfo ci = new ClassInfo("java.lang.String");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[1], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[2], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[3], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[4], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[5], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[6], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[7], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[8], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[9], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[10], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[11], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[12], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[13], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[14], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[15], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[16], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[17], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[18], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[19], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[20], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[21], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[22], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[23], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[24], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[25], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[26], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[27], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[28], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[29], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[30], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[31], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[32], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[33], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[34], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[35], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[36], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[37], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[38], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[39], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[40], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[41], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[42], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[43], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[44], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[45], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[46], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[47], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER");
				assertEquals(fields[48], "public static final java.util.Comparator java.lang.String.CASE_INSENS