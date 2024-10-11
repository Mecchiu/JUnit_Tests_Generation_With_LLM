// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {

  @Test
  public void testIsFalse() {
    assertFalse(new ExtBoolArray(4).isFalse(0,2));
	assertTrue(new ExtBoolArray(4).isFalse(0,3));
  }

}
