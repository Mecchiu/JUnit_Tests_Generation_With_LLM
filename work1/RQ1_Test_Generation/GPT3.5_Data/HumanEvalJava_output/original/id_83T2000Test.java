```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartsOneEndsTest {

    @Test
    void testStartsOneEnds_n1() {
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
    }

    @Test
    void testStartsOneEnds_n2() {
        assertEquals(18, StartsOneEnds.startsOneEnds(2));
    }

    @Test
    void testStartsOneEnds_n3() {
        assertEquals(180, StartsOneEnds.startsOneEnds(3));
    }

    @Test
    void testStartsOneEnds_n4() {
        assertEquals(1800, StartsOneEnds.startsOneEnds(4));
    }

    @Test
    void testStartsOneEnds_n5() {
        assertEquals(18000, StartsOneEnds.startsOneEnds(5));
    }

    @Test
    void testStartsOneEnds_n6() {
        assertEquals(180000, StartsOneEnds.startsOneEnds(6));
    }

    @Test
    void testStartsOneEnds_n7() {
        assertEquals(1800000, StartsOneEnds.startsOneEnds(7));
    }

    @Test
    void testStartsOneEnds_n8() {
        assertEquals(18000000, StartsOneEnds.startsOneEnds(8));
    }

    @Test
    void testStartsOneEnds_n9() {
        assertEquals(180000000, StartsOneEnds.startsOneEnds(9));
    }

    @Test
    void testStartsOneEnds_n10() {
        assertEquals(1800000000, StartsOneEnds.startsOneEnds(10));
    }
}
```
