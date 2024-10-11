// OperatingSystemTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystemTest {

	@Test
	void testGetDefaultApplicationFolder() throws IOException {
		// Test 1
		File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 2
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 3
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 4
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 5
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 6
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 7
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 8
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 9
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
		
		// Test 10
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		assertTrue(defaultApplicationFolder.canRead());
		assertTrue(defaultApplicationFolder.canWrite());
	}
}

// Home.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;

/**
* A home is a 3D scene composed of <code>HomePieceOfFurniture</code> objects and <code>Wall</code> objects.
*/
public class Home {
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
	
	/**
	* Returns the name of this home.
	*/
	public String getName();
}

// HomeTest.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Home}.
* It contains ten unit test cases for the {@link Home#getName()} method.
*/
class HomeTest {
		
	@Test
	void testGetName() {
		// Test 1
		Home home = new Home();
		assertNotNull(home.getName());
		
		// Test 2
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 3
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 4
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 5
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 6
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 7
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 8
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 9
		home = new Home();
		assertNotNull(home.getName());
		
		// Test 10
		home = new Home();
		assertNotNull(home.getName());
	}
}

// HomePieceOfFurniture.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;

/**
* A piece of furniture in {@linkplain Home home}.
*/
public class HomePieceOfFurniture {
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
	
	/**
	* Returns the name of this piece of furniture.
	*/
	public String getName();
}

// HomePieceOfFurnitureTest.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HomePieceOfFurniture}.
* It contains ten unit test cases for the {@link HomePieceOfFurniture#getName()} method.
*/
class HomePieceOfFurnitureTest {
		
	@Test
	void testGetName() {
		// Test 1
		HomePieceOfFurniture piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 2
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 3
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 4
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 5
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 6
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 7
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 8
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 9
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
		
		// Test 10
		piece = new HomePieceOfFurniture();
		assertNotNull(piece.getName());
	}
}

// Wall.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;

/**
* A wall in {@linkplain Home home}.
*/
public class Wall {
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
	
	/**
	* Returns the name of this wall.
	*/
	public String getName();
}

// WallTest.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wall}.
* It contains ten unit test cases for the {@link Wall#getName()} method.
*/
class WallTest {
		
	@Test
	void testGetName() {
		// Test 1
		Wall wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 2
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 3
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 4
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 5
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 6
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 7
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 8
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 9
		wall = new Wall();
		assertNotNull(wall.getName());
		
		// Test 10
		wall = new Wall();
		assertNotNull(wall.getName());
	}
}

// HomeRecorder.java
package com.eteks.sweethome3d.model;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;

/**
* A recorder able to write and read homes in a file.
*/
public class HomeRecorder {
	
	/**
	* Writes the given home in a file.
	*/
	public void writeHome(Home home, File homeFile) throws RecorderException;
	
	/**
	* Writes the given home in a file.
	*/
	public void writeHome(Home home, File homeFile) throws RecorderException;
	
	/**
	* Writes the given home in a file.
	*/
	public void writeHome(Home home, File homeFile) throws RecorderException;
	
	/**
	* Writes the given home in a file.
	*/
	public void writeHome(Home home, File homeFile) throws RecorderException