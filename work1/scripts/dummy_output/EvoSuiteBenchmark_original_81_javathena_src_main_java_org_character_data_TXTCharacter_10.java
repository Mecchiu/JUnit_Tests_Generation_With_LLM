// TXTCharacterTest.java
package org.character.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.character.data.config.CharConfig;
import org.javathena.core.data.Friend;
import org.javathena.core.data.Hotkey;
import org.javathena.core.data.IndexedFastMap;
import org.javathena.core.data.Item;
import org.javathena.core.data.PersistenteData;
import org.javathena.core.data.Point;
import org.javathena.core.data.ROCharacter;
import org.javathena.core.data.Skill;
import org.javathena.core.data.ROCharacter.JOB;
import org.javathena.core.utiles.Functions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TXTCharacter}.
* It contains one unit test case for the {@link TXTCharacter#load()} method.
*/
class TXTCharacterTest {
		/**
		 * This unit test case loads saved characters.
		 */
		@Test
		void testLoad() throws IOException {
			TXTCharacter txt = new TXTCharacter();
			BufferedReader br = null;

			try {
				File f = new File(new File(fileDB));
				f.delete();
				f.getParentFile().delete();
			} catch (Exception ex) {
				System.out.println("There was a problem deleting the saved character database: " + ex);
			}

			txt.load(fileDB);

			try (BufferedReader br = new BufferedReader(new FileReader(new File(fileDB)))) {
				String temp;
				int i = 0;

				while ((temp = br.readLine())!= null) {
					if (i++ % VERSION_LENGTH == 0) {
						br.close();
						br = new BufferedReader(new FileReader(new File(fileDB)));
					}
					assertEquals("Incorrect saved character database line number " + i + ". Expected " + i + " but found " + temp, i, Integer.parseInt(temp));
				}
				assertEquals("Incorrect saved character database content. Expected " + (i / VERSION_LENGTH) + " but found " + i, i / VERSION_LENGTH * VERSION_LENGTH * 2, i);
			}
		}


		// TXTRandomNumbersTest.java
		/**
		 * This unit test case has two test cases for the {@link TXTRandomNumbers#load()} method.
		 */
		@Test
		void testLoadRandomNumbers() throws Exception {
			File f = new File(new File(friendDB));
			f.delete();
			f.getParentFile().delete();
			ROCharacter.setDbFileName(friendDB);

			TXTCharacter txt = new TXTCharacter();
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(new File(friendDB)));
			} catch (IOException ex) {
				System.out.println("There was a problem reading the saved character database: " + ex);
			}

			// first line of char database is the line name; the line number is
			// the row of character information
			String lineName = br.readLine();

			assertEquals("The lineName was not loaded correctly.", "Friend ID", lineName);

			// second line contains information about each character
			String lineTemp = br.readLine();

			assertNotNull("The second character info was not loaded correctly.", lineTemp);

			// next line starts with the character id; the line is in a
			// different line of char database
			String lineTemp2 = br.readLine();

			// the character list is loaded correctly (even though I guess if I
			// do not expect it)
			assertNotNull("The character list info was not loaded correctly.", lineTemp2);
			// load the list
			IndexedFastMap<Integer,ROCharacter> indexedDB = txt.load();

			// read the loaded list
			br = new BufferedReader(new FileReader(new File(friendDB)));
			lineTemp = br.readLine();
			int row = Functions.getRowNumber(lineName);

			// the line id is the index of the character info
			String temp = lineTemp;

			assertEquals(
					"In correct position in character info. First line is " + "string: " + lineName + "."
							+ " Second is " + "a line of char database", lineName, temp);
			assertEquals(
					"First line in character list is " + "1", 1, Functions.getLineNumber(lineTemp));

			// now we try different read method which reads the character details
			// and save and reads the list

			// read the character details
			txt = new TXTCharacter();
			br = new BufferedReader(new FileReader(new File(friendDB)));
			lineTemp = br.readLine();
			// readline
			txt.load(lineTemp);
			// save
			txt.save(indexedDB);

			// first line of char database is the line name; the line number is
			// the row of character information
			lineName = br.readLine();

			// next line starts with the character id; the line is in a
			// different line of char database
			lineTemp = br.readLine();

			// the character list is loaded correctly (even though I guess if I
			// do not expect it)
			assertNotNull("The character list info was not loaded correctly.", lineTemp);
			// load the list
			indexedDB = txt.load();

			// read the loaded list
			br = new BufferedReader(new FileReader(new File(friendDB)));
			lineTemp = br.readLine();

			// second line contains information
}
}