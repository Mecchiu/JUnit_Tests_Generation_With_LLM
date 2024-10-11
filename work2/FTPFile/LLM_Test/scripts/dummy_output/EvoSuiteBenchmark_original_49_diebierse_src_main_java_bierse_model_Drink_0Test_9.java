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
		
    /**
     * Constructor for Drink_0Test
     * @param args
     */
    public Drink_0Test() {
    }

    /**
     * Calculates the new price for the drink.
     * <p/>
     * @throws Exception
     */
    @Test
    public void recalculate() throws Exception{
        String xmlData = "";
        Document doc = new Document();
        XMLOutputter outputter = new XMLOutputter();
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc1 = null;
        Document doc2 = null;
        try {
            File file = new File("Drinks/Drink.xml");
            if (!file.exists())
            {
                    doc1 = saxBuilder.createDocument();
            }else{
                doc1 = saxBuilder.build(file);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        try {
                file = new File(Drink_0.drinkDirectory, Drink.NEW_DRINK_NAME);
            } catch (Exception e) {
                System.out.println(e);
            }
        try {
                file = new File(Drink_0.drinkDirectory, Drink.NEW_DRINK_NAME);
            }catch (Exception e) {
                System.out.println(e);
            }
            if (!file.exists())
            {
                    file = new File(Drink_0.drinkDirectory, Drink.NEW_DRINK_NAME);
            }else{
                doc2 = saxBuilder.build(file);
            }
}
}