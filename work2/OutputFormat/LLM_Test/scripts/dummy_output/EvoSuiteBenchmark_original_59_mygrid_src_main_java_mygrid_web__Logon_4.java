// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
		 /**
		  * No instanciation required.
		  * @throws java.lang.IllegalStateException if required
		  */
       private _LogonTest() {
           throw new java.lang.IllegalStateException("No invocation allowed");
       }

       @Test
       public void getTypeDesc1() {
           assertEquals(_Logon.getTypeDesc(), _Logon.class);
       }

       @Test
       public void getTypeDesc12() {
           assertEquals(_Logon.getTypeDesc(), _Logon.class);
       }

       @Test
       public void getTypeDesc25() {
           _Logon.getTypeDesc();  
       }

       @Test
       public void getTypeDesc14() {
           _Logon.getTypeDesc();  
       }

       @Test
       public void getTypeDesc20() {
           _Logon.getTypeDesc();  
       }
}