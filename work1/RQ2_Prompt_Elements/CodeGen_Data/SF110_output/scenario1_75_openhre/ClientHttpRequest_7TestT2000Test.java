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
Map<String,Object> parameterMap = new HashMap<String,Object>();
		String text = "Hello world";
	@Test
		void post() throws Exception {
        assertEquals(
                new ClientHttpRequest().post("Parameter1", "ParameterValue1", null, "ParameterValue2", "ParameterValue3", null),
                new ClientHttpRequest().post("Parameter1", "ParameterValue1", "ParameterValue2", "ParameterValue3")
            );
    }

        @Test
        void postFile() throws Exception {
            File file =  new File("C:\\test.txt");
            String parameter = "value";

            assertEquals(
                    new ClientHttpRequest().post(parameter, FileUtil.openInputStream(file), null, null, "ParameterValue1", null)
           ,   new ClientHttpRequest().post(parameter, FileUtil.openInputStream(file), null)
            );
        }
		@Test
        void postFileFile() throws Exception {
			File file =  new File("C:\\test.txt");
			String parameter = "value";

			assertEquals(
					new ClientHttpRequest().post(parameter, FileUtil.openInputStream(file), null)
           ,   new ClientHttpRequest().post(parameter, FileUtil.openInputStream(file))
            );
		}
		@Test
        void postFileInputStream() throws Exception {
			InputStream is =  new FileInputStream("C:\\test.txt");
			String parameter = "value";

			assertEquals(
                    new ClientHttpRequest().post(parameter, is)
           ,   new ClientHttpRequest().post(parameter, new InputStream() {
				    @Override
					public int read() throws IOException {
						return 0;
					}
			}), "value")
            );
		}
// ServerHttpRequest.java
        static class ServerHttpRequest extends ClientHttpRequest {
            private static Map<String,Object> requestParameters = new HashMap<>();

            public ServerHttpRequest setParameter(String name, Object value) {
                requestParameters.put(name, value);

                return this;
            }


            @Override
            public String getFormEncodedParameter(String name, String separator) {
                return getRequestParameters().get(name);
            }


            @Override
            public Map<String, Object> getRequestParameters() {
                return requestParameters;
            }
        }

// Class ClientHttpRequest_2Test.java
        static class ClientHttpRequest_2Test extends ClientHttpRequest {
            public ClientHttpRequest_2Test setParameter(String name, Object value) {
                return (ClientHttpRequest_2Test)mv.set(name, value);
            }

            public ClientHttpRequest_2Test getRequestParameters() {
                return (ClientHttpRequest_2Test)mv;
            }
        }

        @Test
        void postMulti() throws Exception {
            Map.Entry<String,Object>[] entries = new HashMap.Entry[4];
            entries[0] = new HashMap.Entry<String, Object>("name1", "value1");
            entries[1] = new HashMap.Entry<String, Object>("name2", "value2");
            entries[2] = new HashMap.Entry<String, Object>("name3", "value3");
            entries[3] = new HashMap.Entry<String, Object>("name4", "value4");

            ClientHttpRequest request = new ClientHttpRequest_2Test();
            Set<String> keys = request.getRequestParameters().keySet();

            for (String key : keys) {
                request.setParameter(key, request.getRequestParameters().get(key));
            }

            assertEquals(
                    new ClientHttpRequest_2Test().getRequestParameters(),
                    new ClientHttpRequest(request).getRequestParameters()
            );
        }
	@Test
	void getFormEncodedParameter() throws Exception {
		URLConnection conn = new URL(ClientHttpRequest.class.getResource("GetFormEncodedParameter.html").toExternalForm());


		clientHttprequest(conn).getFormEncodedParameter("param");
	}


    public abstract  URLConnection clientHttprequest(URLConnection input) throws IOException;
    @Test
	public void formParams() throws Exception {
		ClientHttpRequest instanceOfFormData = new ClientHttpRequest().getRequestParameters();

		Set<String> set = instanceOfFormData.keySet();

		assertAll(set.iterator());
	}

    public static void assertEquals(Object r1, Object r2) throws Exception {
        String s1 = null!= r1? r1.toString() : null;
        String s2 = null!= r2? r2.toString() : null;
        assertNotNull(s1);
        assertNotNull(s2);

        assertEquals(s1,s2);
    }

	public static void assertNull(Object o) throws Exception {
		String s = null!= o? o.toString() : null;
		assertEquals(s, null);
	}



	private static void assertAll(Iterator<Object> it) throws Exception {
        if (it.hasNext()) {
            Object o = it.next();
            if (o == null) {
            	throw new Exception("Exception expected");
            }
        }
        else {
        	throw new Exception("Exception expected");
        }

    }



public static final Random RANDOM = new Random();
public static  int NUM = 10;
public static  ClientHttpRequest clientHttprequest(URL url) throws Exception {
        ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		Map<String, Map<String, String>> request = new HashMap<String, Map<String, String>>();

		clientHttpRequest.setURL(url);

		Map<String,String> map = new HashMap<String,String>();
		try (ClientHttpRequest r = clientHttprequest(url)) {
			r.addParameter("num",String.valueOf(NUM));
			r.readResponse();

			map = r.getParameterMap();

		}
		assertEquals(NUM,  (int)map.get("num"));

		Iterator<Map.Entry<String, Map<String, String>>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Map<String, String>> entry = it.next();
            String name = entry.getKey();
            String value = entry.getValue().get("value");

            String prefix = ""+name+"-"+value+";";