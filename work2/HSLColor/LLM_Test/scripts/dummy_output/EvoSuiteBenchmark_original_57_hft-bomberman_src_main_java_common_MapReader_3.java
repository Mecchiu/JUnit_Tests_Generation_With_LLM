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
		public void setMap_File() throws Exception {
			MapReader mapReader = new MapReader(new File(mapFile));


				String string = "" + "    \"File\"" + "\n" + "    \"File:Name of the file with map information\"" + "\n";
				string += "    \"Start points\"" + "\n" + "    \"Start points:X and Y coordinates\"" + "\n" + "    \"area\"" + "\n" + "File : " + mapFilePath + "" + "\n";
				String x = "Start points";
				String y = "Area";
				String area = mapReader.getArea().toString();
}
}