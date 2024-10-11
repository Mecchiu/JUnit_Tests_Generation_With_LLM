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
		Object o;
		String prefix;
		String arrayType;
		String key;
		String boolValue;
		String shortValue;
		String intValue;
		String longValue;
		String floatValue;
		String doubleValue;
		String[] array;
		String strValue;


		/**
		 * Construct a {@link JCLO_0Test} to test the constructor.
		 */
		public JCLO_0Test(String key) {
			this.key = key;
		}

		/**
		 * Create a new instance of this object.
		 */
		public Object makeObject() {
			this.o = JCLO.getObject(this.key);
			//System.out.println("JCLO_0Test.test: o = " + o);
			//System.out.println("JCLO_0Test.test: prefix = " + prefix);
			//System.out.println("JCLO_0Test.test: arrayType = " + arrayType);
			if (this.arrayType == null) {
				arrayType = "Byte";
			}
			//System.out.println("JCLO_0Test.test: arrayType = " + arrayType);
			if (this.arrayType.equals("Byte")) {
				this.o = JCLO.addToArray(
						Array.newInstance(
							byte.class,
							1
						),
						o
				);
				//System.out.println("JCLO_0Test.test: o = " + o);
			}
			return o;
		}
	}