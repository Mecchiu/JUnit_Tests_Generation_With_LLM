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