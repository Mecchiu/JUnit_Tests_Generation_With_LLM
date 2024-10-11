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

	/**
	* Test case 1.
	* Test the {@link TXTCharacter#load()} method with a valid file.
	* The file contains one character.
	* The expected result is a {@link IndexedFastMap} containing one {@link ROCharacter}.
	*/
	@Test
	void testLoad_1() {
		try {
			TXTCharacter txtCharacter = new TXTCharacter();
			txtCharacter.fileDB = "test/test_1.txt";
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtCharacter.load();
			assertEquals(1, indexedChar.size());
			ROCharacter character = indexedChar.get(1);
			assertEquals(1, character.getId());
			assertEquals("test", character.getName());
			assertEquals(JOB.NOVICE, character.getJob());
			assertEquals(0, character.getBaseLevel());
			assertEquals(0, character.getJobLevel());
			assertEquals(0, character.getBaseExp());
			assertEquals(0, character.getJobExp());
			assertEquals(0, character.getZeny());
			assertEquals(0, character.getStr());
			assertEquals(0, character.getAgi());
			assertEquals(0, character.getVit());
			assertEquals(0, character.getInt());
			assertEquals(0, character.getDex());
			assertEquals(0, character.getLuk());
			assertEquals(0, character.getMaxHp());
			assertEquals(0, character.getMaxSp());
			assertEquals(0, character.getHp());
			assertEquals(0, character.getSp());
			assertEquals(0, character.getStatusPoints());
			assertEquals(0, character.getSkillPoints());
			assertEquals(0, character.getOption());
			assertEquals(0, character.getKarma());
			assertEquals(0, character.getManner());
			assertEquals(0, character.getPartyId());
			assertEquals(0, character.getGuildId());
			assertEquals(0, character.getPetId());
			assertEquals(0, character.getHair());
			assertEquals(0, character.getHairColor());
			assertEquals(0, character.getClothesColor());
			assertEquals(0, character.getWeapon());
			assertEquals(0, character.getShield());
			assertEquals(0, character.getHeadBottom());
			assertEquals(0, character.getHeadTop());
			assertEquals(0, character.getHeadMid());
			assertEquals(0, character.getHairStyle());
			assertEquals(0, character.getClothesStyle());
			assertEquals(0, character.getLastMap());
			assertEquals(0, character.getLastPoint().getX());
			assertEquals(0, character.getLastPoint().getY());
			assertEquals(0, character.getSavePoint().getX());
			assertEquals(0, character.getSavePoint().getY());
			assertEquals(0, character.getPartnerId());
			assertEquals(0, character.getOnline());
			assertEquals(0, character.getFather());
			assertEquals(0, character.getMother());
			assertEquals(0, character.getChild());
			assertEquals(0, character.getFame());
			assertEquals(0, character.getRename());
			assertEquals(0, character.getDeleteDate());
			assertEquals(0, character.getMoves());
			assertEquals(0, character.getUnbanTime());
			assertEquals(0, character.getFont());
			assertEquals(0, character.getUniqueId());
			assertEquals(0, character.getHotkey().size());
			assertEquals(0, character.getFriends().size());
			assertEquals(0, character.getMails().size());
			assertEquals(0, character.getInventory().size());
			assertEquals(0, character.getCart().size());
			assertEquals(0, character.getSkills().size());
			assertEquals(0, character.getMails().size());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 2.
	* Test the {@link TXTCharacter#load()} method with a valid file.
	* The file contains two characters.
	* The expected result is a {@link IndexedFastMap} containing two {@link ROCharacter}.
	*/
	@Test
	void testLoad_2() {
		try {
			TXTCharacter txtCharacter = new TXTCharacter();
			txtCharacter.fileDB = "test/test_2.txt";
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtCharacter.load();
			assertEquals(2, indexedChar.size());
			ROCharacter character = indexedChar.get(1);
			assertEquals(1, character.getId());
			assertEquals("test", character.getName());
			assertEquals(JOB.NOVICE, character.getJob());
			assertEquals(0, character.getBaseLevel());
			assertEquals(0, character.getJobLevel());
			assertEquals(0, character.getBaseExp());
			assertEquals(0, character.getJobExp());
			assertEquals(0, character.getZeny());
			assertEquals(0, character.getStr());
			assertEquals(0, character.getAgi());
			assertEquals(0, character.getVit());
			assertEquals(0, character.getInt());
			assertEquals(0, character.getDex());
			assertEquals(0, character.getLuk());
			assertEquals(0, character.getMaxHp());
			assertEquals(0, character.getMaxSp());
			assertEquals(0, character.getHp());
			assertEquals(0, character.getSp());
			assertEquals(0, character.getStatusPoints());
			assertEquals(0, character.getSkillPoints());
			assertEquals(0, character.getOption());
			assertEquals(0, character.getKarma());
			assertEquals(0, character.getManner());
			assertEquals(0, character.getPartyId());
			assertEquals(0, character.getGuildId());
			assertEquals(0, character.getPetId());
			assertEquals(0, character.getHair());
			assertEquals(0, character.getHairColor());
			assertEquals(0, character.getClothesColor());
			assertEquals(0, character.getWeapon());
			assertEquals(0, character.getShield());
			assertEquals(0, character.getHeadBottom());
			assertEquals(0, character.getHeadTop());
			assertEquals(0, character.getHeadMid());
			assertEquals(0, character.getHairStyle());
			assertEquals(0, character.getClothesStyle());
			assertEquals(0, character.getLastMap());
			assertEquals(0, character.getLastPoint().getX());
			assertEquals(0, character.getLastPoint().getY());
			assertEquals(0,