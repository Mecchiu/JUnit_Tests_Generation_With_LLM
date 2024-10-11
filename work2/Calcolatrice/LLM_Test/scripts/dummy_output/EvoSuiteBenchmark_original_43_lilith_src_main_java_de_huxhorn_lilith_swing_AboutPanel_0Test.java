// AboutPanel_0Test.java
package de.huxhorn.lilith.swing;

import de.huxhorn.sulky.swing.GraphicsUtilities;
import de.huxhorn.sulky.swing.filters.ColorTintFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AboutPanel}.
* It contains ten unit test cases for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
*/
class AboutPanel_0Test {
		@Test
void testGetToolTipText_InsideScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertEquals("Scroll Area Tooltip", tooltip);
}

@Test
void testGetToolTipText_OutsideScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 150, 150, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_NullToolTipText() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_MouseEventHandlingBackground() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");
    aboutPanel.setMouseEventHandling(AboutPanel.MOUSE_BACKGROUND);

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_MouseEventHandlingScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");
    aboutPanel.setMouseEventHandling(AboutPanel.MOUSE_SCROLLAREA);

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertEquals("Scroll Area Tooltip", tooltip);
}

@Test
void testGetToolTipText_MouseEventHandlingDisabled() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");
    aboutPanel.setMouseEventHandling(AboutPanel.MOUSE_DISABLED);

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_NullMouseEvent() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(null);
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_NullScrollArea() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollAreaToolTipText("Scroll Area Tooltip");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertNull(tooltip);
}

@Test
void testGetToolTipText_EmptyScrollAreaToolTipText() {
    AboutPanel aboutPanel = new AboutPanel();
    aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
    aboutPanel.setScrollAreaToolTipText("");

    String tooltip = aboutPanel.getToolTipText(new MouseEvent(aboutPanel, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, 50, 50, 0, false));
    
    assertEquals("", tooltip);
}
}