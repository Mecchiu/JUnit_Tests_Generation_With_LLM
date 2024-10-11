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
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a non-empty {@link IndexedFastMap} object.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
	}
	
	/**
	 * Test case 2:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
	}
	
	/**
	 * Test case 3:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct name.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectName() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals("Test", indexedChar.get(1).getName());
	}
	
	/**
	 * Test case 4:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct job.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectJob() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(ROCharacter.JOB.NOVICE, indexedChar.get(1).getJob());
	}
	
	/**
	 * Test case 5:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct base level.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectBaseLevel() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(1, indexedChar.get(1).getBase_level());
	}
	
	/**
	 * Test case 6:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct job level.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectJobLevel() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(1, indexedChar.get(1).getJob_level());
	}
	
	/**
	 * Test case 7:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct base experience.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectBaseExperience() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(0, indexedChar.get(1).getBase_exp());
	}
	
	/**
	 * Test case 8:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct job experience.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectJobExperience() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(0, indexedChar.get(1).getJob_exp());
	}
	
	/**
	 * Test case 9:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct zeny.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectZeny() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(0, indexedChar.get(1).getZeny());
	}
	
	/**
	 * Test case 10:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct map index.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectMapIndex() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(0, indexedChar.get(1).getMap_index());
	}
}

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
* It contains ten unit test cases for the {@link TXTCharacter#load()} method.
*/
class TXTCharacterTest {
		
	/**
	 * Test case 1:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a non-empty {@link IndexedFastMap} object.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
	}
	
	/**
	 * Test case 2:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
	}
	
	/**
	 * Test case 3:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct name.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectName() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals("Test", indexedChar.get(1).getName());
	}
	
	/**
	 * Test case 4:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct job.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectJob() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar.get(1));
		assertEquals(ROCharacter.JOB.NOVICE, indexedChar.get(1).getJob());
	}
	
	/**
	 * Test case 5:
	 * 
	 * Test the {@link TXTCharacter#load()} method with a valid file.
	 * 
	 * Expected result:
	 * 
	 * The method should return a {@link IndexedFastMap} object containing a {@link ROCharacter} object with the correct base level.
	 * 
	 * @throws IOException
	 */
	@Test
	void testLoad_ValidFile_ContainsCharacter_CorrectBaseLevel() throws IOException {
		TXTCharacter txtChar = new TXTCharacter();
		IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
		assertNotNull(indexedChar);
		assertFalse(indexedChar.isEmpty());
		assertNotNull(indexedChar