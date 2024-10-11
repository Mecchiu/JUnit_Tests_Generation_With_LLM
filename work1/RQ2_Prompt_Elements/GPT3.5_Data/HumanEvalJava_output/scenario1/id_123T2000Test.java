import static org.junit.jupiter.api.Assertions.assertEquals;

class GetOddCollatzTest {

    @Test
    void testGetOddCollatzWithOne() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1));
    }

    @Test
    void testGetOddCollatzWithTwo() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(2));
    }

    @Test
    void testGetOddCollatzWithThree() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(3));
    }

    @Test
    void testGetOddCollatzWithFour() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(4));
    }

    @Test
    void testGetOddCollatzWithFive() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(5));
    }

    @Test
    void testGetOddCollatzWithSix() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(6));
    }

    @Test
    void testGetOddCollatzWithSeven() {
        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(7));
    }

    @Test
    void testGetOddCollatzWithEight() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(8));
    }

    @Test
    void testGetOddCollatzWithNine() {
        List<Integer> expected = new ArrayList<>();
        expected.add(9);
        expected.add(7);
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(9));
    }

    @Test
    void testGetOddCollatzWithTen() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(10));
    }
}