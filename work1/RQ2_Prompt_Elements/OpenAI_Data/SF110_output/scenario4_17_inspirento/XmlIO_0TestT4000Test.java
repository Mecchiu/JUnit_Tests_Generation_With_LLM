// XmlIO_0Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_0Test {

	/**
	* Test case 1 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is null and expects a NullPointerException.
	*/
	@Test
	void testLoad_0() {
		XmlIO fixture = new XmlIO();
		InputStream input = null;
		
		try {
			fixture.load(input);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// success
		}
	}
	
	/**
	* Test case 2 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is empty and expects a SAXException.
	*/
	@Test
	void testLoad_1() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return -1;
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 3 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_2() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return 'a';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 4 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_3() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 5 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_4() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 6 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_5() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 7 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_6() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 8 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_7() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 9 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_8() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 10 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_9() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
}

// XmlIO_1Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_1Test {
		
	/**
	* Test case 1 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is null and expects a NullPointerException.
	*/
	@Test
	void testLoad_0() {
		XmlIO fixture = new XmlIO();
		InputStream input = null;
		
		try {
			fixture.load(input);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// success
		}
	}
	
	/**
	* Test case 2 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is empty and expects a SAXException.
	*/
	@Test
	void testLoad_1() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return -1;
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 3 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_2() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return 'a';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 4 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_3() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 5 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_4() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 6 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_5() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 7 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_6() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 8 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_7() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 9 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_8() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
	
	/**
	* Test case 10 for {@link XmlIO#load(InputStream)} method.
	* It tests the case that the input stream is not empty and expects a SAXException.
	*/
	@Test
	void testLoad_9() {
		XmlIO fixture = new XmlIO();
		InputStream input = new InputStream() {
			@Override
			public int read() throws IOException {
				return '<';
			}
		};
		
		try {
			fixture.load(input);
			fail("SAXException expected");
		} catch (SAXException e) {
			// success
		}
	}
}

// XmlIO_2Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax