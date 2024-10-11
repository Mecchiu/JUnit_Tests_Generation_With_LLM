// DrinkTest.java
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
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class DrinkTest {

		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is NEW_DRINK_NAME.
		*/
		@Test
		void testSave_returnsNullIfNameIsNewDrinkName() {
				Drink drink = new Drink(null);
				drink.name = Drink.NEW_DRINK_NAME;
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is null.
		*/
		@Test
		void testSave_returnsNullIfNameIsNull() {
				Drink drink = new Drink(null);
				drink.name = null;
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is empty.
		*/
		@Test
		void testSave_returnsNullIfNameIsEmpty() {
				Drink drink = new Drink(null);
				drink.name = "";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a whitespace.
		*/
		@Test
		void testSave_returnsNullIfNameIsWhitespace() {
				Drink drink = new Drink(null);
				drink.name = " ";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a tab.
		*/
		@Test
		void testSave_returnsNullIfNameIsTab() {
				Drink drink = new Drink(null);
				drink.name = "\t";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a new line.
		*/
		@Test
		void testSave_returnsNullIfNameIsNewLine() {
				Drink drink = new Drink(null);
				drink.name = "\n";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a carriage return.
		*/
		@Test
		void testSave_returnsNullIfNameIsCarriageReturn() {
				Drink drink = new Drink(null);
				drink.name = "\r";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a form feed.
		*/
		@Test
		void testSave_returnsNullIfNameIsFormFeed() {
				Drink drink = new Drink(null);
				drink.name = "\f";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a backspace.
		*/
		@Test
		void testSave_returnsNullIfNameIsBackspace() {
				Drink drink = new Drink(null);
				drink.name = "\b";
				assertNull(drink.save());
		}
		
		/**
		* Test case for {@link Drink#save()} method.
		* It tests if the method returns null if the name of the drink is a vertical tab.
		*/
		@Test
		void testSave_returnsNullIfNameIsVerticalTab() {
				Drink drink = new Drink(null);
				drink.name = "\u000B";
				assertNull(drink.save());
		}
}

// Drink.java
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

/**
 * @author Rainer Friesen
 */
public class Drink {

    public File save() {
        if (!NEW_DRINK_NAME.equals(name)) {
            model.getLog().debug("Save drink: " + name);
            // Build JDOM document representing the settings
            Element root = new Element("drink");
            Element minPriceElem = new Element("minPrice");
            minPriceElem.setText(String.valueOf(minPrice));
            root.addContent(minPriceElem);
            Element maxPriceElem = new Element("maxPrice");
            maxPriceElem.setText(String.valueOf(maxPrice));
            root.addContent(maxPriceElem);
            Element startPriceElem = new Element("startPrice");
            startPriceElem.setText(String.valueOf(startPrice));
            root.addContent(startPriceElem);
            Element targetAmountElem = new Element("targetAmount");
            targetAmountElem.setText(String.valueOf(targetAmount));
            root.addContent(targetAmountElem);
            Element deltaAmountElem = new Element("deltaAmount");
            deltaAmountElem.setText(String.valueOf(deltaAmount));
            root.addContent(deltaAmountElem);
            Element maxStepElem = new Element("maxStep");
            maxStepElem.setText(String.valueOf(maxStep));
            root.addContent(maxStepElem);
            Element usedElem = new Element("used");
            usedElem.setText(String.valueOf(used));
            root.addContent(usedElem);
            Element keyElem = new Element("key");
            keyElem.setText(String.valueOf(key));
            root.addContent(keyElem);
            Document settingsDoc = new Document(root);
            // Save JDOM document to file system
            File folder = new File(DRINKS_FOLDER);
            File file = new File(DRINKS_FOLDER + name + ".xml");
            try {
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                model.getLog().debug("File for Drink: " + file.getAbsolutePath());
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                XMLOutputter serializer = new XMLOutputter();
                serializer.output(settingsDoc, fos);
                fos.flush();
                fos.close();
            } catch (Exception e) {
                model.getLog().error(this, e);
            }
            return file;
        }
        return null;
    }
}

// DrinkTest.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.j