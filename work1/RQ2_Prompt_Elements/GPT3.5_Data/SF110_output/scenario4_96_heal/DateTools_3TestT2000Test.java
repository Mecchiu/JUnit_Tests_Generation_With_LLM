import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTools_3Test {

	@Test
	void testParse_NullDateString() {
		assertNull(DateTools.parse(null, DateTools.DEFAULT_DATE_FORMAT));
	}

	@Test
	void testParse_NullFormat() {
		assertNull(DateTools.parse("2021-01-01", null));
	}

	@Test
	void testParse_InvalidDateString() {
		assertNull(DateTools.parse("not a date", DateTools.DEFAULT_DATE_FORMAT));
	}

	@Test
	void testParse_InvalidFormat() {
		assertNull(DateTools.parse("2021-01-01", "not a format"));
	}

	@Test
	void testParse_ValidDateString_DefaultFormat() throws ParseException {
		Date expected = new SimpleDateFormat(DateTools.DEFAULT_DATE_FORMAT).parse("2021-01-01");
		Date actual = DateTools.parse("2021-01-01", DateTools.DEFAULT_DATE_FORMAT);
		assertEquals(expected, actual);
	}

	@Test
	void testParse_ValidDateString_LongFormat() throws ParseException {
		Date expected = new SimpleDateFormat(DateTools.LONG_DATE_FORMAT).parse("2021-01-01 12:00:00");
		Date actual = DateTools.parse("2021-01-01 12:00:00", DateTools.LONG_DATE_FORMAT);
		assertEquals(expected, actual);
	}

	@Test
	void testParse_ValidDateString_CustomFormat() throws ParseException {
		Date expected = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
		Date actual = DateTools.parse("01/01/2021", "dd/MM/yyyy");
		assertEquals(expected, actual);
	}

	@Test
	void testParse_ValidDateString_YearOnlyFormat() throws ParseException {
		Date expected = new SimpleDateFormat("yyyy").parse("2021");
		Date actual = DateTools.parse("2021", "yyyy");
		assertEquals(expected, actual);
	}

	@Test
	void testParse_InvalidDateString_ValidFormat() {
		assertNull(DateTools.parse("not a date", DateTools.LONG_DATE_FORMAT));
	}

	@Test
	void testParse_ValidDateString_InvalidFormat() {
		assertNull(DateTools.parse("2021-01-01", "not a format"));
	}

}