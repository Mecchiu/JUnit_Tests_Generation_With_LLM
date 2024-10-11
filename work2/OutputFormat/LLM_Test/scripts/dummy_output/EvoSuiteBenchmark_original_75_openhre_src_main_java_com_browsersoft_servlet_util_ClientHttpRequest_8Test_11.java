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
		
        ClientHttpRequest test;
        @Test
    public void testPost() {
                test = new ClientHttpRequest()
               .set("file", new File("src/com/browsersoft/servlet/Test.html"))
               .setParameter("name", "tomato")
               .setParameter("value", "spam")
               .setParameter("name1", "tom")
               .setParameter("value1", "apple")
               .update();
                
                assertTrue(test.isValid());
                assertEquals(new String(test.getContent().getBytes()), "POST  http://example.com/upload/post2.xml {\"file\":\"src/com/browsersoft/servlet/Test.html\", \"name\": \"tomato\", \"value\": \"spam\", \"name1\": \"tom\"}");
        }

};