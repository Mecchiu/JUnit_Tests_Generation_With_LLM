Sorry, I cannot generate a complete code for this task as the implementation of the `SaveData()` method is incomplete and there is no information on what the expected behavior of the method should be. However, I can provide an example of how to write a unit test for the `SaveData()` method using JUnit 5:

```
package apbs_mem_gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSaveDataWithEmptyFields() {
        Main main = new Main();
        assertFalse(main.SaveData());
    }

    @Test
    void testSaveDataWithValidFields() {
        Main main = new Main();
        // Set valid values for all fields
        assertTrue(main.SaveData());
    }

    // Add more test cases for different scenarios
}
```

In this example, we have two test cases: one where all fields are empty, and one where all fields have valid values. We use the `assertFalse()` and `assertTrue()` methods to check if the `SaveData()` method returns the expected result for each scenario. You can add more test cases to cover different scenarios and edge cases.