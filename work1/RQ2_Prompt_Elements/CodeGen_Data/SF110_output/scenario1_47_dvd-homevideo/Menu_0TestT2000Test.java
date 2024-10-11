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
@Test
        public void test0() throws IOException
        {
            boolean bResult = Menu.init();

            assertTrue(bResult);

            FileInputStream FIF = null;
            File file = null;

            try {
                FIF = new FileInputStream(new File(m_GUI.strOutputDir + "/log/dvd-menu.log"));
                file = new File(m_GUI.strOutputDir + "/log/dvd-menu.log");

                InputStreamReader ISR = new InputStreamReader(FIF);
                BufferedReader bFIF = new BufferedReader(ISR);
                String sLine;
                String path = null;
                String name = null;
                String name1 = null;
                String name2 = null;
                String name3 = null;
                String path2 = null;

                /* Print a line indicating how many times there are tests */
				System.out.println("TEST: ");
				int num = 0;

                bFIF.readLine();
				while ((sLine = bFIF.readLine())!= null) {
                    if (num == 0) {
                        if (sLine.equals("TEST")) {
                            if (bFIF.readLine()!= null) {
                                while ((sLine = bFIF.readLine())!= null) {
                                    num++;
                                    }
                            } else {
                                System.out.println("No test line");
                                num += 2;
                            }
                        } else {
                            System.out.println("Invalid test comment");
                        }
                    } else {
                        System.out.println(name);
                        int m = sLine.indexOf(' ');
                        int n = sLine.indexOf('=', m);
                        path = sLine.substring(m+1, n);
                        name = sLine.substring(n+1);
                    }
				}
                bFIF.close();

                String s = getPath(path);
                if (s.length() == 0) s = "/home/dud/Desktop";
                if (path.indexOf(s) >= 0) {
                    File dir = new File(s);
                    if (dir.delete()) {
                        int c = dir.mkdirs();
                        assertTrue(true);
                        name1 = path;
                        name = name + "_1";
                        assertTrue(true);
                        name2 = path;
                        name = name + "_2";
                        assertTrue(true);
                        name3 = path;
                        name = name + "_3";
                        assertTrue(true);
                    } else {
                        throw new IOException("Unable to create directory " + name);
                    }
                } else {
                    System.out.println("Error creating directory " + name);
                    System.out.print("Error: ");
                    System.out.println(name);
                    assertTrue(false);
                }

                StringTokenizer st = new StringTokenizer(name);
                while (st.hasMoreTokens()) {
                    String tok = st.nextToken();
                    File aFile = new File(file, tok);
                    File aDir = new File(aFile, name);
                    bFIF = new BufferedReader(new InputStreamReader(new FileInputStream(aFile)));
                    System.out.println("Writing " + aFile);
    				buff = new StringBuilder();
    				while ((sLine = bFIF.readLine())!= null) {
    					buff.append(sLine );
    				}
    				System.out.println("Writing " + aFile);
                    bFIF.close();
                }
    			} catch (Throwable t) {
    				System.out.println("Error creating directory " + name);
    				System.out.print("Error: ");
    				System.out.println(name);
   				}

            } catch (FileNotFoundException ex) {
                System.out.println("Error: " + ex);
                assertTrue(false);
            }
        }
        
		public String getPath(String path) {
            StringTokenizer st = new StringTokenizer(path);
            String dir = "";
            String name1 = "";
            String name2 = "";
            String name3 = "";
            while (st.hasMoreTokens()) {
                String tok = st.nextToken();
                int m = tok.indexOf('#');
                if (m < 0) {
                    dir = tok;
                    name1 = path;
                } else {
                    dir = tok.substring(0, m);
                    name1 = tok.substring(m+1);
                }
        	}

	        File parentDir = new File(dir);
	        File file = new File(parentDir, name1);
	        try { file.mkdir(); }
	        catch(IOException exception) {
	        	file.deleteOnExit(); System.out.println("Error creating directory " + dir);
	        	System.out.print("Error: ");
	        	System.out.println(dir);
	        	exception.printStackTrace(System.out);
	        	assertTrue(false);
	        }
	        File dir1File = new File(file, name2);
	        try { file.mkdir(); }
	        catch (IOException exception) {
	        	file.deleteOnExit();

	        	System.out.println("Error creating directory " + dir1File.getAbsolutePath() + "/" + dir1File.getName());
	        	System.out.print("Error: ");
	        	System.out.println(dir1File.getAbsolutePath() + "/" + dir1File.getName());
	        	exception.printStackTrace(System.out);
	        	assertTrue(false);
	        }

	        File dir2File = new File(file, name3);
	        try { file.mkdir(); }
	        catch (IOException exception) {
	        	file.deleteOnExit();

	        	System.out.println("Error creating directory " + dir2File.getAbsolutePath()