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
		private static final String packageName = "com.l3tb.tools";
		private static final String simpleClassName = "simple.Test_0";
		private static final String simpleClassPackageName = packageName.concat(".tools.");
		private static final String[] fndMethods;

		static {
			String[] a = new String[] {
				"public  static  Class <init> (java.lang.String[])",
				"public  static  Class <init> (java.lang.String[])",
				"public  static  Class <init> (java.lang.String[])", "public  static  Class <init> (java.lang.String[])"
			};

			fndMethods = new String[a.length];
			for(int i=0; i<a.length; i++) {
				fndMethods[i] = a[i]+". Test_0";
			}
			fndMethods[0] = "{L0,L2}";
		}

		static class TestInfo {
}
}