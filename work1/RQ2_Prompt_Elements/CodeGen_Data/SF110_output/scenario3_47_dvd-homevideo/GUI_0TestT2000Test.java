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
 static public final boolean checkForModules();
        public static boolean m_stop;
		static public final String m_dvdPath = "/home/visha9/Desktop/DVD/";
		static public final String m_videoPath = "/home/visha9/Desktop/TV/";

		public static void main(String args[]) throws java.io.IOException {
			System.out.println("\nTest class of " + java.lang.System.getProperty("os.name") + ": "
					+ java.lang.System.getProperty("os.version"));
            if (m_stop) {
				return;
			}

            // Create a new video recorder and install into our system wide instance
            JFileChooser fd = new JFileChooser();

            // Show the dialog box asking for a path to a user provided
            // file.
			fd.setFileFilter(new FileFilter() {
				private String[] filters = {"*.dv", "*.avi", "*.tvi"};
                public boolean accept(final File file) {
					// return true if the file is a.dv file OR if it is a 
					//.avi file OR if the file is a.tif file
					try {
						int m = 0;
						for (int i = 0; i < filters.length; i++) {
							String extension = filters[i];
							if (file.getName().endsWith(extension)) {
								m++;
								if (m == filters.length || filesAreEqual(file, file.getParentFile(), ext)) {
									return true;
								}
							}
						}
						return false;
					} catch (Exception e) {
						return false;
					}
				}
				void getExtensions(String[] result) {
					// Result contains the.dv,.avi, and.tif files that should be 
					// included in result[]
					for (int i = 0; i < filters.length; i++) {
						String extension = filters[i];
						if (extension.endsWith(".dv")) {
							result[i] = "dv";
						} else if (extension.endsWith(".tvi")) {
							result[i] = "tvi";
						}
						System.out.println("Result File Name: " + result[i]);
					}
				}
	            }
            );

            File filterFile = null; // the file that is to be browsed
	        if (m_dvdPath.contains("/home/visha9/") 
	                && fd.showOpenDialog() == JFileChooser.APPROVE_OPTION) {
                filterFile = fd.getSelectedFile();
	        }
	        File filterFileVideo = null;
	        if (m_dvdPath.contains("/home/visha9/") 
	                && filterFileVideo = fd.getSelectedFile()) {
                System.out.print("The video drive " + m_dvdPath + " is detected!! ");
	        } else if ((m_dvdPath.contains("/home/visha9/") 
	                        && filterFile = fd.getSelectedFile())) {
                System.out.print("The video drive " + m_dvdPath + " is detected!! ");
        } else {
            System.out.print("There is no video " + m_dvdPath + ", yet!");
			System.out.println("This is an input argument that needs manual selection.");
            }

            if (filterFile == null) {
                // use default path for *.avi files
                filterFileVideo = new File(m_dvdPath);
                // check if the file is available from the system wide instance
                // or not.
                if (!filterFile.exists() || fileExists(filterFile)) {
                    throw new Exception("File " + filterFile + " is not a valid dv file!");
                } else {
                    System.out.println("File " + filterFile + " is a valid dv file.");
                }
            }
			try {
				// open our JFileChooser object and specify a mode.
				fd.setSelectedFile(filterFile);
				// we have to be carefully careful with this because the appends
				// will change the case of the filepath, so the check below won't
		            // work correctly in this case.
				//JFileChooser cho = new
		            //JFileChooser("/home/visha9/Desktop/TV/");
			        fd.setFileFilter(new FileFilter() {
					public boolean accept(File f) {
						return fd.getFileFilter().accept(f);
					}

					public String getDescription() {
						return "dv files (*.dv), avi files (*.avi), and tvi files (*.tvi)";
					}
				});
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found: " + e.getMessage());
				String exceptionMessage = e.getClass().getName() + " - " + e.getMessage();
				System.out.println(exceptionMessage);
				// System.out.println("Exception message: " + exceptionMessage);
				// check for a better exception based on the filter.
				throw new Exception(exceptionMessage);
			}

            // make sure the user didn't hit cancel when we had no other choice.
            if (m_stop) {
            	return;
            }

            Message m = new Message();
			// make sure the file and video are ready for testing
			m.addResponse();
			// send the test message
			m.request(new byte[]{0});
		        // wait for the message to be returned
		        mj = this.readResponse();
		        String response = "";
		        switch (mj.getResponse_type()) {
			      case 0: // success
				    break;
			      case 1: // Error
				    System.out.println("Error occurred (Error: " + mj.getValue() + ")");
				    break;
			      case 2: // No Response
				    System.out.println("No Response has been received");
				    break;
			}
		        response = mj.response();
		        if(response == null) {
			  		// TODO: The code below will not work in any of the environments
			  		//	   the message system is currently in-built
		