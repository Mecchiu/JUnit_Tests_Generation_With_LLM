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
		@Test
		void stringReplaceAll() {
			System.out.println("stringReplaceAll");
			String s = "abcde";
			Vector<String> tokens = new Vector<String>();
			Vector<String> replacements = new Vector<String>();
			StringBuffer replacement = new StringBuffer();
			StringBuilder sb = new StringBuilder(s.length());
			int start = 0;
			int end = s.length() - 1;
			
			
			for(int i = 0 ; i < s.length(); i++) {
				assertEquals("the first character is not the last character", s.charAt(i), s.charAt(end));
				assertNotNull("string start token should not be null", token);
				replacements.add(s.substring(start));
				replacement.append(s.substring(start, i));
				sb.append(s.substring(i, end));
				if(s.charAt(i) == '?') {
					assertEquals("The first character is wrong", token.charAt(0), s.charAt(i));
					assertEquals("the last character is not the first character", token.charAt(1), s.charAt(end));
					token = StringTokenizer.getGroupToken(token);
					replacements.add(s.substring(start, i));
					replacement.append(s.substring(i, end));
					sb = null;
				} 
				else{
					String toToken = token.toString();
					//System.out.println("token : ");
					//System.out.println("The first character is expected : " + toToken.charAt(0));
					//System.out.println("The last character is expected : " + toToken.charAt(toToken.length() - 1));
					replacements.add(s.substring(start, i));
					replacement.append(s.substring(i, end));
					sb.append(s.substring(end, i));
					assertThat("token is null",toToken, notNullValue());
				}
			}
			assertEquals("The replaced string length should be the same as the previous string length",replacements.size(),source.length());
			assertEquals("The replaced string buffer should be the same as the source string buffer",replacement.length(),stringReplaceAll.length());


			String result = stringReplaceAll(sb, '0', "test").toString();

			assertNotNull("An argument is returned", result);
		}
}