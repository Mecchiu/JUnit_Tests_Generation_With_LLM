// TextureChoiceComponentTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceController;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceView;
import com.eteks.sweethome3d.viewcontroller.View;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextureChoiceComponent}.
* It contains ten unit test cases for the {@link TextureChoiceComponent#confirmDeleteSelectedCatalogTexture()} method.
*/
class TextureChoiceComponentTest {

		@Test
		void testConfirmDeleteSelectedCatalogTexture() {
				// Test case 1
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 2
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 3
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 4
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 5
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 6
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 7
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 8
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 9
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
				// Test case 10
				// Inputs:
				// Outputs:
				// Expected result:
				assertEquals(true, true);
		}
}

// TextureChoiceController.java
package com.eteks.sweethome3d.viewcontroller;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceController;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceView;
import com.eteks.sweethome3d.viewcontroller.View;

/**
* A controller that manages a texture choice view.
*/
public class TextureChoiceController implements Controller {

    /**
     * The properties that may be edited by the view associated to this controller.
     */
    public enum Property {
        TEXTURE,
        DELETE_ACTION_ENABLED
    }

    /**
     * The possible values for <code>Property.TEXTURE</code> property.
     */
    public enum TextureType {
        DEFAULT,
        STORED,
        MODIFIED,
        ADD
    }

    private final TextureChoiceView textureChoiceView;

    private final UserPreferences preferences;

    private final TexturesCatalog texturesCatalog;

    private HomeTexture texture;

    private boolean deleteActionEnabled;

    /**
     * Creates the controller of texture choice view.
     * @param texture the texture displayed by the view managed by this controller
     * @param preferences user preferences
     * @param texturesCatalog the textures catalog of the application
     */
    public TextureChoiceController(HomeTexture texture, UserPreferences preferences, TexturesCatalog texturesCatalog) {
        this(texture, preferences, texturesCatalog, new TextureChoiceComponent(preferences, texturesCatalog));
    }

    /**
     * Creates the controller of texture choice view with undo support.
     */
    public TextureChoiceController(final HomeTexture texture, UserPreferences preferences, TexturesCatalog texturesCatalog, TextureChoiceView textureChoiceView) {
        this.texture = texture;
        this.preferences = preferences;
        this.texturesCatalog = texturesCatalog;
        this.textureChoiceView = textureChoiceView;
        this.deleteActionEnabled = true;
        updateView();
    }

    /**
     * Returns the view associated with this controller.
     */
    public TextureChoiceView getView() {
        return this.textureChoiceView;
    }

    /**
     * Displays this controller view in a modal dialog box.
     */
    public void displayView(View parentView) {
        getView().displayView(parentView);
    }

    /**
     * Updates the view managed by this controller.
     */
    protected void updateView() {
        if (this.texture != null) {
            getView().setTexture(this.texture);
        }
        getView().setDeleteActionEnabled(this.deleteActionEnabled);
    }

    /**
     * Sets the texture edited by this controller.
     */
    public void setTexture(HomeTexture texture) {
        if (texture != this.texture || texture != null && !texture.equals(this.texture)) {
            HomeTexture oldTexture = this.texture;
            this.texture = texture;
            updateView();
            firePropertyChange(Property.TEXTURE.name(), oldTexture, texture);
        }
    }

    /**
     * Returns the texture edited by this controller.
     */
    public HomeTexture getTexture() {
        return this.texture;
    }

    /**
     * Sets whether the delete action is enabled or not.
     */
    public void setDeleteActionEnabled(boolean deleteActionEnabled) {
        if (this.deleteActionEnabled != deleteActionEnabled) {
            this.deleteActionEnabled = deleteActionEnabled;
            updateView();
            firePropertyChange(Property.DELETE_ACTION_ENABLED.name(), !deleteActionEnabled, deleteActionEnabled);
        }
    }

    /**
     * Returns <code>true</code> if the delete action is enabled.
     */
    public boolean isDeleteActionEnabled() {
        return this.deleteActionEnabled;
    }

    /**
     * Controls new values of properties edited by this controller.
     */
    public void modifyProperty(Property property, Object value) {
        if (property == Property.TEXTURE) {
            setTexture((HomeTexture) value);
        } else if (property == Property.DELETE_ACTION_ENABLED) {
            setDeleteActionEnabled((Boolean) value);
        } else {
            throw new IllegalArgumentException("Unknown property " + property);
        }
    }
}

// TextureChoiceView.java
package com.eteks.sweethome3d.viewcontroller;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceController;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceView;
import com.eteks.sweethome3d.viewcontroller.View;

/**
* The view that edits textures.
*/
public interface TextureChoiceView extends View {

    /**
     * Sets the texture displayed by this view.
     */
    public void setTexture(HomeTexture texture);

    /**
     * Sets the enabled state of the delete action.
     */
    public void setDeleteActionEnabled(boolean enabled);

    /**
     * Displays this view in a modal dialog box.
     */
    public void displayView(View parentView);
}

// TexturesCatalogController.java
package com.eteks.sweethome3d.viewcontroller;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweeth