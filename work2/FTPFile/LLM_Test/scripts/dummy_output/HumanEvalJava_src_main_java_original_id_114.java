
package original;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MinsubarraysumTest {
   @Test
   void test1() {
    List<Object> nums = List.of(2, 3, 4, 1, 2, 4);
    long expected = 1;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test2() {
    List<Object> nums = List.of(-1, -2, -3);
    long expected = -6;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test3() {
    List<Object> nums = List.of(-1, -2, -3, 2, -10);
    long expected = -14;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test4() {
    List<Object> nums = List.of(-Long.parseLong("9999999999999999"));
    long expected = -Long.parseLong("9999999999999999");
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test5() {
    List<Object> nums = List.of(0, 10, 20, 1000000);
    long expected = 0;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test6() {
    List<Object> nums = List.of(-1, -2, -3, 10, -5);
    long expected = -6;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test7() {
    List<Object> nums = List.of(100, -1, -2, -3, 10, -5);
    long expected = -6;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test8() {
    List<Object> nums = List.of(10, 11, 13, 8, 3, 4);
    long expected = 3;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test9() {
    List<Object> nums = List.of(100, -33, 32, -1, 0, -2);
    long expected = -33;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test10() {
    List<Object> nums = List.of(-10);
    long expected = -10;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test11() {
    List<Object> nums = List.of(7);
    long expected = 7;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
   @Test
   void test12() {
    List<Object> nums = List.of(1, -1);
    long expected = -1;
    long actual = Minsubarraysum.minsubarraysum(nums);
    assertEquals(expected, actual);
   }
}