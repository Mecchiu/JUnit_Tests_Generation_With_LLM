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
		
	public ClassInfo_5Test() {
	}

	
	/**
	 * Returns cMethods based on c.
	 * <p>
	 * This method is always executed when it is called.
	 */
	public String[] getCMethods() {
        return cMethods;
    }

    /**
     * Returns the public c.
     * <p>
     * This method is always executed when it is called.
     */
	public String getClassName() { return getClass(0).getName(); }

	/**
	 * Returns the cPackages, which contains
	 * all packages from the class that define c methods.
	 */
	public String[] getPackageNames() {
		try {
            return ClassNameChecker.getPackageNames(getClassName());
		} catch (Exception e) {
            fail(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        return null;
    }

	/**
	 * Returns the class to which the c.
	*/
}