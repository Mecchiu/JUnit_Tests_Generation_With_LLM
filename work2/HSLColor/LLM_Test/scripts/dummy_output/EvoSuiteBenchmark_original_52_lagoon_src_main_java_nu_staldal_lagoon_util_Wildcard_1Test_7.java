// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {
		
  @Test @SuppressWarnings("unchecked")
    public void matchWildcard() {
      List<String> patterns;
      
      patterns = new ArrayList<>();
      patterns.add(".*");
      patterns.add(".*");
      assertSame("", 
               patterns.stream()
                              .map(fqn -> fqn + ".*") 
                              .min(String::length).orElseThrow(() -> new AssertionError()));

    }
    
  }