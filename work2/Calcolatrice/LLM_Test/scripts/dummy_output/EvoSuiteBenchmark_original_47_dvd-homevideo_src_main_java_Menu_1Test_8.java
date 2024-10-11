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
   * Method creating the menu.
     * @param m_GUI This is the GUI object used to control the form
   * @return   A boolean to determine if an error occurred in the function
   */
    public boolean createXML(GUI m_GUI) {
        
        m_GUI.addMenu("menu", "Menu");
        
        String strTitle = m_GUI.getTitle();
        
        if (strTitle.length() == 0)
        {
      		m_GUI.setMessage(this.baseErr+"You need to enter a title.");
        }
     		else
        {
      		
			File f = null;

			try
			{
				f = new File("menu/menu");
			}
			catch (Exception iex1)
			{
		 		m_GUI.setMessage(this.baseErr+"You need to specify a valid file on the menu path.");
				iex1.printStackTrace();
		 		return true;
			}
			
			m_GUI.changeMenu(f, strTitle);
        }
      		
    	
        m_GUI.enableOption(-1);

        
        String strPic = m_GUI.getMenuPic();
        
        String strAudio = m_GUI.getMenuAudio();
        
        int numVideoFiles = NumberUtils.toInt(strVideoFiles[NUMVIDFOLDS-1]);
        
        for (int i = 0; i < numVideoFiles; i++)
        {
          videodvd_menu = strVideoFiles[i];
          
						
				strPicPath = strVideoFiles[i] + "/" + strPic + "_pic";
				strAudioPath = strVideoFiles[i] + "/" + strAudio + "_audio";
				
				if (NUMVIDFOLDS == 1)
				{
          m_GUI.setMenuPic(strPicPath);
					m_GUI.setMenuAudio(strAudioPath);
				}
				else
				{
					
					m_GUI.changeMenu(strPicPath, strPic);
					m_GUI.changeMenu(strAudioPath, strAudio);
				
				}
        }
        
        return true;
    }
}