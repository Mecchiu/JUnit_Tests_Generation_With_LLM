// XmlElement_3Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String, String)} method.
*/
class XmlElement_3Test {
		
        private Object object;
        private XmlElement xmlElement;
        
        /**
         * @throws Exception Thrown in case of test error.
         */
        @Test
        void test() throws Exception {
                
                Hashtable<String, Vector<String>> hashtableObject = new Hashtable<>();
                hashtableObject.put("name", new Vector<>(10));
                hashtableObject.put("value", new Vector<>(10));
                xmlElement = new XmlElement(hashtableObject);
                assertTrue(xmlElement instanceof XmlElement);
                
                xmlElement.setClassName("MyClass");
                assertEquals("MyClass", xmlElement.getClassName());
                
                xmlElement.addObserver(new MyObserver());
                
                xmlElement.setData("value1");
                Object value = xmlElement.getData();
                assertEquals("value1", value);
                
                Enumeration enumeration = xmlElement.elements();
                assertTrue(enumeration.hasMoreElements());
                
                Vector<String> list = (Vector<String>) enumeration.nextElement();
                String value1 = list.get(0);
                assertEquals("value1", value1);
                
                Vector<String> list2 = xmlElement.getData();
                assertEquals(list.size(), list2.size());
                assertTrue(list2.containsAll(list));
                
                Enumeration eEnum = xmlElement.elements();
                assertTrue(eEnum.hasMoreElements());
                
                object = eEnum.nextElement();
                assertNotNull(object);
                
                xmlElement.setClassName("MySubclass");
                object = new MySubclass();
                Enumeration eObject = xmlElement.elements();
                //assertTrue(eObject.hasMoreElements());
                object.setData("My value");
                String value2 = xmlElement.getData();
                assertEquals("My value", value2);
                
                object = new MySubclass();
                Enumeration eObject2 = xmlElement.elements();
                assertTrue(eObject2.hasMoreElements());
                object2= eObject2.nextElement();
                String value3 = object.getData(); 
                assertEquals("My Subvalue", value3);
                
/*
*/                
		}
		
}