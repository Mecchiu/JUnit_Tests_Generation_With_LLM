// Functions_1Test.java
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
* It contains one unit test case for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {
		/**
		* Test method for {@link Functions#addS(String)}
		* where pRequest is null.
		* <br>The method is implemented as it is test method in {@link Functions} class with a
		* pRequest equals to null
		* @throws Exception exception thrown if the test fails
		*/

//        @Test

//        public void test1() throws Exception {
//                MyCustomTagParser parser = new MyCustomTagParser("1");
//                 String result = parser.doIt(null);
//                 assertEquals(
//         "1" + EOL_LINUX +
//         "123456" + EOL_LINUX +
//         "123" + EOL_LINUX +
//         "12" + EOL_LINUX +
//         "3456" + EOL_LINUX +
//         "345" + EOL_LINUX +
//         "45" + EOL_LINUX +
//         "45\r\n" + EOL_LINUX +
//         "45\r\n" + EOL_LINUX +
//         "456" + EOL_LINUX +
//         "45" + EOL_LINUX +
//         "45\r\n" + EOL_LINUX +
//         "45\r\n" + EOL_LINUX);
//        }

        /**
		* Test method for {@link Functions#addS(String)}
		* where pValue and pSep are empty string, and pRequest is a request of a string containing
		*'' as a separator.
		* <br>The method is implemented as it is test method in {@link Functions} class with a
		* pValue equal to an empty string and pSep equals to''
		* @throws Exception exception thrown if the test fails
		*/

    @Test
    public void test2() throws Exception {
        System.out.println("===="+Functions_1Test.class.getName()+"====");
        StringBuilder sb = new StringBuilder();
        String pValue = Functions_1Test.addS(sb,Functions_1Test.makeSep(Functions_1Test.ordinal(Functions_1Test.getLastDigit(3)), Functions_1Test.ordinal(Functions_1Test.getLastDigit(4))));
}
}