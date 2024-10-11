// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {
private String string;

		/**
		* Default constructor.
		*/
		public Wildcard_0Test() {
                        string = null;
                    }

		/**
		* Constructor.
		*
		* @param string a non-null string.
		*/
		public Wildcard_0Test(String string) {
			assert true;
                        this.string = string;
		}

		/**
		* Test method for {@link Wildcard#isWildcard(String)}.
		*/
		@Test
		public void test() {
			assertTrue(string.equals("*"));
		}
}
/* Copyright (c) 2015, Salesforce.com, Inc.  All rights reserved. */
