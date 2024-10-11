// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {
/**
		*  Test of GetImage method, of class com.pmdesigns.jvc.tools.SimpleCharStream.
		* @see com.pmdesigns.jvc.tools.test.SimpleCharStream#GetImage()
		*/
	@Test
	public void TestGetImage()
	{
		String s;

		//The first test...
		s =  new String("\t");
		assertEquals("\t", s);

		s =  new String(" \t");
		assertEquals("\t", s);

		s =  new String("\u0000\n");
		assertEquals("\n", s);

		s =  new String("\t\r");
		assertEquals("\r", s);

		s =  new String("\n\u0000");
		assertEquals("\n", s);

		try {
			System.out.println("\t\u0000");
			fail("An IllegalArgumentException must be raised");
		
		} catch (IllegalArgumentException ex) {
			
		}

		try { 
			System.out.println("\t\u0000\n");
			fail("An IllegalArgumentException must be raised");

		} catch (IllegalArgumentException ex) {

		}

		try { 
			System.out.println("\t\u0000\n\t\r");
			fail("An IllegalArgumentException must be raised");

		} catch (IllegalArgumentException ex) {

		}

		try { 
			System.out.println("\t\u0000\r\t\u0000");
			fail("An IllegalArgumentException must be raised");

		} catch (IllegalArgumentException ex) {

		}

		try { 
			System.out.println("\t\u0000\u0000\u0000");
			fail("An IllegalArgumentException must be raised");

		} catch (IllegalArgumentException ex) {

		}

		try { 
			System.out.println("\r\n\t");
			assertEquals("\t", s);

			try { 
				System.out.println("\t\r");
				fail("A character cannot be a line break");

			} catch (java.io.IOException ex) {

				// Ignored
				
			}

			try { 
				System.out.println("\t\u0000");
				fail("An IllegalArgumentException must be raised");

			} catch (IllegalArgumentException ex) {

			}

			try { 
				System.out.println("\t\u0000\n");
				fail("An IllegalArgumentException must be raised");

			} catch (IllegalArgumentException ex) {

		}

			try { 
				System.out.println("\t\u0000\r\t");
				fail("An IllegalArgumentException must be raised");

			} catch (IllegalArgumentException ex) {

		}

			try { 
				System.out.println("\t\u0000\u0000\r");
				fail("An IllegalArgumentException must be raised");

			} catch (IllegalArgumentException ex) {

		}

		try { 
			System.out.println("\t\u0000\u0000\u00A0");
			fail("An IllegalArgumentException must be raised");

		} catch (IllegalArgumentException ex) {

		}

		// The last test....
		try { 
			System.out.println("\n");
			String text ="\t";
			GetToken(text);
			assertEquals("String literal", text);
		} catch (java.io.IOException ex) {
			fail("IOException exception must be raised");
		}
	} // Test of GetImage method, of class com.pmdesigns.jvc.tools.SimpleCharStream.
	
	
	private void FindTokenRef(String text)
	{
		System.out.println("Text to find: \t" + text);
		
		String s = "";
		try { 
			s = text + "\nb";
			GetToken(s);
			s = "b" + "\tb";
			FindTokenRef( s );

			s = "bab\t";
			GetToken(s);
			s = "bab\b";
			FindTokenRef( s );
			
		} catch (java.io.IOException ex) {
			if (ex instanceof java.io.UnsupportedEncodingException) {
				System.out.println("Unsupported Encoding Exception");
			}
			else {
				ex.printStackTrace();
			}
			fail( "An UnsupportedEncodingException must be raised" );
		}
	} // Test of FindTokenRef method, of class com.pmdesigns.jvc.tools.SimpleCharStream.
	public void FindTokenRef(String text)
	{
		System.out.println("Token to find with ref: \t" + text);
		
		String s = "";
		GetToken(s);
		s + "\b\t\n";
		FindTokenRef( s );
		
		s = "b";
		GetToken(s);
		s + "\r\t\n";
		FindTokenRef( s );
		
		s = "\r";
		GetToken(s);
		s += "\n\t";
		FindTokenRef(s );
		
		s = "\u2028";
		GetToken(s);
		s + "\u2029";
		FindTokenRef( s );
		
		
	}	
	
	
	public static void main(String args[] )
	{
		String testInput = "";	// Holds the text from the user to the machine
		String testOutput;	// Holds the text to output the machine to, the text was found and it was kept in a state

		SimpleCharStream test;

		test = new SimpleCharStream();

		FindTokenRef(testInput);

		testOutput = testInput.substring(testInput.length() -1, testInput.length());
		System.out.println("FindTokenRef return value " + testOutput);
		assertEquals("String literal", testOutput);

		String toFind = "";
		toFind += " b";
		toFind += "\n";
		toFind += "\t";
		toFind += "bab\t";
		toFind += "\bab\b";
		toFind += "\b\tb";
		toFind += "\r\n";
		toFind += "\u2028";
		toFind += "\u2029";
		System.out.println(testOutput);
		System.out.println(toFind);
		test.FindTokenRef(toFind);
		testOutput = "bab\b";
		test.FindTokenRef(testOutput);
		testOutput = "b\t";
		test.FindTokenRef(testOutput);
		testOutput = "bab\b\t";
		test.FindTokenRef(testOutput);
		testOutput = "b\n";
		test.FindTokenRef(testOutput);
		testOutput = "bab\tb";
		test.FindTokenRef(testOutput);

		
	}
} // ends TestFindTokenRef class
