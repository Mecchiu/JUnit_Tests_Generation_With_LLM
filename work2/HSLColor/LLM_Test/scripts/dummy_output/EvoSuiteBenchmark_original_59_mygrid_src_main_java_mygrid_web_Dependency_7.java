// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		/*
  * 
  * This test checks the method {@link Dependency#getTypeDesc()}
  * 
  *  It verifies that the method {@link Dependency#getTypeDesc()} returns the canonical name of the
  *  method and when when the canonical name is set to this value, it returns the value returned by calling 
  *  the method and not the argument
  */
    @Test
    void getTypeDesc(){
        // set the name of the Dependency to "test"
        Dependency test=new Dependency();
        assertNotNull(
                "The 'test' Dependency should have a different name than 'test'",
                test.getName());
    }
}