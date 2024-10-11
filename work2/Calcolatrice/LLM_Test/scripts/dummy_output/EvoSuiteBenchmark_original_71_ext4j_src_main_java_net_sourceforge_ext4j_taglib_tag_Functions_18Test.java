package net.sourceforge.ext4j.taglib.tag;
java
class Functions_18Test {

    @Test
    void testDateToMilliseconds_NullDate_ReturnsZero() {
        assertEquals(0, Functions.dateToMilliseconds(null));
    }

    @Test
    void testDateToMilliseconds_ValidDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JANUARY, 1, 0, 0, 0);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_FutureDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2050, Calendar.DECEMBER, 31, 23, 59, 59);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_PastDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_CurrentDate_ReturnsMilliseconds() {
        Date currentDate = new Date();
        long expectedMilliseconds = currentDate.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(currentDate));
    }

    @Test
    void testDateToMilliseconds_SameDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JANUARY, 1, 12, 30, 45);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_MinDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1970, Calendar.JANUARY, 1, 0, 0, 0);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_MaxDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(292278994, Calendar.DECEMBER, 31, 23, 59, 59);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_NegativeDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(-1000, Calendar.JANUARY, 1, 0, 0, 0);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }

    @Test
    void testDateToMilliseconds_EpochDate_ReturnsMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0);
        Date date = calendar.getTime();
        long expectedMilliseconds = date.getTime();
        assertEquals(expectedMilliseconds, Functions.dateToMilliseconds(date));
    }
}
