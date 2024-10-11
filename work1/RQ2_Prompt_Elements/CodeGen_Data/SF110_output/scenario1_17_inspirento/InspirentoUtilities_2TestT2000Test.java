// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {

	/**
	* It converts a string {@link String}.
	* Tested in StringUtils.java with string.
	* @param input the test {@link String} to convert.
	* @param delim the delimiter character.
	* @return the converted {@link String}.
	*/
        private static String toString(String input, char delim) {
        return stringReplaceAll(input, delim, "\"")
           .replaceAll("\"", delim);
    }
	
	/**
	* Test constructor for {@link InspirentoUtilities_2Test}.
	* 1) It takes a string of text to be converted and returns a vector holding it.
	* 2) It retrieves the first index of a character in the string that matches {@link String#count(String)} and returns the index.
	* 3) It retrieves the index of a character in the string that matches {@link String#indexOf(String)} and returns the index.
	* 4) It has to convert the string to an array of characters.
	* It returns a {@link ArrayUtilTest}.
	*/
    @Test 
    public void text_to_vector() {
                Vector<Character> test_String = new Vector<Character>();
        test_String.add((Character)toString("text", '\"'));
        test_String.add((Character)toString("test", '\\')); 
        test_String.add((Character)toString("test2", '\\'));

        Vector<Integer> test_int = new Vector<Integer>();
        int index_int = test_String.indexOf(toString("test", '\\'));
        if (index_int!= -1) {
            test_int.add(index_int);
        }
        index_int = test_String.indexOf(toString("test2", '\\'));
        if (index_int!= -1) {
            test_int.add(index_int);
        }

        ArrayUtilTest test = new ArrayUtilTest(test_String, test_int);

        /* If the test input is a string, then this test was successful */
        assertEquals(1, test.compareTo(new StringBuilder(toString("text", '\"'))));

        /* If the test input is not a string, assert that this test failed */
        assertFalse(toString("text", '"').equals(toString("text", '"', '\"')));

    }
}

/**
* Unit test class for the {@link InspirentoUtilities_2Test} class which performs the test {@link #text_to_vector()} and {@link #int_to_string()} separately.
* We need the second unit test test after the second one {@link ArrayUtilTest} which performs the test {@link #text_to_vector()} and {@link #int_to_string()}.
*/
class ArrayUtilTest {
    private Vector<Character> input;
    private StringBuilder stringBuilder;
    private Vector<Integer> intVector;
    private int count = 0;
    private int index = 0;

    /**
     * It creates a {@link ArrayUtilTest} and initializes it.
     */
    public ArrayUtilTest(Vector<Character> input, Vector<Integer> intVector) {
    this.input = input;
    this.intVector = intVector; // The test vector is not a vector object!
    }

    /**
     * It converts the test vector to string and stores it in the test class.
     * Tested in {@link InspirentoUtilities_2Test#text_to_vector()}.
	*/
    @Test
    public void toString() {
    for (int i = 0; i < count; i++) {
        stringBuilder.append((Character)input.get(i).charAt(0));
    }
    
    for (int i = 0; i < count; i++) {
    stringBuilder.append(input.get(i).charAt(stringBuilder.length()));
    }

    String to_String = stringBuilder.toString();
    count = to_String.length();    
    index = 0;
    for (int i = 0; i < count; i++) {
    if (input.get(i).charAt(index)!= stringBuilder.charAt(i)) {
    return;
    }
    }
    intVector.add(index);
    StringBuilder stringBuilder_add = new StringBuilder(stringBuilder);
    for (int i = 0; i < count; i++) {
    stringBuilder_add.append((Character)input.get(i).charAt(stringBuilder.length() - 1));
    }
    stringBuilder = stringBuilder_add;
    
    count = stringBuilder.length();
        
    }

    /**
     * It checks if it is good to perform the test afterwards.
     * The count of the test vector is set as a variable.
     * The output is tested in {@link #int_to_string()}.
     */
    @Test
    public void compareTo() {
    count = 0;
    StringBuilder stringBuilder_add = new StringBuilder(stringBuilder);

    for (int i=0; i < count; i++) {
    if (stringBuilder_add.charAt(i)!= input.get(i).charAt(stringBuilder.length())) {
        return;
    }

    }
    boolean ok = true;
    StringBuilder stringBuilder = new StringBuilder();

    for (int i=0; i < count-1; i++) {
    if (input.get(i).charAt(stringBuilder.length())!= stringBuilder.charAt(stringBuilder.length() - 1)) {
        ok = false;
    }
    }
    
    if (ok) {
                ok = count!= 0;
    }
    
    if (ok) {
                   System.err.println(count);
                   ok = true;
    }
    stringBuilder_add.append("\"");
    stringBuilder = new StringBuilder();
    for (int i = 0; i < count - 1; i++) {
    stringBuilder_add.append((Character)input.get(i).charAt(stringBuilder.length()));
    stringBuilder = new StringBuilder();
    }
    while(!stringBuilder_add.toString().endsWith("\"")) {
        if (count - input.get(count).charAt(stringBuilder.length()) > 0) {
            break;
        }
        stringBuilder.append((Character)input.get(count).charAt(stringBuilder.length() - 1));
    }
    stringBuilder_add.append(stringBuilder.toString());
    
    assertEquals(intVector.get(index), stringBuilder.length());
    
    if (ok) {
           ok = intVector.get(count-1) == stringBuilder.length();
           assertEquals(ok, true);
    }
    
    stringBuilder.replace(0, stringBuffer.length(), stringBuilder.toString());
    count=0;
    for (int i = 0; i < count; i++) {
            if (stringBuilder.charAt(i)!= input.get(i).charAt(stringBuilder.length())) {
            return;
            }
