// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		public static void main(String[] args) {
			String s = "This is a test string.";

			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i) + " ");
			}

			System.out.println();
			System.out.print(s);
			System.out.println(s + "\n");
			System.out.print(s.substring(2, s.length()).replace(" ", ""));
		}
}