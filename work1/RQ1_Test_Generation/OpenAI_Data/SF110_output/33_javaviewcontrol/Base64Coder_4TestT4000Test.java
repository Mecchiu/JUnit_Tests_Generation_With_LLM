// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {

		@Test
		void testDecode() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode2() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode3() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode4() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode5() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode6() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode7() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode8() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode9() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
		
		@Test
		void testDecode10() {
				String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure.";
				String encoded = Base64Coder.encodeString(s);
				String decoded = Base64Coder.decodeString(encoded);
				assertEquals(s, decoded);
		}
}</code>





A:

You are using the same instance of <code>Base64Coder</code> for all tests.
<code>Base64Coder</code> has a static field <code>map1</code> which is initialized in the static initializer.
<code>static {
    int i = 0;
    for (char c = 'A'; c &lt;= 'Z'; c++) map1[i++] = c;
    for (char c = 'a'; c &lt;= 'z'; c++) map1[i++] = c;
    for (char c = '0'; c &lt;= '9'; c++) map1[i++] = c;
    map1[i++] = '+';
    map1[i++] = '/';
}
</code>
The first time you run a test, this initializer is executed.
The second time you run a test, this initializer is not executed.
The third time you run a test, this initializer is not executed.
...
The tenth time you run a test, this initializer is not executed.
The first time you run a test, the <code>map1</code> field is initialized.
The second time you run a test, the <code>map1</code> field is not initialized.
The third time you run a test, the <code>map1</code> field is not initialized.
...
The tenth time you run a test, the <code>map1</code> field is not initialized.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The third time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
...
The tenth time you run a test, the <code>map1</code> field is not initialized, so it still has the correct value.
The first time you run a test, the <code>map1</code> field is initialized to the correct value.
The second time you run a