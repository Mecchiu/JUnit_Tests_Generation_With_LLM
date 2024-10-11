// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		/**
		 *	A test method
		 *
		 *	@param args	the arguments to be passed to it.
		 */
		public void testGet(String[] args) {

     //	Field f = getField("getValue(String)");
     //
     //	f.setAccessible(true);
     //
     //	f.set(this, "value");

				final Object o = getObject(getField("getValue(String)"));

     //	f.set(this, "value");
      }

}