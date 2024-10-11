// VowelsCountTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains one unit test case for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
@Test void test_vowelsCount_vowelsCount_1() { vowelsCount("a"); }
		@Test void test_vowelsCount_vowelsCount_2() { vowelsCount("aeiouvbAeEiouvbeAeiouvBiEeiouvbEiouvBeAeiouvB"); }
		@Test void test_vowelsCount_vowelsCount_3() { vowelsCount("YayioyuayaeEiouvbhAeiouvu"); }
}

//VowelsCountTest.java