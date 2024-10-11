// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {

  // Test case 1: Null argument
  @Test(expected = NullPointerException.class)
  public void nullInputSource_1() {
    // Create an instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader(null);
	     builder.createTree("../test/data/sample.doctype");
	     builder.openReader(new FileReader(""));
  }

  // Test case 2: URL to a file
  @Test
  public void urlfileToFile_2() {
    // Open document to read it
	  String filepath;
	  InputStream fp = getClass().getResourceAsStream("/" + "sample.doctype");
	 
    // Create an instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader(new FileReader(filepath));
	  
	   builder.createTree("/input/sample.doctype");
	   builder.openReader(fp);
  }

  // Test case 3: URL to an InputStream
  @Test
  public void uriStreamToInputStream_3() {
    // Open file to read it
	  File file = new File("/input/sample.doctype");
	 
    // Create an instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader(file.toURI().toURL());
	  
	   builder.createTree("/input/sample.doctype");
	   builder.openReader(new FileInputStream(file));
  }

  // Test case 4: URL
  @Test
  public void urldocumentToDocument_4() {
    // Create an instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader("http://www.ib.cantabezote.in/bunnywong/");
	  
  	// Create the Document Element
    DocType doctype = new DocType();
    doctype.setName("html");
    doctype.setPublicId("" + "urn:i1234");
	  
    // Create the HTML Document
    HtmlDocument htmlDocument = new HtmlDocument();
    htmlDocument.getRawContent().add(doctype);
    
  	// Open document to read it
	  InputStream fp = getClass().getResourceAsStream("/" + "sample.doc");
	  
    // Create an instance and null it
    builder = new DefaultTreeBuilder().openReader(new InputStreamReader(fp));
	  builder.openDocument(htmlDocument);
  }


  // Test case 5: URL
  @Test
  public void urldocumentToDocument_5() {
    // Create an instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader("http://www.ib.cantabezote.in/bunnywong/");
	  
  	// Create the Document Element
  	DocType doctype = new DocType();
  	doctype.setPublicId("" + "urn:i1234");
  	doctype.setName("html");
	  
  	// Create the HTML Document
  	HtmlDocument htmlDocument = new HtmlDocument();
  	htmlDocument.getRawContent().add(doctype);
  	
		builder = new DefaultTreeBuilder().openReader(new InputStreamReader(getClass().getResourceAsStream("/" + "sample.doc")));
	  builder.openDocument(htmlDocument);
  }

  // Test case 6: InputSource
  // Create a instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader("http://www.ib.cantabezote.in/bunnywong/");
	
	// Create the HTML Document
  HtmlDocument htmlDocument = new HtmlDocument();
	htmlDocument.getRawContent().add(new DocType("", "", ""));

    InputSource inputSource = new InputSource(new Reader() {
		public InputSource wrap(InputStream in) throws IOException {
			return new InputSource(in);
		}
		public boolean getCharacterStream() {
			return false;
		}
		public Reader getReader() throws IOException {
			return new InputSourceReader(this);
		}
		public String getRawStream() {
			return null;
		}
		public String getSystemId() {
			return null;
		}
		public String getPublicId() {
			return null;
		}
	});
	builder = new DefaultTreeBuilder().openReader(htmlDocument);
	builder.openDocument(inputSource);
	     builder.openDocument(htmlDocument);
	
	// The test is passed
      return
  }

  // Test case 7: URL
  @Test
  public void urldocumentToInputSource_7() {
    // Create an instance and null it
    TreeBuilder builder = new DefaultTreeBuilder().openReader("http://www.ib.cantabezote.in/bunnywong/");
	   builder.openDocument(new Reader() {
	        public Reader wrap(Reader in) throws IOException {
	            return new InputSourceReader(this);
	        }
	        public boolean getCharacterStream() {
	        	return false;
	        }

	        public Reader getReader() throws IOException {
	            return new InputSourceReader(this);
	        }

	        public String getRawStream() {
	        	return null;
	        }
	        public String getSystemId() {
	        	return null;
	        }
	        public String getPublicId() {
	        	return null;
	        }
	    });
	builder.createDocument("/some/otherDocument.doctype");
       builder.createDocument(new InputSource(""));
	System.exit(0);
  }
}

