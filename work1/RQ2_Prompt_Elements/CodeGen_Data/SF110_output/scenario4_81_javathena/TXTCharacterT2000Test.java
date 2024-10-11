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

    private final static String DEFAULT_ACCOUNT_FILE = "save/athena.txt";

    private final static int VERSION_LENGTH = 18;

    private final static String DEFAULT_FRIEND_FILE = "save/friends.txt";

    private final static String DEFAULT_HOTKEYS_FILE = "save/hotkeys.txt";

    private String fileDB = CharConfig.getCharConfig().getDbPath()!= null? CharConfig.getCharConfig().getDbPath() : DEFAULT_ACCOUNT_FILE;

    private String friendDB = DEFAULT_FRIEND_FILE;

    private String hotkeyDB = DEFAULT_HOTKEYS_FILE;

    @Override
    public void save(IndexedFastMap<Integer, ROCharacter> data) throws IOException;

    /**
     * Load character under the last format version only version 1500 (homun +
     * mapindex maps)
     *
     * @return indexedChar a fastmap containing loaded characters
     * @throws MalformedDataException
     */
    @Override
    public IndexedFastMap<Integer, ROCharacter> load() throws IOException;

    private void readHotkeys(IndexedFastMap<Integer, ROCharacter> indexedChar) throws IOException;

    private void readFriend(IndexedFastMap<Integer, ROCharacter> indexedChar) throws IOException;

    private ROCharacter readCharactere(String line) throws MalformedDataException;
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
		
    private String fileDB = CharConfig.getCharConfig().getDbPath()!= null? CharConfig.getCharConfig().getDbPath() : DEFAULT_ACCOUNT_FILE;
    private String friendDB = DEFAULT_FRIEND_FILE;
    private String hotkeyDB = DEFAULT_HOTKEYS_FILE;

    private ROCharacter rochar = null;

    @Test
    void setChar() throws IOException {
        rochar = new ROCharacter(fileDB, "char.txt", "char.txt", JOB.MARTIN);
        IndexedFastMap<Integer, ROCharacter> indexedChar = rochar.getIndexedCharacter();
        ROCharacter loadedChar = loadChar(rochar);

        assertNotNull(loadedChar);
        assertEquals(ROCharacter.RO_A, indexedChar.get(loadedChar.getId()));

        rochar.setId(20);
        assertNotNull(loadedChar);
        assertEquals(ROCharacter.RO_B, indexedChar.get(loadedChar.getId()));

        rochar.setId(-20);
        assertNotNull(loadedChar);
        assertEquals(ROCharacter.RO_A, indexedChar.get(loadedChar.getId()));
    }

    private void readFriends(IndexedFastMap<Integer, ROCharacter> indexedChar) throws IOException {
        List<IndexedFastMap<Integer, ROCharacter>> friends =  loadFriendsData();

        for (IndexedFastMap<Integer, ROCharacter> friendDB: friends) {
            rochar = readChar(friendDB);
            RoUser roUser = rochar.getRoUser();
            assertNotNull(roUser);
            for (IndexedFastMap<Integer, ROCharacter> roUser: roUser.getIndexedFriendsList()) {
                RoUser myFriend = roUser.get(rochar.getId());
                assertNotNull(myFriend);
            }
        }
    }

    private List<IndexedFastMap<Integer, ROCharacter>> loadFriendsData();

    private RoUser readFriend(IndexedFastMap<Integer, ROCharacter> indexedChar) throws IOException {
        File file = new File(IndexedFastMap.getFileName(indexedChar) + "_myfriend.txt");
        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new FileReader(file));
            String line = null;

            int a = 0;
			while ((line = Functions.nextLine(bfr))!= null) {

                assertNotNull(line);
                line = line.trim();

                if (line.length() == 0) {
                    continue;
                }
                if (line.charAt(0) == '\0') {
                    continue;
                }

                int b = a;
                a = line.replaceFirst("^[\r\n]*", "").replaceFirst("[\r\n ]*", "");
                // we will now end the line
                if (line.charAt(0) == '\r') {
                    b = a;
                }
                String myId = line.substring(b,b + VERSION_LENGTH).trim();
                IndexedFastMap<Integer, ROCharacter> myFriend = readChar(myId);
                RoUser myFriendROU = myFriend.get(rochar.getId());
                assertNotNull(myFriend);
                indexedChar.put(myFriend.get(rochar.getId()));

            }

            return rochar.getRoUser();

        }
        finally {
            try {
                if (bfr!= null) {
                    bfr.close();
                }
            } catch (IOException ex) {
                //do nothing
            }
        }

    }

    private RoUser readChar(String myId) throws IOException {
        ROCharacter myChar = readCharFromLine(indexedChar, "character.txt", myId, "mychar.txt", JOB.MARTIN);
        assertEquals("character.txt", myChar.getName());
        myChar.setId(40);

        return myChar;
    }

    private RoCharacter readCharFromLine(IndexedFastMap<Integer, ROCharacter> indexedChar, String name, String line, String file, JOB j) throws IOException {

        File file = new File(name + "_mychar." + vers);

        /*
         * BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
         *
         * while(reader.ready()){String line2 = reader.readLine(); if(line2!= null) {ROUserROU = RoUserROU; RoUser = Line;} }
         */

    	indexedChar.remove(myChar.getId());
        BufferedReader br = new BufferedReader