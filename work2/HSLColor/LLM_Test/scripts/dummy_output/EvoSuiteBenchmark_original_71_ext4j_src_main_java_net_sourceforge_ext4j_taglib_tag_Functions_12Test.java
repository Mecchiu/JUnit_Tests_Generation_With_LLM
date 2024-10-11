 package net.sourceforge.ext4j.taglib.tag;
java
class Functions_12Test {
    @Test
    void testDateFormat_NullDate_ReturnsEmptyString() {
        String formattedDate = Functions.dateFormat(null, "yyyy-MM-dd");
        assertEquals("", formattedDate);
    }
    @Test
    void testDateFormat_ValidDate_ReturnsFormattedDate() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "yyyy-MM-dd");
        assertEquals("2021-07-31", formattedDate);
    }
    @Test
    void testDateFormat_EmptyPattern_ReturnsEmptyString() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "");
        assertEquals("", formattedDate);
    }
    @Test
    void testDateFormat_InvalidPattern_ReturnsEmptyString() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "invalid pattern");
        assertEquals("", formattedDate);
    }
    @Test
    void testDateFormat_InvalidDate_ReturnsEmptyString() {
        Date date = new Date(Long.MAX_VALUE);
        String formattedDate = Functions.dateFormat(date, "yyyy-MM-dd");
        assertEquals("", formattedDate);
    }
    @Test
    void testDateFormat_ValidDateWithTime_ReturnsFormattedDate() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "yyyy-MM-dd HH:mm:ss");
        assertEquals("2021-07-31 00:00:00", formattedDate);
    }
    @Test
    void testDateFormat_ValidDateWithDifferentPattern_ReturnsFormattedDate() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "dd/MM/yyyy");
        assertEquals("31/07/2021", formattedDate);
    }
    @Test
    void testDateFormat_ValidDateWithCustomPattern_ReturnsFormattedDate() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "MMMM dd, yyyy");
        assertEquals("July 31, 2021", formattedDate);
    }
    @Test
    void testDateFormat_ValidDateWithTimezone_ReturnsFormattedDate() {
        Date date = new Date(Long.parseLong("1627699200000"));
        String formattedDate = Functions.dateFormat(date, "yyyy-MM-dd HH:mm:ss z");
        assertEquals("2021-07-31 00:00:00 UTC", formattedDate);
    }
}