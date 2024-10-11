// ClientHttpRequest_7Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
private final Random r = new Random(System.currentTimeMillis());
		private final ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		private static final String POSTURL = "http://cahchas.mock.cst.com";
		private static final String PASSWORD = "password";
		protected final int N = 100, K = 300;
		private static final int TESTSCOUNT = 20;
		protected void setParameter(String name, Object val) throws IOException {
			Iterator<Map.Entry<String, Object>> it = clientHttpRequest.getParameters().entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, Object> entry = it.next();
				String key = name + "." + entry.getKey();
				if (r.nextInt(100) < val.toString().length()) {
					it.remove();
				}
				assertEquals(val.toString(), clientHttpRequest.getParameter(name, key, (String) null));
			}
			if (r.nextInt(1000) < val.toString().length() || r.nextInt(100) < N) {
				it = clientHttpRequest.getParameters().entrySet().iterator();
				while (it.hasNext()) {
					clientHttpRequest.addParameter(name, val.toString());
					it.remove();
				}
			}
		}
		@Test
		public void test() throws IOException {
			for (int i = 0; i < TESTSCOUNT; i++) {
				if (generateFile(100)) {
					clientHttpRequest.post(POSTURL, "{}", PASSWORD, N, K, true);
				} else {
					clientHttpRequest.post(POSTURL, "{}", PASSWORD, N, K, false);
				}

				if (generateFile(K)) {
					clientHttpRequest.post(POSTURL, "{}", PASSWORD, N, K, "true");
				} else {
					clientHttpRequest.post(POSTURL, "{}", PASSWORD, N, K, "false");
				}
			}

			// get request content
			HttpRequestRequest request = (HttpRequestRequest) clientHttpRequest.getRequest();
			assertTrue(request.getEntityLine() > 0L);

			// content length
			assertEquals(N, request.getEntityDataLength());

			// content type
			assertEquals("UTF-8", request.getEntityContentType());

			// encoding
			assertEquals("charset=" + Charsets.UTF_8.asString(), request.toString());
		}
		private boolean generateFile(final int count) throws IOException {
			Map<File, FileOutputStream> map = new HashMap<File, FileOutputStream>();

			for (int i = 1; i <= count; i++) {
				String tmp = String.valueOf(r.nextInt(100) * 25) +
						String.valueOf(r.nextInt(100) * 25) +
						String.valueOf(r.nextInt(100) * 25);
				if (count % 2 == 0) {
					tmp += "true";
				}
				File tmpDir = new File("tmp/test", tmp);
				map.put(tmpDir, new FileOutputStream(tmpDir));
			}

			for (Iterator<Map.Entry<File, FileOutputStream>> it = map.entrySet().iterator(); it.hasNext(); ) {
				FilePath fp = it.next().getKey();
				byte[] tmp = fp.toContents();
				File tmpDir = new File(fp.toString());
				try {
					fp.writeDirectly(new FileInputStream(tmp));
					fp.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				it.remove();
			}

			return true;
		}
	}
