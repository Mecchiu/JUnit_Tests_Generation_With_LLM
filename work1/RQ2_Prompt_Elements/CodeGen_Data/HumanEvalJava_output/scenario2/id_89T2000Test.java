// EncryptTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains one unit test case for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {
@Test
		void encryptTest() {
			String test1 = "Hello, World!";
            assertEquals("Hello, W", encrypt(test1));
            
            String test2 = "Hello World,!";
            assertEquals("Hello World,!", encrypt(test2));
			
            String test3 = "Hi my name is Hello!";
            assertEquals("Hi my name is Hello", encrypt(test3));
            
            String test4 = "Hi my name is Hi World!!!";
            assertEquals("Hi my name is Hi World!!!", encrypt(test4));
            
            String test5 = "Hi my name is Hi World!!!!!!";
            assertEquals("Hi my name is Hi World!!!!", encrypt(test5));

            
            String test6 = "Hi my name is Hi World!!!!!!";
            assertEquals("Hi my name is Hi World!!!!", encrypt(test6));
			
		}
		
		 @Test
		 void encryptTest2() {
			 String test1 = "Hello, World!";
            assertEquals("Hello, World!", encrypt(test1));
            
            String test2 = "Hello World,!";
            assertEquals("Hello World,!", encrypt(test2));
			
            String test3 = "Hi my name is Hello!";
            assertEquals("Hi my name is Hello", encrypt(test3));
            
            String test4 = "Hi my name is Hi World!!!";
            assertEquals("Hi my name is Hi World!!!", encrypt(test4));
            
            String test5 = "Hi my name is Hi World!!!!!!";
            assertEquals("Hi my name is Hi World!!!!", encrypt(test5));

            
            String test6 = "Hi my name is Hi World!!!!!!";
            assertEquals("Hi my name is Hi World!!!!", encrypt(test6));
			
		 }

		
	
}
