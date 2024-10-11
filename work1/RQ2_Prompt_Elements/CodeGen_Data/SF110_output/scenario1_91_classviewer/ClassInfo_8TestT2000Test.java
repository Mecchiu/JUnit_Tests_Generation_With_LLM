// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
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

    public MethodData getFoundMethod(final int pos) {
        if (fndMethods == null || pos > fndMethods.length)
            return null;
        return new MethodData() {

            //check to make sure position isn't out of range
            String tempStr = fndMethods[pos], tempStr2;

            String className, methodName;

            int begin, end;

            Class methClass;

            {
                end = tempStr.indexOf(")");
                tempStr = tempStr.substring(0, end + 1);
                begin = tempStr.lastIndexOf(" ");
                tempStr = tempStr.substring(begin + 1, tempStr.length());
                begin = tempStr.indexOf("(");
                end = tempStr.lastIndexOf(".", begin);
                className = tempStr.substring(0, end);
                methodName = tempStr.substring(end + 1, tempStr.length());
                if (debug)
                    System.out.println("className=" + className);
                methClass = ClassInfo.tryClass(className);
                if (debug)
                    System.out.println("methClass=" + methClass);
            }

            public String getMethPackage() {
                if (methClass == null)
                    return null;
                return methClass.getPackage()!= null? methClass.getPackage().getName() : null;
            }

            public String getMethClass() {
                if (methClass == null)
                    return null;
                return methClass.getName();
            }

            public String getMethName() {
                return methodName;
            }
        };
    }
}

// ClassInfo_8Test.java
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
* It contains one unit test case for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {
		
    @Test
    void testGetAllConstructors() {
        //no arguments
        assertNull(ClassInfo.getAllConstructors(null, new HashSet()));
        assertNull(ClassInfo.getAllConstructors(null));
        assertNull(ClassInfo.getAllConstructors(new HashSet(), new HashSet()));
        ClassInfo_8Test.testGetConstructors(ClassName_1_0_9.class, new HashSet());

        //test parameter types
        final ClassData[] data = ClassInfo.getAllConstructors(ClassName_1_0_9.class, null);
        final Constructor[] constructor = ClassInfo.getConstructorsForClass(ClassInfo_7_8_1.class);
        assertEquals(1, data.length);

        final List<Constructor> constructors = new ArrayList<>();
        final Constructor[] constructorParam = ClassInfo_7_8_1.class.getConstructors();
        for (int i = 0; i < constructorParam.length && constructors.size() < 2; i++)
          constructors.add(constructorParam[i]);
        assertEquals(constructors.size(), constructors.size(), 2);

        final Constructor constructorOne = constructors.get(0);
        final List<Constructor> constructorTwo = new ArrayList<>();
        for (final Constructor constructor2 : constructorOne.getParameterTypes())
                constructors.add(constructor2);
        assertEquals(constructors.size(), 2, String.format("Expected number of %s%nFound %s%n", classInfo, DataInfo.getConstructorsForClass(ClassInfo_8Test.this.classInfo).size()));

        final Constructor constructorOneOne = constructors.get(1);
        final List<Constructor> constructorTwoOne = new ArrayList<>();
        for (final Constructor constructor2 : constructorOneOne.getParameterTypes())
                constructors.add(constructor2);
        assertEquals(constructors.size(), 2, String.format("Expected number of %s%nFound %s%n", classInfo, DataInfo.getConstructorsForClass(ClassInfo_8Test.this.classInfo).size()));

        //get all constructors
        final List<Constructor> constructorList = new ArrayList<>(constructors);
        final Constructor[] constructorArray = ClassInfo.getConstructorsForClass(ClassInfo_8Test.this.classInfo);
        assertEquals("Number of constructed constructors", constructorList.size(), constructorArray.length);

        //test argument types
        final ClassData[] cData = ClassInfo.getAllConstructors(ClassInfo_8Test.this.getClass(), Constructor.class);
        final Constructor constructor = cData[1].getConstructor();
        assertEquals("Number of constructors", constructor.getParameterTypes().length, 1);

        //test parameter type
        final ClassData[] cData2 = ClassInfo.getAllConstructors(new ClassInfo_8Test().getClass(), Constructor.class);
        final Constructor constructorParam= ClassInfo_8Test.this.getClass().getConstructors()[1].getParameterTypes()[0];
        assertEquals("Number of constructors", cData2.length, constructorParam.getParameterTypes()[0].getType());
        assertEquals("Class name", ClassInfo_8Test.this.className, cData[0].getClass().getName());
        assertEquals("Number of constructors", Constructor.class, cData[0].getClass().getConstructors()[0].getParameterTypes()[0].getClass());
    }

    @Test
    void testGetConstructors() {
		System.out.println("=========TestClassInfo.java:getConstructors=======================");
		final HashSet dataFields = new HashSet();
		dataFields.add("f1");
		dataFields.add("f2");
		dataFields.add("f3");
		dataFields.add("f4");

        //test data
        final Set <Field> fieldSet = new HashSet(Arrays.asList(ClassInfo.getAllFields(this.classInfo),
                ClassInfo.getAllProperties(this.classInfo),
                ClassInfo.getAllStaticFields(this.classInfo),
                ClassInfo.getAllFields(DataInfo.class),
                ClassInfo_8Test.class.getFields(),
                DataInfo.class.getFields(),
                ClassInfo_7_8_1.class.getFields()
        ));
        assertEquals(Arrays.asList(ClassInfo.getAllMethods(this.classInfo.getName()),
                ClassInfo.getAllMethods(DataInfo_1_0_2.class.getName())
        ), fieldSet);
		System.out.println("Number of constructors=" + (ClassInfo.getAllConstructors(this.classInfo).size()));

		assertEquals("Number of constructors", dataFields.size(), ClassInfo.getConstructorsForClass(ClassInfo_8Test.this.classInfo).size());
	}
}