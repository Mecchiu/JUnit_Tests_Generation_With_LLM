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
		public static final Logger logger = Logger.getLogger(MapReaderTest.class);
    /**
     * Creates a setter-method for map.
     *
     * @return Map setter method
     */
    public Set<AbstractSetter> createSetterMethod() {
    return new HashSet<>();
    }

    /**
     * Reads values of XML-Node based on XPath expressions
     *
     * @return String value
     */
    public String readXMLValues();

    /**
     * reads value of XML-Node based on XPath expressions
     *
     * @param node  XML-Node
     * @return String value of XML-Node
     */
    public String readXMLValue(Node node);

    /**
     * reads XML-Node based on XPath expressions
     *
     * @param xpath XPath-Expression
     * @return String value of XML-Node if value is not found otherwise error message
     */
    public String readXMLValue(String xpath);

    /**
     * Sets the specific powerups to Map object
     *
     * @param map Map instance
     */
    public void setPowerups(Map map);

    /**
     * sets the type of Map object
     */
    public Map setType();

    /**
     * checks if map is changed
     *
     * @param map Map instance
     */
    public void checkMapValue(Map map);

    /**
     * Sets the specific wall on the border of map set
     *
     * @param map Map instance
     */
    public void autoWall(Map map, String Type);

}