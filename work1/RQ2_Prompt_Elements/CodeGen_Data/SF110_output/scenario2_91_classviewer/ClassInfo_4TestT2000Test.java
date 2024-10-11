// ClassInfo_4Test.java
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
* It contains one unit test case for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
// ClassInfo.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;

/**
 * Obtains the interfaces as well as the public constructors, methods
 * and fields from a Class object.
 * <p>
 * This class is for obtaining data and handling.
 *
 * @author James Harris
 * @version 2.0a
 */
public class ClassInfo {

    /**
     * Returns an array of strings that contain the interfaces for
     * the class. The data is pulled from the c private Class object.
     * <p>
     * This method calls  {@link #getData(java.lang.Class[])} method for constructors.
     *
     * @return string array of interfaces
     */
    public String[] printInterfaces() {
        Class[] inter = c.getInterfaces();
        if (debug)
            System.out.println("****************************************");
        String[] data = getData(inter);
        if (c!= java.lang.Object.class &&!c.isInterface()) {
            Class superC = c.getSuperclass();
            TreeSet<String> hInterfaces = new TreeSet<String>();
            int i = 0;
            if (data!= null)
                for (i = 0; i < data.length; i++) {
                    hInterfaces.add(data[i]);
                }
            while (superC!= null && superC!= java.lang.Object.class) {
                inter = superC.getInterfaces();
                if (debug)
                    System.out.println("****************************************");
                data = getData(inter);
                if (data!= null)
                    for (i = 0; i < data.length; i++) {
                        hInterfaces.add(data[i]);
                    }
                superC = superC.getSuperclass();
            }
            if (hInterfaces.size()!= 0) {
                data = new String[hInterfaces.size()];
                Iterator it = hInterfaces.iterator();
                i = 0;
                while (it.hasNext()) {
                    data[i] = (String) it.next();
                    i++;
                }
            }
        }
        if (debug && data == null)
            System.out.println("No interfaces.");
        else
            printArray(data);
        return data;
    }
}

// ClassInfo_4Test.java
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
* It contains one unit test case for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
		/**
		 * Testing classinfo.
		 *  @see ClassInfo
		 *  @see ClassInfo$Test
		 *  @see ClassInfo$Test_C1
		 */
	static class TestClassInfo extends ClassInfo_4Test {
		/**
		 * Constructor of class info.
		 * @param c The Class object of this object.
		 */
		TestClassInfo(Class c) {
			super(c);
		}
	}
	static class TestClassInfo$TestC1 extends ClassInfo_4Test {
		public static boolean test(Class... args) {
			System.out.println(args.length);
			for (Object o: args)
				System.out.println(o);
			return false;
		}
		public TestClassInfo$TestC1() {
			super(TestClassInfo.class);
		}
	}
		private static void test(String cName,String cDescription) {
		System.out.println(cName);
		System.out.println(cDescription);
		Class[] inter = c.getInterfaces();
		if (inter!= null) {
			for (int idx = 0; idx < inter.length; idx++) {
				inter[idx] = inter[idx].getCanonicalName();
				System.out.println(inter[idx]);
			}
		}
		if (c.isInterface())
			System.out.println();
		else {
			String d = getData(inter);
			System.out.println(d);
		}
		System.out.println(inter);
		System.out.println(Class.getPackage(inter[0]).getName());
		Class<?> cl = inter[0];
		System.out.println("" + cl);
		Class<?> ct = cl.getSuperclass();
		System.out.println("" + ct);
		Map m = new HashMap();
		Class[][] interfaces = ct.getInterfaces();
		for (int idx = 0; idx < interfaces.length; idx++) {
			System.out.println("["+idx+"]" + interfaces[idx][0]);
			for (int i = 1; i < interfaces[idx].length; i++)
				m.put(interfaces[idx][i], interfaces[idx][i]);
		}
		Class[] d = new Class<?>[] {};
		System.out.println("" + m);
		m.keySet().toString(); // toString():
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println("["+i+"]" + interfaces[i][0]);
			for (int j = 0; j < interfaces[i].length; j++)
				if (i!= j)
					System.out.println("["+j+","+interfaces[i][j]+"]" + interfaces[i][j]);
		}
		System.out.println(m);
		Class classForJST = getClass(m.get(d[0]));
		System.out.println("" + classForJST);
		String[] names = m.keySet().toString().split(",");
		for (int i = 0; i < names.length; i++) {
			System.out.println("" + names[i]);
		}
	}

		public static void main(String[] args) {
			test("java.lang.Object", "Object");
			Class[] inter = ClassInfo.class.getInterfaces();
			while (inter!= null) {
				test("com.jstevh.viewer.ClassInfo$Test$TestClassInfo$TestC1", "This class does not implement TestClassInfo$Test.");

				System.out.println("" + inter);
				test("com.jstevh.viewer.ClassInfo_4Test$TestClassInfo$TestC1", "I'm a test class!");

				test("com.jstevh.viewer.ClassInfo", "I'm a test class! I don't understand.");

				test("com.jstevh.viewer.ClassInfo.TestClassInfo", "This is a public class.");
				test("com.jstevh.viewer.ClassInfo$TestClassInfo", "This is a public class!");
				test("com.jstevh.viewer.ClassInfo.TestClassInfo$TestClassInfo", "This is a public class!");
				test("com.jstevh.viewer.ClassInfo$TestClassInfo", "This is a public class!");
				test("com.jstevh.viewer.ClassInfo$TestClassInfo.TestClassInfo", "This is a public class!");

				System.out.println(test("com.jstevh.viewer.ClassInfo", "This is a public class."));
						//public void printInterfaces() {
						//System.out.println(interfaces.length);
						//int idx = 0;
						//for (Object o: interfaces)
						//	System.out.println("[interface "+idx+"]"+o);
						//}


				System.out.println(test("com.jstevh.viewer.ClassInfo.TestClassInfo", "This is a public class!"));
				Class[] c = ClassInfo.class.getInterfaces();
				test("com.jstevh.viewer.Class