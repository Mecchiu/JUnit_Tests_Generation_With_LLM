@Test
void testStringReplaceAll() {
    // Test case 1: Replace all occurrences of 'a' with "hello"
    StringBuffer source1 = new StringBuffer("abacadabra");
    StringBuffer expected1 = new StringBuffer("hellohellochellobhellohello");
    StringBuffer result1 = InspirentoUtilities.stringReplaceAll(source1, 'a', "hello");
    assertEquals(expected1.toString(), result1.toString());

    // Test case 2: Replace all occurrences of ' ' with "world"
    StringBuffer source2 = new StringBuffer("Hello, my name is Allen");
    StringBuffer expected2 = new StringBuffer("Hello,worldmyworldnameworldisworldAllen");
    StringBuffer result2 = InspirentoUtilities.stringReplaceAll(source2, ' ', "world");
    assertEquals(expected2.toString(), result2.toString());

    // Test case 3: Replace all occurrences of '1' with "one"
    StringBuffer source3 = new StringBuffer("123456789");
    StringBuffer expected3 = new StringBuffer("onetothreefourfivesixseveneightnine");
    StringBuffer result3 = InspirentoUtilities.stringReplaceAll(source3, '1', "one");
    assertEquals(expected3.toString(), result3.toString());

    // Test case 4: Replace all occurrences of 'x' with "xyz"
    StringBuffer source4 = new StringBuffer("xoxoxoxox");
    StringBuffer expected4 = new StringBuffer("xyzoyzxyzoyzxyzoyz");
    StringBuffer result4 = InspirentoUtilities.stringReplaceAll(source4, 'x', "xyz");
    assertEquals(expected4.toString(), result4.toString());

    // Test case 5: Replace all occurrences of '!' with "exclamation"
    StringBuffer source5 = new StringBuffer("Hello! How are you!");
    StringBuffer expected5 = new StringBuffer("Helloexclamation How are youexclamation");
    StringBuffer result5 = InspirentoUtilities.stringReplaceAll(source5, '!', "exclamation");
    assertEquals(expected5.toString(), result5.toString());

    // Test case 6: Replace all occurrences of 'o' with "O"
    StringBuffer source6 = new StringBuffer("Hello, world!");
    StringBuffer expected6 = new StringBuffer("HellO, wOrld!");
    StringBuffer result6 = InspirentoUtilities.stringReplaceAll(source6, 'o', "O");
    assertEquals(expected6.toString(), result6.toString());

    // Test case 7: Replace all occurrences of 'e' with "E"
    StringBuffer source7 = new StringBuffer("The quick brown fox jumps over the lazy dog");
    StringBuffer expected7 = new StringBuffer("ThE quick brown fox jumps ovEr thE lazy dog");
    StringBuffer result7 = InspirentoUtilities.stringReplaceAll(source7, 'e', "E");
    assertEquals(expected7.toString(), result7.toString());

    // Test case 8: Replace all occurrences of ' ' with ""
    StringBuffer source8 = new StringBuffer("Hello, world!");
    StringBuffer expected8 = new StringBuffer("Hello,world!");
    StringBuffer result8 = InspirentoUtilities.stringReplaceAll(source8, ' ', "");
    assertEquals(expected8.toString(), result8.toString());

    // Test case 9: Replace all occurrences of 'a' with ""
    StringBuffer source9 = new StringBuffer("abacadabra");
    StringBuffer expected9 = new StringBuffer("bcbdb");
    StringBuffer result9 = InspirentoUtilities.stringReplaceAll(source9, 'a', "");
    assertEquals(expected9.toString(), result9.toString());

    // Test case 10: Replace all occurrences of 'z' with "zzz"
    StringBuffer source10 = new StringBuffer("zzzzzzzzzz");
    StringBuffer expected10 = new StringBuffer("zzzzzzzzzz");
    StringBuffer result10 = InspirentoUtilities.stringReplaceAll(source10, 'z', "zzz");
    assertEquals(expected10.toString(), result10.toString());
}
}