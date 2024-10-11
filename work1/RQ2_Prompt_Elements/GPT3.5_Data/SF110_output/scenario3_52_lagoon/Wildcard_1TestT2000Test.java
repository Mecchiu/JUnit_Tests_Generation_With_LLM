// Here's an example implementation of the Wildcard_1Test class:

class Wildcard_1Test {

    @Test
    void testMatchWildcard() {
        // Test case 1: Matching a simple pattern with a simple filename
        String pattern1 = "file.txt";
        String filename1 = "file.txt";
        String expected1 = "file.txt";
        String result1 = Wildcard.matchWildcard(pattern1, filename1);
        assertEquals(expected1, result1);

        // Test case 2: Matching a simple pattern with a different filename
        String pattern2 = "file.txt";
        String filename2 = "otherfile.txt";
        String expected2 = null;
        String result2 = Wildcard.matchWildcard(pattern2, filename2);
        assertEquals(expected2, result2);

        // Test case 3: Matching a pattern with a wildcard and a simple filename
        String pattern3 = "file*.txt";
        String filename3 = "file123.txt";
        String expected3 = "file123.txt";
        String result3 = Wildcard.matchWildcard(pattern3, filename3);
        assertEquals(expected3, result3);

        // Test case 4: Matching a pattern with a wildcard and a different filename
        String pattern4 = "file*.txt";
        String filename4 = "otherfile.txt";
        String expected4 = null;
        String result4 = Wildcard.matchWildcard(pattern4, filename4);
        assertEquals(expected4, result4);

        // Test case 5: Matching a pattern with multiple wildcards and a matching filename
        String pattern5 = "file*123*.txt";
        String filename5 = "fileabc123def.txt";
        String expected5 = "fileabc123def.txt";
        String result5 = Wildcard.matchWildcard(pattern5, filename5);
        assertEquals(expected5, result5);

        // Test case 6: Matching a pattern with multiple wildcards and a non-matching filename
        String pattern6 = "file*123*.txt";
        String filename6 = "otherfile.txt";
        String expected6 = null;
        String result6 = Wildcard.matchWildcard(pattern6, filename6);
        assertEquals(expected6, result6);

        // Test case 7: Matching a pattern with multiple simple patterns and a matching filename
        String pattern7 = "file1.txt;file2.txt;file3.txt";
        String filename7 = "file2.txt";
        String expected7 = "file2.txt";
        String result7 = Wildcard.matchWildcard(pattern7, filename7);
        assertEquals(expected7, result7);

        // Test case 8: Matching a pattern with multiple simple patterns and a non-matching filename
        String pattern8 = "file1.txt;file2.txt;file3.txt";
        String filename8 = "otherfile.txt";
        String expected8 = null;
        String result8 = Wildcard.matchWildcard(pattern8, filename8);
        assertEquals(expected8, result8);

        // Test case 9: Matching a pattern with a wildcard and an empty filename
        String pattern9 = "file*.txt";
        String filename9 = "";
        String expected9 = null;
        String result9 = Wildcard.matchWildcard(pattern9, filename9);
        assertEquals(expected9, result9);

        // Test case 10: Matching a pattern with an empty pattern and a non-empty filename
        String pattern10 = "";
        String filename10 = "file.txt";
        String expected10 = null;
        String result10 = Wildcard.matchWildcard(pattern10, filename10);
        assertEquals(expected10, result10);
    }
}