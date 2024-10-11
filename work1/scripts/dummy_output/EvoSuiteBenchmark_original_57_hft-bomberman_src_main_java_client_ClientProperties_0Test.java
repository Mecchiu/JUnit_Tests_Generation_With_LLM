package client;
java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientProperties_0Test {

    private ClientProperties clientProperties;

    @BeforeEach
    void setUp() {
        clientProperties = new ClientProperties("test_properties.xml");
    }

    @Test
    void testGetProperty_ElementExists_ReturnsValue() {
        String element = "existingElement";
        String expected = "existingValue";
        clientProperties.setProperty(element, expected);
        String actual = clientProperties.getProperty(element);
        assertEquals(expected, actual);
    }

    @Test
    void testGetProperty_ElementDoesNotExist_ReturnsEmptyString() {
        String element = "nonExistingElement";
        String actual = clientProperties.getProperty(element);
        assertEquals("", actual);
    }

    @Test
    void testGetProperty_EmptyElement_ReturnsEmptyString() {
        String element = "";
        String actual = clientProperties.getProperty(element);
        assertEquals("", actual);
    }

    @Test
    void testGetProperty_NullElement_ReturnsEmptyString() {
        String element = null;
        String actual = clientProperties.getProperty(element);
        assertEquals("", actual);
    }

    @Test
    void testGetProperty_SpecialCharactersElement_ReturnsValue() {
        String element = "specialElement";
        String expected = "!@#$%^&*()";
        clientProperties.setProperty(element, expected);
        String actual = clientProperties.getProperty(element);
        assertEquals(expected, actual);
    }

    @Test
    void testGetProperty_LongElementName_ReturnsValue() {
        String element = "thisIsAVeryLongElementNameThatMightExceedTheLimit";
        String expected = "longValue";
        clientProperties.setProperty(element, expected);
        String actual = clientProperties.getProperty(element);
        assertEquals(expected, actual);
    }

    @Test
    void testGetProperty_MultipleElements_ReturnsCorrectValues() {
        String element1 = "element1";
        String expected1 = "value1";
        clientProperties.setProperty(element1, expected1);

        String element2 = "element2";
        String expected2 = "value2";
        clientProperties.setProperty(element2, expected2);

        assertEquals(expected1, clientProperties.getProperty(element1));
        assertEquals(expected2, clientProperties.getProperty(element2));
    }

    @Test
    void testGetProperty_FileErrorTrue_ReturnsEmptyString() {
        clientProperties = new ClientProperties("nonExistingFile.xml");
        String element = "element";
        String actual = clientProperties.getProperty(element);
        assertEquals("", actual);
    }
}
