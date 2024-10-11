// AboutPanelTest.java
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
* It contains one unit test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
*/
class AboutPanelTest {

	// --------------------------------------------------------------------------
    //
    // --------------------------------------------------------------------------
    
    /**
    * Test of getToolTipText method, of class
    * {@link AboutPanel}.
    */
    @Test
    public void testGetToolTipText() {
        System.out.println("getToolTipText");
        AboutPanel panel1 = null;
        try {
            panel1 = new AboutPanel();
            assertTrue("getToolTipText() works!", panel1.isOpaque());
        }
        catch (Throwable ignored) {
        }
        panel1.setOpaque(false);
        panel1.setToolTipText(new StringBuilder(),"foo");
        assertTrue("getToolTipText() works!", panel1.isOpaque());
        panel1.setOpaque(true);
        assertFalse("getToolTipText() works!", panel1.isOpaque());
    }
    
	// --------------------------------------------------------------------------
    //
    // --------------------------------------------------------------------------
    
    /**
    * Test of changeEvent method, of class {@link AboutPanel}.
    */
    @Test
    public void testChangeEvent() {
        System.out.println("changeEvent");
        AboutPanel panel1 = null;
        try {
            panel1 = new AboutPanel();
            panel1.setOpaque(false);
            assertTrue("changeEvent() works!", panel1.isOpaque());
            panel1.setOpaque(true);
            assertTrue("changeEvent() works!", panel1.isOpaque());
            panel1.setOpaque(false);
            assertTrue("changeEvent() works!", panel1.isOpaque());
            panel1.setOpaque(true);
            assertFalse("changeEvent() works!", panel1.isOpaque());
            panel1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    panel1.setOpaque(false);
                    panel1.setOpaque(true);
                    panel.setOpaque(false);
                    panel.setOpaque(true);
                }
            });
            panel1.changeEvent(new ChangeEvent(panel1));
            assertTrue("changeEvent() works!", panel1.isOpaque());
            panel1.changeEvent(new ChangeEvent(panel1));
            assertFalse("changeEvent() works!", panel1.isOpaque());
            panel1.addPropertyChangeListener(new PropertyChangeListener() {
                public void propertyChange(PropertyChangeEvent evt) {
                    panel1.setOpaque(false);
                    panel1.setOpaque(true);
                }
            });
            try {
                panel1.changeEvent(new ChangeEvent(panel1));
                assertTrue("changeEvent() works!", panel1.isOpaque());
            }
            catch(Throwable th) {
                fail(th.toString());
            }
        }
        catch(Throwable th) {
            fail(th.toString());
        }
    }
    
}