// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
//@Test
  public void Test() {
    final String s = "AAAAATWf0RnJ7h7QP1zQPv";
    assertTrue(Base64Coder.decodeString(s)!= null);
  }
}
