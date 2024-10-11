// UserPreferencesController.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC controller for user preferences view.
 *
 * @author Emmanuel Puybaret
 */
public class UserPreferencesController implements Controller {

    private HomeController homeController;
    private PropertyChangeSupport propertyChangeSupport;

    public UserPreferencesController() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public boolean mayImportLanguageLibrary() {
        return this.homeController != null;
    }

    public void setHomeController(HomeController homeController) {
        HomeController oldHomeController = this.homeController;
        this.homeController = homeController;
        this.propertyChangeSupport.firePropertyChange("homeController", oldHomeController, homeController);
    }

    public void addUserPreferencesListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removeUserPreferencesListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }
}

// UserPreferencesControllerTest.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UserPreferencesController}.
* It contains ten unit test cases for the {@link UserPreferencesController#mayImportLanguageLibrary()} method.
*/
class UserPreferencesControllerTest {

    @Test
    void testMayImportLanguageLibraryWithHomeController() {
        UserPreferencesController controller = new UserPreferencesController();
        HomeController homeController = new HomeController();
        controller.setHomeController(homeController);
        assertTrue(controller.mayImportLanguageLibrary());
    }

    @Test
    void testMayImportLanguageLibraryWithoutHomeController() {
        UserPreferencesController controller = new UserPreferencesController();
        assertFalse(controller.mayImportLanguageLibrary());
    }
}