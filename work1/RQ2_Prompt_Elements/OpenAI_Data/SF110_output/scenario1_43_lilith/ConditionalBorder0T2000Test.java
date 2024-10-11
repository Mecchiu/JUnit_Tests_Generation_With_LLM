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
	void getBorderInsets_thickness_0_innerThickness_0() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(0);
		Insets insets = border.getBorderInsets(null);
		assertEquals(0, insets.top);
		assertEquals(0, insets.left);
		assertEquals(0, insets.bottom);
		assertEquals(0, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_1_innerThickness_0() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(0);
		Insets insets = border.getBorderInsets(null);
		assertEquals(1, insets.top);
		assertEquals(1, insets.left);
		assertEquals(1, insets.bottom);
		assertEquals(1, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_0_innerThickness_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(1);
		Insets insets = border.getBorderInsets(null);
		assertEquals(1, insets.top);
		assertEquals(1, insets.left);
		assertEquals(1, insets.bottom);
		assertEquals(1, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_1_innerThickness_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(1);
		Insets insets = border.getBorderInsets(null);
		assertEquals(2, insets.top);
		assertEquals(2, insets.left);
		assertEquals(2, insets.bottom);
		assertEquals(2, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_2_innerThickness_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(1);
		Insets insets = border.getBorderInsets(null);
		assertEquals(3, insets.top);
		assertEquals(3, insets.left);
		assertEquals(3, insets.bottom);
		assertEquals(3, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_1_innerThickness_2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(2);
		Insets insets = border.getBorderInsets(null);
		assertEquals(3, insets.top);
		assertEquals(3, insets.left);
		assertEquals(3, insets.bottom);
		assertEquals(3, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_2_innerThickness_2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(2);
		Insets insets = border.getBorderInsets(null);
		assertEquals(4, insets.top);
		assertEquals(4, insets.left);
		assertEquals(4, insets.bottom);
		assertEquals(4, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_3_innerThickness_2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(3);
		border.setInnerThickness(2);
		Insets insets = border.getBorderInsets(null);
		assertEquals(5, insets.top);
		assertEquals(5, insets.left);
		assertEquals(5, insets.bottom);
		assertEquals(5, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_2_innerThickness_3() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(3);
		Insets insets = border.getBorderInsets(null);
		assertEquals(5, insets.top);
		assertEquals(5, insets.left);
		assertEquals(5, insets.bottom);
		assertEquals(5, insets.right);
	}
	
	@Test
	void getBorderInsets_thickness_3_innerThickness_3() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(3);
		border.setInnerThickness(3);
		Insets insets = border.getBorderInsets(null);
		assertEquals(6, insets.top);
		assertEquals(6, insets.left);
		assertEquals(6, insets.bottom);
		assertEquals(6, insets.right);
	}
}
```

## Test-Driven Development

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Testfall geschrieben wird, der eine Funktionalität beschreibt, die noch nicht implementiert ist. Dieser Testfall wird dann ausgeführt und scheitert, da die Funktionalität noch nicht implementiert ist. Anschließend wird die Funktionalität implementiert und der Testfall erneut ausgeführt. Der Testfall sollte nun erfolgreich sein.

### Test-Driven Development mit JUnit

JUnit ist ein Framework zum Testen von Java-Programmen. Es wird in der Regel zum Test-Driven Development verwendet.

#### Test-Klassen

Test-Klassen werden in JUnit mit der Annotation `@Test` gekennzeichnet.

```java
package de.huxhorn.lilith.swing.table.renderer;

import org.junit.jupiter.api.Test;

class ConditionalBorderTest {
	@Test
	void getBorderInsets_thickness_0_innerThickness_0() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(0);
		Insets insets = border.getBorderInsets(null);
		assertEquals(0, insets.top);
		assertEquals(0, insets.left);
		assertEquals(0, insets.bottom);
		assertEquals(0, insets.right);
	}
}
```

#### Test-Methoden

Test-Methoden werden in JUnit mit der Annotation `@Test` gekennzeichnet.

```java
package de.huxhorn.lilith.swing.table.renderer;

import org.junit.jupiter.api.Test;

class ConditionalBorderTest {
	@Test
	void getBorderInsets_thickness_0_innerThickness_0() {
		ConditionalBorder border = new ConditionalBorder();