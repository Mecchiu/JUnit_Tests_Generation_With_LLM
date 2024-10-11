Here's the source code for the MakeAPileTest class:

```
class MakeAPileTest {
    
    @Test
    void testMakeAPileWithOneLevel() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = MakeAPile.makeAPile(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithTwoLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        List<Integer> actual = MakeAPile.makeAPile(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithThreeLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(4);
        expected.add(2);
        List<Integer> actual = MakeAPile.makeAPile(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithFourLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(3);
        List<Integer> actual = MakeAPile.makeAPile(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithFiveLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(4);
        List<Integer> actual = MakeAPile.makeAPile(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithSixLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(5);
        List<Integer> actual = MakeAPile.makeAPile(6);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithSevenLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(6);
        List<Integer> actual = MakeAPile.makeAPile(7);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithEightLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(7);
        List<Integer> actual = MakeAPile.makeAPile(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithNineLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(9);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(22);
        expected.add(8);
        List<Integer> actual = MakeAPile.makeAPile(9);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithTenLevels() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(22);
        expected.add(24);
        expected.add(26);
        expected.add(9);
        List<Integer> actual = MakeAPile.makeAPile(10);
        assertEquals(expected, actual);
    }
}
```

This test class contains ten unit test cases for the `makeAPile` method of the `MakeAPile` class. Each test case tests the method with a different input value and checks that the output is correct. The `assertEquals` method is used to compare the expected output with the actual output.