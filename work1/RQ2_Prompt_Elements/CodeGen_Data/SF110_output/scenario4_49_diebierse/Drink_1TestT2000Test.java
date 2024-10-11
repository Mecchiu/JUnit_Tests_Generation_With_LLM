// Drink_1Test.java
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
* It contains one unit test case for the {@link Drink#save()} method.
*/
class Drink_1Test {
/**
		* The unit test for saving a {@link Drink}
		*
		*/
    @Test
    public void testSave() {
        new Drink(_NEW_DRINK_NAME, Model.MODEL_SIZE, Model.MODEL_FOLDER, Model.CONFIG_FOLDER);
    }
    @Test
    public void testLoad() {
        String file = Drink.getDataString();
        new Drink(file,Model.MODEL_SIZE,Model.MODEL_FOLDER, Model.CONFIG_FOLDER);
    }
	public static void main(String[] args) {
        //To use this command:
        //java Drink_1Test
	}
}


