// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains one unit test case for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {
		private final int bufferSize = 1024;

		private final int maxSize = 4096;

		private byte[] msg = null;

    private String res = null;

    private WebClient client = null;

    {
        msg = new byte[bufferSize];
    }

    @Test
    public void test() throws IOException {

        client = new WebClient();
        client.setBufferSize(maxSize);
		client.init(null);

        writer = new PrintWriter(new ByteArrayOutputStream(), true);
		test();
    }

    private void test(String header) throws IOException {

        reset();
            //  Send a GET with non empty response
        client.get(new URI(getURI(header)), new Hashtable<String,String>(), new ArrayList<String>(), new ArrayList<String>());
            //  The result is written in the buffer
   println(": " + header + getBody() + "\n" + "\n" + "\n" + ":");
            //  We want to reset the buffer to the first byte
    reset();

            //  Send a GET with non empty response
    client.get(new URI(getURI("")), new Hashtable<String,String>(), new ArrayList<String>(), new ArrayList<String>());
            //  The result is written in the buffer
  println(": " + header + getBody() + "\n" + "\n" + "\n" + ":");
            //  We want to reset the buffer to the first byte
    reset();

        //  Send a GET with empty response
        String uri = header + getBody();
        byte[] arr1 = uri.getBytes();
        client.get(uri, new Hashtable<String,String>(), new ArrayList<String>(), new ArrayList<String>());
        println("Result: \n" + "\n" + "" + "\n" + "" + "\n" + "" + "\n");
        assertEquals(204, client.getResponseCode());

        assertNull(response.getHeader("ETag"));

/*          
        byte[] arr2 = uri.getBytes();
        if (arr1.length > bufferSize && bufferSize < maxSize) {
            client.get(uri, new Hashtable<String,String>(), new ArrayList<String>(), new ArrayList<String>());
            println("Result: \n" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "");
        }

*/

            //  Reset the buffer to the first byte
        response.resetBuffer();
            //  Write the rest of the message to a new buffer.
    System.arraycopy(arr1, 0, msg, 2, arr1.length-2);
    writer = new PrintWriter(new ByteArrayOutputStream(), true);
    writer.print(arr1);
        writer.flush();

        assertEquals(1024, client.getResponseCode());

            //  Reset the buffer to the first byte
        response.resetBuffer();

            //  Write the rest of the message to a new buffer.
        System.arraycopy(arr1, 0, msg, 2, arr1.length-2);
            //   Reset the buffer to the second byte.
    writer = new PrintWriter(new ByteArrayOutputStream(), true);
    writer.print(arr1);
        writer.flush();

        assertEquals(1024, client.getResponseCode());

            //  Reset the buffer to the first byte

        client.get(new URI(getURI() + "/"), new Hashtable<String,String>(), new ArrayList<String>(), new ArrayList<String>());
            //  The result is written in the buffer
println("Result: \n" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "");
        assertEquals(204, client.getResponseCode());


            //  Reset the buffer to the buffer size
        writer.print(msg);
                writer.flush();
                writer = new PrintWriter(new ByteArrayOutputStream(), true);
    writer.print(msg);
        writer.flush();

                assertEquals(1024, client.getResponseCode());




            //  Reset the buffer to the first byte
        writer = new PrintWriter(new ByteArrayOutputStream(), true);
        writer.print(msg);
        writer.flush();

        assertEquals(1024, client.getResponseCode());

        writer = new PrintWriter(new ByteArrayOutputStream(), true);
        writer.print(msg);
        writer.flush();
        /*
            assertEquals(1024, client.getResponseCode());

            writer = new PrintWriter(new ByteArrayOutputStream(), true);
            ArrayList<String> arr2 = new ArrayList<String>();

            arr2.add(msg);
            writer.print(arr2);
            writer.flush();
            assertEquals(308, client.getResponseCode());
        */


            //  Reset the buffer to the first byte
        writer = new PrintWriter(new ByteArrayOutputStream(), true);
        writer.print(msg);
        writer.flush();

        assertEquals(1024, client.getResponseCode());

        writer = new PrintWriter(new ByteArrayOutputStream(), true);
        writer.print(new String(msg));
        writer.flush();

        assertEquals(1024, client.getResponseCode());

        writer = new PrintWriter(new ByteArrayOutputStream(), true);
        writer.print(new String(new char[6]));
        writer.flush();

        assertEquals(1024, client.getResponseCode());


        if (response.getHeader("Content-Length")!= null && response.getHeader("Content-Length").length() > 0) {
            // Verify the content-length header as well.
            assertEquals(3 * 1024, client.getResponseCode());
        }
                /*
                writer = new PrintWriter(new ByteArrayOutputStream(), true);
                writer.print(new String(msg));
                writer.flush();
                assertEquals(308, client.getResponseCode());
        */

    writer.close();
    System.out.println("Closed");
}
}