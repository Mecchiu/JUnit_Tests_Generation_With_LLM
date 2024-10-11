// Menu_1Test.java


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
* It contains one unit test case for the {@link Menu#createXML()} method.
*/
class Menu_1Test {
		
	/**
	 * Unit test for {@link Menu#DVDAuthorMenu}
	 */
	@Test
    public final void unitTestDVDAuthorMenu() {
		
		// createMenu();
		this.m_GUI = new DVD_GUI();
		this.m_GUI.setMenu(this.createXML());
		
//		System.out.println(this.m_GUI);
//		this.m_GUI.dvdMenu = "dvd - menu";
//		this.m_GUI.dvd_menu.run();

    }

}


/**
* Unit test for the Menu class.
*/
class Menu implements Runnable {

	/**
    * Creates a new instance of a Menu class
    */
    public Menu() {
    }

  	/**
  	 * Adds menuItem to the menu
  	 * @param   menuItem - A menu item to be added to the menu
  	 * @param   isPAL_Menu - Is this a PAL-menu video
  	 */

  	public void MenuAddItem(String menuItem, boolean isPAL_Menu) {

  		if (StringTools.isWholeWord(menuItem)) {
  			throw new UnsupportedOperationException("Only menu words are accepted");
  		}
    	if (this.get_Menu() == null) {
      	this.dvdMenu = "dvd - menu";
	  }
    	String [] items = menuItem.split(" - ");
    	String title =items[0];
    	
    	if ((items.length == 3) && title.isEmpty()) {
 
  			return; // nothing to add
  		}

    	// we check is_PAL_Menu here to skip the call to "getMenu()"
  		this.pal_menu = isPAL_Menu && items[2].equals(".PAL");
  		ItemsMenuItem itemMenu = new ItemsMenuItem(title);

  		this.dvdMenu = dvdMenu + ".Menu";

  		for (int x=0; x < items.length; x++) {
  			itemMenu.ItemAdd(items[x]);
  		}


    	this.dvdMenu = this.dvdMenu + ".Menu";
    	addMenuItem(itemMenu);
    } 

  	/**
  	 * Returns current menu.
  	 * @return current menu.
  	 */
    public String get_Menu() {

    	return this.dvdMenu;
    }

  	/**
  	 * Sets the menu title.
  	 * @param   menuItem - A menu title.
  	 */
    public void MenuSetTitle(String menuItem) {

    	this.strTitle = menuItem;
    }

  	/**
  	 * Executed when Menu is triggered.
  	 */
    public void menuIsDone() {
    	this.m_GUI.setMenu(this.dvdMenu);
        this.m_GUI.setNumTitles(titles.length);
    }
}

class MenuItem {
    String Item;
    String title;

    MenuItem(String Item_, String Title) {
        this.Item = Item_;
        this.title = Title;
    }

    String Item() {
        return this.Item;
    }

    String title() {
        return this.title;
    }
}

class ItemsMenuItem extends Item {
    String title;

    ItemsMenuItem(String title) {
        this.title = title;
    }

    void Item() {
    }

    String title() {
	return title;
    }
}