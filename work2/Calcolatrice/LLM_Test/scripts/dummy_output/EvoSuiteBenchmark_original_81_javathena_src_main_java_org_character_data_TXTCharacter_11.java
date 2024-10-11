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
     * This method tests the loaded data correctly. Checks that the correct number of entries
     * was loaded, the correct format for the entry is correctly encoded and the actual data
     * is correctly loaded.
     */
	 @Test
	 public void testLoadAndDecodeEntries() throws IOException {
	     try {
	         ROCharacter chr = readCharactere("0123456456789ABCEDDD");
	         assertEquals("0123456456789ABCEDDD",
	                 Functions.decode(chr.getHotkey(), Functions.encodeVersion(VERSION_LENGTH)));
	     } catch (IOException ioe) {
	        throw ioe;
	     } catch (IOException ioe) {
	         throw ioe;
	     } catch (Throwable e) {
	        throw new RuntimeException(e);
	     }
	 }
	 
	 @Test
	 public void testSaveAndLoad() throws IOException {
	     readHotkeyDB = CharConfig.getCharConfig().getDbPath() + Hotkey.class.getName();
	     readFriendDB = CharConfig.getCharConfig().getDbPath() + FRIEND.class.getName();
	     readCharactere("0123456789ABCEDDD");
	     
	     final ROCharacter chr = readHotkeyDB + "_" + "0123456789ABCEDDD";
	     ROCharacter savedCharacter = TXTCharacter.load(0)["0123456789ABCEDDD"].unloaded().unloaded().unloaded();
	     ROCharacter savedCharacter2 = TXTCharacter.load(0)["456789ABCEDDD"].ready();
	     ROCharacter savedCharacter3 = TXTCharacter.load(0)["0123" + String.valueOf(Integer.MAX_VALUE) + "DE" + String.valueOf(Integer.MAX_VALUE) + "DE"].ready();
	     
	     Savedata.cleanData(readCharactere(chr));
	     TXTCharacter.save(chr, savedCharacter);
	     TXTCharacter.save(savedCharacter, savedCharacter2);
	     TXTCharacter.save(savedCharacter2, savedCharacter3);
	     Savedata.cleanData(readCharactere(savedCharacter3));
	     TXTCharacter.save(savedCharacter3, savedCharacter);
	     ROCharacter savedCharacter4 = TXTCharacter.load(0)["0123456789"].unloaded().unloaded().unloaded();
	     ROCharacter savedCharacter5 = TXTCharacter.load(0)["45678"].ready();
	     
	     assertEquals("0123456" +
	                String.valueOf(Integer.MAX_VALUE + 1) + 
	                String.valueOf(Integer.MAX_VALUE + 1) +        
	                String.valueOf(Integer.MAX_VALUE + 1), savedCharacter.getName());
	     assertEquals("01234567" + String.valueOf(Integer.MAX_VALUE) +        
	                String.valueOf(Integer.MAX_VALUE) + String.valueOf(Integer.MAX_VALUE) +
	                String.valueOf(Integer.MAX_VALUE), savedCharacter4.getName());
	     assertEquals("45678" + String.valueOf(Integer.MAX_VALUE) +        
	                String.valueOf(Integer.MAX_VALUE), savedCharacter5.getName());
	     assertEquals("0123456" + String.valueOf(Integer.MAX_VALUE + 1) + 
	                String.valueOf(Integer.MAX_VALUE + 1) +        
	                String.valueOf(Integer.MAX_VALUE + 1), savedCharacter2.getName());
	     assertEquals("01234567" + String.valueOf(Integer.MAX_VALUE) +        
	                String.valueOf(Integer.MAX_VALUE) + String.valueOf(Integer.MAX_VALUE) +
	                String.valueOf(Integer.MAX_VALUE), savedCharacter3.getName());
	     assertEquals("4567" + String.valueOf(Integer.MAX_VALUE) +        
	                String.valueOf(Integer.MAX_VALUE), savedCharacter4.getName());
	     
	     Savedata.deleteData(chr);
	     TXTCharacter.load("0123456789ABCEDDD");
	 }
	 
}