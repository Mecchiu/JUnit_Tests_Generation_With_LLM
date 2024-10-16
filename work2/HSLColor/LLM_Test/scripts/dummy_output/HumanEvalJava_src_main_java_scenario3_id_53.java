
package scenario3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AddTest {
   @Test
   void testAddPositiveNumbers() {
      assertEquals(1, Add.add(0, 1));
      assertEquals(1, Add.add(1, 0));
      assertEquals(5, Add.add(2, 3));
      assertEquals(12, Add.add(5, 7));
      assertEquals(12, Add.add(7, 5));
      assertEquals(1297, Add.add(572, 725));
      assertEquals(855, Add.add(51, 804));
      assertEquals(741, Add.add(645, 96));
      assertEquals(1565, Add.add(712, 853));
      assertEquals(324, Add.add(223, 101));
   }
   @Test
   void testAddNegativeNumbers() {
      assertEquals(-1, Add.add(-1, 0));
      assertEquals(-1, Add.add(0, -1));
      assertEquals(-5, Add.add(-2, -3));
      assertEquals(-12, Add.add(-5, -7));
      assertEquals(-12, Add.add(-7, -5));
      assertEquals(-1297, Add.add(-572, -725));
      assertEquals(-855, Add.add(-51, -804));
      assertEquals(-741, Add.add(-645, -96));
      assertEquals(-1565, Add.add(-712, -853));
      assertEquals(-324, Add.add(-223, -101));
   }
   @Test
   void testAddPositiveAndNegativeNumbers() {
      assertEquals(0, Add.add(-1, 1));
      assertEquals(0, Add.add(1, -1));
      assertEquals(1, Add.add(-2, 3));
      assertEquals(-2, Add.add(-5, 3));
      assertEquals(2, Add.add(5, -3));
      assertEquals(-1, Add.add(572, -573));
      assertEquals(753, Add.add(51, 702));
      assertEquals(-549, Add.add(-645, 96));
      assertEquals(141, Add.add(712, -571));
      assertEquals(-122, Add.add(-223, 101));
   }
   @Test
   void testAddZeros() {
      assertEquals(0, Add.add(0, 0));
      assertEquals(0, Add.add(0, -0));
      assertEquals(0, Add.add(-0, 0));
      assertEquals(0, Add.add(-0, -0));
   }
   @Test
   void testAddLargeNumbers() {
      assertEquals(1000000000, Add.add(999999999, 1));
      assertEquals(1000000000, Add.add(1, 999999999));
      assertEquals(2000000000, Add.add(1000000000, 1000000000));
      assertEquals(2000000000, Add.add(-1000000000, Integer.parseInt("3000000000")));
      assertEquals(-2000000000, Add.add(-1000000000, -1000000000));
      assertEquals(0, Add.add(1000000000, -1000000000));
      assertEquals(0, Add.add(-1000000000, 1000000000));
   }
   @Test
   void testAddSmallNumbers() {
      assertEquals(2, Add.add(1, 1));
      assertEquals(0, Add.add(1, -1));
      assertEquals(0, Add.add(-1, 1));
      assertEquals(-2, Add.add(-1, -1));
      assertEquals(3, Add.add(1, 2));
      assertEquals(3, Add.add(2, 1));
      assertEquals(0, Add.add(1, -1));
      assertEquals(0, Add.add(-1, 1));
      assertEquals(-3, Add.add(-1, -2));
      assertEquals(-3, Add.add(-2, -1));
   }
   @Test
   void testAddDifferentSigns() {
      assertEquals(0, Add.add(1, -1));
      assertEquals(0, Add.add(-1, 1));
      assertEquals(0, Add.add(1000000000, -1000000000));
      assertEquals(0, Add.add(-1000000000, 1000000000));
      assertEquals(0, Add.add(1000000000, -1000000000));
      assertEquals(0, Add.add(-1000000000, 1000000000));
   }
   @Test
   void testAddSameSigns() {
      assertEquals(2, Add.add(1, 1));
      assertEquals(-2, Add.add(-1, -1));
      assertEquals(3, Add.add(1, 2));
      assertEquals(-3, Add.add(-1, -2));
      assertEquals(0, Add.add(0, 0));
      assertEquals(0, Add.add(0, -0));
      assertEquals(0, Add.add(-0, 0));
      assertEquals(0, Add.add(-0, -0));
   }
   @Test
   void testAddSameSigns() {
      assertEquals(2, Add.add(1, 1));
      assertEquals(-2, Add.add(-1, -1));
      assertEquals(3, Add.add(1, 2));
      assertEquals(-3, Add.add(-1, -2));
      assertEquals(0, Add.add(0, 0));
      assertEquals(0, Add.add(0, -0));
      assertEquals(0, Add.add(-0, 0));
      assertEquals(0, Add.add(-0, -0));
   }
   @Test
   void testAddSameSigns() {
      assertEquals(2, Add.add(1, 1));
      assertEquals(-2, Add.add(-1, -1));
      assertEquals(3, Add.add(1, 2));
      assertEquals(-3, Add.add(-1, -2));
      assertEquals(0, Add.add(0, 0));
      assertEquals(0, Add.add(0, -0));
      assertEquals(0, Add.add(-0, 0));
      assertEquals(0, Add.add(-0, -0));
   }
   @Test
   void testAddSameSigns() {
      assertEquals(2, Add.add(1, 1));
      assertEquals(-2, Add.add(-1, -1));
      assertEquals(3, Add.add(1, 2));
      assertEquals(-3, Add.add(-1, -2));
      assertEquals(0, Add.add(0, 0));
      assertEquals(0, Add.add(0, -0));
      assertEquals(0, Add.add(-0, 0));
      assertEquals(0, Add.add(-0, -0));
   }
   @Test
   void testAddSameSigns() {
      assertEquals(2, Add.add(1, 1));
      assertEquals(-2, Add.add(-1, -1));
      assertEquals(3, Add.add(1, 2));
      assertEquals(-3, Add.add(-1, -2));
      assertEquals(0, Add.add(0, 0));
      assertEquals(0, Add.add(0, -0));
      assertEquals(0, Add.add(-0, 0));
      assertEquals(0, Add.add(-0, -0));
   }
}