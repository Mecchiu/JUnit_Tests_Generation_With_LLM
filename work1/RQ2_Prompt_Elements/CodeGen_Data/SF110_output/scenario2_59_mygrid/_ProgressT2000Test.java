// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {

	    final static String DATA = 
			"{\"step\": \"/api/stages/1\",\n" + 
			"  \"value\": {\"data\": 0.5,\n" + 
			"    \"type\": \"string\",\n" + 
			"    \"name\": \"value\"\n" + 
			"  },\n" + 
			"  \"next\": {\"step\": \"/api/stages/2\",\n" + 
			"    \"value\": {\"data\": 1.0,\n" + 
			"      \"type\": \"double\",\n" + 
			"      \"name\": \"value\"\n" + 
			"    }\n" + 
			"  },\n" + 
			"  \"last\": {\"step\": \"/api/stages/3\",\n" + 
			"    \"value\": {\"data\": 5.0,\n" + 
			"      \"type\": \"double\",\n" + 
			"      \"name\": \"value\"\n" + 
			"    }\n" + 
			"  }\n" + 
			"}";
	
	    final static String TYPE_DESC = "class typeDesc for Class<" + _Step.class.getName() + ">";
	    
	public void test_getTypeDesc() {
		_Step step = new _Step();
		assertEquals("Type does not match", TYPE_DESC, step.getTypeDesc());
	}
}