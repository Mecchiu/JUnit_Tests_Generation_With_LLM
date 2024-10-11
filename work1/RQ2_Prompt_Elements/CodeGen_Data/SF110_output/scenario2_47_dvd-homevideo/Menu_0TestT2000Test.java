// Menu_0Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#init()} method.
*/
class Menu_0Test {

	/**
	* Test of getInputFileName method, of class Menu.
	*/
	@Test
	public void testGetInputFileName() {
		assertTrue(Menu.getInputFileName()!= "");
	}

	/**
	* Test of getDVDLog method, of class Menu.
	*/
	@Test
	public void testGetDVDLog() {
		assertTrue(Menu.getDVDLog()!= "");
	}

	/**
	* Test of getHelp method, of class Menu.
	*/
	@Test
	public void testGetHelp() {
		assertTrue(Menu.getHelp()!= "");
	}

	/**
	* Test of getMenuName method, of class Menu.
	*/
	@Test
	public void testGetMenuName() {
		assertTrue(Menu.getMenuName()!= "");
	}

	/**
	* Test of getMenuPath method, of class Menu.
	*/
	@Test
	public void testGetMenuPath() {
		assertTrue(Menu.getMenuPath()!= "");
	}

	/**
	* Test of getMenuTitle method, of class Menu.
	*/
	@Test
	public void testGetMenuTitle() {
		assertTrue(Menu.getMenuTitle()!= "");
	}

	/**
	* Test of isValidMenuName method, of class Menu.
	*/
	@Test
	public void testIsValidMenuName() {
		assertTrue(Menu.isValidMenuName("menu")==true);
	}

	/**
	* Test of isValidMenuPath method, of class Menu.
	*/
	@Test
	public void testIsValidMenuPath() {
		assertTrue(Menu.isValidMenuPath("menu")==true);
	}

	/**
	* Test of isValidMenuTitle method, of class Menu.
	*/
	@Test
	public void testIsValidMenuTitle() {
		assertTrue(Menu.isValidMenuTitle("menu")==true);
	}

	/**
	* Test of addMenuItem method, of class Menu.
	*/
	@Test
	public void testAddMenuItem() {
		String title, subTitle;
		String[] input;
		File dir = new File(".");
		String dirStr = dir.getName();
		
		input = new String[1];
		dirStr = dirStr.substring(dirStr.indexOf(".") + 1);
		System.out.println("Testing the directory string = "+dirStr);
		String menuName = dirStr+"/"+menuName;
		input[0] = menuName;
		
		try {
			System.out.println("Testing creating menu item of "+input[0]);
			Menu_0Test.menu = Menu.getMenu(input);
			Menu_0Test.menu.addMenuItem(
				"menu_item1_2",
				"item1_2_title",
				input[0]);

			if (Menu_0Test.menu == null) {
				assertTrue(false);
			}

			/* Search for the menu with this name */
			Menu_0Test.menu.searchMenu();
			/* Find Menu_0Test.menu and check that title is unique */
			Menu_0Test.Menu_0.firstItem();
			Menu_0Test.Menu_0.firstItem().setTitle("menu_item1_1");
			Menu_0Test.Menu_0.firstItem().setTitle("menu_item1_2");

			title = Menu_0Test.menu.getTitle();
			subTitle = Menu_0Test.menu.getSubTitle();

			assertTrue((title.compareTo(Menu_0Test.menu.getTitle())==0) &&
			(subTitle.compareTo(Menu_0Test.menu.getSubTitle())==0));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		
	}

	/**
	* Test of findMenuItem method, of class Menu.
	*/
	@Test
	public void testFindMenuItem() {
		String title, subTitle;
		String input;
		File dir = new File(".");
		String dirStr = dir.getName();
		String inputStr = "menu_item1_2";
		inputStr = inputStr.substring(inputStr.indexOf(".") + 1);
		String pathStr = directoryToFilename(dirStr);
		
		File menuItemDir = new File(dirStr);
		String menuItemFilename = directoryToFilename(menuItemDir);
		File menuItemPath = new File(pathStr);
		
		File menuFile = Menu.getMenu(inputStr);
		File titleFile = Menu_0Test.menu.getTitleFile();
		
		/* Test if the menu Item is the specified menuItem */
		int menuItemIndex = Menu_0Test.menu.findMenuItem(menuItemFilename);
			

		assertEquals(menuItemIndex,
			InputStreamReader.readInt(new BufferedReader(new InputStreamReader(new FileInputStream(menuItemPath), "UTF-8"))));

		/* Test if the title is present in the menuItem */
			
		if (titleFile.exists()) {
			/* Try to read the title (will fail for non UTF-8 input) */
			input = InputStreamReader.readUTF(new BufferedReader(
					new InputStreamReader(new FileInputStream(titleFile), "UTF-8")));
			
			title = menuItemDir.getName().concat("/"+input);
			subTitle = menuItemDir.getName().concat("/"+menuItemFilename);
				
			assertTrue(Menu_0Test.menu.findMenuItem(subTitle)+
				" is not associated with this menu item "+
				"but is "+titleFile);
		} else {
			assertTrue(menuItemDir.exists());
		}
	}

	/**
	* Test of findSubtitle method, of class Menu.
	