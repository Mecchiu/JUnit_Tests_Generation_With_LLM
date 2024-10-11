// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
static final String html = "<html><body><script></script>\t\n"
                + "<body onload='load_JS(document.body);'>\t\n"
                + "</body></html>";

		/**
		 * Load JS script before running this test.
		 */
		@Test
		public final void testFilterJS() {

                String result = HTMLScriptParser.parseString(html);
                assertNotNull(result);
                System.out.println(result);
                assertTrue(result.contains("(function(){"), result.indexOf("<head>")+1);
        	}

        	/**
		 * Get JS code from given XML document to run this test.
		 */
		@Test
		public final void testFilter() {
        	 	
        	    String result = parseHTML(new File(path).getAbsolutePath());
        	    assertNotNull(result);
        	    System.out.println(result);
        	    assertTrue(result.contains("jQuery/jQuery.min.js"), result);
        	}
		@Test
		public final void testFilterJSArray() {

                String result = parseHTML(new File(pathJSScriptArray).getAbsolutePath());
                assertNotNull(result);
                System.out.println(result);
                assertNotNull(result);
                assertTrue(result.contains("<script></script>"), result);
                assertTrue(result.contains("</script>"), result);
        	}

		/**
		 * Get document.body from html.
		 * @return A string with content of document.body
		 */
		private String parseHTML(String path) {
                Document doc = getXML(path);
                return doc.body.replaceAll("[a-z]+", "");
                //return doc.body.replaceAll("[\\s\\n]+", "").replaceAll("\\s+", "");
	}

        /**
     * Construct XML Document from given path string.
     * @param path The path string where XML document is embedded
     * @return
     */
     static Document getXML(String path) {
        String f = path.split("/")[8];
        String xml = "";

        xml = xml.append("<head><meta name=\"viewport\" content=\"...\" /></head>");
        xml = xml.append("<meta name=\"description\" content=\"...\" >");
        xml = xml.append("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery" + f + ".min.js\" ></script>");
        xml = xml.append("</head><body><p><a href=\"javascript:load_JS('" + f + "')");
        xml = xml.append("\">loadJS('") + f + "')</a></p></body></html>");
        return javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new StringReader(xml));
    }

        static final String path = "/path_to_file/path";
        static final String content = "<html><body onload=\"loadJS('" + path + "')\">\t\n"
                + "</body></html>";
        
}
