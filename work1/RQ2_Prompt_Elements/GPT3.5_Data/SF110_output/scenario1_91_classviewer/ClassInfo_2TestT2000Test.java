// Here's an example of how you can test the printMethods() method of ClassInfo class using JUnit 5.

package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassInfoTest {

    @Test
    void testPrintMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertNull(methods);

        // Test with a class that has public methods
        classInfo = new ClassInfo(String.class);
        methods = classInfo.printMethods(0);
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        for (String method : methods) {
            assertTrue(method.startsWith("java.lang.String."));
        }

        // Test with a class that has no public methods
        classInfo = new ClassInfo(ArrayList.class);
        methods = classInfo.printMethods(0);
        assertNull(methods);
    }
}