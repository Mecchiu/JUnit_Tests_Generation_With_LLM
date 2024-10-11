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
		
	private String fileDB = CharConfig.getCharConfig().getDbPath()!= null? CharConfig.getCharConfig().getDbPath() : DEFAULT_ACCOUNT_FILE;

	private String fileFriend = DEFAULT_FRIEND_FILE;

	private String fileHotkeyDB = DEFAULT_HOTKEYS_FILE;

	private String accountFile = fileDB + "/" + fileFriend + "/" + fileHotkeyDB;

	@Test
    void testLoad() throws MalformedDataException, IOException {
		
		// Create new character
		
		TXTCharacter character = new TXTCharacter(accountFile, versionString);
		
		character.fileDB = fileDB;
		character.fileFriend = fileFriend;
		character.fileHotkeyDB = fileHotkeyDB;
		
		// Load character
		
		IndexedFastMap<Integer, ROCharacter> indexedChar = character.load();
		
		// Load character with loaded data
		
		assertEquals(versionString, character.fileDB);
		assertEquals(true, indexedChar.containsKey(versionString));
	}
	
	@Test
	void testLoadVersion() {
		
		// Loading character
		
		TXTCharacter characterFile = new TXTCharacter(accountFile, versionString);

		// Loading character with loaded data
		
		assertEquals(false, characterFile.load() instanceof TXTCharacter);
	}
	
	@Test
	void testReadData() throws IOException {
		
		IndexedFastMap<Integer, ROCharacter> indexedChar = load();

		assertEquals(versionString, indexedChar.get(versionString).getVersion());
		assertEquals(true, indexedChar.isEmpty() == false);
	}
	
	@Test
	void testReadFriend() throws IOException {
		
		IndexedFastMap<Integer, ROCharacter> indexedChar = load();

		readFriend(indexedChar);
		
		assertEquals(versionString, indexedChar.get(versionString).getVersion());
		assertEquals(true, indexedChar.isEmpty() == false);
	}
	
	@Test
	void testReadHotkey() throws IOException {
		
		IndexedFastMap<Integer, ROCharacter> indexedChar = load();

		readHotkey(indexedChar);
		
		assertEquals(versionString, indexedChar.get(versionString).getVersion());
		assertEquals(true, indexedChar.isEmpty() == false);
	}
	
	@Test
	void testReadCharactere() {

		ROCharacter character = readCharactere(accountFile);
		assertNotNull(character);
		assertEquals(true, character.getVersion() == versionString);
		assertEquals(false, character.getFriends().isEmpty());
	}
	
	@Test
	void testWriteData() throws IOException {
		
		IndexedFastMap<Integer, ROCharacter> indexedChar = load();

		indexedChar.put(versionString, new TXTCharacter(accountFile, versionString));
		indexedChar.put(versionString + "0", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "0", ROCharacter.FRIEND);

		indexedChar.write(versionString + "/" + fileDB + "/" + fileFriend + "/" + fileHotkeyDB);

		indexedChar = readHotkeyDB();
		
		indexedChar.put(versionString + "0", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "1", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "1", ROCharacter.HOTKEY);
		
		indexedChar = readFriendDB();
		
		indexedChar.put(versionString + "0", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "0", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "0", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "0", ROCharacter.FRIEND);
		indexedChar.put(versionString + "1", ROCharacter.FRIEND);
		indexedChar.put(versionString + "1", ROCharacter.FRIEND);
		
		indexedChar = readTempDB();
		
		indexedChar.put(versionString + "4", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "4", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "4", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "5", ROCharacter.HOTKEY);
		indexedChar.put(versionString + "5", ROCharacter.HOTKEY);
				
}
}