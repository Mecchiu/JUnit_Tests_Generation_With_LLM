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
* It contains ten unit test cases for the {@link TXTCharacter#load()} method.
*/
class TXTCharacterTest {

		private final static String DEFAULT_ACCOUNT_FILE = "save/athena.txt";
		
		private final static int VERSION_LENGTH = 18;
		
		private final static String DEFAULT_FRIEND_FILE = "save/friends.txt";
		
		private final static String DEFAULT_HOTKEYS_FILE = "save/hotkeys.txt";
		
		private String fileDB = CharConfig.getCharConfig().getDbPath() != null ? CharConfig.getCharConfig().getDbPath() : DEFAULT_ACCOUNT_FILE;
		
		private String friendDB = DEFAULT_FRIEND_FILE;
		
		private String hotkeyDB = DEFAULT_HOTKEYS_FILE;
		
		@Test
		void testLoad() throws IOException {
				IndexedFastMap<Integer, ROCharacter> indexedChar = new IndexedFastMap<Integer, ROCharacter>();
				BufferedReader in = new BufferedReader(new FileReader(new File(fileDB)));
				String line = null;
				while ((line = in.readLine()) != null) {
						try {
								ROCharacter currChar = readCharactere(line);
								indexedChar.put(currChar.getChar_id(), currChar);
						} catch (MalformedDataException e) {
								Functions.showWarning(e.getMessage());
						}
				}
				in.close();
				readFriend(indexedChar);
				readHotkeys(indexedChar);
				assertEquals(indexedChar.getData().size(), 1);
		}
		
		private void readHotkeys(IndexedFastMap<Integer, ROCharacter> indexedChar) throws IOException {
				BufferedReader in = new BufferedReader(new FileReader(new File(hotkeyDB)));
				String line = null;
				String[] splitedHotkeys = null;
				while ((line = in.readLine()) != null) {
						if (!line.startsWith("//")) {
								for (int i = 0; i < splitedHotkeys.length && i < ROCharacter.MAX_HOTKEY; i++) {
										splitedHotkeys = line.split(",");
										indexedChar.getData().get(Integer.parseInt(splitedHotkeys[0])).addHotkey(new Hotkey(Integer.parseInt(splitedHotkeys[1]), Integer.parseInt(splitedHotkeys[2]), Integer.parseInt(splitedHotkeys[3])), i);
								}
						}
				}
		}
		
		private void readFriend(IndexedFastMap<Integer, ROCharacter> indexedChar) throws IOException {
				BufferedReader in = new BufferedReader(new FileReader(new File(friendDB)));
				String line = null;
				String[] splitedFriend = null;
				while ((line = in.readLine()) != null) {
						if (!line.startsWith("//")) {
								splitedFriend = line.split(",");
								for (int i = 0; i < splitedFriend.length && i < ROCharacter.MAX_FRIENDS; i++) {
										indexedChar.getData().get(Integer.parseInt(splitedFriend[0])).addFriend(new Friend(Integer.parseInt(splitedFriend[1]), Integer.parseInt(splitedFriend[2]), splitedFriend[3]), i);
								}
						}
				}
				in.close();
		}
		
		private ROCharacter readCharactere(String line) throws MalformedDataException {
				String[] mainCharSL;
				ROCharacter currChar = new ROCharacter();
				if (!line.startsWith("//") && line.length() != 0) {
						if (line.contains("//")) {
								line = line.substring(0, line.indexOf("//"));
						}
						;
						mainCharSL = line.split("\t");
						if (mainCharSL.length == VERSION_LENGTH) {
								for (int i = 0; i < mainCharSL.length; i++) {
										String[] tmpSplit = null;
										Point tmpPoint = null;
										currChar.setChar_id(Integer.parseInt(mainCharSL[0]));
										tmpSplit = mainCharSL[1].split(",");
										currChar.setAccount_id(Integer.parseInt(tmpSplit[0]));
										currChar.setSlot(Integer.parseInt(tmpSplit[1]));
										currChar.setName(mainCharSL[2]);
										tmpSplit = mainCharSL[3].split(",");
										currChar.setClass_(JOB.parseFromValue(Short.parseShort(tmpSplit[0])));
										currChar.setBase_level(Integer.parseInt(tmpSplit[0]));
										currChar.setJob_level(Integer.parseInt(tmpSplit[0]));
										tmpSplit = mainCharSL[4].split(",");
										currChar.setBase_exp(Integer.parseInt(tmpSplit[0]));
										currChar.setJob_exp(Integer.parseInt(tmpSplit[1]));
										currChar.setZeny(Integer.parseInt(tmpSplit[2]));
										tmpSplit = mainCharSL[5].split(",");
										currChar.setHp(Integer.parseInt(tmpSplit[0]));
										currChar.setMax_hp(Integer.parseInt(tmpSplit[1]));
										currChar.setSp(Integer.parseInt(tmpSplit[2]));
										currChar.setMax_sp(Integer.parseInt(tmpSplit[3]));
										tmpSplit = mainCharSL[6].split(",");
										currChar.setStr(Short.parseShort(tmpSplit[0]));
										currChar.setAgi(Short.parseShort(tmpSplit[1]));
										currChar.setVit(Short.parseShort(tmpSplit[2]));
										currChar.setInt(Short.parseShort(tmpSplit[3]));
										currChar.setDex(Short.parseShort(tmpSplit[4]));
										currChar.setLuk(Short.parseShort(tmpSplit[5]));
										tmpSplit = mainCharSL[7].split(",");
	