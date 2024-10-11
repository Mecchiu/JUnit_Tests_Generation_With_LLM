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
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfoTest {

		/**
		* Test case for {@link ClassInfo#printFields()} method.
		* It tests the {@link ClassInfo#printFields()} method with a {@link String} object.
		*/
		@Test
		void testPrintFieldsString() {
				ClassInfo ci = new ClassInfo(String.class);
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.lang.String.CASE_INSENSITIVE_ORDER=0");
				assertEquals(fields[1], "public static final java.lang.String java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[2], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[3], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[4], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[5], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[6], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[7], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[8], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[9], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[10], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[11], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[12], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[13], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[14], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[15], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[16], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[17], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[18], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[19], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[20], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[21], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[22], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[23], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[24], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[25], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[26], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[27], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[28], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[29], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[30], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[31], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[32], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[33], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[34], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[35], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[36], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[37], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[38], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[39], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[40], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[41], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[42], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[43], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[44], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[45], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[46], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[47], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[48], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[49], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[50], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[51], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[52], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[53], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[54], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[55], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[56], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[57], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[58], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[59], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[60], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[61], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[62], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[63], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[64], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[65], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[66], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[67], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[68], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[69], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[70], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[71], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[72], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[73], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[74], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[75], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[76], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[77], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[78], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[79], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[80], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[81], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[82], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[83], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[84], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[85], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[86], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[87], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[88], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[89], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[90], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[91], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER=null");
				assertEquals(fields[92], "public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE