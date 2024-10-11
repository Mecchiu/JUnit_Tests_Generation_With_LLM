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
				// Inputs
				String message = "Are you sure you want to delete the selected texture?";
				String title = "Delete texture";
				String delete = "Delete";
				String cancel = "Cancel";
				// Expected result
				boolean expectedResult = true;
				// Call the method under test
				boolean result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 2
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 3
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 4
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 5
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 6
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 7
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 8
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 9
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
				// Test case 10
				// Inputs
				message = "Are you sure you want to delete the selected texture?";
				title = "Delete texture";
				delete = "Delete";
				cancel = "Cancel";
				// Expected result
				expectedResult = true;
				// Call the method under test
				result = TextureChoiceComponent.confirmDeleteSelectedCatalogTexture();
				// Check result
				assertEquals(expectedResult, result);
		}
}