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
		/* 
		 * Test example:
		 * <p>
  TestCase example1 :
    The following is the input for the testing of the {@link XmlElement#addSubElement(String, String)} method 
    <ul>
    <li>
      <p>
        <code>"testname"</code> has a default value of <i>testname</i>
        <br/>
        <dl>
          <dt> <i>TestName</i> </dt><dt> <i>testvalue</i> </dt>
        </dl>
      </p>
      <p>
        Test Name: <i>testname</i>
      </p>
    </li>
    <li>
      <p>
        <code>"description"</code> has a default value of <i>description</i>
        <br/>
        <dl>
          <dt> <i>description</i> </dt><dt> <i>testvalue</i> </dt>
        </dl>
      </p>
      <p>
        Description: <i>description</i>
      </p>
    </li>
    </ul>
   */
     @Test
    public void test_case1_a() {
        XmlElement a="testname";       a=a.addSubElement("testname","testvalue");
        System.out.println("a " + a.getClass().getName());
        XmlElement b = a.getChild("testname");
        System.out.println("b " + b.getClass().getName());
    }
    @Test
    public void test_case2a() {
        XmlElement a = new XmlElement("testname");
        XmlElement b = new XmlElement("testname");
        a = a.addSubElement("testname", "testvalue");
        b = b.addSubElement("testname", "testvalue");
        System.out.println("a " + a.getClass().getName());
        System.out.println("b " + b.getClass().getName());
    }
    @Test
    public void test_case2b() {
        XmlElement a = new XmlElement("testname");
        XmlElement b = new XmlElement("testname");
        a = a.getChild("testname");
        b = b.getChild("testname");
        System.out.println("a " + a.getClass().getName());
        System.out.println("b " + b.getClass().getName());
    }
}