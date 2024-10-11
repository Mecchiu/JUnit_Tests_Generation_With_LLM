// FixSpacesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {

	@Test
	void testFixSpaces() {
		assertEquals("Example", FixSpaces.fixSpaces("Example"));
		assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
		assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
		assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
		assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
		assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
		assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
		assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
		assertEquals("", FixSpaces.fixSpaces(""));
		assertEquals("_", FixSpaces.fixSpaces(" "));
	}
}

// Scenario3.java
package scenario3;

import java.util.Scanner;

/**
 * This class contains the main method to run the program.
 * It takes a string from the user and prints the result of {@link FixSpaces#fixSpaces(String)} method.
 */
public class Scenario3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println(FixSpaces.fixSpaces(text));
    }
}

// Scenario3Test.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Scenario3}.
 * It contains one unit test case for the {@link Scenario3#main(String[])} method.
 */
class Scenario3Test {

    @Test
    void testMain() {
        String[] args = null;
        Scenario3.main(args);
    }
}

// pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>scenario3</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>