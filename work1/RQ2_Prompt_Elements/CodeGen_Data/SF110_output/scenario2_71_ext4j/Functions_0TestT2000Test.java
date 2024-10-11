// Functions_0Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains one unit test case for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_0Test {

    @Test
        public void test() throws Exception {
             String testValue = null;
//         JspTagTag _nullTestValue = getTag();
	IRequest _request = new Request();
         // Map<Integer, String> params = Map.of(10, "test");
         // _request.put("params", Map.of("test", "testValue"));
//
//         _request.setInject(new HashMap<String, String>() {{ put("hello", "123");}});

    	String s = getTag().doStartTag();
    	
    	// assert false;
    	assertNull(getTag().getInjectedParams());
    	
//        _nullTestValue.doStartTag();
        String expected = "Date";
        String actual = _request.getParameter("params");
        assertEquals("params", expected, actual);
//
//        _request.setInject(new HashMap<String, String>() {{ put("hello", "123");}});
        _request.setParameter("hello", "hello");

//        _nullTestValue.doStartTag();
        expected = "123";
        actual = _request.getParameter("hello");
        assertEquals("hello", expected, actual);

    }
//    @Test
//	public void testGet() throws Exception {
//	JspTagTag _nullTestJson = getTag();
//	IRequest _request = new Request();
//	IRequest _request1 = new Request();
//	IRequest _iRequest1 = new Request();
//	Map<String, String> params = Map.of("hello", "hello");
//	IRequest _request2 = new Request();
//	IRequest _iRequest2 = new Request();
//	Map<String, String> iParams = null;
//	IRequest _request3 = new Request();
//	Map<String, String> oParams = Map.of("hello", null);
//	Map<String, String> jParams = null;
//	Map<String, String> oParams1 = null;
//        Map<String,String> iParams1 = null;
//        Map<String,String> oParams2 = null;
//        Map<String,String> jParams1 = null;
//	String output = "";
//	String error = "";
//		
//	_nullTestJson.doStartTag();
//	output =  _nullTestJson.doStartParams(_request);
//	String input = _nullTestJson.doStartParams(_iRequest);
//	String output1 = _nullTestJson.doStartParams(_request1);
//	String output2 = _nullTestJson.doStartParams(_iRequest1);
//	String output3 = _nullTestJson.doStartParams(_request3);
//	String output4 = _nullTestJson.doStartParams(_iRequest2);
//	String output5 = _nullTestJson.doStartParams(_request2);
	
//
//
//	_request.setParameter("hello",  "hello");
//	_iRequest.setParameter("hello", "");
//	_request1.setParameter("hello", null);
//	_iRequest1.setParameter("hello", "string");
//	_request2.setParameter("hello", Map.of("hello", "hello"));
//	_iRequest2.setParameter("hello", Arrays.asList("hello", "hello"));
//	_request3.setParameter("hello", Map.of("hello", null))
//	_iRequest3.setParameter("hello", null);
//	_request4.setParameter("hello", Map.of("hello", null))
//	_iRequest4.setParameter("hello", Map.of("hello", "hello"))
//	_request5.setParameter("hello", Map.of("hello", null))
//		}
//
//	@After
//	public void clean() {
//		_request3.setParameter("hello", null);
//		_iRequest3.setParameter("hello", null);
//		_request4.setParameter("hello", null);
//		_iRequest4.setParameter("hello", null);
//		_request5.setParameter("hello", null);
//		
//	}
}
/* end of functions.src.jsp */
