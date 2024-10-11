```java
class SumSquares1Test {

    @Test
    void testSumSquares_case1() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        assertEquals(6, SumSquares1.sumSquares(lst));
    }

    @Test
    void testSumSquares_case2() {
        List<Object> lst = new ArrayList<>();
        assertEquals(0, SumSquares1.sumSquares(lst));
    }

    @Test
    void testSumSquares_case3() {
        List<Object> lst = new ArrayList<>();
        lst.add(-1);
        lst.add(-5);
        lst.add(2);
        lst.add(-1);
        lst.add(-5);
        assertEquals(-126, SumSquares1.sumSquares(lst));
    }

    // Add more test cases here

}
```
```