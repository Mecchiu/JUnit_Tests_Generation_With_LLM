// GUI_0Test.java


//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileFilter;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains one unit test case for the {@link GUI#checkForModules()} method.
*/
class GUI_0Test {
		
    private System getSystem() {
	return System.getProperty("os.name").toUpperCase();
    }
	
    /**
     * The test method that does the actual tests.
     * @throws Throwable
     */
    @Test
    void test_0() throws Throwable {
	if (getSystem() == System.OS.win32) {
	    JOptionPane.showMessageDialog(new JFrame(),
		"The dv camcorder test was skipped when win32 is the operating system.",
		"Warning", JOptionPane.WARNING_MESSAGE);
	    return;
	}
	String cmd = "xdvcamcorder ";
	if (getSystem() == System.OS.macosx) {
	   cmd = "xdvcamcorder -b -";
	}
	StringTokenizer tokens = new StringTokenizer(cmd, " ");
	tokens.nextToken();
	tokens.nextToken();
	tokens.nextToken();
	String inFile = null;
	String outFile = null;
	if (getSystem() == System.OS.linux &&
	    new File(tokens.nextToken()).exists()) {
	    inFile = tokens.nextToken();
	} else if (getSystem() == System.OS.sunos &&
		   new File(tokens.nextToken()).exists()) {
	    inFile = "c:\\camcrash\\libcamcrash1394/libcamcrash\\libcamcrash\\libcamcrash\\libcamcrash\\libcamcrash11\\libcamcrash11.dvcamcorder ";
	    outFile = tokens.nextToken();
	}
	switch (JOptionPane.showConfirmDialog
	    (javax.swing.JFrame.getRootPane(),
	     cmd,
	     "Xdv camcorder",
	     JOptionPane.YES_NO_OPTION,
	     JOptionPane.QUESTION_MESSAGE, null)) {
	case JOptionPane.YES_OPTION:
	    if (new File(outFile)).exists()) {
		break;
	    }
	case JOptionPane.NO_OPTION:
	    return;
	case JOptionPane.CLOSED_OPTION:
	    throw new IllegalStateException("Confirm aborted.");
	default:
	    throw new IllegalStateException("Confirm aborted.");
	}
	if ((getSystem() == System.OS.win32) &&
	    (tokens.nextToken().length() > 0)) {
	    JFileChooser fC = new JFileChooser();
	    fC.setCurrentDirectory(new File(inFile));
	    String o = fC.showSaveDialog(new JFrame());
	    javax.swing.FileFilter filter =
		(o == null? null : new javax.swing.FileFilter() {
		    public boolean accept(File file) { return (file.isDirectory() ||
			    (file.getName()).toLowerCase().endsWith(".dv")); }
		}   );
	    File out = new File(outFile + "." + filter.getExtension());
	    if ((out.exists() && out.canWrite()) || (!out.exists() &&!out.canWrite())) {
		fC.setCurrentDirectory(null);
		String outFilename = out.getAbsolutePath() + ".";
		outFilename += filter.getMimeType();
		outFilename += filter.getExtension();
		out = new File(outFilename);
		if (out.exists() && out.canWrite()) {
		    System.out.println("Saved output as " + outFilename);
		}
		out.deleteOnExit();
		fC.setSelectedFile(out);
		fC.setFileFilter(filter);
		int answer = fC.showSaveDialog(new JFrame());
		if (answer == JFileChooser.APPROVE_OPTION) {
		    inFile = fC.getSelectedFile().getAbsolutePath().substring(
			    fC.getSelectedFile().getAbsolutePath().length() - "c:".length());
		} else {
		    throw new Exception("Confirm aborted.");
		}
	    } else {
		throw new Exception("Output file is in a directory where dv camcorder cannot write.");
	    }
	}
	if (getSystem() == System.OS.macosx &&
	   !new File("/usr/bin/dvcamcorder -").exists()) {
	    throw new AssertionError("Unable to find \"/usr/bin/dvcamcorder -\"\n");
	}
	// if (isMacOsXDV()) {
	    javax.swing.UIManager.setLookAndFeel(
		    new javax.swing.SwingUtilities.
		    CurrentLookAndFeelClassName(javax.swing.UIManager.class.getClass().getClassLoader()));
	}
	/*
	javax.swing.UIManager.setLookAndFeel(
	    new javax.swing.SwingUtilities.
	    CurrentLookAndFeelClassName(javax.swing.UIManager.class.getClass().getClassLoader()));
	*/
	String[] args ={};
	run(tokens.nextToken(), args);
    }

}