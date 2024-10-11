```java
class DateTools_1Test {

    @Test
    void testFormatWithDefaultFormat() {
        Date date = new Date();
        String formattedDate = DateTools.format(date);
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatWithLongFormat() {
        Date date = new Date();
        String formattedDate = DateTools.format(date, DateTools.LONG_DATE_FORMAT);
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatWithCustomFormat() {
        Date date = new Date();
        String customFormat = "dd/MM/yyyy";
        String formattedDate = DateTools.format(date, customFormat);
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatWithNullDate() {
        Date date = null;
        String formattedDate = DateTools.format(date);
        assertNull(formattedDate);
    }

    @Test
    void testFormatWithNullDateAndFormat() {
        Date date = null;
        String formattedDate = DateTools.format(date, DateTools.DEFAULT_DATE_FORMAT);
        assertNull(formattedDate);
    }

    @Test
    void testFormatWithInvalidFormat() {
        Date date = new Date();
        String invalidFormat = "invalid";
        String formattedDate = DateTools.format(date, invalidFormat);
        assertNull(formattedDate);
    }

    @Test
    void testFormatWithEmptyFormat() {
        Date date = new Date();
        String emptyFormat = "";
        String formattedDate = DateTools.format(date, emptyFormat);
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatWithEmptyDate() {
        Date date = new Date(0);
        String formattedDate = DateTools.format(date, DateTools.DEFAULT_DATE_FORMAT);
        assertNotNull(formattedDate);
    }

    @Test
    void testFormatWithEmptyDateAndFormat() {
        Date date = new Date(0);
        String formattedDate = DateTools.format(date, "");
        assertNotNull(formattedDate);
    }
}
```
```