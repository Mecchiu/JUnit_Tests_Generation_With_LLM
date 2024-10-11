// Here's an example of how you can write unit tests for the Author class

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest {

    @Test
    public void testCreateDVDFileStructure() {
        // Create a mock GUI object
        GUI mockGUI = new GUI();

        // Create an instance of the Author class
        Author author = new Author();

        // Call the CreateDVDFileStructure method and check if it returns true
        assertTrue(author.CreateDVDFileStructure(mockGUI));
    }

    @Test
    public void testCreateDVDFileStructureWithNullGUI() {
        // Create a null GUI object
        GUI nullGUI = null;

        // Create an instance of the Author class
        Author author = new Author();

        // Call the CreateDVDFileStructure method with a null GUI object and check if it throws a NullPointerException
        assertThrows(NullPointerException.class, () -> author.CreateDVDFileStructure(nullGUI));
    }

    @Test
    public void testCreateDVDFileStructureWithInvalidInput() {
        // Create a mock GUI object with invalid input
        GUI mockGUI = new GUI();
        mockGUI.setInput("invalid input");

        // Create an instance of the Author class
        Author author = new Author();

        // Call the CreateDVDFileStructure method with invalid input and check if it throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> author.CreateDVDFileStructure(mockGUI));
    }

    // Add more test cases as needed
}