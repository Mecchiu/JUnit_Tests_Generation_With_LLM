```java
package visu.handball.moves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Main}.
 * It contains ten unit test cases for the {@link Main#getField()} method.
 */
class Main_4Test {

    @Test
    void testGetFieldNotNull() {
        assertNotNull(Main.getField());
    }

    @Test
    void testGetFieldInstance() {
        assertTrue(Main.getField() instanceof Field);
    }

    @Test
    void testGetFieldSameInstance() {
        assertSame(Main.getField(), Main.getField());
    }

    @Test
    void testGetFieldNotSameInstance() {
        Field field1 = Main.getField();
        Field field2 = new Field(new HandballModel(), new ColorModel());
        assertNotSame(field1, field2);
    }

    @Test
    void testGetFieldDimensions() {
        Field field = Main.getField();
        assertNotNull(field);
        assertEquals(0, field.getX());
        assertEquals(0, field.getY());
        assertEquals(100, field.getWidth());
        assertEquals(100, field.getHeight());
    }

    @Test
    void testGetFieldColorModelNotNull() {
        assertNotNull(Main.getField().getColorModel());
    }

    @Test
    void testGetFieldHandballModelNotNull() {
        assertNotNull(Main.getField().getHandballModel());
    }

    @Test
    void testGetFieldColorModelInstance() {
        assertTrue(Main.getField().getColorModel() instanceof ColorModel);
    }

    @Test
    void testGetFieldHandballModelInstance() {
        assertTrue(Main.getField().getHandballModel() instanceof HandballModel);
    }
}
```
