// PasswordTest.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Password}.
* It contains one unit test case for the {@link Password#crypt(String, String)} method.
*/
class PasswordTest {
/**
		* Unit test code for {@link Password#crypt(String, String)}.
		* The execution of the method should return a {@link String}, if {@link String}
		* with an {@code encryptedPassword} is not to long.
		*/
    @Test
    public void test1() {
        assertEquals(
                "Wrong result of the method, if the output is not to long.",
                "a7a2bb75ee2bb964d24c8a9a3c0c5e5a8e6fc3",
                Password.crypt("a7a2bb75ee2bb964d24c8a9a3c0c5e5a8e6fc3", "a7a2bb75ee2bb964d24c8a9a3c0c5e5a8e6fc3")
                );
        }
}

//==============================================================================================
/*
 * To run this test, simply type *nuniquetest.sh* into it.
 * This will result in a running process.  You can do this using {@link Test#junit(String, Object[])} as the
 * Java launcher (as above):
 * *nuniquetest.sh test_password_test_1_run
 *
 */
//==============================================================================================
