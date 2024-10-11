
package scenario2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SumToNTest {
   @Test
   void testSumToN1() {
    int n = 0;
    int expected = 0;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN2() {
    int n = 1;
    int expected = 1;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN3() {
    int n = 5;
    int expected = 15;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN4() {
    int n = 10;
    int expected = 55;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN5() {
    int n = -1;
    int expected = 0;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN6() {
    int n = 100;
    int expected = 5050;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN7() {
    int n = 1000;
    int expected = 500500;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN8() {
    int n = 10000;
    int expected = 50005000;
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN9() {
    int n = 100000;
    int expected = Integer.parseInt("5000050000");
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
   @Test
   void testSumToN10() {
    int n = 1000000;
    int expected = Integer.parseInt("500000500000");
    int actual = SumToN.sumToN(n);
    assertEquals(expected, actual);
   }
}