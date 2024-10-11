// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculate_1Test {

	@Test
	void subBinaryTest() {
		
		// Binary to binary comparison
		String[] numbers = {"1", "0x0", "0x0p", "0x0l", "0x0ll", "0x1", "0x1p", "0x1l", "0x1ll"};
		
		for (String number : numbers) {
			String newNumber = subBinary(number, "1"); // Subtracts the previous binary
			
			String[] result = {newNumber};
			
			// Subtraction check for new binary number
			boolean isTrue = getBinaryTrue(newNumber);
			assertEquals(true, isTrue);
			// Comparison check for previous binary number
			boolean isTrue2 = subBinary(number, "0");
			assertEquals(true, isTrue2);
			// Comparison check for next binary number
			boolean isTrue3 = getBinaryTrue(newNumber);
			assertEquals(true, isTrue3);
			// Comparison check for 1
			boolean isTrue4 = subBinary(newNumber, "1");
			assertEquals(true, isTrue4);
		}
		
	}
	
	@Test
	void binaryCalculationWithOddIntegers() {
		
		String[] numbers = {"1", "1p", "1l", "1ll", "0", "0p", "0l", "0ll", "0x", "0xp", "0xl", "0xll"};
		
		// Test with a binary number with a maximum value of 9
		String newNumber = "00";
		String actualNumber = BinaryCalculate.subBinary(numbers[0], newNumber);
		String expectedString = "00";
		String expectedDigit = String.valueOf(Integer.valueOf(expectedString));
		
		assertEquals(Integer.valueOf(expectedString), Integer.parseInt(actualNumber));
		
	}
	
	
	private boolean getBinaryTrue(String binaryToCheck) {
		char a = binaryToCheck.charAt(0);
		char b = binaryToCheck.charAt(1);
		return ((a == '1') || (b == '1'));
	}
}


//  java.util.regex Matcher
class Matcher {

String pat;
int mLenght;
public Matcher(String pattern, int length) {
     pat = pattern;
     mLenght = length;
}

//  class Matcher{
//     protected StringBuffer sb;
//     protected int start;
//     protected int end;
//     protected boolean valid;
//     public void begin(int startBegin) {
//        this.start = startBegin;
//         valid = startBegin < pat.length();
//     }
//     public boolean isValid(String text) {
//        return valid;
//     }
// }

}


class RegexMatcher extends Matcher {

    private Pattern pattern;
    private int start;
    public RegexMatcher(String pattern, int length) {
        Matcher matcher = new Matcher(pattern, length);
        pattern = matcher.pat;
        if( matcher.valid ) {
            mLenght = pattern.length();
            addString(pat);
        }else {
            pattern = pattern.substring(matcher.start);
            mLenght = pattern.length();
        }
        pattern = pattern.substring(0, mLenght - 1);
    }

    private void addString(String text) {
        pattern = pattern.replace("^" + text, "");
        int stringStart = findStart(text);
        if( stringStart > 0 )
        start = stringStart;
        else
            start = end;
    }

    private int findStart(String text) {
        int retVal = 0;
        int index = 0;
        while((index < text.length()) && (retVal == -1)) {
            index = pattern.matcher(text).start(index);
            retVal = index;
        }
        return retVal;
    }
}


class Matcher {
        
    protected StringBuffer sb;
	protected boolean valid;
	public String getString() {
		return sb.toString();
	}
	
	
	protected boolean isValid(String text) {
		return valid;
	}
}
