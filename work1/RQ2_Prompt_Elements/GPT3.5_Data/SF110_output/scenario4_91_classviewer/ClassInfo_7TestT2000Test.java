// ClassInfo_7Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
 */
class ClassInfo_7Test {

    @Test
    void testSrchMethods() {
        ClassInfo ci = new ClassInfo("java.lang.String");
        String[] expected = {"charAt(int)", "codePointAt(int)", "codePointBefore(int)", "codePointCount(int, int)", "compareTo(java.lang.Object)", "compareTo(java.lang.String)", "compareToIgnoreCase(java.lang.String)", "concat(java.lang.String)", "contains(java.lang.CharSequence)", "contentEquals(java.lang.CharSequence)", "contentEquals(java.lang.StringBuffer)", "copyValueOf(char[])", "copyValueOf(char[], int, int)", "endsWith(java.lang.String)", "equals(java.lang.Object)", "equalsIgnoreCase(java.lang.String)", "format(java.lang.String, java.lang.Object[])", "format(java.util.Locale, java.lang.String, java.lang.Object[])", "getBytes()", "getBytes(int, int, byte[], int)", "getBytes(java.lang.String)", "getChars(int, int, char[], int)", "hashCode()", "indexOf(int)", "indexOf(int, int)", "indexOf(java.lang.String)", "indexOf(java.lang.String, int)", "intern()", "isEmpty()", "join(java.lang.CharSequence, java.lang.CharSequence...)", "lastIndexOf(int)", "lastIndexOf(int, int)", "lastIndexOf(java.lang.String)", "lastIndexOf(java.lang.String, int)", "length()", "matches(java.lang.String)", "offsetByCodePoints(int, int)", "regionMatches(boolean, int, java.lang.String, int, int)", "regionMatches(int, java.lang.String, int, int)", "replace(char, char)", "replace(java.lang.CharSequence, java.lang.CharSequence)", "replaceAll(java.lang.String, java.lang.String)", "replaceFirst(java.lang.String, java.lang.String)", "split(java.lang.String)", "split(java.lang.String, int)", "startsWith(java.lang.String)", "startsWith(java.lang.String, int)", "subSequence(int, int)", "substring(int)", "substring(int, int)", "toCharArray()", "toLowerCase()", "toLowerCase(java.util.Locale)", "toString()", "toUpperCase()", "toUpperCase(java.util.Locale)", "trim()", "valueOf(boolean)", "valueOf(char)", "valueOf(char[])", "valueOf(char[], int, int)", "valueOf(double)", "valueOf(float)", "valueOf(int)", "valueOf(java.lang.Object)", "valueOf(long)", "valueOf(java.lang.String)"};
        assertArrayEquals(expected, ci.srchMethods(""));
    }

    @Test
    void testSrchMethodsWithFragment() {
        ClassInfo ci = new ClassInfo("java.lang.String");
        String[] expected = {"charAt(int)", "codePointAt(int)", "codePointBefore(int)", "codePointCount(int, int)", "compareTo(java.lang.Object)", "compareTo(java.lang.String)", "compareToIgnoreCase(java.lang.String)", "concat(java.lang.String)", "contains(java.lang.CharSequence)", "contentEquals(java.lang.CharSequence)", "contentEquals(java.lang.StringBuffer)", "copyValueOf(char[])", "copyValueOf(char[], int, int)", "endsWith(java.lang.String)", "equals(java.lang.Object)", "equalsIgnoreCase(java.lang.String)", "format(java.lang.String, java.lang.Object[])", "format(java.util.Locale, java.lang.String, java.lang.Object[])", "getBytes()", "getBytes(int, int, byte[], int)", "getBytes(java.lang.String)", "getChars(int, int, char[], int)", "hashCode()", "indexOf(int)", "indexOf(int, int)", "indexOf(java.lang.String)", "indexOf(java.lang.String, int)", "intern()", "isEmpty()", "join(java.lang.CharSequence, java.lang.CharSequence...)", "lastIndexOf(int)", "lastIndexOf(int, int)", "lastIndexOf(java.lang.String)", "lastIndexOf(java.lang.String, int)", "length()", "matches(java.lang.String)", "offsetByCodePoints(int, int)", "regionMatches(boolean, int, java.lang.String, int, int)", "regionMatches(int, java.lang.String, int, int)", "replace(char, char)", "replace(java.lang.CharSequence, java.lang.CharSequence)", "replaceAll(java.lang.String, java.lang.String)", "replaceFirst(java.lang.String, java.lang.String)", "split(java.lang.String)", "split(java.lang.String, int)", "startsWith(java.lang.String)", "startsWith(java.lang.String, int)", "subSequence(int, int)", "substring(int)", "substring(int, int)", "toCharArray()", "toLowerCase()", "toLowerCase(java.util.Locale)", "toString()", "toUpperCase()", "toUpperCase(java.util.Locale)", "trim()", "valueOf(boolean)", "valueOf(char)", "valueOf(char[])", "valueOf(char[], int, int)", "valueOf(double)", "valueOf(float)", "valueOf(int)", "valueOf(java.lang.Object)", "valueOf(long)", "valueOf(java.lang.String)"};
        assertArrayEquals(expected, ci.srchMethods("a"));
    }

