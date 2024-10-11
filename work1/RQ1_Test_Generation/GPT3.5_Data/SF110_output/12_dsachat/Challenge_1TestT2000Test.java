```java
class Challenge_1Test {

    @Test
    void testDiceWithSides1() {
        assertEquals(1, Challenge.dice(1));
    }

    @Test
    void testDiceWithSides2() {
        int result = Challenge.dice(2);
        assertTrue(result >= 1 && result <= 2);
    }

    @Test
    void testDiceWithSides5() {
        int result = Challenge.dice(5);
        assertTrue(result >= 1 && result <= 5);
    }

    @Test
    void testDiceWithSides10() {
        int result = Challenge.dice(10);
        assertTrue(result >= 1 && result <= 10);
    }

    @Test
    void testDiceWithSides20() {
        int result = Challenge.dice(20);
        assertTrue(result >= 1 && result <= 20);
    }

    @Test
    void testDiceWithSides50() {
        int result = Challenge.dice(50);
        assertTrue(result >= 1 && result <= 50);
    }

    @Test
    void testDiceWithSides100() {
        int result = Challenge.dice(100);
        assertTrue(result >= 1 && result <= 100);
    }

    @Test
    void testDiceWithSides500() {
        int result = Challenge.dice(500);
        assertTrue(result >= 1 && result <= 500);
    }

    @Test
    void testDiceWithSides1000() {
        int result = Challenge.dice(1000);
        assertTrue(result >= 1 && result <= 1000);
    }

    @Test
    void testDiceWithSides10000() {
        int result = Challenge.dice(10000);
        assertTrue(result >= 1 && result <= 10000);
    }
}
```
```