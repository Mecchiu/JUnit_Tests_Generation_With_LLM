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

    private int classNumber;
    private ClassInfo classInfo;
    private TestFrame testFrame;
    
    /**
     * Initialises with classes to search and the current class number as
     * the "number" of the class
     */
    TestInfo createTestInfo(Object[] classesToSearch, int classNumber) {
        Class<?> currentClass = classesToSearch[classNumber] instanceof Class<?>? (Class<?>) classesToSearch[classNumber] : null;
        
        return new TestInfo(this.testFrame, (currentClass == null? "noClass" : currentClass.getSimpleName()), classesToSearch[0], this.classNumber);
    }
	
    /**
     * Run the suite of {@link TestInfo}s for classes found by {@link ClassInfo#getFoundMethod(int)}
     * at the given position and class number.
     * @param classesToSearch classes to test with
     * @param startPosition starting index of test
     */
    public void runTest(Object[] classesToSearch, int startPosition) {
		
		// Set up with current set of classes and expected result in case test is skipped
		this.testFrame = new TestFrame(new TestInfo(this.testFrame, "classTest", this.classInfo.getClassName(), this.classNumber));

		this.classNumber = startPosition;
		
		// Test each class
		for(int i = startPosition; i >= 0; i--) {
			this.testFrame.setClassInfoToSearch(this.classesAndFields(this.classInfo, (clazz) classesToSearch[i]), this.getFoundMethod(i));
		}
		
		// Add footer and show the frame and test info
		this.testFrame.addFooter("Found " + this.classInfo.getClassName() + " (" + this.classesAndFields(this.classInfo, (clazz)classesToSearch[classNumber]).length + ")");
		this.testFrame.setVisible();
		this.testFrame.setTitle(classesToSearch[classNumber] + " Class Information");
	}
    
    /**
     * Returns a map from {@code clazz} to {@code method name} of
     * {@code clazz}'s methods.
     *
     * @param clazz
     * @return map from clazz to method name
     */
	private static Map<Object, String> getClassNameToMethodMap(Class<?> clazz) {
		
        // Collect all methods
		LinkedHashSet<Method> methods = new LinkedHashSet<>();
        List<Member> members = new LinkedList<Member>(); // List for members.
		
        clazz.getDeclaredMethods();
        for(int i = 0; i < clazz.getDeclaredMethods().length; i++) {
            Method method = clazz.getDeclaredMethods()[i];
            if(method.getName().startsWith("get")) {
                addElementMethod(method, members);
            }
        }
        
        // Collect all fields
        List<Member> fields = new LinkedList<Member>();
        for(int i = 0; i < clazz.getFields().length; i++) {
            Field field = clazz.getFields()[i];
            if(field.getName().startsWith("get")) {
                addElementField(field, fields);
            }
        }
        
        // Add up all methods and fields
        Member[] members2 = fields.toArray(new Member[fields.size()]);
        List<Member> fields2 = new LinkedList<Member>(); // List for members.
        for(Member member : members2) {
            fields2.add(member);
        }
        
        Collections.sort(fields2, new Comparator<Member>() {
            public int compare(Member left, Member right) {
                int n1 = 0;
                int n = 0;
                int m1 = left.getModifiers();
                int m2 = right.getModifiers();
                while(n1 < 0 && n2 < 0 && (m1 > 0 && m1 < m2) || (m1 < 0 && m2 > 0)) {
                    m1 = left.getModifiers();
                    m2 = right.getModifiers();
                    n1++;
                }
                if(m1 < m2) {
                    return -1;
                }
                if(m2 < m1) {
                    return 1;
                }
                return 0;
            }
        });
        
        // Convert fields2 to map from field names to methods
        Map<String, Set<Member>> field2MethodMap = new HashMap<String, Set<Member>>();
        for(Member member: fields2) {
            String fieldName = member.getName();
            // Get method that corresponds to fieldName
            Method method = member.getDeclaringClass().getDeclaredMethod((String)fieldName);
            addElementTypeMethod(method, member, field2MethodMap);
        }
        
        // Now populate with all classes and interfaces
        Map<Object, Class<?>> class2ClassMap = new HashMap<Object, Class<?>>();
        for(Object currentClassFromClassInfo : this.classesAndFields(this.classInfo, (clazz)classesToSearch[classNumber])) {
            if(!currentClassFromClassInfo.equals(clazz)) {
                addElementClass(currentClassFromClassInfo, class2ClassMap);
                class1 = (Class<?>)currentClassFromClassInfo;
            }
        }
        
        return new HashMap<Object, Class<?>>(class2ClassMap);

	}

	private static void addElementClass(Object currentClassFromClassInfo, Map<Object, Class<?>> class2ClassMap) {
        Class c = (Class) currentClassFromClassInfo;
        // Get the real classes
        for(Class<?> p : currentClassFromClassInfo.getInterfaces()) {
            class2ClassMap.put(p.getName(), p);
        }
        // Add as member of classes
        // The classes and interfaces can't be null, because
        // classes could add null for example.
        if(c!= null) {
            // Set names of all interfaces and classes
            Set<String> interfaces = new HashSet<String>();
            Set<Class<?>> classes = new HashSet<Class<?>>();
            for(Class<?> p: c.getInterfaces()) {
                interfaces.add(p.getName());
                classes.add(p);
            }
            // Get the name of the first class that is not a interface
            for(Class<?> p: c.getInterfaces()) {
                if(!interfaces.contains((String)p.getInternalName())) {
                    break;
                }
                classes.add((Class<?>)p);
            }
            addElementClass(classes.iterator().next(), class2ClassMap);
        }
	}

    /** Creates new ClassInfo_8Test