    @Test
    void testSrchMethodsNotFound() {
        ClassInfo ci = new ClassInfo("java.lang.String");
        String[] expected = {};
        assertArrayEquals(expected, ci.srchMethods("xyz"));
    }

    @Test
    void testSrchMethodsEmptyString() {
        ClassInfo ci = new ClassInfo("java.lang.String");
        String[] expected = ci.printMethods();
        assertArrayEquals(expected, ci.srchMethods(""));
    }

    @Test
    void testSrchMethodsNullString() {
        ClassInfo ci = new ClassInfo("java.lang.String");
        String[] expected = ci.printMethods();
        assertArrayEquals(expected, ci.srchMethods(null));
    }

    @Test
    void testSrchMethodsWithIndex() {
        ClassInfo ci = new ClassInfo("java.lang.String");
        String[] index = {"charAt(int)", "codePointAt(int)", "codePointBefore(int)", "codePointCount(int, int)", "compareTo(java.lang.Object)", "compareTo(java.lang.String)", "compareToIgnoreCase(java.lang.String)", "concat(java.lang.String)", "contains(java.lang.CharSequence)", "contentEquals(java.lang.CharSequence)", "contentEquals(java.lang.StringBuffer)", "copyValueOf(char[])", "copyValueOf(char[], int, int)", "endsWith(java.lang.String)", "equals(java.lang.Object)", "equalsIgnoreCase(java.lang.String)", "format(java.lang.String, java.lang.Object[])", "format(java.util.Locale, java.lang.String, java.lang.Object[])", "getBytes()", "getBytes(int, int, byte[], int)", "getBytes(java.lang.String)", "getChars(int, int, char[], int)", "hashCode()", "indexOf(int)", "indexOf(int, int)", "indexOf(java.lang.String)", "indexOf(java.lang.String, int)", "intern()", "isEmpty()", "join(java.lang.CharSequence, java.lang.CharSequence...)", "lastIndexOf(int)", "lastIndexOf(int, int)", "lastIndexOf(java.lang.String)", "lastIndexOf(java.lang.String, int)", "length()", "matches(java.lang.String)", "offsetByCodePoints(int, int)", "regionMatches(boolean, int, java.lang.String, int, int)", "regionMatches(int, java.lang.String, int, int)", "replace(char, char)", "replace(java.lang.CharSequence, java.lang.CharSequence)", "replaceAll(java.lang.String, java.lang.String)", "replaceFirst(java.lang.String, java.lang.String)", "split(java.lang.String)", "split(java.lang.String, int)", "startsWith(java.lang.String)", "startsWith(java.lang.String, int)", "subSequence(int, int)", "substring(int)", "substring(int, int)", "toCharArray()", "toLowerCase()", "toLowerCase(java.util.Locale)", "toString()", "toUpperCase()", "toUpperCase(java.util.Locale)", "trim()", "valueOf(boolean)", "valueOf(char)", "valueOf(char[])", "valueOf(char[], int, int)", "valueOf(double)", "valueOf(float)", "valueOf(int)", "valueOf(java.lang.Object)", "valueOf(long)", "valueOf(java.lang.String)"};
        String[] expected = {"charAt(int)", "codePointAt(int)", "codePointBefore(int)", "codePointCount(int, int)", "compareTo(java.lang.Object)", "compareTo(java.lang.String)", "compareToIgnoreCase(java.lang.String)", "concat(java.lang.String)", "contains(java.lang.CharSequence)", "contentEquals(java.lang.CharSequence)", "contentEquals(java.lang.StringBuffer)", "copyValueOf(char[])", "copyValueOf(char[], int, int)", "endsWith(java.lang.String)", "equals(java.lang.Object)", "equalsIgnoreCase(java.lang.String)", "format(java.lang.String, java.lang.Object[])", "format(java.util.Locale, java.lang.String, java.lang.Object[])", "getBytes()", "getBytes(int, int, byte[], int)", "getBytes(java.lang.String)", "getChars(int, int, char[], int)", "hashCode()", "indexOf(int)", "indexOf(int, int)", "indexOf(java.lang.String)", "indexOf(java.lang.String, int)", "intern()", "isEmpty()", "join(java.lang.CharSequence, java.lang.CharSequence...)", "lastIndexOf(int)", "lastIndexOf(int, int)", "lastIndexOf(java.lang.String)", "lastIndexOf(java.lang.String, int)", "length()", "matches(java.lang.String)", "offsetByCodePoints(int, int)", "regionMatches(boolean, int, java.lang.String, int, int)", "regionMatches(int, java.lang.String, int, int)", "replace(char, char)", "replace(java.lang.CharSequence, java.lang.CharSequence)", "replaceAll(java.lang.String, java.lang.String)", "replaceFirst(java.lang.String, java.lang.String)",