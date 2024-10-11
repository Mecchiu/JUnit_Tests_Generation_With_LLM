Here's the source code for the FTest class with ten unit test cases for the f(int) method:

```
class FTest {

    @Test
    void testFWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, F.f(0));
    }

    @Test
    void testFWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, F.f(1));
    }

    @Test
    void testFWithTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, F.f(2));
    }

    @Test
    void testFWithThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        assertEquals(expected, F.f(3));
    }

    @Test
    void testFWithFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        assertEquals(expected, F.f(4));
    }

    @Test
    void testFWithFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        assertEquals(expected, F.f(5));
    }

    @Test
    void testFWithSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        assertEquals(expected, F.f(6));
    }

    @Test
    void testFWithSeven() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        assertEquals(expected, F.f(7));
    }

    @Test
    void testFWithEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        assertEquals(expected, F.f(8));
    }

    @Test
    void testFWithNine() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        expected.add(45);
        assertEquals(expected, F.f(9));
    }
}
```

These test cases cover different scenarios, including edge cases (n = 0, n = 1), even and odd values of n, and larger values of n.