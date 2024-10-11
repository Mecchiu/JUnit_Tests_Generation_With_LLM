// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		private String[] args;
		private Object[] o;

		/**
		* Test method for {@link JCLO#usage()}
		*/
		@Test
		void testUsage() {
				checkUsage("");
				checkUsage("-array,a[,b[,c[=x[d,f=d]]]");
				checkUsage("-array,a[,b[,c,[d,[f=[d,f]]]]");
				checkUsage("-array,a[,b[,c,[d,[,f=[d,f]]]]");
				checkUsage("-array,a[,b[,c,[d,,[,f=[d,f]]]]");
				checkUsage("-array,a[,b[,c,{d},[,f=[d,f]]]]");
}
}