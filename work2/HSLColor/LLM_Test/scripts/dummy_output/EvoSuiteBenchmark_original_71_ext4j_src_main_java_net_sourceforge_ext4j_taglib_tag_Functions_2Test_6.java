// Functions_2Test.java
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
* It contains one unit test case for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class Functions_2Test {
		@Test
	void dateToMilliseconds( ) throws Exception {
		assertEquals( 0l, dateToMilliseconds( new Date() ) ) ;
		assertEquals( 100l, dateToMilliseconds( new Date( 1000000l ) ) ) ;
		assertEquals( 100l, dateToMilliseconds( new Date( 10000000l ) ) ) ;
		assertEquals( 600l, dateToMilliseconds( new Date( 6000000l ) ) ) ;
		assertEquals( 600l, dateToMilliseconds( new Date( 60000000l ) ) ) ;
	}

	@Test
	void dateToMilliseconds_1( ) throws Exception {
		System.out.println( "dateToMilliseconds test" );
		assertEquals( 0l, dateToMilliseconds( new Date() ) ) ;
		assertEquals( 100l, dateToMilliseconds( new Date( 1000000l ) ) ) ;
		assertEquals( 100l, dateToMilliseconds( new Date( 10000000l ) ) ) ;
		assertEquals( 600l, dateToMilliseconds( new Date( 6000000l ) ) ) ;
		assertEquals( 600l, dateToMilliseconds( new Date( 60000000l ) ) ) ;
	}
	
	@Test
	void dateToMilliseconds_2( ) throws Exception {
		System.out.println( "dateToMilliseconds test" );
		//String pDate = "2016-11-10 11:20:32.1";
		//System.out.println( "pDate: " + pDate );
		assertEquals( "0000012000", dateToMilliseconds( new java.util.Date( 1000000L ) ) ) ;
		assertEquals( 300000L, dateToMilliseconds( new Date( 1001000L ) ) ) ;
	}

	@Test
	public void removeParam_1( ) throws Exception {
		assertEquals( "test", removeParam(1) );
	}

	@Test
	public void removeParam_2( ) throws Exception {
		assertEquals( "test2", removeParam(2) );
	}

	@Test
	public void removeParam_3( ) throws Exception {
		assertEquals( "test3", removeParam(3) );
	}

}