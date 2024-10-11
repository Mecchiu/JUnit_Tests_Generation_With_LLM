// StringToMd5Test.java
package scenario1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains one unit test case for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

    /**
     * Test for calculating a string of random number. 
     * @throws NoSuchAlgorithmException
     * @see StringToMd5#stringToMd5(String)
     */
    @Test
    public void test_StringToMd5()
        throws NoSuchAlgorithmException {
        //System.out.println("StringToMd5Test Test_StringToMd5.test_StringToMd5");
        String expected = "EQZr1YxMvZGUZ6zQMq7r8gP0x3R3sY2KGXBp8aG/X2/M2qg3aO2T";

        String result = StringToMd5.stringToMd5(
                StringToMd5Test.randomString()
            );

        assertEquals(expected, result);
    }

    /**
     * Test for calculating a string with a single element. 
     * @throws NoSuchAlgorithmException
     * @see StringToMd5#stringToMd5(String)
     */
    @Test
    public void test_StringToMd5_single_element()
        throws NoSuchAlgorithmException {
        String expected = "1YU4Nvn8bXHcFv+DpOvY6yNQ7MvF1iKl+p7YZ5/6Pp8uRfV/7Kz/8M6j8f7sH+8+f7Dv7U+0gX4qhbK1d6t9rzD5J4kfF+f7q5i8K+5W9t9Q/f7nLrZsTb4M+t8X4dPf2VpN+xR8J/4d/f7+7F/r8Y+q6T/f7+7w8+f7/1F+v7B+f7/1C5M/f7/1N+v7C+f7/1W+v7i+f7/1E5M+x/f7/3A+f8/4F+f7/3N+f7/3N+f8/1K-3Z3";
        String result = StringToMd5.stringToMd5(
                StringToMd5Test.randomString()
                );
        assertEquals(expected, result);
    }
    
	private String randomString() {
    	StringBuilder stringBuilder = new StringBuilder();
    	for (int i = 0; i < TestString.length(); i++) {
    		char c = TestString.charAt(i);
    		
    		switch (c) {
    		case '0' :
    		case '1' :
    		case '2' :
    		case '3' :
    		case '4' :
    		case '5' :
    		case '6' :
    		case '7' :
    		case '8' :
    		case '9':
    		case '+':
    		case '-':
    			stringBuilder.append(c);
    			break;
    		default:
    			throw new RuntimeException("invalid character " + c);
    		}
    	}
    	return stringBuilder.toString();
	}
	
	@Test
	public void test_StringToMd5_random() {
		//System.out.println("StringToMd5Test Test_StringToMd5");
		String randomString = randomString();
		String expected = "R8p8m8ZMV+XGZS8mMv+Zi9Gk8dK8zMj8+Z/Mv8O+b8G/8h8g/8Z/8N1K/8O";
		
		String result = StringToMd5.stringToMd5(randomString);
		
		assertEquals(expected, result);
	}

    @Test
    void hash_equal() {
        assertEquals(StringToMd5Test.hash_equal(StringToMd5Test.randomString(), StringToMd5.randomString()), true);
    }

    @Test
    void hash_not_equal() {
        assertEquals(StringToMd5Test.hash_not_equal(StringToMd5Test.randomString(), StringToMd5.randomString()), false);
    }

    @Test
    void hash_compare() {
        assertEquals(StringToMd5Test.hash_compare(StringToMd5Test.randomString(), null), 0);
        assertEquals(StringToMd5Test.hash_compare(null, StringToMd5.randomString()), -1);
    }

     @Test
	public void hash_nonzero() {
		assertHashNonZero(StringToMd5Test.randomString(), null);
		assertHashNonZero(null, StringToMd5Test.randomString());
	}
    
}
