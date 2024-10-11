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
     * Test constructor.
     */
    public TXTCharacterTest() {
    }

    @Test
    public void testLoad() {
    }

    /**
     * {@link TXTCharacter#toString}
     *
     * @see TXTCharacter#load()
     */
    @Test
    public void testToString() {

        POJO2TOSTRING toString = new POJO2TOSTRING();

        String expectedString = "" + "ROCharacter(ROCharacter(ROCharacter, JOB, HOTKEY), HOTKEY)\n" + "HOTKEY : <0x13f8ffd0>\n" + "JOB : ROCharacter(JOB)";

        toString.readString(readCharactere(getClass().getResource(expectedString).toString()));
        assertEquals(expectedString, toString.toString());
    }

    @Test
    public void testLoadFromFile() throws IOException {
        readHotkeyDB = CharConfig.getCharConfig().getDbPath()!= null? CharConfig.getCharConfig().getDbPath() : DEFAULT_HOTKEYS_FILE;

        POJO2TOSTRING toString = new POJO2TOSTRING();
        toString.readString(readHotkeyDB);
        assertTrue(toString.contains(getClass().getResource(getClass().getResource(READ_FILE).toString())));
    }

    @Test
    public void testLoadFromFileAndLoadFromOtherFile() throws IOException, MalformedDataException {

        readHotkeyDB = CharConfig.getCharConfig().getDbPath()!= null? CharConfig.getCharConfig().getDbPath() : DEFAULT_HOTKEYS_FILE;

        POJO2TOSTRING toString = new POJO2TOSTRING();
        toString.readString(readHotkeyDB);
        loadOtherFile();
        ROCharacter roCharacter = readCharactere(toString.toString());

        PersistenteData oldData = new TXTCharacter();
        oldData.load();
        assertEquals(roCharacter.getChar(), oldData.getChar());
    }

    @Test
    public void testLoadFromReader() throws IOException, MalformedDataException {
        BufferedReader reader = new BufferedReader(new FileReader(readDBFile()));

        try {
            POJO2TOSTRING toString = new POJO2TOSTRING();
            toString.readString(reader);
            POJO2TOSTRING loadedString = new POJO2TOSTRING();
            loadedString.readString(getClass().getResource(toString.toString()).toString());
            assertEquals(toString.toString(), loadedString.toString());
        } finally {
            reader.close();
        }
    }

    private File readDBFile() throws IOException {
        File targetFile = new File(fileDB);
        if (! targetFile.exists()) {
            targetFile.createNewFile();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(targetFile))) {
            String line;
            while ((line = reader.readLine())!= null) {
                String toStringLine = line.replaceAll("^((?!^.+)\\(?)=)", "");
                POJO2TOSTRING toString = new POJO2TOSTRING();
                toString.readString(toStringLine);
                if (! toString.contains(getClass().getResource(READ_FILE).toString())) {
                    throw new MalformedDataException((getClass().getResource(READ_FILE).toString()).replaceAll("^((?!^.+)\\(?)=)", ""));
                }
            }
        }

        return targetFile;
    }

}