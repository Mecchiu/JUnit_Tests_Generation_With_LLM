// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		@Test
		void test1() {
				assertEquals("", new Base64Coder().decode(new char[0]));
		}
		@Test
		void test2() {
				char[] s = new char[64];
				int i, z;
				Base64Coder b64 = new Base64Coder();
				b64.encode(s);
				Integer in = new Integer(s);
				Integer p = b64.decode(s);
				for (i=0; i < s.length; i++) {
						if (s[i] == '=') z = 1;
							else z = s.length-i-1;
				}
	
				String t1 = "";
	
	
				for (int j=0; j<8; j++) {
						char c1 = s[0];
						int num = (c1 == 'A'? 1: z);
	
						t1 += c1;
						s[0] = c1;
						s[8] = s[9];
	
						s[9] = (char)(num>>>16);
						s[10] = (char)(num>>>8);
						s[11] = (char)(num>>>0);
						if (num == 0x40) {
								continue;
						}
						for (int k=1; k < num; k++) {
	
	
								if ((s[k] = s[k-1] == 'A'? 'a' : 'A') == 'A') 
								s[k+1] = (s[k] == 'M'?'m' : 'M');
								else if ((s[k] = s[k-1] == 'c'? 'C' : 'C') == 'C') 
								s[k+1] = (s[k] == 'g'? 'g' : 'g');
						
								if (j == 7) break;
						}
						j++;
				}
				t1 += "\n";
		
				String t2 = "";
				for (i=0; i < s.length; i++) {
						char c = s[i];
						char c2 = s[i+1];
						if ((c >='' && c <= '~')  || (c <= 'Z'))
								continue;
						c2 = s.charAt(i+1);
						if ((c2 >='' && c2 <= '9') && (c >= '~'))
				return "";
				}
		return "";
		}
}