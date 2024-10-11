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
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad1() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 2.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad2() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 3.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad3() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 4.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad4() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 5.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad5() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 6.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad6() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 7.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad7() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 8.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad8() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 9.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad9() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Test case 10.
	* The test case is passed if the method {@link TXTCharacter#load()}
	* returns a {@link IndexedFastMap} with the same size of the file
	* {@link CharConfig#fileDB}.
	*/
	@Test
	void testLoad10() {
		TXTCharacter txtChar = new TXTCharacter();
		try {
			IndexedFastMap<Integer, ROCharacter> indexedChar = txtChar.load();
			assertEquals(indexedChar.size(), countLines(CharConfig.fileDB));
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}
	
	/**
	* Count the number of lines of a file.
	* @param fileName the name of the file.
	* @return the number of lines of the file.
	*/
	private int countLines(String fileName) {
		int count = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
			while (in.readLine() != null) {
				count++;
			}
			in.close();
		} catch (IOException e) {
			fail(e.getMessage());
		}
		return count;
	}
}

// TXTCharacter.java
package org.character.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.character.data.config.CharConfig;
import org.javat