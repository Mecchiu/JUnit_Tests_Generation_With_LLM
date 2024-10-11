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
		 * Test method for
		 * {@link edu.mscd.cs.jclo.JCLO#getValue(java.lang.String)}.
		 */
		@Test
    public void testGetValue_String() {
        System.out.println("JCLO_0Test#testGetValue_String");
        String key = null;
        Object obj = null;
        Object result=null;
        try {
			int size = 2;
            obj = new Object[size];
			for (int i=0; i<size; i++) {
				obj[i] = i;
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			result=getValue(key);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (key == null) {
			println(getFullName() + " - key was null");
			return;
		}
		if (result == null) {
			println(getFullName() + " - result was null");
			return;
		}
		for(int i=0; i<size-1; i++) {
            println(getFullName()+" [ " + ( obj.length) + " ] " +
              jclo_idStr( getType(1).toString()) );
			//assertEquals( "length", obj[i].getClass(),
				//  getType(1).getDeclaredClass());
        }
		println(getFullName() + " - null");
    }

	/**
	 * Method to initialize the class {@link Integer}.
	 *
	 * @param key the key of the new class (not used).
	 * @return an {@link Integer}.
	 */
	private Field getField(String key) {
		Class<?> cl;
		try {
			cl = Class.forName(key);
		} catch(Exception e) {
			println(
				getFullName() + " - the key " + key + " is not a recognized class. Try one of the Java classes: java.lang.String, java.lang.Class, java.lang.reflect.Class, or java.beans.Introspection.Introspectable.");
			return (null);
		}
		Field f = null;
		if (Modifier.isPublic(cl.getModifiers())) {
			f = cl.getDeclaredField(key);
			f.setAccessible(true);
			return (f);
		}
		return (null);
	}

	/**
	 * Method to get the String representation of a java object.
	 *
	 * @param o an Object.
	 * @return a String.
	 */
	private String jclo_idStr(String o) {
		try {
			return (o!= null && o.length() > 0? Integer.toString(o.hashCode()) : "");
		} catch(Exception e) {
			return (String.format("%s.%s", o.toString(), "id"));
		}
	}

	/**
	 * Method to get the {@link Class} object of a Class object.
	 *
	 * @param n an Integer.
	 * @return a Class object.
	 */
	private Class<?> getType(int n) {
		Class<?> class2 = null;
		try {
			for (int i=0; i<n; i++) {
				class2 = Array.get(Array.get((Object)class2, i + 1), i);
			}
		} catch (Exception e) {
			println(getFullName()+" - The Class object doesn't satisfy the constraint given.");
			assertNotNull("Class should not be null", class2);
			return (class2);
		}
		return (class2);
	}
}
