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
		private static final Logger logger = Logger.getLogger(MapWriter.class);
	/**
     * constructor
     */
    public MapReaderTest(){}

	/**
	 * main method
	 */
    @Test
    public void test(){
        mapFilePath = "/MAPS";
        Node mapNode = parseXMLFile(mapFilePath);

        Map map = new Map();
        
        boolean result = createMap(map);
        if(result){
            //System.out.println("map created successfully");
        }
        else{
            String reason = " map creation failed";
            logger.error(reason);
            throw new RuntimeException(reason);
        }

       logger.info("The created map is:" + map);
     }
}// MapReaderTest