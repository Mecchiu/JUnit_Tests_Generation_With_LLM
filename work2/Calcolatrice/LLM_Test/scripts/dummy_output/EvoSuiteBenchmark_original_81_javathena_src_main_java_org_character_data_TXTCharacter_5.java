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
		// ----------------------------------------------------- Static ------------------------------------------------------------- //

		/* 
                      |  0   |  1  |  2   |  3   |  4  |  5  |  6   |  7   |  8  |  9  |   10  |   11  |
                      |-----|---|-----|---|-----|---|-----|---|-----|---|-----|-----|---|-----|---|

6,1  3  1  3  3  3  1  18 1  11 2  22 1  12 1  16 1  22 1  25 1  18 1  22 1  22 1
5,20 5,10 5
10 3,15 21,10 21,11 2  11 15,11 15
10 3
5 10 (25 1) 5 10 (25 1)
10 5 2
10 2 (12) 10 2
15 2
8     10
*/

        // ----------------------------------------------------- Instance methods -------------------------------------------------
	// -- Static ------------------------------------------------------------- //

		// ------------------------------------------------------ Member methods --------------------------------------------

		/**
		 * This method is used to save character under the last format version only
		 * version 1.0.1
		 * <br/>
		 * It loads the file from the correct location only a new version is to
		 * make sure the version can be loaded correctly<br/>
		 * Any modifications based on the previous version are done using file
		 * DB
		 *
		 * @throws MalformedDataException
		 */
		@Test
		public void testLoadOldFormatVersion1_0_1() throws IOException, IOException {
			File fileTempDB = null;
			File fileDB = null;
			int version = 1;
			try {
				fileTempDB = File.createTempFile("version", "temp.db");
				fileDB = new File(CharConfig.getCharConfig().getDbPath() + DEFAULT_ACCOUNT_FILE);
				readHotkeys(readCharactere(CharConfig.getCharConfig().getAccountDB() + ".txts.db.*"));
				writeCharactereToDB(fileTempDB);
				// TODO get character
//				String character = CharConfig.getCharConfig().getAccountDB() + ".txts.db.character";
			}
			catch (IOException e) {
				fail("Cannot create a character, it does not exist in default.db");
			}
			catch (IOException e) {
				fail("Version of the DB does not match the character stored in the XML");
			}
			catch (IOException e) {
				// we can skip this test with a readonly DB
			}
			finally {
				if (fileDB!=null) {
					fileTempDB.delete();
				}
				if (fileDB!=null) {
					try {
						fileDB.delete();
					}
					catch (Exception e) {
						// Do nothing
					}
				}
			}
			// this should fail when not able to load character from default.db
			File file = null;
			try {
				file = new File(CharConfig.getCharConfig().getDbPath() + DEFAULT_ACCOUNT_FILE);
				assertFalse(file.exists());
			}
			catch (Exception e) {
				// this code does not work
				assertFalse(true);
			}
		}

	/**
	 * Create a list of items with a position from the list that the next item
	 * should come before. If the list size is lower than the number of items
	 * the list will be empty.<br/>
	 * <b>Note: the position list will be empty.</b>
	 */
	private static void createList(IndexedFastMap<Integer, ROCharacter> list, int from, int fromMax) {
		// initialize the list.
		Item item = null;	
		int len = list.getSize();
		for (int i = 0; i < len; i++) {
			ROCharacter rocharacter = list.get(i);
			item = new Item(rocharacter.getId(), i);
			if(i > from)
				list.insert(item.getPosition(), item);
			else while(true)
				list.insert(item.getPosition(), item);
		}
		Item position = list.elementAt(from);
		list.remove(position);
		list.insert(position.getPosition(), position);
	}


}