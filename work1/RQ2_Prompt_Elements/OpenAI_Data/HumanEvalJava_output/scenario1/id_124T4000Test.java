// ValidDateTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

		/**
		* Test case 1 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate1() {
				assertTrue(ValidDate.validDate("01-01-2000"));
		}
		
		/**
		* Test case 2 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate2() {
				assertTrue(ValidDate.validDate("02-29-2000"));
		}
		
		/**
		* Test case 3 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate3() {
				assertTrue(ValidDate.validDate("04-30-2000"));
		}
		
		/**
		* Test case 4 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate4() {
				assertTrue(ValidDate.validDate("06-30-2000"));
		}
		
		/**
		* Test case 5 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate5() {
				assertTrue(ValidDate.validDate("09-30-2000"));
		}
		
		/**
		* Test case 6 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate6() {
				assertTrue(ValidDate.validDate("11-30-2000"));
		}
		
		/**
		* Test case 7 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate7() {
				assertTrue(ValidDate.validDate("12-31-2000"));
		}
		
		/**
		* Test case 8 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate8() {
				assertFalse(ValidDate.validDate("02-30-2000"));
		}
		
		/**
		* Test case 9 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate9() {
				assertFalse(ValidDate.validDate("13-01-2000"));
		}
		
		/**
		* Test case 10 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate10() {
				assertFalse(ValidDate.validDate("01-01-200"));
		}
}

// ValidDateTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
		
		/**
		* Test case 1 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate1() {
				assertTrue(ValidDate.validDate("01-01-2000"));
		}
		
		/**
		* Test case 2 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate2() {
				assertTrue(ValidDate.validDate("02-29-2000"));
		}
		
		/**
		* Test case 3 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate3() {
				assertTrue(ValidDate.validDate("04-30-2000"));
		}
		
		/**
		* Test case 4 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate4() {
				assertTrue(ValidDate.validDate("06-30-2000"));
		}
		
		/**
		* Test case 5 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate5() {
				assertTrue(ValidDate.validDate("09-30-2000"));
		}
		
		/**
		* Test case 6 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate6() {
				assertTrue(ValidDate.validDate("11-30-2000"));
		}
		
		/**
		* Test case 7 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate7() {
				assertTrue(ValidDate.validDate("12-31-2000"));
		}
		
		/**
		* Test case 8 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate8() {
				assertFalse(ValidDate.validDate("02-30-2000"));
		}
		
		/**
		* Test case 9 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate9() {
				assertFalse(ValidDate.validDate("13-01-2000"));
		}
		
		/**
		* Test case 10 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate10() {
				assertFalse(ValidDate.validDate("01-01-200"));
		}
}

// ValidDate.java
package scenario2;

class ValidDate {

    public static Boolean validDate(String date) {
        if (date.length() != 10) {
            return false;
        }
        String[] dateArr = date.split("-");
        if (dateArr.length != 3) {
            return false;
        }
        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);
        if (month < 1 || month > 12) {
            return false;
        }
        if (month == 2) {
            if (day < 1 || day > 29) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                return false;
            }
        } else {
            if (day < 1 || day > 31) {
                return false;
            }
        }
        return true;
    }
}

// ValidDateTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
		
		/**
		* Test case 1 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate1() {
				assertTrue(ValidDate.validDate("01-01-2000"));
		}
		
		/**
		* Test case 2 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate2() {
				assertTrue(ValidDate.validDate("02-29-2000"));
		}
		
		/**
		* Test case 3 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate3() {
				assertTrue(ValidDate.validDate("04-30-2000"));
		}
		
		/**
		* Test case 4 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate4() {
				assertTrue(ValidDate.validDate("06-30-2000"));
		}
		
		/**
		* Test case 5 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate5() {
				assertTrue(ValidDate.validDate("09-30-2000"));
		}
		
		/**
		* Test case 6 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate6() {
				assertTrue(ValidDate.validDate("11-30-2000"));
		}
		
		/**
		* Test case 7 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate7() {
				assertTrue(ValidDate.validDate("12-31-2000"));
		}
		
		/**
		* Test case 8 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate8() {
				assertFalse(ValidDate.validDate("02-30-2000"));
		}
		
		/**
		* Test case 9 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate9() {
				assertFalse(ValidDate.validDate("13-01-2000"));
		}
		
		/**
		* Test case 10 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with an invalid date.
		*/
		@Test
		void testValidDate10() {
				assertFalse(ValidDate.validDate("01-01-200"));
		}
}

// ValidDate.java
package scenario3;

class ValidDate {

    public static Boolean validDate(String date) {
        if (date.length() != 10) {
            return false;
        }
        String[] dateArr = date.split("-");
        if (dateArr.length != 3) {
            return false;
        }
        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);
        if (month < 1 || month > 12) {
            return false;
        }
        if (month == 2) {
            if (day < 1 || day > 29) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                return false;
            }
        } else {
            if (day < 1 || day > 31) {
                return false;
            }
        }
        return true;
    }
}

// ValidDateTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
		
		/**
		* Test case 1 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate1() {
				assertTrue(ValidDate.validDate("01-01-2000"));
		}
		
		/**
		* Test case 2 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate2() {
				assertTrue(ValidDate.validDate("02-29-2000"));
		}
		
		/**
		* Test case 3 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate3() {
				assertTrue(ValidDate.validDate("04-30-2000"));
		}
		
		/**
		* Test case 4 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate4() {
				assertTrue(ValidDate.validDate("06-30-2000"));
		}
		
		/**
		* Test case 5 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate5() {
				assertTrue(ValidDate.validDate("09-30-2000"));
		}
		
		/**
		* Test case 6 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate6() {
				assertTrue(ValidDate.validDate("11-30-2000"));
		}
		
		/**
		* Test case 7 for {@link ValidDate#validDate(String)}.
		* This test case tests the method with a valid date.
		*/
		@Test
		void testValidDate7() {
				assertTrue(ValidDate.validDate("12-31-2000"));
		}
		
		/**
