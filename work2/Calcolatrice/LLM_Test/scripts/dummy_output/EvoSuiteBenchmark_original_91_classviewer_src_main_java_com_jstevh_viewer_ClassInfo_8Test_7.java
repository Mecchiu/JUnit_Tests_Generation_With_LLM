// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		
	private static final List<String> PACKAGES = Arrays.asList("Test", "Util");
	private static final int PACKAGE_INDEX = PACKAGES.indexOf("Test");
	private static final int CLASS_INDEX = PACKAGE_INDEX + PACKAGES.size() - 1;
	private static final int SUB_CLASS_INDEX = CLASS_INDEX + PACKAGES.size() - 1;
	private static final List<String> SUBS = PACKAGES.stream().filter((str) -> "S".equals(str)).collect(Collectors.toList());

	private final static String TEST_CLASS_NAME = "TestClassName";
	private final static String TEST_UNDERSCORE = "U";

	public static final Map<Integer, List<String>> PACKAGES_FOUND = new HashMap<>();

	static {
		PACKAGES_FOUND.put(1, PACKAGES);
	}

}