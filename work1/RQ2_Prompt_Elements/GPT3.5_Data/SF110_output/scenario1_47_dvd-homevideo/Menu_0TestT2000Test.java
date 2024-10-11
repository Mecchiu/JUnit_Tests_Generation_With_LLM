// Here's an example of how you can test the Menu class using JUnit 5:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void testInitWithDefaultValues() {
        Menu menu = new Menu();
        assertTrue(menu.init());
        // TODO: Add more assertions to check that the default values are used
    }

    @Test
    void testInitWithCustomValues() {
        // TODO: Create a test case where the user specifies custom values
        // and check that they are used correctly
    }

    // TODO: Add more test cases to cover different scenarios and edge cases
}