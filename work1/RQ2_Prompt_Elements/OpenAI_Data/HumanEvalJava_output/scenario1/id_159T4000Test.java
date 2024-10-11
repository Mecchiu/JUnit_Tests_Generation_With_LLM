// EatTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

	@Test
	void testEat() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 1, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 0, 1);
		assertEquals(Arrays.asList(0, 1), result);
		
		result = Eat.eat(0, 1, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 2, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 1, 2);
		assertEquals(Arrays.asList(1, 1), result);
		
		result = Eat.eat(0, 2, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 3, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 2, 3);
		assertEquals(Arrays.asList(2, 1), result);
		
		result = Eat.eat(0, 3, 3);
		assertEquals(Arrays.asList(3, 0), result);
	}
}

// Scenario1.java
package scenario1;

import java.util.Arrays;
import java.util.List;

/**
* This class contains the main method of the scenario 1.
* It contains the main method of the scenario 1.
*/
public class Scenario1 {

    /**
    * Main method of the scenario 1.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        List<Integer> result = Eat.eat(0, 0, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 0, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 3);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 3);
        System.out.println(result);
    }
}

// Scenario1Test.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Scenario1}.
* It contains ten unit test cases for the {@link Scenario1#main(java.lang.String[])} method.
*/
class Scenario1Test {
		
	@Test
	void testMain() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 1, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 0, 1);
		assertEquals(Arrays.asList(0, 1), result);
		
		result = Eat.eat(0, 1, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 2, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 1, 2);
		assertEquals(Arrays.asList(1, 1), result);
		
		result = Eat.eat(0, 2, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 3, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 2, 3);
		assertEquals(Arrays.asList(2, 1), result);
		
		result = Eat.eat(0, 3, 3);
		assertEquals(Arrays.asList(3, 0), result);
	}
}

// Scenario2.java
package scenario2;

import java.util.Arrays;
import java.util.List;

/**
* This class contains the main method of the scenario 2.
* It contains the main method of the scenario 2.
*/
public class Scenario2 {

    /**
    * Main method of the scenario 2.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        List<Integer> result = Eat.eat(0, 0, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 0, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 3);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 3);
        System.out.println(result);
    }
}

// Scenario2Test.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Scenario2}.
* It contains ten unit test cases for the {@link Scenario2#main(java.lang.String[])} method.
*/
class Scenario2Test {
		
	@Test
	void testMain() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 1, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 0, 1);
		assertEquals(Arrays.asList(0, 1), result);
		
		result = Eat.eat(0, 1, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 2, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 1, 2);
		assertEquals(Arrays.asList(1, 1), result);
		
		result = Eat.eat(0, 2, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 3, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 2, 3);
		assertEquals(Arrays.asList(2, 1), result);
		
		result = Eat.eat(0, 3, 3);
		assertEquals(Arrays.asList(3, 0), result);
	}
}

// Scenario3.java
package scenario3;

import java.util.Arrays;
import java.util.List;

/**
* This class contains the main method of the scenario 3.
* It contains the main method of the scenario 3.
*/
public class Scenario3 {

    /**
    * Main method of the scenario 3.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        List<Integer> result = Eat.eat(0, 0, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 0, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 3);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 3);
        System.out.println(result);
    }
}

// Scenario3Test.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Scenario3}.
* It contains ten unit test cases for the {@link Scenario3#main(java.lang.String[])} method.
*/
class Scenario3Test {
		
	@Test
	void testMain() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 1, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 0, 1);
		assertEquals(Arrays.asList(0, 1), result);
		
		result = Eat.eat(0, 1, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 2, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 1, 2);
		assertEquals(Arrays.asList(1, 1), result);
		
		result = Eat.eat(0, 2, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 3, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 2, 3);
		assertEquals(Arrays.asList(2, 1), result);
		
		result = Eat.eat(0, 3, 3);
		assertEquals(Arrays.asList(3, 0), result);
	}
}

// Scenario4.java
package scenario4;

import java.util.Arrays;
import java.util.List;

/**
* This class contains the main method of the scenario 4.
* It contains the main method of the scenario 4.
*/
public class Scenario4 {

    /**
    * Main method of the scenario 4.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        List<Integer> result = Eat.eat(0, 0, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 0);
        System.out.println(result);
        
        result = Eat.eat(0, 0, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 1);
        System.out.println(result);
        
        result = Eat.eat(0, 1, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 2);
        System.out.println(result);
        
        result = Eat.eat(0, 2, 3);
        System.out.println(result);
        
        result = Eat.eat(0, 3, 3);
        System.out.println(result);
    }
}

// Scenario4Test.java
package scenario4;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Scenario4}.
* It contains ten unit test cases for the {@link Scenario4#main(java.lang.String[])} method.
*/
class Scenario4Test {
		
	@Test
	void testMain() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 1, 0);
		assertEquals(Arrays.asList(0, 0), result);
		
		result = Eat.eat(0, 0, 1);
		assertEquals(Arrays.asList(0, 1), result);
		
		result = Eat.eat(0, 1, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 2, 1);
		assertEquals(Arrays.asList(1, 0), result);
		
		result = Eat.eat(0, 1, 2);
		assertEquals(Arrays.asList(1, 1), result);
		
		result = Eat.eat(0, 2, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 3, 2);
		assertEquals(Arrays.asList(2, 0), result);
		
		result = Eat.eat(0, 2, 3);
		assertEquals(Arrays.asList(2, 1), result);
		
		result = Eat.eat(0, 3, 3);
		assertEquals(Arrays.asList(3, 0), result);
	}
}

// Scenario5.java
package scenario5;

import java.util.Arrays;
import java.util.List;

/**
* This class contains the main method of the scenario 5.
* It contains the main method of the scenario 5.
*/
public class Scenario5 {

    /**
    * Main method of the scenario 5.
    * @param args the command line arguments
   