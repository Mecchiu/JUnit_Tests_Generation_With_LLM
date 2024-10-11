// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {

    private volatile boolean m_Error = false;
    private volatile boolean m_GUI;
    public final static String m_BaseOutputDir = "/data/mplex";
    public final static String m_BASE_ERR_LOG = "/mplex/log/baseerr.log";
    public final static String m_BASE_ERR_MPLEX = "/mplex/log/baseerr.mplex";
    public final static String m_MUX_LOG = "/data/mplex/log/mux.log";
    public final static String m_MUX_MPLEX = "/data/mplex/log/mux.mplex";
    final public static String m_FNAME = "TestMainFile.avi";
    final public static String m_DEFAULTSOURCESTART = "TestFile.avi";
    final public static String[] m_DEFAULTDEFAULTSOURCES = new String[] {m_DEFAULTSOURCESTART};
    final public static String[][] m_STRINGS = new String[][] {
        new String[] {"#define A", "0"},
        new String[] {"$A", ""},
        new String[] {"xmplex", "2"},
        new String[] {"1", "4"},
        new String[] {"y", "1"},
    };
    public final static int m_DEFAULTSOURCESTARTINDEX = 0;
    public final static String m_FILENAME = "TestFile.avi";
        
    public ConvertTest() {
    	m_GUI = true;
    }
    
    @Test
    public void TransCodeTest () throws NumberFormatException {
        m_MessageLogger.printMsg("TransCodeTest", String.valueOf(m_Error));
        m_Console = System.out;
        System.setOut(new NullOutputStream());
        m_Transcode = new Convert();
        m_Transcode.init();
        TranscodeProcess p = new TranscodeProcess();
        p.init();
        assertTrue("Could not start TransCodeProcess for "+m_BASE_ERR_LOG+".  It appears that the error is: "+m_Error, p.start());
        assertTrue("Could not start TransCodeProcess for "+m_BASE_ERR_MPLEX+".  It appears that the error is: "+m_Error, p.start());
        p.start();
        setTranscodeOption();
    }
	
    @Test
    public void TestFile () throws NumberFormatException {
    	if (m_TranscodeFile.getText().compareTo (m_DEFAULTSOURCES[m_DEFAULTSOURCESTARTINDEX])!= 0) {
    		throw (new NumberFormatException ("The base input file does not start with the correct suffix : "+
    				m_TranscodeFile.getText().substring(m_TranscodeFile.getText().lastIndexOf(".")+1)));
    	}
    	m_Console = System.out;
        m_MessageLogger.printMsg("TestFile", String.valueOf(m_Error));
        m_Console = System.out;
        System.setOut(new NullOutputStream());
        m_Transcode = new Convert();

        m_Transcode.init();

	    File f = new File(m_TranscodeFile.getText());

	    m_Transcode.prepare();

        f.delete();
    	f = new File(m_BASE_OUTPUTDIR + "/" + m_BASE_ERR_MPLX + m_MUX_LOG + ".mp4");
        InputStreamReader isr = new InputStreamReader(new FileInputStream(f));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f));
        BufferedWriter bw = new BufferedWriter(osw);

        String s = null;
        for (int i=0; s == null && i<m_STRINGS.length-1; i++) {
            s = m_STRINGS[i][m_STRINGS.length-1].toLowerCase ();
            bw.write(s);
        }

        bw.close();

        bw = new BufferedWriter(new FileWriter(f));
        bw.write("file="+f.getAbsolutePath()+" transcoded to  \""+m_MUX_MPLEX+"\"");
        for (int i=0; i<m_STRINGS.length-1; i++) {
            bw.write(m_STRINGS[i][m_STRINGS.length-1])+"\r\n";
        }
        bw.close();

        File transcode = new File("transcode");
        osw = new OutputStreamWriter(new FileOutputStream(transcode));
        bw = new BufferedWriter(osw);
        System.setOut(new NullOutputStream());

        try {
            m_Transcode.exec("transcode");
        } catch (IOException ex) {
            IOException ex1 = new IOException("Error executing "+m_Transcode);
            throw ex1;
        }
        bw.close();

        m_MessageLogger.printMsg("TestFile", String.valueOf(m_TranscodeFile.getText()));
        m_Console = System.out;
    }

    private void setTranscodeOption() {
        m_TranscodeFile.setText("transcode");
    }
}




