// PasswordField_0Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordField_0Test {
		
    private final char[] password = new char[] {};
    private final boolean[] masked = new boolean[] {};
    private final int[] length = new int[] {};
    private final boolean[] required = new boolean[] {};
    private final String[] invalid = new String[] { "foo" };
    private final String[] valid = new String[] {
        "foo"
    };
    private final PrintStream log = System.err;
    private final String passwordFieldPattern;
    private final String inputFieldPattern;
    private final String maskedInputFieldPattern;
  
    /**
     * Standard public constructor.
     * @param pattern The pattern for the input field where the
     *        password field will appear.
     */
    public PasswordField_0Test(String pattern) {
	passwordFieldPattern = pattern;
	inputFieldPattern = pattern+".input";
	maskedInputFieldPattern = pattern+".masked";
    }
  
    /**
     * Method to check that the password of the input field matches given
     * value after masking the input field.
     */
    @Test
    public void passwordMatchedAfterMaskingInput() {
	   String input = "this is a test";
	String[] valid = new String[] {
	    "thisIsARealTest",
	    "thisisamaltest"
	};
	
	if (required[0]) {
	    for (int i = 0; i < invalid.length; i++) {
		if (required[i]) {
		    String inputArray = valid[i].toCharArray();
		    for (int j = 0; j < input.length(); j++) {
			inputArray[j] = invalid[i].charAt(j);
		    }
		    
		    input = new PasswordField(passwordFieldPattern).getPassword(inputArray);
		    
		    if (!passwordMatch(input, inputArray, password, passwordFieldPattern, this.log)) {
			fail("The password of the " + input + " field does not match the " +
			     "expected password. The password of this field is " +
			     "    " + Arrays.toString(password) + ".");
		    }
		}
	    }
	}
	
	// PASSWORD is masked based on length of the password
	String[] valid_length = new String[] {
	    "this is a very very very very very very very very very long string"
	};	
	
	for (int index = 0; index < valid.length; index++) {
	    if (maske[index]) {
		String mask = valid[index].replace(' ', '_');
		String[] maskArray = new String[] {
		    "_password",
		    "password",
		    mask
		};
		
		if (!passwordMatch(inputFieldPattern, valid[index], 
			password, passwordFieldPattern, this.log)) {
		    fail("The password of the " + valid[index] + " field does not match " +
			 "the expected password. This field was " +

			 "    length = " + Arrays.toString(length) + 
			 " which does not contain the mask. The password of this field is " +

			 "    " +Arrays.toString(password) + ".");		    
		}
		
		for (int j = 1; j < mask.length(); j++) {
		    for (int k = 0; k < maskArray.length; k++) {
			if ((j <= maskArray.length) && 
			    ((j == maskArray.length) || 
			     (((k > 0) && maskArray[k].isEmpty()) || 
			      maskArray[k].startsWith("_")))) {
			
			    String maskSub = maskArray[k].replace('_','');

			    if (j + k >= maskArray.length) {
				fail("The password of " + valid[index] + " field " + 
				     "is not a valid mask. It did not complete the mask in the " +
				     "format specified by " + maskFieldPattern + ".  The password " +
				     "and the password of this " + valid[index] + 
				     " field are: " + 
				     "    " + Arrays.toString(password) + ".");  
			    }
				
			    password[j + k] = maskSub.charAt(0);
			    password[j + k + 1] = maskSub.charAt(1);			    
			    invalid[index] = maskSub;
			}
		    }

		}
	    }
	}
	
	for (int i = 0; i < invalid.length; i++) {
		fail("Invalid value for password must exist");	
	}
      }
  
  
  /**
   * Checks if the password is masked correctly.
   * @param mask String that should be masked (if it is present).
   * @param str String it contains the actual password.
   * @param password char array that should be masked.
   * @param pattern char array the pattern will be matched against.
   * @param log The to which the test will be logged.
   * @return true if the password match; false if it does not.
   */
  private boolean passwordMatch(String mask, String str, char[] password, String pattern,
                                PrintingLogger logger) {
    String[] patternArray = new String[] {pattern};
    return passwordMatch(mask, mask.indexOf(str),
		       new char[] {password[0]},
		       patternArray, logger);
  }
  
  /**
   * Checks if the password is correctly masked.
   * This test should use one of the password fields that have a pattern specified.
   * @param mask String that should be masked (if it is present).
   * @param index String where the password is.
   * @param maskingArray char array that should be masked.
   * @param logger The to which the test will be logged.
   * @return true if the password match; false if it does not.
   */
  private boolean passwordMatch(String mask, int index, char[] maskingArray,
                                String[] patternArray,
                                PrintingLogger logger) {
    if (required[index]) {
	try {
	    maskingArray[maskingArray.length - 1] = '_';
      }
	catch (IndexOutOfBoundsException ioobe) {
	    for (int j = 0; j < maskingArray.length; j++) {
		try {
		  maskingArray[j] = '_';
		}
		catch (IndexOutOfBoundsException ieoe) {
		    return false;
		}
	    }
	}
	
	return passwordMatch(mask, index, maskingArray, patternArray,
		  logger);
    }
    else { return true; }
  }
}