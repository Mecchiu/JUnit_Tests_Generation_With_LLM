package org.sourceforge.ifx.tools;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.sourceforge.ifx.tools.JavaSource;

class JavaSource_0Test {

    @Test
    void testHasInterface_NullInterface() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasInterface());
    }

    @Test
    void testHasInterface_WithInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("org.example.Interface");
        assertTrue(javaSource.hasInterface());
    }

    @Test
    void testHasSuperClass_NullSuperClass() {
        JavaSource javaSource = new JavaSource();
        assertFalse(javaSource.hasSuperClass());
    }

    @Test
    void testHasSuperClass_WithSuperClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.setSuperClass("org.example.SuperClass");
        assertTrue(javaSource.hasSuperClass());
    }

    @Test
    void testAddMemberVariable() {
        JavaSource javaSource = new JavaSource();
        javaSource.addMemberVariable("int", false);
        assertEquals(1, javaSource.getNumberOfMemberVariables());
    }

    @Test
    void testAddMemberVariableWithClass() {
        JavaSource javaSource = new JavaSource();
        javaSource.addMemberVariable("MyClass", "org.example.MyClass", false);
        assertEquals(1, javaSource.getNumberOfMemberVariables());
    }

    @Test
    void testGetMemberVariables() {
        JavaSource javaSource = new JavaSource();
        javaSource.addMemberVariable("int", false);
        assertNotNull(javaSource.getMemberVariables());
    }

    @Test
    void testGetNumberOfMemberVariables() {
        JavaSource javaSource = new JavaSource();
        javaSource.addMemberVariable("int", false);
        assertEquals(1, javaSource.getNumberOfMemberVariables());
    }

    @Test
    void testGetInterface() {
        JavaSource javaSource = new JavaSource();
        javaSource.setInterface("org.example.Interface");
        assertEquals("org.example.Interface", javaSource.getInterface());
    }
}
