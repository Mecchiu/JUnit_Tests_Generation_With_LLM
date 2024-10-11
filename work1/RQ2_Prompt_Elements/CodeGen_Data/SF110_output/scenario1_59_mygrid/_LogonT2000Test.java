// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {

	@Test
	  public void test2_1() {
		  assertEquals(_Logon.logOn_TypeDesc, _Logon.getTypeDesc());
	  }
	
}
