package org.character.data;
java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.character.data.TXTCharacter;
import org.javathena.core.data.IndexedFastMap;
import org.javathena.core.data.ROCharacter;

class TXTCharacterTest {

    private final String TEST_DB_PATH = "test/athena_test.txt";
    private final String TEST_FRIENDS_PATH = "test/friends_test.txt";
    private final String TEST_HOTKEYS_PATH = "test/hotkeys_test.txt";

    private IndexedFastMap<Integer, ROCharacter> testCharacters;

    @BeforeEach
    void setUp() {
        testCharacters = new IndexedFastMap<>();
        // Add test characters to testCharacters map
    }

    @Test
    void testLoadWithValidData() {
        // Create a test file with valid character data
        createTestFile(TEST_DB_PATH, "// Valid character data");

        TXTCharacter txtCharacter = new TXTCharacter();
        txtCharacter.setFileDB(TEST_DB_PATH);

        try {
            IndexedFastMap<Integer, ROCharacter> loadedCharacters = txtCharacter.load();
            assertNotNull(loadedCharacters);
            // Add assertions for loaded characters
        } catch (IOException e) {
            fail("IOException should not be thrown for valid data");
        }
    }

    @Test
    void testLoadWithMalformedData() {
        // Create a test file with malformed character data
        createTestFile(TEST_DB_PATH, "// Malformed character data");

        TXTCharacter txtCharacter = new TXTCharacter();
        txtCharacter.setFileDB(TEST_DB_PATH);

        assertThrows(MalformedDataException.class, () -> {
            txtCharacter.load();
        });
    }

    // Add more test cases for different scenarios

    private void createTestFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
