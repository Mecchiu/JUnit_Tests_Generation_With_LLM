// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains one unit test case for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {
		
    private final List<String> testfiles;

    /**
     * @param testfiles the testfiles
     */
    public Wildcard_2Test(String testfiles) {
        this.testfiles = Arrays.asList(testfiles.split(";"));
    }

    /**
	 * Test case of {@link Wildcard#matchWildcard(long, long)}.
	 */
	@Test
	public final void testMatchWildcard() {
		
		for (String fulltestFilename: testfiles) {
			ArrayList<String> list = new ArrayList<String>();
			String[] listStrings = fulltestFilename.split(";");

			// Create an arrayList for each substring of the testFile
			for (String testfile: listStrings) {
				String[] substr = getSubstring(testfile, 1);

				int nsub = 0;
				// Check if the substring was not null
				assertNotNull(substr);

				// Check the case (if the substring was not null).
				check(testfile, testfile + ": [" + substr[0] + "]; " + substr[1],
						substr[0],!isshouldmatch(substr[0]));
				
				assertEquals(substr[0].toLowerCase(), substr[1].toLowerCase());
				assertTrue("Missing match.", isshouldmatch(substr[0]));
				
				nsub = 1 + 2 + 3 + 4 + 5;
				// Check the case (if not subset, test is complete).
				check(testfile + ": [" + substr[0] + "]",
						substr[0].toLowerCase(),!isshouldcase(substr[0]));
				// If there is the case, then substring not null and shouldmatch
				assertFalse(isshouldmatch(substr[0]));
				
				// Make sure that the result string is actually not the case of wildcard
				String result;
				if (strContains(substr[1], substr[0].toLowerCase())) {
					check("wildcard[" + substr[0] + "][" + substr[1] + "];" + substr[0], substr[1], true);

					result = substring(substr[1], "{");
				} else {
					result = substring(substr[0], "{");
				}
				assertTrue("Should not have matched: [" + substr[1] + "]",
						strContains(result, "{"));
				if (substr[0].equals("*")) {
					check(testfile + ": [" + substr[0] + "], " + substr[1], true);
					if (strContains(substr[1], substr[0].toLowerCase())) {
						check("wildcard[" + substr[0] + "];" + substr[1], substr[1], true);
					} else {
						fail("No '*'? Match in wildcard: [" + subjectFile(substr[0]) + "]");
					}
					if (substr[1].equals("*")) {
						fail("No '*'? Match in wildcard: [" + subjectFile(substr[0]) + "]");
					} else {
						fail("No '*'? Match in wildcard: [" + subjectFile(substr[0]) + "]");
					}
					//if (substr[0].equals("*")) {
					//if (strContains(substr[1], substr[0].toLowerCase())) {
					//fail("Match in wildcard. Matches '*': [" + subjectFile(substr[0]) + "]");
					//} else {
					//fail("Match in wildcard. not matches '*' : [" + subjectFile(substr[0]) + "]");
					//}
					//if (substr[1].equals("*")) {
					//fail("Match in wildcard. Not matches '*' : [" + subjectFile(substr[0]) + "]");
					//} else {
					//fail("Match in wildcard. not matches '*' : [" + subjectFile(substr[0]) + "]");
					//}
				} else if (issubtheshouldmatch(subslice.get(1))) {

				} else {
					assertTrue("Do not match in wildcard: [" + substr[1] + "]", true);

				}

				assertEquals("Should have result 1, not [" + testfile + ":" + substr[1] + "]",
						subslice.get(1), result);
				//assertEquals("Should have result 2, not [" + testfile + ":" + substr[0] + "]",
				//testfile + ":" + substr[1], result);
				assertTrue("Should have two match, not [" + testfile + ":" + substr[1] + "]",
						testfile + ":" + substr[1].toLowerCase().contains("*"));
			}
		}
	}
	
	private boolean isshouldcase(String s) {
		if (s.equals("*")) return true;
		if (!s.equals("*")) return false;
		return true;
	}
	
	private boolean isshouldsubstring(String s) {
		if (s.equals("*")) return true;
		if (!s.equals("*")) return false;
		return true;
	}
			
	private String subjectFile(String s) {
		if (s.equals("*")) return "*";
		return s;
	}

	// Get all substrings of the given string. A subString is a part of a
	// list of parts separated by ';'.
	private String[] getSubstring(String testfile, int startIndex) {
		String[] result = new String[startIndex];

		int i = startIndex;
		ArrayList<String> splist = new ArrayList<String>();
		do {
			i++;
			if (i > startIndex) {
				splist.add(testfile.substring(startIndex, i - 1) + '$');
			}
		} while (i < testfile.length());

		splist.add(testfile.substring(startIndex, i) + "|");
		splist.add(testfile.substring(i));

		StringTokenizer st = new StringTokenizer(splist.get(0), '$');
		String str = "";
		String substr;

		while (st.hasMoreElements()) {
			st.nextElement();
			String[] substrs = st.nextToken().split("/~");
			List<String> list = new ArrayList<String>();
			for (String elm: substrs) {
				list.add(elm);
			}

			// Get the last element
			if (!list.get(list.size() - 1).equals("~")){
				substr = list.get(list.size() - 1);
			} else {
				substr = list.get(list.size() - 2);
			}
			substr = str + substrs[0] + "| " + substrs[1];
			result[i] = substr;
		}
		return result;
	}
					
	// Compare two strings
	private boolean isshouldmatch(String s) {
}
}