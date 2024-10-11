// ConditionalBorderTest.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorderTest {

	@Test
	void testGetBorderInsets() {
		ConditionalBorder border = new ConditionalBorder();
		assertEquals(new Insets(0, 0, 0, 0), border.getBorderInsets(null));
		border.setTop(true);
		assertEquals(new Insets(1, 0, 0, 0), border.getBorderInsets(null));
		border.setLeft(true);
		assertEquals(new Insets(1, 1, 0, 0), border.getBorderInsets(null));
		border.setBottom(true);
		assertEquals(new Insets(1, 1, 1, 0), border.getBorderInsets(null));
		border.setRight(true);
		assertEquals(new Insets(1, 1, 1, 1), border.getBorderInsets(null));
		border.setTop(false);
		assertEquals(new Insets(0, 1, 1, 1), border.getBorderInsets(null));
		border.setLeft(false);
		assertEquals(new Insets(0, 0, 1, 1), border.getBorderInsets(null));
		border.setBottom(false);
		assertEquals(new Insets(0, 0, 0, 1), border.getBorderInsets(null));
		border.setRight(false);
		assertEquals(new Insets(0, 0, 0, 0), border.getBorderInsets(null));
	}
}
```

## Test-Driven Development

### Test-Driven Development

* Test-Driven Development (TDD) is a software development process that relies on the repetition of a very short development cycle:
  * First the developer writes an (initially failing) automated test case that defines a desired improvement or new function, then produces the minimum amount of code to pass that test, and finally refactors the new code to acceptable standards.
* Kent Beck, who is credited with having developed or "rediscovered" the technique, stated in 2003 that TDD encourages simple designs and inspires confidence.
* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right.
* Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

### Test-Driven Development Cycle

* Test-driven development is related to the test-