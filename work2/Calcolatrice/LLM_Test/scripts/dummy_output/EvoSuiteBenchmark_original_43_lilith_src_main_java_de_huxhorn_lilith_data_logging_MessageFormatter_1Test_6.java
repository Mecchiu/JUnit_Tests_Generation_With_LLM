// MessageFormatter_1Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains one unit test case for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {
		
/**
 * The count of unescaped placeholders in the given messagePattern.
*
* @see MessageFormatter#countArgumentPlaceholders(String)
*/
@Test
void countArgumentPlaceholders_0() {
		
  final String testMessage = "message-1";
  final SimpleDateFormat messageDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  MessageFormatter instance = new MessageFormatter();
  int result = instance.countArgumentPlaceholders(testMessage);
  
  assertEquals(5, result);
  
  int count = 0;
  int count2 = 0;
  int count3 = 0;
  
  // check values
  if (new SimpleDateFormat("ddMMyyyy").parse(testMessage) instanceof Date) {
    String dateValue = ((Date) new SimpleDateFormat("ddMMyyyy").parse(testMessage)).getTime().toString();
    
    //System.out.println("dateValue = " + dateValue);
    //System.out.println("count = " + count);
    
    count2 = count;
    count = 0;
    count3 = 0;
  }
  
  // System.out.println("count2 = " + count2);
  
  // check values
  assertEquals(5, count);
  
  //System.out.println("count3 = " + count3);
}
}
//MessageFormatter_1Test.java