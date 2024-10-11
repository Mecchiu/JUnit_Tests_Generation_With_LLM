// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {
		
	if(!java.lang.RuntimePermission.get("ControlCharacterOutputStream")) {
        System.out.println("Permission Denied");
        error(false);
	}
		
   /* Constructor */
  SimpleCharStream_0Test(){
  }
   /* Method to return string value */
  @Test
  public void test_0(){
    String expected_result = "begin";;
    String result_result = SimpleCharStream.getImage();
    assertEquals(expected_result, result_result);
  }
   
}