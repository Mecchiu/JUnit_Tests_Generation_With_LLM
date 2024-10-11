// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    int count = 1;
    @java.lang.SuppressWarnings("all")
    public ArrayOfStringTest() {
				
    }
    
    //Test cases
    @java.lang.SuppressWarnings("all")
	public void test01(){
        Object obj = new ArrayOfString();
        obj.setTypeDesc("ArrayOfString");
        
        Object obj2 = new ArrayOfString(obj);
        assertTrue(obj2!= null);
        
        assertTrue(obj2 instanceof ArrayOfString);
        
        Object obj3 = new ArrayOfStringBuffer("this is a test");
        Object obj4 = new ArrayOfStringBuffer("this is a test");
        ArrayOfString obj5 = new ArrayOfStringBuffer("this is a test");
        Object obj6 = new ArrayOfStringBuffer("this is a test");
    }
    
    @java.lang.SuppressWarnings("all")
    @java.lang.Override
    public java.lang.String toString() {
        return (java.lang.String) null;
    }
}