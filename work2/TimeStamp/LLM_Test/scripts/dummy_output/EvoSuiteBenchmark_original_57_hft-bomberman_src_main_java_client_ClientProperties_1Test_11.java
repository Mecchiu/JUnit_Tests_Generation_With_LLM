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
		
    private static final Logger logger = Logger.getLogger(ClientProperties_1Test.class);
    public static final String PROFILE_CONFIG = "resource.properties";
    public static final String PROFILE_USER = "profile";
		
    //TODO: copy of client xml-file to a local directory
    /*
     * Method name of this object must be public.
     */

    @Test
    public void fileCopy() throws IOException {

        boolean fileError = false;
        InputStream sourceFile;
        String destFile;
        InputStream inputStream;

        // get InputStream for the client
        sourceFile = this.classpath2TestclassResource(Constants.INPUT_XML);

        // if not exists, open destination file-name
        destFile = this.classpath2Testclass("properties");

        inputStream = this.classpath2TestclassResource(Constants.BASIC_PROPERTIES_FILENAME);

        //TODO: check if file-content is read to create a new instance of Properties
//        //create new instance of Properties

        this.setProfileAndFileError(0);

        File file = new File(this.pathToProfile(PROFILE_USER, PROFILE_CONFIG));
        FileOutputStream fos = new FileOutputStream(file);
        
        // write File content
        XmlFunctions.writeToOutputStream(inputStream, fos);
        fos.flush();
        fos.close();

        //read file content and check for error properties
        inputStream = this.classpath2TestclassResource(Constants.INPUT_XML);
        XmlFunctions.readFromInputStream(sourceFile, inputStream);

        fileError = file.exists();

//        StringBuilder testData = new StringBuilder();
//        
//        for (String line : new StringBuilder(XmlFunctions.xmlStreamToString(inputStream)).toString()) {

        //TODO: write in xml
//        testData.append(line);
            
//        }

        // testResult = testData.toString();

        logger.debug(".testFileCopy() - success=" + fileError + " - file exists=" + fileError);

        assertTrue(fileError);

    }

    /**
     * @param fileName -
     *            name of file
     * @return Testfilename -
     */
    private String pathToProfile(String profileName, String fileName) {
        String profileFolder = "src/test/resources/profile";
        File profileDirectory = new File(profileFolder);

        return String.format("%tFile(%s, %s);", profileName, fileName, profileDirectory);
    }

    /**
     * @param fileName -
     *            Name of file
     * @return Profile -
     */
    private String classpath2Testclass(String fileName) {
        return "src/test/resources/classpath2testclass.%t/" + fileName;
    }

    /**
     * @param name -
     *            Name of the property that will be checked for error
     * @param val -
     *            new value of the property
     */
    private void setProperty(String element, String val) {
        String profile = this.classpath2Testclass("profile");
        String file = this.classpath2Testclass("tests");

        // set Property
        this.setProperty(element, val);

        // get filename of the profile
        String filename = new File(profile).getName();

        logger.debug(String.format("profile-element '%s' set for property '%s' -> profile '%s' -> file '%s'", element, val, profile, filename));
    }

    /**
     * Initialize ClientProperties and properties file
     * to be copied
     */
    private void setProfileAndFileError(int error) {
        this.fileError = error;
    }
}