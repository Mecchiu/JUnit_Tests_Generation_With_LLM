// ClientProperties_1Test.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains one unit test case for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientProperties_1Test {


    /**
     * method to verify fileCopy() 
     */
    @Test
    public void testFileCopy() throws IOException {
        Logger.getLogger(Constants.log4jLOG_FOLDER).info("testFileCopy() - START");
        InputStream in = new FileInputStream(Constants.resourceDirectory+File.separator+constants.xml_name);
        FileOutputStream out = new FileOutputStream(Constants.resourceDirectory+File.separator+constants.xml_name);

        // test cases with valid files
        in = new FileInputStream(Constants.xml_source+Constants.xml_name);        

        // test cases with invalid files in the destination path
        in = Constants.xml_source + File.separator + "INVALID_PATH\nINVALID_PATH/INVALID_PATH\n"; 

        XmlFunctions.XML_FILE.setFileCopy(true);
        File xmlFile = new File(Constants.resourceDirectory+File.separator+"ClientProperties_1");
        boolean result = XmlFunctions.XML_FILE.fileCopy(in, xmlFile);
        if (result!= true) {
            String msg = "Error while copying XML file.";
            System.out.println(msg);
            System.out.println("*********************************************");
            System.out.println(msg);
            System.out.println("*********************************************");
            fail(msg);
        }

        in.close();
        in=null; // clean resources
        XmlFunctions.XML_FILE.setFileCopy(false);

		// test cases without files
         in = new FileInputStream(Constants.xml_source+Constants.xml_name);
         boolean result = XmlFunctions.XML_FILE.fileCopy(in);
        if (result!= true) {
            String msg = "Error while copying XML file.";
            System.out.println(msg);
            System.out.println("*********************************************");
            System.out.println(msg);
            System.out.println("*********************************************");
            fail(msg);
        }

        in.close();
        in=null; // clean resources
        XmlFunctions.XML_FILE.setFileCopy(false);

        // test cases with valid files, but invalid names, in dest directory
        in = new FileInputStream(Constants.xml_source+Constants.xml_name+"INVALID_NAME");
        boolean result = XmlFunctions.XML_FILE.fileCopy(in);
        if (result!= true) {
            String msg = "Error while copying XML file.";
            System.out.println(msg);
            System.out.println("*********************************************");
            System.out.println(msg);
            System.out.println("*********************************************");
            fail(msg);
        }

        in.close();
        in=null; // clean resources
        XmlFunctions.XML_FILE.setFileCopy(false);


        Logger.getLogger(Constants.log4jLOG_FOLDER).info("testFileCopy() -  FINISH");

    }

	/**
     * @throws java.lang.Exception
     */
    @Test
    public void test() throws Exception {
        // TODO Auto-generated method stub
    }

}


