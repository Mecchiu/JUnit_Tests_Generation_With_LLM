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
	 * Test case 1:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid character file.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoadValidCharacter() throws IOException {
		
		// Create a new instance of TXTCharacter
		TXTCharacter txtCharacter = new TXTCharacter();
		
		// Create a new instance of IndexedFastMap
		IndexedFastMap<Integer, ROCharacter> indexedChar = new IndexedFastMap<Integer, ROCharacter>();
		
		// Create a new instance of ROCharacter
		ROCharacter character = new ROCharacter();
		
		// Create a new instance of File
		File file = new File("test/org/character/data/test_character.txt");
		
		// Create a new instance of BufferedReader
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		// Create a new instance of String
		String line = br.readLine();
		
		// Create a new instance of String[]
		String[] split = line.split("\t");
		
		// Set the character's account id
		character.account_id = Integer.parseInt(split[0]);
		
		// Set the character's char id
		character.char_id = Integer.parseInt(split[1]);
		
		// Set the character's name
		character.name = split[2];
		
		// Set the character's class
		character.clazz = JOB.valueOf(split[3]);
		
		// Set the character's base level
		character.base_level = Integer.parseInt(split[4]);
		
		// Set the character's job level
		character.job_level = Integer.parseInt(split[5]);
		
		// Set the character's base experience
		character.base_exp = Integer.parseInt(split[6]);
		
		// Set the character's job experience
		character.job_exp = Integer.parseInt(split[7]);
		
		// Set the character's zeny
		character.zeny = Integer.parseInt(split[8]);
		
		// Set the character's str
		character.str = Integer.parseInt(split[9]);
		
		// Set the character's agi
		character.agi = Integer.parseInt(split[10]);
		
		// Set the character's vit
		character.vit = Integer.parseInt(split[11]);
		
		// Set the character's int
		character.int_ = Integer.parseInt(split[12]);
		
		// Set the character's dex
		character.dex = Integer.parseInt(split[13]);
		
		// Set the character's luk
		character.luk = Integer.parseInt(split[14]);
		
		// Set the character's max hp
		character.max_hp = Integer.parseInt(split[15]);
		
		// Set the character's hp
		character.hp = Integer.parseInt(split[16]);
		
		// Set the character's max sp
		character.max_sp = Integer.parseInt(split[17]);
		
		// Set the character's sp
		character.sp = Integer.parseInt(split[18]);
		
		// Set the character's status point
		character.status_point = Integer.parseInt(split[19]);
		
		// Set the character's skill point
		character.skill_point = Integer.parseInt(split[20]);
		
		// Set the character's option
		character.option = Integer.parseInt(split[21]);
		
		// Set the character's karma
		character.karma = Integer.parseInt(split[22]);
		
		// Set the character's manner
		character.manner = Integer.parseInt(split[23]);
		
		// Set the character's hair
		character.hair = Integer.parseInt(split[24]);
		
		// Set the character's hair color
		character.hair_color = Integer.parseInt(split[25]);
		
		// Set the character's clothes color
		character.clothes_color = Integer.parseInt(split[26]);
		
		// Set the character's weapon
		character.weapon = Integer.parseInt(split[27]);
		
		// Set the character's shield
		character.shield = Integer.parseInt(split[28]);
		
		// Set the character's head bottom
		character.head_bottom = Integer.parseInt(split[29]);
		
		// Set the character's head top
		character.head_top = Integer.parseInt(split[30]);
		
		// Set the character's head mid
		character.head_mid = Integer.parseInt(split[31]);
		
		// Set the character's hair style
		character.hair_style = Integer.parseInt(split[32]);
		
		// Set the character's guild id
		character.guild_id = Integer.parseInt(split[33]);
		
		// Set the character's guild emblem id
		character.guild_emblem_id = Integer.parseInt(split[34]);
		
		// Set the character's fame
		character.fame = Integer.parseInt(split[35]);
		
		// Set the character's save point
		character.save_point = new Point(Integer.parseInt(split[36]), Integer.parseInt(split[37]));
		
		// Set the character's save map
		character.save_map = Integer.parseInt(split[38]);
		
		// Set the character's base job
		character.base_job = JOB.valueOf(split[39]);
		
		// Set the character's kill count
		character.kill_count = Integer.parseInt(split[40]);
		
		// Set the character's death count
		character.death_count = Integer.parseInt(split[41]);
		
		// Set the character's title id
		character.title_id = Integer.parseInt(split[42]);
		
		// Set the character's last map
		character.last_map = Integer.parseInt(split[43]);
		
		// Set the character's last point
		character.last_point = new Point(Integer.parseInt(split[44]), Integer.parseInt(split[45]));
		
		// Set the character's partner id
		character.partner_id = Integer.parseInt(split[46]);
		
		// Set the character's online
		character.online = Integer.parseInt(split[47]);
		
		// Set the character's father
		character.father = Integer.parseInt(split[48]);
		
		// Set the character's mother
		character.mother = Integer.parseInt(split[49]);
		
		// Set the character's child
		character.child = Integer.parseInt(split[50]);
		
		// Set the character's homunculus id
		character.homunculus_id = Integer.parseInt(split[51]);
		
		// Set the character's elemental id
		character.elemental_id = Integer.parseInt(split[52]);
		
		// Set the character's hotkey bar
		character.hotkey = new Hotkey[CharConfig.HOTKEY_MAX];
		
		// Create a new instance of String[]
		String[] hotkey = split[53].split(" ");
		
		// For each hotkey
		for (int i = 0; i < hotkey.length; i++) {
			
			// Create a new instance of String[]
			String[] hotkey_split = hotkey[i].split(":");
			
			// Create a new instance of Hotkey
