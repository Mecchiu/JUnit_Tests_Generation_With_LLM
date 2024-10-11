// FenetrePrincipale_0Test.java
package fr.unice.gfarce.interGraph;

/**
 * classe qui dessine toute l interphace graphique
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.RespFormation;
import fr.unice.gfarce.main.Controler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FenetrePrincipale}.
* It contains one unit test case for the {@link FenetrePrincipale#dateLimForm()} method.
*/
class FenetrePrincipale_0Test {

    /**
     * Test for {@link FenetrePrincipale#FenetrePrincipale(String, String)}.
     */
    @Test
	public void test_FenetrePrincipale_0() throws Throwable {

	/*
	 * @Fix: We want to test with different dates
	 */
        	// System.out.println("---------------------------------------------------------------------------");
	Calendar cal = Calendar.getInstance(); 
	cal.clear();
        	
        	cal.setTimeZone(java.util.TimeZone.getDefault());
        	cal.set(2009, 1, 25, 3, 2, 3);
      	   	cal.set(Calendar.SECOND, 0);
      	   	cal.set(Calendar.MILLISECOND, 0);
      	   	cal.set(Calendar.MINUTE,0);
      	   	cal.set(Calendar.HOUR_OF_DAY, 0);
      	   	cal.set(Calendar.MINUTE, 0);
       		cal.set(Calendar.SECOND, 0);
       		cal.set(Calendar.MILLISECOND, 0);
        	
        	String date1 = cal.getDisplayName("dd/MM/yyyy", Calendar.FULL);
        	String date2 = cal.getDisplayName("dd/MM/yyyy", Calendar.NO_IGNORE_PARSing);
        	String date3 = cal.getDisplayName("dd.MM.yyyy", Calendar.FULL);
        	String date4 = cal.getDisplayName("DD.MM.yyyy", Calendar.NO_IGNORE_Parsing);
        	
        	assertEquals(date1,"DATE_LIMITED  2009-01-25 03:02:03",date2);
        	assertEquals(date1,"DATE_LIMITED  2009-01-25 03,02:03",date3);
          	assertEquals(date1,"DATE_LIMITED  2009-01-25 02:46:04",date4);
        	
        	String date = cal.getFormattedDate();
        	
        	assertEquals(date,"DATE_LIMITED  2009-01-25 03:02:03");
        	
    	/* 
           *  Test for an existing date
           */
           

        	// Calculate a limit date
    	    	Calendar limit = Calendar.getInstance();
    	    	limit.clear();
    	    	limit.setTimeZone(java.util.TimeZone.getDefault());
    	    	limit.set(2009, 1, 25, 3, 2, 3);
    	    	limit.set(Calendar.SECOND, 0);
    	    	limit.set(Calendar.MILLISECOND, 0);
    	    	limit.set(Calendar.MINUTE,0);
    	    	limit.set(Calendar.HOUR_OF_DAY, 0);
    	    	limit.set(Calendar.MINUTE, 0);
    	    	limit.set(Calendar.SECOND, 0);
    	    	limit.set(Calendar.MILLISECOND,0);
    	    	
    	    	cal.setTime(limit.getTime());
    	    	cal.set(Calendar.HOUR, 0);
    	    	cal.set(Calendar.MINUTE, 0);
    	    	cal.set(Calendar.SECOND, 0);
    	    	cal.setTime(limit.getTime());
    	        
        	
        	
        	// Test with an impossible date
        	String wrongDate
        		= DateLimit.generateRandomDate(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),cal.get(Calendar.HOUR_OF_DAY)+1,cal.get(Calendar.MINUTE)+1);

        	check(wrongDate, date);
        	
        	// Test with an impossible date format
        	wrongDate = dateLimit.replace("%D", "%m");
        	check(wrongDate, date);
        	
        	// Test with an impossible date format
        	wrongDate = dateLimit.replace("%H", "%m");
        	