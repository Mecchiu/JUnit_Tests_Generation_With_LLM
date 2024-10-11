// Here's the source code for the Eat class and the EatTest class with ten unit test cases for the eat method.

// Eat.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class Eat {

    /**
     * * You're a hungry rabbit, and you already have eaten a certain number of carrots,
     * but now you need to eat more carrots to complete the day's meals.
     * you should return an array of [ total number of eaten carrots after your meals,
     * the number of carrots left after your meals ]
     * if there are not enough remaining carrots, you will eat all remaining carrots, but will still be hungry.
     *
     * Example:
     * * eat(5, 6, 10) -> [11, 4]
     * * eat(4, 8, 9) -> [12, 1]
     * * eat(1, 10, 10) -> [11, 0]
     * * eat(2, 11, 5) -> [7, 0]
     *
     * Variables:
     *
     * @number : integer
     * the number of carrots that you have eaten.
     * @need : integer
     * the number of carrots that you need to eat.
     * @remaining : integer
     * the number of remaining carrots that exist in stock
     *
     * Constrain:
     * * 0 <= number <= 1000
     * * 0 <= need <= 1000
     * * 0 <= remaining <= 1000
     *
     * Have fun :)
     *
     * > eat(5, 6, 10)
     * [11, 4]
     * > eat(4, 8, 9)
     * [12, 1]
     * > eat(1, 10, 10)
     * [11, 0]
     * > eat(2, 11, 5)
     * [7, 0]
     * > eat(4, 5, 7)
     * [9, 2]
     * > eat(4, 5, 1)
     * [5, 0]
     */
    public static List<Integer> eat(int number, int need, int remaining) {
        List<Integer> result = new ArrayList<>();
        int totalEaten = number + need;
        int leftOver = remaining - need;
        if (leftOver < 0) {
            totalEaten += leftOver;
            leftOver = 0;
        }
        result.add(totalEaten);
        result.add(leftOver);
        return result;
    }
}

// EatTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

    @Test
    void testEat1() {
        List<Integer> result = Eat.eat(5, 6, 10);
        assertEquals(11, result.get(0));
        assertEquals(4, result.get(1));
    }

    @Test
    void testEat2() {
        List<Integer> result = Eat.eat(4, 8, 9);
        assertEquals(12, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testEat3() {
        List<Integer> result = Eat.eat(1, 10, 10);
        assertEquals(11, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testEat4() {
        List<Integer> result = Eat.eat(2, 11, 5);
        assertEquals(7, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testEat5() {
        List<Integer> result = Eat.eat(4, 5, 7);
        assertEquals(9, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void testEat6() {
        List<Integer> result = Eat.eat(4, 5, 1);
        assertEquals(5, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testEat7() {
        List<Integer> result = Eat.eat(0, 0, 0);
        assertEquals(0, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testEat8() {
        List<Integer> result = Eat.eat(1000, 0, 1000);
        assertEquals(1000, result.get(0));
        assertEquals(1000, result.get(1));
    }

    @Test
    void testEat9() {
        List<Integer> result = Eat.eat(0, 1000, 0);
        assertEquals(1000, result.get(0));
        assertEquals(0, result.get(1));
    }

    @Test
    void testEat10() {
        List<Integer> result = Eat.eat(1000, 1000, 1000);
        assertEquals(2000, result.get(0));
        assertEquals(0, result.get(1));
    }
}