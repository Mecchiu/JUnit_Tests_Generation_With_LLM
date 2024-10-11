// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {

	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	public void testRead_1() throws Exception {
		try {
			IFXDocumentHandler.read(null, false, null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: empty input stream.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testRead_2() throws Exception {
		try {
			IFXDocumentHandler.read(new InputStream() {
				public int read() throws IOException {
					return -1;
				}
			}, false, null);
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: invalid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testRead_3() throws Exception {
		try {
			IFXDocumentHandler.read(new InputStream() {
				public int read() throws IOException {
					return '<';
				}
			}, false, null);
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_4() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, false, null);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_5() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, true, null);
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_6() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, true, new java.util.HashMap());
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_7() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, true, new java.util.HashMap() {
			{
				put("schema", "http://www.w3.org/2001/XMLSchema");
			}
		});
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_8() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, true, new java.util.HashMap() {
			{
				put("schema", "http://www.w3.org/2001/XMLSchema");
				put("namespace", "http://www.w3.org/2001/XMLSchema");
			}
		});
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_9() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, true, new java.util.HashMap() {
			{
				put("schema", "http://www.w3.org/2001/XMLSchema");
				put("namespace", "http://www.w3.org/2001/XMLSchema");
				put("namespace1", "http://www.w3.org/2001/XMLSchema");
			}
		});
		assertNotNull(doc);
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
	* Test data: valid XML.
	* Expected result: {@link Document}.
	*/
	@Test
	public void testRead_10() throws Exception {
		Document doc = IFXDocumentHandler.read(new InputStream() {
			public int read() throws IOException {
				return '<';
			}
		}, true, new java.util.HashMap() {
			{
				put("schema", "http://www.w3.org/2001/XMLSchema");
				put("namespace", "http://www.w3.org/2001/XMLSchema");
				put("namespace1", "http://www.w3.org/2001/XMLSchema");
				put("namespace2", "http://www.w3.org/2001/XMLSchema");
			}
		});
		assertNotNull(doc);
	}
}

// IFXDocumentHandler_3Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
*/
class IFXDocumentHandler_3Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	public void testWrite_1() throws Exception {
		try {
			IFXDocumentHandler.write(null, 0, null, null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: empty output stream.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_2() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_3() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_4() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_5() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_6() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_7() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_8() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_9() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
	
	/**
	* Test case for {@link IFXDocumentHandler#write(Document, int, String, OutputStream)} method.
	* Test data: valid XML.
	* Expected result: {@link IFXException}.
	*/
	@Test
	public void testWrite_10() throws Exception {
		try {
			IFXDocumentHandler.write(new Document(), 0, null, new OutputStream() {
				public void write(int b) throws IOException {
					// do nothing
				}
			});
			fail("IFXException expected");
		} catch (IFXException e) {
			// OK
		}
	}
}

// IFXDocumentHandler_4Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_4Test {
		
	/**
	* Test case for {@link IFXDocumentHandler#parse(Document)} method.
	* Test data: null.
	* Expected result: {@link NullPointerException}.
	*/
	@Test
	public void testParse_1() throws Exception {