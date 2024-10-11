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
        IndexedFastMap<Integer, ROCharacter> indexedChar = TXTCharacter.load();
        assertNotNull(indexedChar.findByKey(new Integer(1000)));
        assertNotNull(indexedChar.findByKey(new Integer(2001)));
        assertNotNull(indexedChar.findByKey(new Integer(3010)));
        assertNotNull(indexedChar.findByKey(new Integer(3001)));
        assertNotNull(indexedChar.findByKey(new Integer(302)));
        assertNotNull(indexedChar.findByKey(new Integer(3002)));
        assertNotNull(indexedChar.findByKey(new Integer(3011)));
    }

    @Test
    void testReadHotkeys() throws IOException {
        readHotkeys(TXTCharacter.load());
    }

    @Test
    void testReadUser() throws IOException {
        readFriend(TXTCharacter.load());
    }

    @Test
    void testReadCharactere() throws IOException {
        readCharactere(TXTCharacter.load());
    }

    @Test
    void testGetCharctereByCharactereKey() {
        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()), null);
        assertEquals(TXTCharacter.getCharctereByCharactereKey("a"), null);
        assertNotNull(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[0]));
        assertNotNull(TXTCharacter.getCharctereByCharactereKey("aaa"));
        assertNotNull(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[0] + "b"));
    }

    @Test
    void testGetHotkidKeys() throws IOException {
        readHotkeys(TXTCharacter.load());
    }

    @Test
    void testFetchRoomUsers() throws IOException {
        readFriend(TXTCharacter.load());

        Friend[] users = (Friend[]) new IndexedFastMap().fetchByKeys(-1, -1).get().toArray(new Friend[0]);
        assertEquals(users.length, 1);
        assertEquals(users[0], CharConfig.getCharConfig().getUser('A'));
    }

    @Test
    void testFindRandomUser() throws IOException {
        assertEquals(4, ((IndexedFastMap<Integer, ROCharacter>) TXTCharacter.load("db/randomuser1.ttx")).size());
        assertEquals(2, ((IndexedFastMap<Integer, ROCharacter>) TXTCharacter.load("db/randomuser2.ttx")).size());
        assertEquals(2, ((IndexedFastMap<Integer, ROCharacter>) TXTCharacter.load("db/randomuser3.ttx")).size());
        assertEquals(1, ((IndexedFastMap<Integer, ROCharacter>) TXTCharacter.load("db/randomuser4.ttx")).size());
        assertEquals(1, ((IndexedFastMap<Integer, ROCharacter>) TXTCharacter.load("db/randomuser5.ttx")).size());
    }

    @Test
    void testFindCharacterByCharactereKey() throws IOException {
        assertEquals(TXTCharacter.getCharctereByCharactereKey(null), null);
        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[0]), null);
        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[1]), null);
        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[2]), null);
        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[7]), null);

        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[0] + "a"), CharConfig.getCharConfig().getUser('A'));
        assertEquals(TXTCharacter.getCharctereByCharactereKey(CharConfig.getCharConfig().getCharacterees()[0] + "b"), CharConfig.getCharConfig().getUser('B'));
    }

}