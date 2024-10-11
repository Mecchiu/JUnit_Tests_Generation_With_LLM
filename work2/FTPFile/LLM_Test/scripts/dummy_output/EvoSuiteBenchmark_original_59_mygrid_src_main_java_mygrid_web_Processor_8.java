// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {
		
/**
* Test for {@link Processor#getTypeDesc} method.
*/
@Test
public void testGetTypeDesc(){
    java.lang.String type;
    java.lang.String assembly;
    type=(java.lang.String) java.lang.ThreadState.getState(_threadState[0]);
    java.lang.String expected="javapropertyprocessor";
    expected="";
    assembly=(java.lang.String) java.lang.ThreadState.getState(_threadState[0]);
    assembly="";
    typeDesc.setType("javapropertyprocessor");
    assertEquals(type,typeDesc.getType());
    assertEquals(assembly,typeDesc.getAssembly());
    assertEquals(expected,typeDesc.toString());
}



}