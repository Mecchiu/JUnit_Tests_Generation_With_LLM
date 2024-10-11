```java
import static org.junit.jupiter.api.Assertions.*;

class Main_8Test {

    @Test
    void testDeepCopy_NullObject_ReturnsNull() {
        assertNull(Main.deepCopy(null));
    }

    @Test
    void testDeepCopy_WithSerializableObject_ReturnsDeepCopy() {
        HandballModel original = new HandballModel();
        try {
            HandballModel copy = (HandballModel) Main.deepCopy(original);
            assertNotSame(original, copy);
            assertEquals(original.getClass(), copy.getClass());
        } catch (Exception e) {
            fail("Exception thrown during deep copy: " + e.getMessage());
        }
    }

    @Test
    void testDeepCopy_NonSerializableObject_ThrowsException() {
        Object nonSerializable = new Object();
        assertThrows(Exception.class, () -> Main.deepCopy(nonSerializable));
    }

    @Test
    void testDeepCopy_SameReferenceObject_ReturnsSameObject() {
        HandballModel original = new HandballModel();
        try {
            HandballModel copy = (HandballModel) Main.deepCopy(original);
            assertNotSame(original, copy);
            assertEquals(original.getClass(), copy.getClass());
        } catch (Exception e) {
            fail("Exception thrown during deep copy: " + e.getMessage());
        }
    }

    @Test
    void testDeepCopy_WithDifferentClassObject_ThrowsException() {
        ColorModel colorModel = new ColorModel();
        assertThrows(Exception.class, () -> Main.deepCopy(colorModel));
    }

    @Test
    void testDeepCopy_WithNullObject_ThrowsException() {
        assertThrows(Exception.class, () -> Main.deepCopy(null));
    }

    @Test
    void testDeepCopy_WithValidObject_ReturnsDeepCopy() {
        HandballModel original = new HandballModel();
        try {
            HandballModel copy = (HandballModel) Main.deepCopy(original);
            assertNotSame(original, copy);
            assertEquals(original.getClass(), copy.getClass());
        } catch (Exception e) {
            fail("Exception thrown during deep copy: " + e.getMessage());
        }
    }

    @Test
    void testDeepCopy_WithDifferentInstanceObject_ReturnsDeepCopy() {
        HandballModel original = new HandballModel();
        try {
            HandballModel copy = (HandballModel) Main.deepCopy(original);
            assertNotSame(original, copy);
            assertEquals(original.getClass(), copy.getClass());
        } catch (Exception e) {
            fail("Exception thrown during deep copy: " + e.getMessage());
        }
    }
}
```