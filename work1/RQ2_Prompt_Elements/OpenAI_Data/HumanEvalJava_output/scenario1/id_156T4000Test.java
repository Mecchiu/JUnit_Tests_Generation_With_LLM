// IntToMiniRomanTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {

		@Test
		void testIntToMiniRoman() {
				assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
				assertEquals("ii", IntToMiniRoman.intToMiniRoman(2));
				assertEquals("iii", IntToMiniRoman.intToMiniRoman(3));
				assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
				assertEquals("v", IntToMiniRoman.intToMiniRoman(5));
				assertEquals("vi", IntToMiniRoman.intToMiniRoman(6));
				assertEquals("vii", IntToMiniRoman.intToMiniRoman(7));
				assertEquals("viii", IntToMiniRoman.intToMiniRoman(8));
				assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
				assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
		}
}

// MiniRomanToInt.java
package scenario1;

class MiniRomanToInt {

    public static int miniRomanToInt(String miniRoman) {
        int result = 0;
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        for (int i = 0; i < symbols.length; i++) {
            while (miniRoman.startsWith(symbols[i])) {
                result += values[i];
                miniRoman = miniRoman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// MiniRomanToIntTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MiniRomanToInt}.
* It contains ten unit test cases for the {@link MiniRomanToInt#miniRomanToInt(String)} method.
*/
class MiniRomanToIntTest {
		
		@Test
		void testMiniRomanToInt() {
				assertEquals(1, MiniRomanToInt.miniRomanToInt("i"));
				assertEquals(2, MiniRomanToInt.miniRomanToInt("ii"));
				assertEquals(3, MiniRomanToInt.miniRomanToInt("iii"));
				assertEquals(4, MiniRomanToInt.miniRomanToInt("iv"));
				assertEquals(5, MiniRomanToInt.miniRomanToInt("v"));
				assertEquals(6, MiniRomanToInt.miniRomanToInt("vi"));
				assertEquals(7, MiniRomanToInt.miniRomanToInt("vii"));
				assertEquals(8, MiniRomanToInt.miniRomanToInt("viii"));
				assertEquals(9, MiniRomanToInt.miniRomanToInt("ix"));
				assertEquals(10, MiniRomanToInt.miniRomanToInt("x"));
		}
}

// RomanToInt.java
package scenario1;

class RomanToInt {

    public static int romanToInt(String roman) {
        int result = 0;
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }
}

// RomanToIntTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RomanToInt}.
* It contains ten unit test cases for the {@link RomanToInt#romanToInt(String)} method.
*/
class RomanToIntTest {
		
		@Test
		void testRomanToInt() {
				assertEquals(1, RomanToInt.romanToInt("i"));
				assertEquals(2, RomanToInt.romanToInt("ii"));
				assertEquals(3, RomanToInt.romanToInt("iii"));
				assertEquals(4, RomanToInt.romanToInt("iv"));
				assertEquals(5, RomanToInt.romanToInt("v"));
				assertEquals(6, RomanToInt.romanToInt("vi"));
				assertEquals(7, RomanToInt.romanToInt("vii"));
				assertEquals(8, RomanToInt.romanToInt("viii"));
				assertEquals(9, RomanToInt.romanToInt("ix"));
				assertEquals(10, RomanToInt.romanToInt("x"));
		}
}

// Scenario1.java
package scenario1;

import java.util.Scanner;

/**
* This class is the main class of the scenario 1.
* It contains the main method of the scenario 1.
*/
public class Scenario1 {

    /**
    * This is the main method of the scenario 1.
    * It contains the main menu of the scenario 1.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Convert integer to mini roman");
            System.out.println("2. Convert mini roman to integer");
            System.out.println("3. Convert integer to roman");
            System.out.println("4. Convert roman to integer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    int number = scanner.nextInt();
                    System.out.println("The mini roman is: " + IntToMiniRoman.intToMiniRoman(number));
                    break;
                case 2:
                    System.out.print("Enter a mini roman: ");
                    String miniRoman = scanner.next();
                    System.out.println("The integer is: " + MiniRomanToInt.miniRomanToInt(miniRoman));
                    break;
                case 3:
                    System.out.print("Enter an integer: ");
                    number = scanner.nextInt();
                    System.out.println("The roman is: " + IntToRoman.intToRoman(number));
                    break;
                case 4:
                    System.out.print("Enter a roman: ");
                    String roman = scanner.next();
                    System.out.println("The integer is: " + RomanToInt.romanToInt(roman));
                    break;
                case 5:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}