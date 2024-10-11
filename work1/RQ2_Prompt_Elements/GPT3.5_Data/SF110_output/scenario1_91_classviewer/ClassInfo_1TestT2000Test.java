// Here's an example of how you can test the printMethods() method of ClassInfo class using JUnit 5.

package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfoTest {

    @Test
    void testPrintMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] expected = {"method1", "method2", "method3"};
        classInfo.setMethods(expected);
        String[] actual = classInfo.printMethods();
        assertArrayEquals(expected, actual);
    }

    @Test
    void testPrintMethodsNoPublicMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] expected = null;
        classInfo.setMethods(expected);
        String[] actual = classInfo.printMethods();
        assertArrayEquals(expected, actual);
    }

    // Add more test cases as needed
}