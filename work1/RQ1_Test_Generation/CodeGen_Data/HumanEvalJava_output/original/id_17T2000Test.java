// ParseMusicTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains one unit test case for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {
@Test
		public void testParseMusic() {
			// test parseMusic()
			List<Integer> musicList = new ArrayList<Integer>();

		  /*
		    testString(musicString, musicList);
		    testResult(musicString, musicList);
		*/
			musicList.add(4);
			musicList.add(4);
			musicList.add(4);
			musicList.add(4);
			musicList.add(1);
			musicList.add(2);
			musicList.add(1);
			musicList.add(2);
			musicList.add(3);
			musicList.add(2);
			musicList.add(1);
			musicList.add(2);
			musicList.add(3);
			musicList.add(1);
			musicList.add(2);
			musicList.add(4);
			musicList.add(2);
			musicList.add(3);
			musicList.add(2);
			musicList.add(4);

			List<Object> result = ParseMusic.parseMusic("o o o o o o o");
			assertTrue(musicList.equals(result));
			assertEquals(musicList, result);
			System.out.println(musicList.toString());

			List<List<Object>> resultList = new ArrayList<List<Object>>();
			resultList.add(new ArrayList<List<Object>>());
			resultList.add(new ArrayList<String>());
			for (int i = 0; i < musicList.size(); i++) {
				if (i % 2 == 0) {
					resultList.add(new ArrayList<String>());
				}
				resultList.get(i % 2).add(musicList.get(i) + "_" + (i + 1 == musicList.size()? "4" : "2"));
			}
			System.out.println(musicList.toString());
			assertEquals(musicList.size(), resultList.size());
			assertEquals(musicList, resultList);
			for (int i = 0; i < musicList.size(); i++) {
				if (musicList.get(i) == 4) {
					assertEquals(i, musicList.indexOf(4));
				}
			}
		}

		@Test
		public void testString() {
			// test parseMusic("4")
			List<String> musicList = new ArrayList<String>();
			musicList.add("4");

			String result = ParseMusic.parseMusic("4");
			assertEquals(result, musicList);
			assertEquals(musicList.toString(), result);

			musicList = new ArrayList<String>();
			musicList.add("_2");
			musicList.add("o");
			musicList.add("o|");
			musicList.add("4");
			musicList.add("o|");
			musicList.add("o");
			musicList.add("o|");
			musicList.add("o|");
			musicList.add("o|");
			musicList.add("o|");
			musicList.add("1");
			musicList.add("1");
			musicList.add("2");
			musicList.add("1");
			musicList.add("2");
			musicList.add("3");
			musicList.add("2");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("4");
			musicList.add("2");
			musicList.add("3");
			musicList.add("1");
			musicList.add("2");
			musicList.add("3");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("0");
			musicList.add("1");
			musicList.add("2");
			musicList.add("3");
			musicList.add("1");
			musicList.add("2");
			musicList.add("3");
			musicList.add("2");
			musicList.add("1");
			musicList.add("2");
			musicList.add("3");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			musicList.add("0");
			musicList.add("1");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("0");
			musicList.add("1");
			musicList.add("0");
			musicList.add("1");
			musicList.add("0");
			musicList.add("1");
			musicList.add("1");
			musicList.add("1");
			result = ParseMusic.parseMusic("4");
			assertEquals(result, musicList);
			result = ParseMusic.parseMusic("_2");
			assertEquals(result, musicList);
			musicList = new ArrayList<String>();
			resultList = new ArrayList<List