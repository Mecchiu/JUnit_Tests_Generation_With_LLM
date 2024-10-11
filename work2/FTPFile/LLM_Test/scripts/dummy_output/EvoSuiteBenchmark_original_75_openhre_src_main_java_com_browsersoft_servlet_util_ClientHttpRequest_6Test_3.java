// ClientHttpRequest_6Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
		
	/**
     * Test method for {@link com.browsersoft.servlet.util.ClientHttpRequest#post(String, Object, String, Object)}.
     */
    @Test
    public void testPost(){
        ClientHttpRequest request;
        String name1 = "Test Name 1";
        String value1 = "Test Value 1";
        ClientHttpRequest.setParameter(name1, value1);
        String name2 = "Test Name 2";
        String value2 = "Test Value 2";
        try(ClientHttpRequest request= new ClientHttpRequest(name1, value1)){
            assertEquals(HttpContext.DEFAULT_SESSION_ID, request.getSessionIdParameter());
            assertEquals(name1, request.getNameParameter());
            assertEquals(value1, request.getValueParameter());
            assertEquals(ClientHttpRequest.CLIENT_VERSION_1, request.getClientVersionParameter());
            assertEquals(HttpRequestMethod.POST, request.getMethodParameter());
            request.setSessionIdParameter(ClientHttpRequest.DEFAULT_SESSION_ID+"-2");
            assertEquals(1, request.getSessionIdParameter()!=ClientHttpRequest.DEFAULT_SESSION_ID, "Session Id can be set");
            assertEquals(ClientHttpRequest.DEFAULT_SESSION_ID+"-2", request.getSessionIdParameter(), "Session Id not set");
            try{
                request.post(name1, value2, ClientHttpRequest.DEFAULT_SESSION_ID+"-2");
                fail("Method execution success");
            }
            catch (HttpClientErrorException | ClientHttpRequestException e) {
            }
            request.post(ClientHttpRequest.DEFAULT_SESSION_ID+"-1", 3L, ClientHttpRequest.CLIENT_VERSION_1);
            tryAll(() -> request.post(ClientHttpRequest.DEFAULT_SESSION_ID+"-1", 3L, ClientHttpRequest.CLIENT_VERSION_1),
                    () -> request.post(ClientHttpRequest.DEFAULT_SESSION_ID+"-2", 3L, ClientHttpRequest.CLIENT_VERSION_1),
                    () -> request.post(ClientHttpRequest.DEFAULT_SESSION_ID+"-3", 3L, ClientHttpRequest.CLIENT_VERSION_1));
        }
    }
    
    boolean check(Map<String, Object> params, Map<String, Object> session);
    private static void assertEquals(String name, Object value, String nameKey, String valueKey,
            Map<String, Object> session) {
        Object object = parameters(parameters(), session);
        Object expected = getParameter(valueKey, session);
        assertEquals(expected, object, nameKey + " for "+valueKey + name);
    }

    @Test
    public void testRandomParam(){
        // set the parameter of random, which will be sent between these tests..
        ClientHttpRequest request = new ClientHttpRequest(null, new Random());
        request.setSessionIdParameter(ClientHttpRequest.DEFAULT_SESSION_ID+"-1");
        request.getSessionIdParameter(); // should return a parameter value
    }

    private Map<String, Object> parameters(Map<String, Object> session, Map<String, Object> headers){
        return (headers!= null)?Headers.convert(session, headers) : Headers.convert(session);
    }

    private Map<String, Object> getParameters(Object sessionParam) {
        if(session!= null)
            return (Headers.convert(session, clientConnectionHeader())) ;
        return Maps.convert(clientConnectionHeader(), null);
    }

    private Map<String, Object> testHeaders(Map<String, Object> headers, Map<String, Object> session) {
        return headReceiver(headers, session, request -> {
            try (OutputStream os = request.post()) {
                headers.forEach((key, value) -> os.write(value.toJSON().toString().getBytes()));
            }
            return true;
        });
    }

    private Map<String, Object> testRequestHeaders(Map<String, Object> headers,
            Map<String, Object> session) {
        return headers == null?
                testHeaders(headers, session) :
                testHeaders(headers, session)
                   .toMap()
                   .remove("Content-Type")
                   .remove("Transfer-Encoding")
                   .toMap();
    }

    private Map<String, Object> testRequestHeaders(
            Map<String, Object> headers,
            ClientHttpRequest request,
            Map<String, Object> session
            ) {
        return testRequestHeaders(
                testRequestHeaders(headers, session),
                request,
                session
                );
    }

    private Map<String, Object> headReceiver(Map<String, Object> headers,
            Map<String, Object> session, Function<ClientHttpRequest, ClientHttpRequest> receiver){
        return (headers!= null? testHeaders(headers, session)
                : Headers.convert(session, clientConnectionHeader()))
               .map(receiver::apply);
    }

    private InputStream post(String name1, Object value1, String name2, Object value2)
            throws IOException {
        try (URLConnection connection = new URL("https://www.browsersoft.com/")
               .setProtocol("https")
               .setPort(443)) {
            connection.setRequestEntity(new ByteArrayEntity(("POST https://www.browsersoft.com/ ").getBytes()));
            return connection.openStream();
        }
    }

    private File putRequest(String name, String value, String fileUrl, ClientHttpRequest request, InputStream source,
            File putFile, boolean uploadFile, FileOutputStream sink){
        return putRequest(
                name,
                value,
                fileUrl,
                request,
                source,
                new File("src/test/src/java/com/browsersoft/servlet/util/ClientHttpRequest_6Test.java"),
                sink,
                File.createTempFile("s", ".tmp"),
                uploadFile);
    }

    private File putRequest(String name, String value, String fileUrl, ClientHttpRequest request, InputStream source,
            File target, File tempFile, boolean uploadFile, FileOutputStream sink) {

}
}