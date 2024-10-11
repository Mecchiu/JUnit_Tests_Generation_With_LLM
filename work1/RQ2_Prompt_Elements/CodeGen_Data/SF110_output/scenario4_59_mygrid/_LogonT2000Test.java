// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {

    private static final java.lang.String FACTORY_MEMBER_OID = "1.3.6.1.4.1.29592.2.1.12.1.14";
    private static final java.lang.String FACTORY_NAME = "mygrid.myaccount";
    private static final java.lang.String FACTORY_TYPE = "mygrid.myaccount";


    @Test
    public void testGetTypeDesc() {
	   assertTrue(_Logon.getTypeDesc() instanceof _Type);
    }

    
    @Test
    public void testCreateLogonInstance(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";

	_Logon logon = _Logon.createLogon(logonType);
	assertNotNull(logon);
	assertEquals(logon.getType(), "1.3.6.1.4.1.29592.2.1.12.1.14");
    }
    
    @Test
    public void testEqualHashCode1(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj = new _Logon();
	assertTrue("'obj' should be equal to 'obj'", obj.equals(obj));
    }

    @Test
    public void testEqualHashCode2(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj = new _Logon();
	assertTrue("'obj' should be equal to 'obj'", obj.hashCode() == obj.hashCode());
    }

    @Test
    public void testEqualHashCode3(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj = new _Logon();
	assertFalse("'obj' should not be equal to 'obj'", obj.equals(obj));
    }

    @Test
    public void testEqualHashCode4(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj = new _Logon();
	assertFalse("'obj' should not be equal to 'obj'", obj.equals(obj));
    }
    
    @Test
    public void testHashCode(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj = new _Logon();
	int objHash = obj.hashCode();
	assertTrue("'obj' should be equal to 'objHash'", objHash == objHash);
    }

    @Test
    public void testEquals(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj = new _Logon();	
	assertTrue("'obj' should be equal to 'obj'", obj.equals(obj));
    }
    
    @Test
    public void testCompareTo(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj1 = new _Logon();
	java.lang.Object obj2 = new _Logon();
	assertTrue("'obj1' should be equal to 'obj2'", 
		    obj1.compareTo(obj2) == 0);
    }
    
	@Test
    public void testEquals2(){
	String logonType = "1.3.6.1.4.1.29592.2.1.12.1.14";
	java.lang.Object obj1 = new _Logon();	
	assertTrue("'obj1' should be equal to 'obj1'", obj2.equals(obj1));
    }
}
