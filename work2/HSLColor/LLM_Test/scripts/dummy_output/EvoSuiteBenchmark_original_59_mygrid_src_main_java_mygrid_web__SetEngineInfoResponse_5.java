// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {
		private _SetEngineInfoResponse target;
	
	private static java.lang.Class _javaType;
	
	static {
		_javaType = (java.lang.Class) null;
	}
	
	private final static java.lang.Class _javaType = (java.lang.Class) null;
	
	static {
	 org.apache.axis.description.TypeDesc.getTypeBinding(_SetEngineInfoResponse.class);
	}
	
	public void setUp() {
		target = new _SetEngineInfoResponse();
	}
	
	private java.lang.Long getTargetObject();
	boolean is_set_target_object();
	private long targetObject;
	
	@Test
	public void test_is_set_target_object()  {
		org.junit.jupiter.api.Assertions.assertNull(getTargetObject());
		is_set_target_object();
	}
	
	@Test
	public void test_is_set_target_object_1()  {
		org.junit.jupiter.api.Assertions.assertNotNull(getTargetObject());
		is_set_target_object();
	}
	
	@Test
	public void test_set_target_object()  {
		targetObject = java.lang.Long.MAX_VALUE;
		org.junit.jupiter.api.Assertions.assertNotNull(getTargetObject());
		targetObject = (long) null;
		org.junit.jupiter.api.Assertions.assertEquals(java.lang.Long.MAX_VALUE, getTargetObject());
	}
	
	@Test
	public void test_set_target_object_2()  {
		org.junit.jupiter.api.Assertions.assertNotNull(getTargetObject());
		targetObject = java.lang.Long.MIN_VALUE;
		org.junit.jupiter.api.Assertions.assertEquals(java.lang.Long.MIN_VALUE, getTargetObject());
	}
	
		public <T extends org.junit.jupiter.api.TestObject> void setup() {
			org.junit.jupiter.api.Assertions.assertNotNull(getTargetObject());
	     	_javaType = org.junit.jupiter.api.Assertions.assertNotNull(get_target_type());
	        target = this;
	    }
	
    public <T extends org.junit.jupiter.api.TestObject> java.lang.Object getTarget() throws java.io.IOException,  java.lang.ClassNotFoundException {
	        return  org.junit.jupiter.api.Assertions.assertNotNull(get_target_type(), this);
    }
	
	private <T extends org.junit.jupiter.api.TestObject> java.lang.Class<T> get_target_type() throws java.lang.ClassNotFoundException {
		return (java.lang.Class<T>) org.junit.jupiter.api.Assertions.assertNotNull(org.junit.jupiter.api.extension.ExtensionExtractUtil.getTargetClass(getTarget()), "Could not convert the target object to the expected type");
	}
	
}