// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		   
    /**
    * getTypeDesc is testing the method {@link ArrayOfContextElement#getTypeDesc()} of java.util.Array
    * */
     @Test (expected = javax.xml.bind.JAXBException.class)
	 public void testGetTypeDesc(){
		  ArrayOfContextElement object = new ArrayOfContextElement();
		  
	      String typeDesc = object.getTypeDesc();
	      
	}
}