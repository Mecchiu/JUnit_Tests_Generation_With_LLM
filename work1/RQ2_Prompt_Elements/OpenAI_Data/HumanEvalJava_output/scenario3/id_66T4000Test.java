// DigitsumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {

	@Test
	void testDigitSum_emptyString() {
		assertEquals(0, Digitsum.digitSum(""));
	}
	
	@Test
	void testDigitSum_abAB() {
		assertEquals(131, Digitsum.digitSum("abAB"));
	}
	
	@Test
	void testDigitSum_abcCd() {
		assertEquals(67, Digitsum.digitSum("abcCd"));
	}
	
	@Test
	void testDigitSum_helloE() {
		assertEquals(69, Digitsum.digitSum("helloE"));
	}
	
	@Test
	void testDigitSum_woArBld() {
		assertEquals(131, Digitsum.digitSum("woArBld"));
	}
	
	@Test
	void testDigitSum_aAaaaXa() {
		assertEquals(153, Digitsum.digitSum("aAaaaXa"));
	}
	
	@Test
	void testDigitSum_HowAreYou() {
		assertEquals(151, Digitsum.digitSum(" How are yOu?"));
	}
	
	@Test
	void testDigitSum_YouAreVerySmart() {
		assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
	}
	
	@Test
	void testDigitSum_allLowerCase() {
		assertEquals(0, Digitsum.digitSum("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testDigitSum_allUpperCase() {
		assertEquals(1330, Digitsum.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
}
```

## Scenario 4

```java
// Digitsum.java
package scenario4;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd")
     * 67
     * > digitSum("helloE")
     * 69
     * > digitSum("woArBld")
     * 131
     * > digitSum("aAaaaXa")
     * 153
     * > digitSum(" How are yOu?")
     * 151
     * > digitSum("You arE Very Smart")
     * 327
     */
    public static int digitSum(String s) {
    }
}

// DigitsumTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
		
	@Test
	void testDigitSum_emptyString() {
		assertEquals(0, Digitsum.digitSum(""));
	}
	
	@Test
	void testDigitSum_abAB() {
		assertEquals(131, Digitsum.digitSum("abAB"));
	}
	
	@Test
	void testDigitSum_abcCd() {
		assertEquals(67, Digitsum.digitSum("abcCd"));
	}
	
	@Test
	void testDigitSum_helloE() {
		assertEquals(69, Digitsum.digitSum("helloE"));
	}
	
	@Test
	void testDigitSum_woArBld() {
		assertEquals(131, Digitsum.digitSum("woArBld"));
	}
	
	@Test
	void testDigitSum_aAaaaXa() {
		assertEquals(153, Digitsum.digitSum("aAaaaXa"));
	}
	
	@Test
	void testDigitSum_HowAreYou() {
		assertEquals(151, Digitsum.digitSum(" How are yOu?"));
	}
	
	@Test
	void testDigitSum_YouAreVerySmart() {
		assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
	}
	
	@Test
	void testDigitSum_allLowerCase() {
		assertEquals(0, Digitsum.digitSum("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testDigitSum_allUpperCase() {
		assertEquals(1330, Digitsum.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
}
```

## Scenario 5

```java
// Digitsum.java
package scenario5;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd")
     * 67
     * > digitSum("helloE")
     * 69
     * > digitSum("woArBld")
     * 131
     * > digitSum("aAaaaXa")
     * 153
     * > digitSum(" How are yOu?")
     * 151
     * > digitSum("You arE Very Smart")
     * 327
     */
    public static int digitSum(String s) {
    }
}

// DigitsumTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
		
	@Test
	void testDigitSum_emptyString() {
		assertEquals(0, Digitsum.digitSum(""));
	}
	
	@Test
	void testDigitSum_abAB() {
		assertEquals(131, Digitsum.digitSum("abAB"));
	}
	
	@Test
	void testDigitSum_abcCd() {
		assertEquals(67, Digitsum.digitSum("abcCd"));
	}
	
	@Test
	void testDigitSum_helloE() {
		assertEquals(69, Digitsum.digitSum("helloE"));
	}
	
	@Test
	void testDigitSum_woArBld() {
		assertEquals(131, Digitsum.digitSum("woArBld"));
	}
	
	@Test
	void testDigitSum_aAaaaXa() {
		assertEquals(153, Digitsum.digitSum("aAaaaXa"));
	}
	
	@Test
	void testDigitSum_HowAreYou() {
		assertEquals(151, Digitsum.digitSum(" How are yOu?"));
	}
	
	@Test
	void testDigitSum_YouAreVerySmart() {
		assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
	}
	
	@Test
	void testDigitSum_allLowerCase() {
		assertEquals(0, Digitsum.digitSum("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testDigitSum_allUpperCase() {
		assertEquals(1330, Digitsum.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
}
```

## Scenario 6

```java
// Digitsum.java
package scenario6;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd")
     * 67
     * > digitSum("helloE")
     * 69
     * > digitSum("woArBld")
     * 131
     * > digitSum("aAaaaXa")
     * 153
     * > digitSum(" How are yOu?")
     * 151
     * > digitSum("You arE Very Smart")
     * 327
     */
    public static int digitSum(String s) {
    }
}

// DigitsumTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
		
	@Test
	void testDigitSum_emptyString() {
		assertEquals(0, Digitsum.digitSum(""));
	}
	
	@Test
	void testDigitSum_abAB() {
		assertEquals(131, Digitsum.digitSum("abAB"));
	}
	
	@Test
	void testDigitSum_abcCd() {
		assertEquals(67, Digitsum.digitSum("abcCd"));
	}
	
	@Test
	void testDigitSum_helloE() {
		assertEquals(69, Digitsum.digitSum("helloE"));
	}
	
	@Test
	void testDigitSum_woArBld() {
		assertEquals(131, Digitsum.digitSum("woArBld"));
	}
	
	@Test
	void testDigitSum_aAaaaXa() {
		assertEquals(153, Digitsum.digitSum("aAaaaXa"));
	}
	
	@Test
	void testDigitSum_HowAreYou() {
		assertEquals(151, Digitsum.digitSum(" How are yOu?"));
	}
	
	@Test
	void testDigitSum_YouAreVerySmart() {
		assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
	}
	
	@Test
	void testDigitSum_allLowerCase() {
		assertEquals(0, Digitsum.digitSum("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testDigitSum_allUpperCase() {
		assertEquals(1330, Digitsum.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
}
```

## Scenario 7

```java
// Digitsum.java
package scenario7;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd")
     * 67
     * > digitSum("helloE")
     * 69
     * > digitSum("woArBld")
     * 131
     * > digitSum("aAaaaXa")
     * 153
     * > digitSum(" How are yOu?")
     * 151
     * > digitSum("You arE Very Smart")
     * 327
     */
    public static int digitSum(String s) {
    }
}

// DigitsumTest.java
package scenario7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
		
	@Test
	void testDigitSum_emptyString() {
		assertEquals(0, Digitsum.digitSum(""));
	}
	
	@Test
	void testDigitSum_abAB() {
		assertEquals(131, Digitsum.digitSum("abAB"));
	}
	
	@Test
	void testDigitSum_abcCd() {
		assertEquals(67, Digitsum.digitSum("abcCd"));
	}
	
	@Test
	void testDigitSum_helloE() {
		assertEquals(69, Digitsum.digitSum("helloE"));
	}
	
	@Test
	void testDigitSum_woArBld() {
		assertEquals(131, Digitsum.digitSum("woArBld"));
	}
	
	@Test
	void testDigitSum_aAaaaXa() {
		assertEquals(153, Digitsum.digitSum("aAaaaXa"));
	}
	
	@Test
	void testDigitSum_HowAreYou() {
		assertEquals(151, Digitsum.digitSum(" How are yOu?"));
	}
	
	@Test
	void testDigitSum_YouAreVerySmart() {
		assertEquals(327, Digitsum.digitSum("You arE Very Smart"));
	}
	
	@Test
	void testDigitSum_allLowerCase() {
		assertEquals(0, Digitsum.digitSum("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testDigitSum_allUpperCase() {
		assertEquals(1330, Digitsum.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
}
```

## Scenario 8

```java
// Digitsum.java
package scenario8;

class Digitsum {

    /**
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     * Examples:
     * digitSum("") => 0
     * digitSum("abAB") => 131
     * digitSum("abcCd") => 67
     * digitSum("helloE") => 69
     * digitSum("woArBld") => 131
     * digitSum("aAaaaXa") => 153
     *
     * > digitSum("")
     * 0
     * > digitSum("abAB")
     * 131
     * > digitSum("abcCd