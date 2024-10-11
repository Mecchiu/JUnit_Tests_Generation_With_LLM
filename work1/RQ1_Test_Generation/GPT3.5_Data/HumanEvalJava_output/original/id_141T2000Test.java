```java
class FileNameCheckTest {

    @Test
    void testFileNameCheck_ValidFileName_ReturnsYes() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("example.txt"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_StartsWithDigit_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck("1example.dll"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_ContainsSpecialCharacters_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck("?aREYA.exe"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_MoreThanThreeDigits_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck("His12FILE94.exe"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_EmptyBeforeDot_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck(".txt"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_InvalidExtension_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck("example.invalid"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_InvalidExtension2_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck("example.txte"));
    }

    @Test
    void testFileNameCheck_InvalidFileName_EmptyFileName_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck(""));
    }

    @Test
    void testFileNameCheck_ValidFileName_MultipleDots_ReturnsNo() {
        assertEquals("No", FileNameCheck.fileNameCheck("final..txt"));
    }

    @Test
    void testFileNameCheck_ValidFileName_Valid_ReturnsYes() {
        assertEquals("Yes", FileNameCheck.fileNameCheck("Is3youfault.txt"));
    }
}
```
```