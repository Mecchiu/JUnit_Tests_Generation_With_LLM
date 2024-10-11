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
		public static final String FOO = "foo";
		public static final String BAR = "bar";

private final String[] cMethods;
private final Properties fndMethods;

	/**
     * Constructor for the {@fixme}
     *
     * @param  s     string array to search for
     * @param  m     member array of searched class name
     */
    public ClassInfo_5Test(String[] s, Members m) {
		cMethods = s;
		fndMethods = m.getFields();
	}

	/**
     * Creates a {@link ClassInfo} with information about fields
     * for the class.
     *
     * @return      ClassInfo object returned by search in array 0
     */
    public static ClassInfo createClassInfo() throws Exception {
		Class[] s = findClass();
		ClassInfo ci = new ClassInfo(Foo.class.getName(), new DirManager(s));
		return ci;
	}
	static Class findClass() throws Exception {
}
}