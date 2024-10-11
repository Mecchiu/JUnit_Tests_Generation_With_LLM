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
// TXTCharacter.java
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

public class TXTCharacter implements PersistenteData<IndexedFastMap<Integer, ROCharacter>> {

    /**
     * Load character under the last format version only version 1500 (homun +
     * mapindex maps)
     *
     * @return indexedChar a fastmap containing loaded characters
     * @throws MalformedDataException
     */
    @Override
    public IndexedFastMap<Integer, ROCharacter> load() throws IOException {
        IndexedFastMap<Integer, ROCharacter> indexedChar = new IndexedFastMap<Integer, ROCharacter>();
        BufferedReader in = new BufferedReader(new FileReader(new File(fileDB)));
        String line = null;
        while ((line = in.readLine())!= null) {
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
        return indexedChar;
    }
}

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
		
	//-------------------------------------------------------------------------------
    /**
     * Test the method {@link TXTCharacter#load()} and {@link TXTCharacter#load()} for
     * a first character with a format version version <= 1500 and
     * a file with the correct version.
     */
	@javax.annotation.ParametersAreNonnullByDefault
	@Test
    public void load_first() throws IOException {
        // Test readCharactere()
        String correct_file = "DB/tests/data/TXTData/f.txt";
        String wrong_file = "DB/tests/data/TXTData/f.txt.gz";
        
        final String correct_file_string = "f.txt";
        final String[] correct_file_strings = new String[]{correct_file_string};
        // correct_file must always be a full file name (including extension)
        boolean correct = false;
        // File type must always be a full file name, so it is possible to create an
        // instance of the class using the correct
        File correct_file = new File(correct_file_string);
        
        final IndexedFastMap<Integer, ROCharacter> indexedChar = TXTCharacterTest.load();
        indexedChar.put(1002, null); // insert 0 at index 1002 because this is the character
        IndexedFastMap<Integer, ROCharacter> charMap = TXTCharacterTest.load();
        assertSameElements(charMap, indexedChar, correct_file_strings, true);
        
        testCorrectFile_1(correct, correct_file, correct_file_strings, correct_file, correct_file_strings);
        
        // File type must always be a full file name, so it is possible to create an
        // instance of the class using the correct
        correct_file = new File(correct_file.getAbsolutePath() + ".gz");
        correct = false;
        testCorrectFile_2(correct, correct_file, correct_file_strings);
    }

    //-------------------------------------------------------------------------------
    /**
     * Test the method {@link TXTCharacter#load(String)} for a character with a format version
     * version!= version > 15 and a file with a valid file type (one containing the wrong value).
     *
     * @param correct_file should be a full file name including extension (no path)
     * @param correct_file_strings should contain one entry containing the correct value
     * @param correct_file_string should contain the correct string that will be returned in the
     * {@link TXTCharacter#load(String)}
     */
    private void testCorrectFile_1(boolean correct, File correct_file, String[] correct_file_strings,
        File correct_file_string, String[] correct_file_strings) throws IOException {
    
        final String correct_file_string_wrong = "f.txt";
        final String expected_string = "f.txt";
        IndexedFastMap<Integer, ROCharacter> charMap = TXTCharacterTest.load(correct_file_string_wrong);
        indexedChar.put(1002, null);
        indexedChar.put(1003, null);
        indexedChar.put(1006, null);
        indexedChar.put(1007, null);
    
        boolean expected_equal = false;
        for (int i=0; i<correct_file_strings.length; i++) {
            if (correct_file_strings[i].equals(expected_file_strings[i])) {
                expected_equal = true;
                break;
            }
        }
            
        assertTrue("Mismatching string on file " + correct_file_string, expected_equal);
        assertNotNull("No character should not be loaded because file " + correct_file_string+" was found", charMap.get(correct_file_string_wrong));
        boolean exists = charMap.containsValue(correct_file_string);
        assertTrue("Correct character does not exist in file "+correct_file_string, exists);
        
        boolean assertEquals = false;
        // Check that the file loaded from correct files contains the correct string
        for (int i=0; i<correct_file_strings.length; i++) {
            if (correct_file_strings[i].equals(expected_file_strings[i])) {
                assertEquals = true;
            }
            else if (correct_file_strings[i].equals("") || expected_file_strings[i].equals("") ){
                assertEquals = correct_file_strings[i].equals(expected_file_strings[i]);
            }
        }
        assertTrue("The correct string was not found in the correct files", assertEquals);
        
        
        assertSameElements(charMap, indexedChar, correct_file_strings, true);        
        
        assertSameElements(charMap, TXTCharacterTest.load(correct_file_string_wrong), correct_file_strings, true);
    }

    //-------------------------------------------------------------------------------
    /**
     * Test the method {@link TXTCharacter#load(String)} for a character with a format version