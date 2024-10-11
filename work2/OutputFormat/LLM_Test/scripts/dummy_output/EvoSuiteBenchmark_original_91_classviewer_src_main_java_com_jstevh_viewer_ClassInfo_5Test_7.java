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
		private static int count, length;
		private final static class ClassInfo_5Test_5 implements Comparable<ClassInfo_5Test.ClassInfo_5Test_5> {
    	public final Class c = ClassInfo_5Test.ClassInfo_5Test.class;
        public int compareTo(ClassInfo_5Test.ClassInfo_5Test_5 other) {
        	return c.getName().compareTo(other.c.getName());
        }
			private boolean isAbstract;
			private boolean isFinal;
			private int statusAbstract;
			private int statusFinal;
    	public int isAbstract() { return isAbstract; }
    	public int isFinal() { return isFinal; }
    	public boolean isAbstract(Object obj) { return isAbstract? obj == null : obj instanceof Class;   }
			public int isFinal(Object obj) { return isFinal? obj == null : obj instanceof Class;   }
}
}