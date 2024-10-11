// Drink_0Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {
		
    final String testName = "Test" + new Date().getTime();
    final String fileName = "File" + "-" + new Date().getTime() + "-Test" + testName + ".xml";
    
    public int total = 0;

    public int avgAmount = 0;

    public int avgPrice = 0;

    public int avgSoldPrice = 0;

    final private float[] f = {
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    @Test
    public void test0() {
        total = 3;
        recalculate();
        assertTrue(avgAmount == 3.0);
        assertTrue(avgPrice == 100.0);
        assertTrue(avgSoldPrice == 100.0);
        assertTrue(getPrice() == 100.0);
        assertTrue(avgAmount <= f.length);
    }
    
    @Test
    public void test1() {
        total = 3;
        recalculate();
        assertTrue(avgAmount == 1.0);
        assertTrue(avgPrice == 70.0);
        assertTrue(avgSoldPrice == 80.0);
        assertTrue(getPrice() == 75.0);
        assertTrue(avgAmount <= f.length);
    }

    @Test
    public void test2() {
        total = 3;
        recalculate();
        assertTrue(avgAmount == 1.0);
        assertTrue(avgPrice == 130.0);
        assertTrue(avgSoldPrice == 130.0);
        assertTrue(getPrice() == 130.0);
        assertTrue(avgAmount <= f.length);
    }
}