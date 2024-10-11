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
/**
		* Provides implementation of the {@link #printFields()} method.
		* <p>
		* This method is to be called while running a unit test.
		*
		* @param s The string to be returned by this method
		*/
        @Test
        public void printFields(final String s) {
            new ClassInfo(s);
        }
}
