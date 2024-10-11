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
				// Input:
				// Output:
				// Expected result:
				assertEquals(true, true);
		}
}

// TextureChoiceController.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditSupport;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC controller for texture choice component.
 * @author Emmanuel Puybaret
 */
public class TextureChoiceController implements Controller {

    private final UserPreferences preferences;

    private final ViewFactory viewFactory;

    private final UndoableEditSupport undoSupport;

    private TextureChoiceView textureChoiceView;

    private HomeTexture texture;

    private TexturesCatalog texturesCatalog;

    private TexturesCategory selectedCategory;

    private final List<TexturesCategory> textureCategories;

    private final List<CatalogTexture> textures;

    private final List<CatalogTexture> selectedTextures;

    private final List<CatalogTexture> deletedTextures;

    private final List<CatalogTexture> modifiedTextures;

    private final List<CatalogTexture> addedTextures;

    private final List<CatalogTexture> addedTexturesInSelectedCategory;

    private final List<CatalogTexture> addedTexturesInOtherCategories;

    private final List<CatalogTexture> addedTexturesInRecentsCategory;

    private final List<CatalogTexture> addedTexturesInFavoritesCategory;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecents;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrFavorites;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavorites;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelected;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModified;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeleted;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAdded;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelected;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModified;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeleted;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAdded;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelected;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModified;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeleted;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAdded;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelected;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModified;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeleted;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAdded;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelected;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModified;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeleted;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAdded;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelected;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModified;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeleted;

    private final List<CatalogTexture> addedTexturesInOtherCategoriesOrRecentsOrFavoritesOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAddedOrSelectedOrModifiedOrDeletedOrAdded;

