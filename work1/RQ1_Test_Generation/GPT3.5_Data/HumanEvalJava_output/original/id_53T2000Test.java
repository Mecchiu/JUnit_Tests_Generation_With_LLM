```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void testAdd_0_1() {
        assertEquals(1, Add.add(0, 1));
    }

    @Test
    void testAdd_1_0() {
        assertEquals(1, Add.add(1, 0));
    }

    @Test
    void testAdd_2_3() {
        assertEquals(5, Add.add(2, 3));
    }

    @Test
    void testAdd_5_7() {
        assertEquals(12, Add.add(5, 7));
    }

    @Test
    void testAdd_7_5() {
        assertEquals(12, Add.add(7, 5));
    }

    // Add more test cases here

}
```
