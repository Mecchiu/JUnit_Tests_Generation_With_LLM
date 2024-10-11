// HowManyTimesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains one unit test case for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {

    @Test
        public void testNumberOfGreetings() {
		assertThat("Number of greetings is 0", howManyTimes("hello"), equalTo(0));
        }
}
