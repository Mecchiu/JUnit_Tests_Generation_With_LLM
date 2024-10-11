package de.paragon.explorer.util;
java
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoggerFactoryTest {

    @Test
    void testMake() {
        // Test case 1
        Logger logger1 = LoggerFactory.make();
        assertNotNull(logger1);

        // Test case 2
        Logger logger2 = LoggerFactory.make();
        assertNotNull(logger2);

        // Test case 3
        assertNotEquals(logger1, logger2);

        // Add more test cases as needed
    }
}
