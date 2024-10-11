// ClientHttpRequest_8Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {
		@Test
		void test() throws Exception {
			RequestParams params = new RequestParams();
			params.put("name1", "value1");
			params.put("name2", "test");
			int i = 0;
			while (true) {
				String nameValue = "key" + ++i;
				params.put("name" + i, nameValue);
				Object value;
				if (i == 4)
					value = new StringBuilder(
							"aaaaaaaaaaaaaadf").append(
									new Random(i).nextInt(1000000) / 1000000
															.toString().substring(1));
				else
					value = new Integer(i).toString();
				params.put("value"	+ i, value);
				String keyValue = "key" + i;
				String key;
				param(keyValue + ".key" + i, keyValue + ".key" + i);
				Iterator<Map.Entry<String,?>> it = params.entryIterator("param");
				while (it.hasNext()) {
					Map.Entry ttt = it.next();
					Object t = ttt.getValue();
					Object value = ((Map) t).get(key);
					assertTrue(String.format("key(%d)", key.length()), key.equals(keyValue) && t.equals(value));
				}
				it.next();
			}
		}
		private void param(String keyValue, String key) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("key" + key.length(), keyValue);
			Object value;
			param(params, "");
			params.clear();
		}
		@SuppressWarnings("rawtypes")
		private void param(Object params, String indent) {
			Object a = new Random(0).nextLong();
			Object b = new Random(2).nextLong();
			Object c = new Random(0).nextInt();
			params.put("a", a);
			params.put("b", b);
			params.put("c", c);
		}
}
class RequestParams {
		public Map<String, Object> get() {
			return new HashMap<String, Object>();
		}
}

/**
 * It's a dummy test class for the Class class for the {@link ClientHttpRequest} class.
 * It extends it to allow to do unit test with a file.
 */
class ClassWithFile extends Class {
    public Object newInstance(ClassLoader classLoader, URL url) throws Exception {
        InputStream in = null;
        FileInputStream fis = null;
        try {
            URLConnection urlCon = url.openConnection();
            if (urlCon instanceof HttpURLConnection)
                fis = ((HttpURLConnection) urlCon).getParseStream();
            else if (urlCon instanceof URLConnection)
                in = ((URLConnection) urlCon).getInputStream();
        } finally {
            if (fis!= null)
                fis.close();
            if (in!= null)
                in.close();
        }
        InputStream f = new BufferedInputStream(fis);
        return new DataConnection(f);
    }
}

interface DataConnectionWithInputStream extends DataConnection {
    @Override
    InputStream getInputStream() throws IOException;
}

/**
 * It's a dummy test class for the {@link ClientHttpRequest} class.
 * It extends it to allow to do unit test with a file.
 */
class ClassWithFileWithInputStream extends ClassWithFile {
    InputStream getInputStream() throws IOException {
        InputStream in;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
            in = new BufferedInputStream(fis);
        } catch (Exception e) {
            e.printStackTrace();
            in = fis;
        }
        return in;
    }
}
/**
 * it's a dummy test class for the {@link ClientHttpRequest} class.
 * It extends it to allow to do unit test with file.
 */
class ClassWithFileWithFile extends ClassWithFile {
    File getFile() throws IOException;
}