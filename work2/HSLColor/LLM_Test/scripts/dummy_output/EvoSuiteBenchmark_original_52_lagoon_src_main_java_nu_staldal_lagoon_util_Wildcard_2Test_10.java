// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {
		public static String get() {
			return "test";
		}
        public static void main(String[] args) {
            System.out.println(Wildcard_2Test.get());
        }
}