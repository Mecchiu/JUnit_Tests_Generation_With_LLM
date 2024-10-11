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

    @Test
    public void test() {
    	
    	HTMLOutputStream.print("Hello, world!");
    	
    	try {
    		response.addHeader("text/html", "Hello, Ola");
    		byte b[] = new byte[10];
    		FileOutputStream out = new FileOutputStream("HTMLOutputStreamTest") {
    			public int write(int b) {
    				return super.write(b);
    			}
    		};
    		out.write(b);
    		out.flush();
    	} catch (IOException e) {
    		assertEquals(e.getMessage(), "Unable to write to stream.");
    	}
    	
    	assertEquals("Hello, Ola", response.getMessage());


    }

    void println(String str) {
    	String s1 = str;
		try {
			response.addHeader("text/html", "<li>"+s1+"</li>");
			response.addHeader("text/html", "<a href=\"/\">http://www.google.com</a>");
			response.addHeader("text/html", "<img src=\"/public/images/logo.png\" alt=\"Log\"/><a href=\"/\">http://www.google.com</a>");
			response.addHeader("text/html", "<a href=\"http://google.com\">http://www.google.com</a>");
			response.addHeader("text/html", "<body>"+str+"</body>");
	
			response.addHeader("Content-Length",
									String.valueOf(response.getContentLength()));
			response.addHeader("Content-Type",
									response.getContentType());
	
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream out = new PrintStream("HTMLOutputStreamTest.out", "UTF-8");
			response.setContentType("text/html");
			baos = baos;
			out.print(response);
			out.flush();
			
			if (response.getContentType().endsWith("; charset=UTF-8")) {
				Document doc = response.getDocument();
				NodeList nodeList = doc.getChildNodes();
				int length = nodeList.getLength();
				for (int i = 0; i < length; i++) {
					Node child = nodeList.item(i);
					if (child.getNodeType()!= Node.ELEMENT_NODE) {
						continue;
					}
					String content = child.getNodeValue();
					byte [] bytes = toByteArray(content);
					out = new PrintStream("HTMLOutputStreamTest.out", "UTF-8");
					baos = baos;
					out.print(doc.asXML());
					out.flush();
					
					if (content.indexOf("<")!= 0) {
						continue;
					}
					
					int startPos = content.indexOf("</") + 1;
					int endPos = content.indexOf("<a ");
					if (endPos == -1) {
						continue;
					}
					String headStart = content.substring(0, startPos);
					String headContent = content.substring(startPos, endPos);

					headContent = headStart + content + headContent;
					
					content = HeadLine.insertAt(content, startPos);
					
					byte [] contentBytes = toByteArray(headContent);
					out = new PrintStream("HTMLOutputStreamTest.out", "UTF-8");
					baos = baos;
					out.print(headStart + headContent);
					out.print(headContent);
					out.print(content);
					out.print(headContent);
					out.flush();
					
					if (headContent.indexOf("</" + content.substring(startPos) + "/>")!= -1) {
						if (content.indexOf("</</content>")!= -1) {
							content += "<\n>\n</\n>";
						}
					} else {
						if (content.indexOf("</</content>")!= -1) {
							content += "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n";
						} else {
							content += content + "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n"
									+ "<\n";
						}
					}					
					baos = baos;
					out.print(content);
					
					Document.removeChild(doc, child);
		    
			} else {
				response.addHeader("content-length",
									String.valueOf(response.getContentLength()));
				response.setContentType("text/html; charset=UTF-8");
				response.setContentType("text/html");
				outputToBuffer(response, baos);
			}
			}
/////////////////////////////////////////////////////////////////////////////////////////
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /**
     * @param response the {@link HttpServletResponse} to be added to
     * @param baos the {@link ByteArrayOutputStream}
     * @throws IOException cannot be thrown
     */
    private void outputToBuffer(HttpServletResponse response, ByteArrayOutputStream baos) throws IOException {
    	int contentLength = response.getContentLength();
    	int pos = 0;
    	int newpos = 0;
        response.setContentType("text/html");
    	while (pos < contentLength) {
    		response.setContentLength(pos + 524);
    		pos = response.getContentLength();
    		pos += 524;
    	}
		response.setContentLength("524"); // should use max length
		pos = response.getContentLength();
		String content = baos.toString();
		content = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n"
				+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
				+ "<head>\n"
				+ "<meta http-equiv=\"Content-Language\" content=\"en-us\" />\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "  <p>This is the contents of the HTML document.</p>\n"
				+ "  <p>\n"
				+ "    <ul>\n"
				+ "      <li