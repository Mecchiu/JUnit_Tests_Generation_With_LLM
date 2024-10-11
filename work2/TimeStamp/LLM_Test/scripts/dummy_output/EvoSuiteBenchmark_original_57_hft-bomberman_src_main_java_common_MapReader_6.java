// MapReaderTest.java
package common;

import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.Point;
import javax.xml.xpath.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapReader}.
* It contains one unit test case for the {@link MapReader#getXMLValue(Node, String)} method.
*/
class MapReaderTest {
		
	@Test
	@Logger(value = "unitTest")
	void test001() {
                Map map;
		try {
			String xmlPath =
		        "testproxies/"+"testproxies.xml"
		        ;
			logger.info("TODO: parse xmlFile "+xmlPath+" to XML...");
			map = new MapReader(xmlPath);
		} catch (Exception ex) {
			assertTrue(ex instanceof XmlParseException, ex.getMessage());
		}
	}
}