// ClassInfo_5Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {

	private static int _i;

	/**
	 * This test method is for {@link ClassInfo#getData(Member[])} method.
	 * It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
	 * @throws Exception
	 */
	@Test
	void getDataArray() throws Exception {
		JT_511 jt = new JT_511();
		Member[] m = ClassInfo_5Test.class.getDeclaredField("m");
        Class clazz = ClassInfo_5Test.class;
		m = clazz.getDeclaredMethod("getData", new Class[]{Member[].class});
		Object o = m.invoke(null, new Object[]{});
		assertEquals(1, m.length);
		String[] Data = getData(m);

		String[] StringData = new String[Data.length];
		System.arraycopy(Data, 0, StringData, 0, Data.length);
		String stringReturned = new String(new CharArrayReader(Data).readLine().replace('\0', '.'));
		System.out.println("array: "+stringReturned);
		assertEquals("Value of string returned has the wrong value.", "String array", stringReturned);
		System.out.println("array: "+o);

		System.out.println("array: "+o.toString());
		assertEquals("Value of array not correct.", "String array", o.toString());
		//Object o = m.invoke(m.get(2));
	}
	
	
	
	/**
	 * ClassInfo.java
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		Constructor[] cons = ClassInfo_5Test.class.getDeclaredConstructors();
		//System.out.println("con count is " + cons.length);
		length = cons.length;
		
		ClassInfo_5Test testObject = new ClassInfo_5Test();
		
		Class[] cs = new Class[length];
		cs[0] = testObject.getClass();
//		java.lang.reflect.Array.newInstance(testObject.getClass(), length);
		
		for (count = 0; count < elements.length; count++) {
			Class[] ClassArray = new Class[length];
			for (int i = 0; i < length; i++)
                ClassArray[i] = elements[count].getClass();
			
			System.out.println("Type is " + ClassArray);
			new ClassArrayIteration(ClassArray);
			
			System.out.println("Type is " + cs[count]);
			new ClassIteration(ClassArray);
			
			System.out.println("Type is " + cs[count].getClass());
			Object o = cons[count].newInstance(cs[count], 0, classes);
			System.out.println("Object is " + o);
			System.out.println("Object is of class " + o.getClass());
		}

		System.out.println("Length is: "+length);
	}

// ClassInfo.java
}