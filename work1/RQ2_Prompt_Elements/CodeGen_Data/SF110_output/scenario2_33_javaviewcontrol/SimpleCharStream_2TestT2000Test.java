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

  final static int[] buffer = new int[1 << 16];
  static final int bufferLength = 1 << 16;
  final static int bufferOffset = 0;
  final static char EQUAL = '=';
  final static char COLON = ':';
  final static char TAB = '\t';
  final static char LINE_FEED = '\n';
  final static char CARRIAGE_RETURN = '\r';
  final static char QUOTE = '"';
  final static char OPEN_PAREN = '(';
  final static char CLOSE_PAREN = ')';
  final static char OPEN_CURLY = '{';
  final static char CLOSE_CURLY = '}';
		
		
  final static String[] IMAGE = new String[bufferLength];
        
		/**
         * Set test image.
         */
  static void SetImage(String[] Image) {
    int i;
    for (i = 0; i < bufferLength; i++) {
      buffer[i] = -1;
    }
    buffer[0] = 0;
    for (i = 0; i < IMAGE.length; i++) {
      IMAGE[i] = Image[i];
    }
  }
		
	
  @Test
  public void testGet_Equal() throws Exception {
    IMAGE[bufferOffset] =  QUOTE;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(COLON, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
	
  @Test
  public void testGet_COLON() throws Exception {
    IMAGE[bufferOffset] = COLON;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(COLON, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
	
  @Test
  public void testGet_TAB() throws Exception {
    IMAGE[bufferOffset] = TAB;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(TAB, result1.charAt(0));
    assertEquals(CARRIAGE_RETURN, result1.charAt(1));
  }
	
	
  @Test
  public void testGet_LINE_FEED() throws Exception {
    IMAGE[bufferOffset] = LINE_FEED;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(LINE_FEED, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
	
  @Test
  public void testGet_QUOTE() throws Exception {
    IMAGE[bufferOffset] = QUOTE;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(QUOTE, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
	
  @Test
  public void testGet_close() throws Exception {
    IMAGE[bufferOffset] =  CLOSE_CURLY;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(OPEN_CURLY, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
  @Test
  public void testGet_close_paren() throws Exception {
    IMAGE[bufferOffset] = OPEN_CURLY;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(OPEN_CURLY, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
  @Test
  public void testGet_close_square() throws Exception {
    IMAGE[bufferOffset] = CLOSE_CURLY;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(CLOSE_CURLY, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
  @Test
  public void testGet_quoted_paren() throws Exception {
    IMAGE[bufferOffset] = QUOTE;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(QUOTE, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	
  @Test
  public void testGet_close_bracket() throws Exception {
    IMAGE[bufferOffset] = CLOSE_CURLY;
    SimpleCharStream instance = new SimpleCharStream();

    String result1 = instance.GetImage();
    assertEquals(CLOSE_CURLY, result1.charAt(0));
    assertEquals(EQUAL, result1.charAt(1));
  }
	

}// end class SimpleCharStream_2Test
