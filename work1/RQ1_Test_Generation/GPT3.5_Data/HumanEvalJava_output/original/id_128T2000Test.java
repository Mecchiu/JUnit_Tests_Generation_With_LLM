```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdSignsTest {

    @Test
    void testProdSigns_case1() {
        assertEquals(-9, ProdSigns.prodSigns(List.of(1, 2, 2, -4)));
    }

    @Test
    void testProdSigns_case2() {
        assertEquals(0, ProdSigns.prodSigns(List.of(0, 1)));
    }

    @Test
    void testProdSigns_case3() {
        assertEquals(-10, ProdSigns.prodSigns(List.of(1, 1, 1, 2, 3, -1, 1)));
    }

    @Test
    void testProdSigns_case4() {
        assertNull(ProdSigns.prodSigns(List.of()));
    }

    @Test
    void testProdSigns_case5() {
        assertEquals(20, ProdSigns.prodSigns(List.of(2, 4, 1, 2, -1, -1, 9)));
    }

    @Test
    void testProdSigns_case6() {
        assertEquals(4, ProdSigns.prodSigns(List.of(-1, 1, -1, 1)));
    }

    @Test
    void testProdSigns_case7() {
        assertEquals(-4, ProdSigns.prodSigns(List.of(-1, 1, 1, 1)));
    }

    @Test
    void testProdSigns_case8() {
        assertEquals(0, ProdSigns.prodSigns(List.of(-1, 1, 1, 0)));
    }
}
```
