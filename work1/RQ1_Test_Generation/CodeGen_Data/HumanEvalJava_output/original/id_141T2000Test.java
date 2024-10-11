// FileNameCheckTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains one unit test case for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {
/**
		 * Call the method of the 'FileNameCheck' class.
		 */

    @Test
    public void testTest(){
            assertTrue(fileNameCheck("").equals("Yes"));
            assertTrue(fileNameCheck("1").equals("Yes"));
            assertTrue(fileNameCheck("1e10d8a8a8e8a0.o86.o86n8a8a8e8a86o6.o86o6a8a8a0.o86o6o6a8a6a8a6ad1ad1ada6aad1ad.o6af6af6e2a5ade2a5ad8a8a6a6a6aae6"
            			+ "a0adc6a8a8a0a8a5a3a2a3a1a0a1e1a2e2e4e6e2e4e6e5e7e8e8"
            			+ "6a0a0aaaadad8a8a6a8a6a5a5e5e6e7e8e7a5a6a7a6a7ae6af6af"
            			+ "6aae6f6ea7ea1ea2ea3a3a2e7ea3ad1a6a6a5e9ae3ae4aa4ad2af3"
            			+ "aae4a3"));
            assertTrue(fileNameCheck("1E8D8A8A8E8A0.o86.o86n8a8a8e8a86o6.o86o6a8.o86o6a8a8.o86o6.o86o.o86o6"
            			+ "e6e1.o6af,6aae.6aae6f6ea7ea1ea2ea3a3a0.a", true);
            
            
    }
}
