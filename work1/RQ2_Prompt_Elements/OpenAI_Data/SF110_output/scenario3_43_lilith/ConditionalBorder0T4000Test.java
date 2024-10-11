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

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c);
}

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

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c);
}

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

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c);
}

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

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c);
}

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

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c);
}

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

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c);
}

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
		border.setTop