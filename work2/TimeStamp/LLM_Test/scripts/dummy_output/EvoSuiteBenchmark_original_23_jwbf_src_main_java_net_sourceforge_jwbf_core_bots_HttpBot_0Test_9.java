// HttpBot_0Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
		public static final String TEXT_M = "Hello world!";
		public static final String[] TEXT_M_ARRAY = new String[]{TEXT_M, "world!"};
		public static final byte[][] STRING_M_ARRAY = new byte[][]{{'a', 'b'},};
		public static final short[] SHORT_M_ARRAY = new short[]{(short) 1, (short) 2};
		public static final long[] LONG_M_ARRAY = new long[]{(long) 1, (long) 2};
		public static final int[] INT_M_ARRAY = new int[]{(int) 1, (int) 2};
		public static final float[] FLOAT_M_ARRAY = new float[]{(float)1, (float)2};

		public static final String[] HTTP_M_ARRAY = new String[]{
			"GET /some/path HTTP/1.1",
			"Host: www.some.net",
			"Accept: text/html;q=0.9, */*;q=0.8;q=.967",
			"Accept-Language: en-US,en;q=0.5,zh-CN;q=0.4,zh;q=0.3",
			"User-Agent: Mozilla/5.0 (Windows NT 6.3; rv:47.0) Gecko/20100101 Firefox/47.0\\b", 
			"Accept-Encoding: gzip, deflate",
			"Accept-Charset: utf-8,utf-16;q=0.5",
			"Content-Type: text/html;charset=utf-8",
			"Content-Length: 56654",
			"",
			"0.0.1.0.1 - - [WIP]",
			"0.0.1.0.2 - - [NONCLIENT]",
			"0.0.1.0.3 - - [PRIVATE REQUEST]",
			"0.0.1.0.4 - - [PRIVATE RESPONSE]",
			"0.0.1.0.5 - - [CLIENT]",
			"0.0.1.0.6 - - [REQ]",
			"0.0.1.0.7 - - [RESP]",
			"0.0.1.0.8 - - [PROTO]",
			"0.0.1.0.9 - - [NO ENCRYPTION]",
			"0.0.1.0.10 - - [NO EXTENSIONS]",
			"0.0.1.0.11 - - [NO PROTOTYPE]",
			"0.0.1.0.12 - - [NO PROTOCOL]",
			"0.0.1.0.13 - - [NO AUTHUTH]",
				""};

		public static final byte[] UTF_8_M_ARRAY = "Hello world!".getBytes(UTF_8);
		public static final byte[] UTF_16_M_ARRAY = "Hello world!".getBytes(UTF_16);
	
}