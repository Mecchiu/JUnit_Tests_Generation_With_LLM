// Here's an example implementation of the JavaSource_1Test class with the ten unit test cases for the hasSuperClass() method:

package org.sourceforge.ifx.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaSource_1Test {

    @Test
    void testHasSuperClassWithSuperClass() {
        JavaSource javaSource = new JavaSource();
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithoutSuperClass() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithNullSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass(null);
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithEmptySuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("");
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithWhitespaceSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("   ");
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithValidSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("MySuperClass");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithValidSuperClassAndWhitespace() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("   MySuperClass   ");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithValidSuperClassAndPackage() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("com.example.MySuperClass");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithValidSuperClassAndPackageAndWhitespace() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("   com.example.MySuperClass   ");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClassWithInvalidSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("MySuperClass$");
        assertFalse(javaSource.hasSuperClass());
    }
}