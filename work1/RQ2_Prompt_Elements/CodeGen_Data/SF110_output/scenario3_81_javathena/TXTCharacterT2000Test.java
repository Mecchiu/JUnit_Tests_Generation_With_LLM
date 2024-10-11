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
private
	private final static CharConfig config = CharConfig.initialDefault();
	// Test File paths with a basePath of '/etc'.
	private final static File root = new File("/etc");
	private final static File test_root =
            new File(root, Constants.TXT_TEST);
	private final static File home = new File(test_root, "temp");
	private final static File test = new File("/tmp");
	private final static String str = "/etc/test.txt";
	private final static File testFile = new File(test.getPath() + str);

	@Test
	public void testLoad() throws IOException {
		//load character data without config
		config = CharConfig.initialDefault();
		IndexedFastMap<Integer, ROCharacter> map =
                load(); /*load character data*/;

		//assertTrue("map.size() == 0",map.isEmpty());
		assertEquals("map.size() == 0",0,map.size());

		//load character data
		ROCharacter roc = load();
		assertNotNull("null returned for loaded character", roc);
		assertNotNull("no char created for loaded character", roc.character);

		//assertTrue("ROC character.character.toString().startsWith(
		//    CharData.CHR_NAME_TO+")",
		//    ROCcharacter.character.toString().startsWith(CharData.CHR_NAME_TO+""));
		IndexedFastMap<Integer, ROCharacter> roC = load();
		assertNotNull("null returned for loaded character ROC", roC);
		assertFalse("load failed", roc.character.equals(roC.character));
		assertFalse("same character", roC.equals(map));

		// get loaded character by id
		RoCharacter roc2 = map.get(0x11);
		assertNotNull("null returned for loaded character with id 0x11", roc2);
		assertEquals("character.toString().startsWith(
                  "Character (0x11 -> CharData " +
                  "   characterId: 0x11) " +
                  "   text: 'Test Character' " +
                  "   basePath: '" +
                  String
                  + test_root)
                  , roc2.getBaseName());
		assertTrue("character.isLoaded()==false", roc2.isLoaded());

//		assertEquals("loaded ROCharacter by id", map.get(0x11).character,roc);
		assertEquals("loaded ROCharacter by id", roc2.character, map.get(0x11));
	}

	private RoCharacter load() throws IOException {
		ROCharacter roc = ROCharacter.initialDefault();
		FileOutputStream fOut = null;
		try {
			fOut = new FileOutputStream(testFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(test));
			BufferedReader in1 = null;
			try {
				in1 = new BufferedReader(new FileReader(test));
				while (in.ready()) {
					in1.readLine();
					String [] line = in1.readLine().split(" ");
					assertEquals("line[0]", line[0], roc.getBaseName());
					assertTrue("line[1]", line.length==2);
					assertEquals("character.toString().startsWith(
        				    "Character (0x11 -> CharData " +
        				    "   characterId: 0x11) " +
        				    "   text: 'Test Character' " +
        				    "   basePath: '" +
        				    filePath
        				    + filePath.getPath()
        				    + str
        				    + ")",
        				    line[1]);
					map.addEntry(0x11, roc);
					assertTrue("roc.character.equals(map.get(0x11)), roc.character.equals(map.get(0x11))", roc.character.equals(map.get(0x11)));
					if (in!= null) {
						in1.readLine();
					}
				}
					//assertTrue("loaded characters after load",roc.character.equals(
					 //map.get(0x11)),
					//	roc.character.equals(map.get(0x11)));
				if (in1!= null) {
					in1.close();
					in1 = null;
				}
				in = null;
			} finally {
				try {
					in.close();
				} catch (Exception e2) {
				}
				try {
					in1.close();
				} catch (Exception e2) {
				}
				in = null;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		assertNull("No return for invalid character",in);

		assertTrue("loaded ROCharacter by id", roc.character.equals(map.get(0x11)));
		fOut.close();
		return roc;
	}

	private ROCharacter ROCharacterTest = null;
	private ROCharacter ROCharacterLoad = null;
	private ROCharacter ROCharacterEmpty = null;
	private ROCharacter ROCharacterGetBaseName = null;
	private ROCharacter ROCharacterToString = null;
	private ROCharacter ROCharacterToBaseName = null;
	public static ROCCharacter ROCharacterNew = null;

	private static void
	load(
	    RoCharacter roc1,
	    ROCharacter roc2
	)
	{
		assertTrue("load failed", false);
		FILE_PATH RO