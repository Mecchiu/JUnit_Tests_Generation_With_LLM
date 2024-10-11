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
		// ************************************************
		// ************ DEFINES
		// ************************************************

		// ************************************************
		// ************ CONSTANTS
		// ************************************************

		// ************************************************
		// ************ CONSTRUCTORS
		// ************************************************

		// ************************************************
		// ************ PUBLIC METHODS
		// ************************************************

		// ************************************************
		// ************ PRIVATE METHODS
		// ************************************************

		@Test
		public void testCreateChar() {
			// ************************************************
			//   ************** PRIVATE FIELDS
			// ************************************************
			// ************************************************
			// ************************************************

			byte[] chaine2 = new byte[(int) Math.floor((float) 2.5 / VERSION_LENGTH) * VERSION_LENGTH];
			byte[] chaine2a = chaine2;

			int indexChar = 1;

			for (int index2 = 0; index2 < VERSION_LENGTH; index2++) {
				char ch = ('0' + index2) < '9'? (index++ < 'a'? 'A' : 'B') : (index2 == '7'? 'Z' : 'a');
				chaine2a[index2] = ch;
				index++;
				chaine2[index2] = ch;
			}

			TXTCharacter character = new TXTCharacter();
			character.fileDB = CharConfig.getCharConfig().getDbPath()!= null? CharConfig.getCharConfig().getDbPath() : DEFAULT_ACCOUNT_FILE;
			character.friendDB = DEFAULT_FRIEND_FILE;
			character.hotkeyDB = DEFAULT_HOTKEYS_FILE;

			// ************************************************
			// ********** TEST CASES //
			// ************************************************

			ROCharacter roCaracter0 = character.createChar();

			ROCharacter roCaracter1 = character.load();

			assertEquals("Character " + indexChar + " loaded character", roCaracter0, roCaracter1);

			IndexedFastMap<Integer, ROCharacter> indexedChar2 = character.load();
			for (int index = 0; index < VERSION_LENGTH; index++) {
				indexedChar2.put(index, roCaracter1.getCharacter(index));
			}
		}

		@Test
		public void testReadCharactere() throws MalformedDataException {
			// ************************************************
			//   ********** TEST CASES //
			// ************************************************

			ROCharacter roCaracter0 = readCharactere("/Character " + 0);
			ROCharacter roCaracter5 = readCharactere("/Character " + 1);
			ROCharacter roCaracter6 = readCharactere("/Character " + 2);
			ROCharacter roCaracter7 = readCharactere("/Character " + 3);
			ROCharacter roCaracter8 = readCharactere("/Character " + 4);

			// ************************************************
			// ********** TEST CASES //
			// ************************************************
			StringBuilder chaine3 = new StringBuilder();
			getCharFor(roCaracter0, chaine3, 0);
			getCharFor(roCaracter5, chaine3, 0);
			getCharFor(roCaracter6, chaine3, 0);
			getCharFor(roCaracter7, chaine3, 0);
			getCharFor(roCaracter8, chaine3, 0);

			assertEquals("Character " + 0 + " loaded character", roCaracter0, find(chaine3, roCaracter0));
			assertEquals("Character " + 1 + " loaded character", roCaracter5, find(chaine3, roCaracter1));
			assertNull("Character " + 2 + " loaded character", find(chaine3, roCaracter2));
			assertNull("Character " + 3 + " loaded character", find(chaine3, roCaracter3));
			assertNull("Character " + 4 + " loaded character", find(chaine3, roCaracter4));
		}

		private StringBuilder getCharFor(ROCharacter roCharacter, StringBuilder chaine3, int character) {
			ROCharacter.JOB role = (roCharacter.isFemale() || roCharacter.isRomance()? JOB.FEMALE : JOB.ROMANCE);

			chaine3.append("Character of role ").append(role.toString());
			ROCharacter.HANDHAND hands = (ROCharacter.HANDHAND) roCharacter.getHand();
			chaine3.append(" of type ").append(hands == null? "undefined" : Hands.class.getName());
			chaine3.append(" of role ").append(role.toString());
			chaine3.append(" with index ").append(character);
			if (!roCharacter.isActive()) {
				chaine3.append(" inactive");
			}
			chaine3.append(" in game mode");
}
}