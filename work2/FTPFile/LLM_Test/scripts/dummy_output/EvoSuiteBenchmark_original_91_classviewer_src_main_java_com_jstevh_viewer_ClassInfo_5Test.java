// ClassInfo_5Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {
		java
    @Test
    void testGetDataWithEmptyArray() {
        Member[] members = new Member[0];
        String[] result = ClassInfo.getData(members);
        assertNull(result);
    }

    @Test
    void testGetDataWithSingleMember() {
        Member[] members = new Member[] {TestClass.class.getDeclaredFields()[0]};
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(1, result.length);
    }

    @Test
    void testGetDataWithMultipleMembers() {
        Member[] members = TestClass.class.getDeclaredFields();
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(members.length, result.length);
    }

    @Test
    void testGetDataWithNull() {
        String[] result = ClassInfo.getData(null);
        assertNull(result);
    }

    @Test
    void testGetDataWithMethods() {
        Member[] members = TestClass.class.getDeclaredMethods();
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(members.length, result.length);
    }

    @Test
    void testGetDataWithConstructors() {
        Member[] members = TestClass.class.getDeclaredConstructors();
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(members.length, result.length);
    }

    @Test
    void testGetDataWithMixedMembers() {
        Member[] members = new Member[] {TestClass.class.getDeclaredFields()[0], TestClass.class.getDeclaredMethods()[0]};
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    @Test
    void testGetDataWithInvalidMembers() {
        Member[] members = new Member[] {null, null};
        String[] result = ClassInfo.getData(members);
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    static class TestClass {
        private int field1;
        public void method1() {}
    }
}