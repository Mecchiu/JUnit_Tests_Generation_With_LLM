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
		
	@Test
	public void testLoadCharactere() throws IOException, MalformedDataException {
        try {
                // read
            CharacterConfig conf = new CharacterConfig("character_config.txt");           
            conf.setDb(new File(fileTest));                 
            Confirmer obj = TXTCharacter.load(conf);
            // assert not null            
            assertNotNull("Unable to load character.", obj);
            
            // assert that character was read
            assertEquals("Unable to read character.",
                         obj.getDef(),          
                         ROCharacter.getDef(obj.getDef()));         
        } catch(MalformedDataException ex) {
            assertTrue("ex.toString(): " + ex.toString(),
                    ex.getMessage().indexOf("character_config.txt") > 0);
        }
	}


}
