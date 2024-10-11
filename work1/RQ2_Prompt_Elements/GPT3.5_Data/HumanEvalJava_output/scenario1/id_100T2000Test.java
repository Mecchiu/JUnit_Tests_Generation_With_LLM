Here's the code for the MakeAPileTest class with ten unit test cases for the makeAPile method:

```
class MakeAPileTest {

    @Test
    void testMakeAPileWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, MakeAPile.makeAPile(0));
    }

    @Test
    void testMakeAPileWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, MakeAPile.makeAPile(1));
    }

    @Test
    void testMakeAPileWithTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, MakeAPile.makeAPile(2));
    }

    @Test
    void testMakeAPileWithThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        expected.add(3);
        assertEquals(expected, MakeAPile.makeAPile(3));
    }

    @Test
    void testMakeAPileWithFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(6);
        assertEquals(expected, MakeAPile.makeAPile(4));
    }

    @Test
    void testMakeAPileWithFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(7);
        expected.add(5);
        assertEquals(expected, MakeAPile.makeAPile(5));
    }

    @Test
    void testMakeAPileWithSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(10);
        expected.add(8);
        assertEquals(expected, MakeAPile.makeAPile(6));
    }

    @Test
    void testMakeAPileWithSeven() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        expected.add(11);
        expected.add(9);
        expected.add(7);
        assertEquals(expected, MakeAPile.makeAPile(7));
    }

    @Test
    void testMakeAPileWithEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(12);
        expected.add(10);
        assertEquals(expected, MakeAPile.makeAPile(8));
    }

    @Test
    void testMakeAPileWithNine() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(9);
        expected.add(11);
        expected.add(13);
        expected.add(15);
        expected.add(17);
        expected.add(13);
        expected.add(11);
        expected.add(9);
        assertEquals(expected, MakeAPile.makeAPile(9));
    }

    @Test
    void testMakeAPileWithTen() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(14);
        expected.add(12);
        assertEquals(expected, MakeAPile.makeAPile(10));
    }
}
```