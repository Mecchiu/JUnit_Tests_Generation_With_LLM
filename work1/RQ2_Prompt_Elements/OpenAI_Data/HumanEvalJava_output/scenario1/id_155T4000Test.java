// EvenOddCountTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {

	@Test
	void testEvenOddCount_1() {
		List<Integer> expected = Arrays.asList(1, 0);
		List<Integer> actual = EvenOddCount.evenOddCount(0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_2() {
		List<Integer> expected = Arrays.asList(1, 1);
		List<Integer> actual = EvenOddCount.evenOddCount(1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_3() {
		List<Integer> expected = Arrays.asList(2, 0);
		List<Integer> actual = EvenOddCount.evenOddCount(10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_4() {
		List<Integer> expected = Arrays.asList(2, 1);
		List<Integer> actual = EvenOddCount.evenOddCount(11);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_5() {
		List<Integer> expected = Arrays.asList(3, 0);
		List<Integer> actual = EvenOddCount.evenOddCount(100);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_6() {
		List<Integer> expected = Arrays.asList(3, 1);
		List<Integer> actual = EvenOddCount.evenOddCount(101);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_7() {
		List<Integer> expected = Arrays.asList(4, 0);
		List<Integer> actual = EvenOddCount.evenOddCount(1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_8() {
		List<Integer> expected = Arrays.asList(4, 1);
		List<Integer> actual = EvenOddCount.evenOddCount(1001);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_9() {
		List<Integer> expected = Arrays.asList(5, 0);
		List<Integer> actual = EvenOddCount.evenOddCount(10000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testEvenOddCount_10() {
		List<Integer> expected = Arrays.asList(5, 1);
		List<Integer> actual = EvenOddCount.evenOddCount(10001);
		assertEquals(expected, actual);
	}
}

// EvenOddCountTestRunner.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({EvenOddCountTest.class})
public class EvenOddCountTestRunner {
}

// EvenOddCountTestSuite.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite {
}

// EvenOddCountTestSuite2.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite2 {
}

// EvenOddCountTestSuite3.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite3 {
}

// EvenOddCountTestSuite4.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite4 {
}

// EvenOddCountTestSuite5.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite5 {
}

// EvenOddCountTestSuite6.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite6 {
}

// EvenOddCountTestSuite7.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite7 {
}

// EvenOddCountTestSuite8.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite8 {
}

// EvenOddCountTestSuite9.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite9 {
}

// EvenOddCountTestSuite10.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite10 {
}

// EvenOddCountTestSuite11.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite11 {
}

// EvenOddCountTestSuite12.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite12 {
}

// EvenOddCountTestSuite13.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite13 {
}

// EvenOddCountTestSuite14.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite14 {
}

// EvenOddCountTestSuite15.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite15 {
}

// EvenOddCountTestSuite16.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite16 {
}

// EvenOddCountTestSuite17.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite17 {
}

// EvenOddCountTestSuite18.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite18 {
}

// EvenOddCountTestSuite19.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite19 {
}

// EvenOddCountTestSuite20.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite20 {
}

// EvenOddCountTestSuite21.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite21 {
}

// EvenOddCountTestSuite22.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite22 {
}

// EvenOddCountTestSuite23.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite23 {
}

// EvenOddCountTestSuite24.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite24 {
}

// EvenOddCountTestSuite25.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite25 {
}

// EvenOddCountTestSuite26.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite26 {
}

// EvenOddCountTestSuite27.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite27 {
}

// EvenOddCountTestSuite28.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite28 {
}

// EvenOddCountTestSuite29.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite29 {
}

// EvenOddCountTestSuite30.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite30 {
}

// EvenOddCountTestSuite31.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("scenario1")
public class EvenOddCountTestSuite31 {
}

// EvenOddCountTestSuite32.java
package scenario1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages