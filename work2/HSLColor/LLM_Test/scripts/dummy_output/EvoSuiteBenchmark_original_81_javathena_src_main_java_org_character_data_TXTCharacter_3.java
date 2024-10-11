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
		
    @Test
    void testLoad() throws IOException {
        // Load character
        TXTCharacter xtxt = new TXTCharacter(fileDB, CharConfig.getCharConfig().getAccountDBFilePath());
        IndexedFastMap<Integer, ROCharacter> indexedChar = xtxt.load();

        roCompacter.testStoreFile(fileDB, indexedChar);

        assertEquals(-1, indexedChar.size());

        // Load new character
        byte[] read = new byte[VERSION_LENGTH];
        xtxt.read((int) 0, read, 0);
        xtxt.setId(3131);

        byte[] read1 = new byte[VERSION_LENGTH];
        xtxt.read((int) 0, read1, 0);
        xtxt.setId(1234);

        roCompacter.testStoreFile(fileDB, indexedChar);

        IndexedFastMap<Integer, ROCharacter> indexedNewChar = xtxt.load();
        assertEquals(read1.length, indexedChar.get(3131).getId().length());

        roCompacter.testStoreFile(fileDB, indexedNewChar);

    }

    @Test
    void testLoadFile() throws IOException {
        // Load character
        TXTCharacter xtxt = new TXTCharacter(fileDB, CharConfig.getCharConfig().getAccountDBFilePath());
        IndexedFastMap<Integer, ROCharacter> indexedChar = xtxt.load();

        roCompacter.testStoreFile(fileDB, indexedChar);

        assertEquals(-1, indexedChar.size());

        // Read file from charactere and check
        BufferedReader inChar = new BufferedReader(new FileReader(new File(fileDB)));
        RoCharacter readChar = xtxt.read(0, inChar, inChar.readLine());

        roCompacter.testStoreFile(fileDB, indexedChar);

        assertEquals(readChar, indexedChar.get(3131));

        // Read file from new character and check
        byte[] read1 = new byte[VERSION_LENGTH];
        xtxt.read((int) 0, read1, 0);
        byte[] read2 = new byte[VERSION_LENGTH];
        xtxt.read((int) 0, read2, 0);

        roCompacter.testStoreFile(fileDB, indexedNewChar);

        assertEquals(read1.length, read2.length);

        roCompacter.testStoreFile(fileDB, indexedNewChar);

        // Check for existing file
        assertEquals(read1.length, indexedNewChar.get(3131).getId().length());

        byte[] read2Old = new byte[VERSION_LENGTH];
        read2 = new byte[VERSION_LENGTH];
        xtxt.read((int) 0, read2, 0);
        xtxt.read((int) 0, read2Old, 0);

        assertEquals(read2Old, read2);

    }
    
    //Test store files
    private final ROCharacter RO_character;

    //Read a character from character
    private final ROCharROCharacter roCharROCharacter;

    // Read character
    private final ROCharROCharacter roCharROCharacter;
    
    public static Pair<ROCharacter,ROCharROCharacter> getCharacter(String pathName){
        return Pair.of(RO_character,roCharROCharacter);
    }

    @Test
    void testCharacterCreation() throws IOException {
        // This method create a character, it will be the default instance for the
        // character and have to be callable.
        BufferedReader in = new BufferedReader(new FileReader(new File(fileDB)));
        ROCharacter readChar = new RW2Char();
        RoCharRoCharacter rcpRoCharacter = new RoCharRoCharacter();

}
}