// HSLColor_5Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HSLColor}.
* It contains ten unit test cases for the {@link HSLColor#setSaturation(int)} method.
*/
class HSLColor_5Test {
```java
@Test
void testSetSaturation_LowerBound() {
    HSLColor color = new HSLColor();
    color.setSaturation(0);
    assertEquals(0, color.getSaturation());
}

@Test
void testSetSaturation_UpperBound() {
    HSLColor color = new HSLColor();
    color.setSaturation(255);
    assertEquals(255, color.getSaturation());
}

@Test
void testSetSaturation_NegativeValue() {
    HSLColor color = new HSLColor();
    color.setSaturation(-50);
    assertEquals(0, color.getSaturation());
}

@Test
void testSetSaturation_AboveUpperBound() {
    HSLColor color = new HSLColor();
    color.setSaturation(300);
    assertEquals(255, color.getSaturation());
}

@Test
void testSetSaturation_MidValue() {
    HSLColor color = new HSLColor();
    color.setSaturation(128);
    assertEquals(128, color.getSaturation());
}

@Test
void testSetSaturation_ZeroValue() {
    HSLColor color = new HSLColor();
    color.setSaturation(0);
    assertEquals(0, color.getSaturation());
}

@Test
void testSetSaturation_MaxValue() {
    HSLColor color = new HSLColor();
    color.setSaturation(255);
    assertEquals(255, color.getSaturation());
}

@Test
void testSetSaturation_Incremental() {
    HSLColor color = new HSLColor();
    color.setSaturation(100);
    color.setSaturation(150);
    assertEquals(150, color.getSaturation());
}

@Test
void testSetSaturation_Decremental() {
    HSLColor color = new HSLColor();
    color.setSaturation(200);
    color.setSaturation(100);
    assertEquals(100, color.getSaturation());
}

@Test
void testSetSaturation_RandomValue() {
    HSLColor color = new HSLColor();
    color.setSaturation(75);
    assertEquals(75, color.getSaturation());
}
```
