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
		
    private HttpServletResponse response = null;
    private boolean binary = false;
    private PrintWriter pw = null;

    /**
     * @param response the response to write into the buffer.
     * @param binary true if the buffer should be in binary mode.
     * @throws IOException if unable to get a character output stream.
     * @throws IOException if unable to close the stream.
     */
    public HTMLOutputStreamTest(HttpServletResponse response, boolean binary) throws IOException {
    	this.response = response;
        this.binary = binary;
        this.pw = this.getPW();
    }

    /**
     * This method does a reset, if this is true.
     */
    public void testReset() throws IOException {
		this.reset();
		assertNotNull(this.response);
		this.pw = null;
		assertNotNull(this.response.getOutputStream());
        if (this.binary) {
			byte[] buf = new byte[128];
			int n = this.response.getContentLength();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				sb.append((char)this.response.getOutputStream().read());
			}
            this.response.setContentLength(this.response.getContentLength());
            this.response.setCharacterEncoding("UTF-8");
            sb.append("<SCRIPT LANGUAGE='JavaScript'>");
            sb.append("var hm=Object.create(%7B%7B%7D%7D);");
            sb.append("hm.%7E=%7B%7B$%7D%7D,%7B%7B%7D%7D:%7B%7B%7D%7D,%7B%7B%7D%7D:%7B%7B%7D%7D");
            sb.append("var sb=Object.create(%7B%7B%7D%7D);");
            sb.append("sb.%7B%7B%7D%7D:%7B%7B$%7D%7D,%7B%7B%7D%7D:%7B%7B%7D%7D,%7B%7B%7D%7D:%7B%7B%7D%7D");
            sb.append("var lm=Object.create(%7B$%7D%7D)");
            sb.append("lm.%7E=%7B$%7B$%7D%7D,%7B%7B$%7D%7D,%7B%7B$%7D%7D:%7B$%7B$%7D%7D,%7B$%7B$%7D%7D");
            sb.append("var lm=Object.create(%7B$%7B$%7D$)");
            sb.append("%7B%7B%7D"); // end string
            sb.append("var ln=Object.create(%7B%7B$%7D$,%7B$%7D)", this.binary);
            sb.append("ln.%7E=%7B%7B$%7D%7D,%7B%7B$%7D%7D,%7B%7B$%7D%7D,%7B$%7B%7D%7D");
            sb.append("var ln=Object.create(%7B$%7B$%7D$,%7B$%7D)");
            sb.append("%7B$%7B$%7D"); // end string
            sb.append("return sb.%7B%7B$%7D.%7B$%7D", sb);
            sb.append("$%7B$%7D"); // end string
            sb.append("</SCRIPT>");
            pw.print(sb.toString());
            pw.close();
            this.response = null;
        }
        else {
        	pw.print("<SCRIPT LANGUAGE='JavaScript'>\n    var rb=Object.create(%7B%7B%7D%7D);\n");
				StringBuilder sb = new StringBuilder();
        		this.pw = new PrintWriter(sb);
        		pw.print(sb);
        		pw.print("</SCRIPT>\n");
        		pw.close();
        		this.response = null;
        }
    }

}