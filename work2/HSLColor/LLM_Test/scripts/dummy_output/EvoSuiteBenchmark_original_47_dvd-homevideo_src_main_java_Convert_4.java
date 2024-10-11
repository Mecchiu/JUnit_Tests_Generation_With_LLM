// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {
		
    /**
     * Test case to test the function for {@link Convert#init()}.
     */
		@Test
    public void InitTest() {
        assertTrue(Convert.init());
		}
    
}