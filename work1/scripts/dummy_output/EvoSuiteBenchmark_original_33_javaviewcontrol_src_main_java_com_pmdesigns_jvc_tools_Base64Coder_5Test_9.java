// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		 
   /**
   * Decodes a character array from Base64 format.
   */
   @Test
   void decodeCharacterArray_Base64_charArray()
   {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
   }
   
   /**
   * Decodes a string from Base64 format.
   */
  @Test
  void decodeString_Base64_String()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }


   /**
   * Decodes a byte array from Base64 format.
   */
  @Test
  void decodeByteArray_Base64_ByteArray()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }
	
	
  /**
	 * Decodes a character from Base64 format.
	 */
  @Test
  void decodeChar_Base64_char()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }


  /**
	 * Decodes a string from Base64 format.
	 */
  @Test
  void decodeString_Base64_string()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }


  /**
	 * Decodes a byte array from Base64 format.
	 */
  @Test
  void decodeByteArray_Base64_Byte_Array()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }


  /**
	 * Decodes a character from Base64 format.
	 */
  @Test
  void decodeChar_Base64_char_Char()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }


  /**
	 * Decodes a string from Base64 format.
	 */
  @Test
  void decodeString_Base64_String_Char()
  {
    assertEquals("Should match the expected encoding result", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", decode(encodedArray("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")));
  }
}