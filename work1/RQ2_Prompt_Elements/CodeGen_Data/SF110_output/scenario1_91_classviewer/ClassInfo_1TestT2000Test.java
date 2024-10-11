// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
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

    public String[] printMethods() {
        if (debug)
            System.out.println("****************************************");
        String[] tempArray = null;
        if (cMethods!= null) {
            tempArray = new String[cMethods.length];
            System.arraycopy(cMethods, 0, tempArray, 0, cMethods.length);
        }
        if (debug && tempArray == null)
            System.out.println("No public methods.");
        else {
            printArray(tempArray);
        }
        return tempArray;
    }
}

// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {
		private final static String[] v = {
				"getConstructor0",
				"getConstructor1",
				"getConstructor2",
				"hashCode0",
				"hashCode1",
				"hashCode2",
				"getConstructor3",
				"getConstructor4",
				"getConstructor5",
				"getMethodsCount",
				"hashCode0",
				"hashCode1",
				"hashCode2",
				"getInterfacesCount",
				"hashCode3",
				"getMethodsCount",
				"addClass0",
				"addClass1",
				"removeObject0",
				"removeObject1",
				"removeObject2",
				"toArray0",
				"toArray1",
				"toArray2",
				"toObject0",
				"toObject1",
				"toObject2",
				"createHashCode0",
				"createHashCode1",
				"clone0",
				"clone1",
				"clone0",
				"clone1",
				"clone2",
				"clone3",
				"clone4",
				"clone5",
				"clone6",
				"clone7",
				"clone8",
				"clone9",
				"clone10",
				"clone11",
				"clone12",
				"clone13",
				"clone14",
				"clone15",
				"clone16",
				"clone17",
				"clone18",
				"clone19",
				"clone20",
				"clone21",
				"clone22",
				"clone23",
				"clone24"};
		private final static Map<Integer, ClassName> CLASS_COUNTS = {
				
		};
		private final static Map<Integer, ClassName> INTERFACES = {
				
		};	

    /**
     * Main test method.
     */
    @Test
    @TestOnly
    public static void main(String[] args) {
        DEBUG = Boolean.parseBoolean(args[2]);
        ClassInfo_1Test.init();
        for (int i = 0; i < args.length; i += 3) {
			Method method = ClassInfo_1Test.getMethod(args[i], args[i+1]);
			Method method2 = ClassInfo_1Test.getMethod(args[i]);
			String[] a = ClassInfo_1Test.getMethods(ClassInfo.class, method);
			String[] a2 = ClassInfo_1Test.getMethods(ClassInfo.class, method2);
			assertEquals(method, a[1] + "");
			assertEquals(method2, a2[1] + "");
			assertEquals(a.length, a.length);
			int[] classes = new int[a.length];
			for (int x = 0; x < classes.length; x++) {
				ClassInfo.CLASS_COUNTS.get(classes[x]).addClass(ClassInfo.getClass(a[x]));
				classes[x]++;
			}
			ClassInfo.INTERFACES.get(classes.length-1).addClass(ClassInfo.getClass(a.length));
		}
        ClassInfo_1Test.reinit(classes.length);
        ClassInfo_1Test.init();
        for (ClassInfo_1Test.TestData data1 : v) {
            System.out.println("Test data1:  " + StringUtils.join(Arrays.asList(data1.names), ","));
            for (ClassInfo_1Test.TestData data2 : v) {
                if (data2!= null) {
					System.out.println("Test data2: " + StringUtils.join(Arrays.asList(data2.names), ","));
                    String t;
					List<Object> cv = new ArrayList<>();
					if (data1 == null ||!data1.names.contains(data2.names))
                    	t = "not " + ((data1 == null)? data2.names : data1.names);
                    else
                    	t = "same " + ((data1 == null)? data2.names : data1.names);
                    cv.addAll(ClassInfo_1Test.getInterfaces(ClassInfo.getClass(data1.className)));
					if (ClassInfo_1Test.getClases(cv)!= null)
                        t += (t == null? "" : ", "+ClassInfo_1Test.getCount((ClassInfo)ClassInfo_1Test.getClases(cv))) + "\n" + "\n" + ClassInfo_1Test.getCount(ClassInfo.getClass(data2.className));
                    else
                    	t += " not " + ClassInfo_1Test.getCount((ClassInfo)ClassInfo_1Test.getClases(cv));
				} else {
					if (data1!= null)
                        t = "null " + ((data1 == null)? null : data1.names.toString());
				}
	
				System.out.println("        TEST DATA + interfaces: " + t);
			}
		}
        System.out.println("TOTAL CLASSES:  " + ClassInfo_1Test.CLASS_COUNTS.size());
		System.out.println("    TOTAL INTERFACES:  " + ClassInfo_1Test.INTERFACES.size());
    }

	//----------------------------------------------------------------------
	public static void init() {
		for (int i = 0; i < v.length; i++)
			ClassInfo_1Test.printMethods();
	}

	//----------------------------------------------------------------------
	public static void reinit(int initialCount) {
		ClassInfo.CLASS_COUNTS.clear();
		ClassInfo.INTERFACES.clear();
		ClassInfo.CLASS_COUNTS.putAll(ClassInfo_1Test.CLASS_COUNTS());
		ClassInfo.INTERFACES.putAll(ClassInfo_1Test.INTERFACES());
		CLASS_COUNTS.clear();
		INTERFACES.clear();
	}

	private ClassInfo(ClassInfo data) {
		init();
		for (int i = 0; i < data.names.size(); i++) {
			ClassInfo_1Test.CLASS_COUNTS.put(i, data);
			System.out.println("   added " + ClassInfo.CLASSCOUNTS.get(i));
		}
	}

	public static class TestData implements Serializable {
        String names[];
		public TestData() {
			names = new String[10];
			Arrays.fill(names, "");
		}
		public final static List<String> testMethods = new ArrayList<>();
		public final static List<ClassName> classes = new ArrayList<>();
	}
	
	public static class TestData_