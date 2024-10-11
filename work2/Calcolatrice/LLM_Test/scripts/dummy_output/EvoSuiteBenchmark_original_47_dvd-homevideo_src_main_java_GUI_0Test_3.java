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
		public static void main (String[] args) {
			String[] testCase = {"checkForModules"
			};
			boolean result = true;
			for (int i = 0; result && i < testCase.length; i++) {
				try {
					result = checkForModules(testCase[i]);
				} catch (Exception e) {
					result = false;
				}
			}
			assertTrue("ERROR_MESSAGE", result);
		}
		/**
		Returns a boolean indicating if the module is present.
		*/
		public static boolean checkForModules(String s) throws IOException {
			StringTokenizer args = new StringTokenizer(s,
				";");
			boolean returnValue = true;
			// check for 1) the module is loaded and return value=true;
                 if (args.hasMoreTokens()) {
                        String mName = args.nextToken();
			if (!args.hasMoreTokens()) {
                    throw new IllegalArgumentException(
						 "module name not specified.");
                } else {
                    mName = args.nextToken();
                    if (!args.hasMoreTokens()) {
                    throw new IllegalArgumentException(
						 "module name not specified.");
                    }
                }
			if (!mName.endsWith("mod")) {
                                throw new IllegalArgumentException(
                        	"module name must end with'mod'.");
                        }
                        if (!hasDir(mName + File.separator + "/mod")) {
                            throw new IllegalArgumentException(
                                "module directory " + mName +
                              " must exist and its path must end with " +
                              "'/mod'.");
                        }
			if (!isDir(mName)) {
				throw new IllegalArgumentException( "module " + mName +
                            " does not exist!");
			}
			
                        if(getFile(mName).exists()) {
                            throw new IllegalArgumentException(
                                "module " + mName +
                               " does not exist!");
                        }
				
                        Module module = getModule(mName);
                        returnValue = module.getVersion()!= -1 || 
                            module.getDescription().length()!= 0;
            }
			return returnValue;
		}
		public static boolean hasDir(String s) {
			FileFilter filter = new FileFilter() {
					public boolean accept(File f) {
						try {
							return f.isDirectory();
						} catch (Exception e) {
							return false;
						}
					}
                };
                     File f = new File(s);
                        return f.exists() && f.isDirectory()
                        ;
		}
		public static boolean isDir(String s) {
							return s.startsWith("/")
			&& s.endsWith("/");
		}
		public static Module getModule(String s) {
			StringTokenizer args = new StringTokenizer(s,
				";");
                                                 	  return new Module(args.nextToken());
		}
		public static byte[] getFile(String s) throws FileNotFoundException {
            File file = new File(s);
                    return file.length()!= 0
				? readBytesFromFile(s)
				: null;
		}
		public static byte[] readBytesFromFile(String s) {
            try {
                    if (s.endsWith("txt"))
                        FileReader fr = new FileReader(new File(s));
                    else
                        FileReader fr = new FileReader(s);
                        return new byte[0]; 
            } catch (FileNotFoundException e) {
                System.out.println(e);
                byte[] b = (new BufferedReader(new InputStreamReader(new FileInputStream(s))));
                System.out.println("loaded from file: " +
                    new String(b));
                return b;   
        }}
}