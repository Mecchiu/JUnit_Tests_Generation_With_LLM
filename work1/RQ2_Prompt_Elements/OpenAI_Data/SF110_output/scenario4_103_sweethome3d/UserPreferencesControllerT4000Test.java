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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
		public void testMayImportLanguageLibrary() {
				UserPreferences preferences = new UserPreferences();
				ViewFactory viewFactory = new ViewFactory() {
						@Override
						public DialogView createUserPreferencesView(UserPreferencesController controller, View parentView) {
								return null;
						}
				};
				ContentManager contentManager = new ContentManager() {
						@Override
						public void importLanguageLibrary(String languageLibraryName) {
						}
				};
				UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
				assertTrue(controller.mayImportLanguageLibrary());
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
* Test class of {@link UserPreferencesController