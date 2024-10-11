// ClientProperties_0Test.java
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
* It contains one unit test case for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientProperties_0Test {

	/**
	* Get property value by element-name returns empty string if fileError is true
	*
	* @param element - Name of element
	* @return String - return empty string if fileError is true
	*/
	void FileTest_0(String element) throws IOException {	
		logger = Logger.getLogger("testLogger");
		File f = new File("/home/test/log.txt");
		FileOutputStream fos = new FileOutputStream(f);
		File f2 = new File("/home/test/log2.txt");
		FileOutputStream fs = new FileOutputStream(f2);
		InputStream baz = ClassLoader.getSystemResourceAsStream("/home/test/prod.xml");
		
		if (baz!= null) {
        InputStreamReader isr = new InputStreamReader(baz);
        fos.write(XmlFunctions.getXmlValue(Constants.XML_DECLARATION).getBytes());
        
        XmlFunctions.getXmlValue(Constants.XML_DECLARATION).serialize(isr, fos);
        fos.close();
        fos = new FileOutputStream(f);
        XmlFunctions.getXmlValue(Constants.XML_DECLARATION).serialize(isr, fos);
        fos.close();
        f2.delete();
	} else {
        f.delete();
        f2.delete();
    }
}	
	
	

// ClientProperties_1.java
	
	/**
* 
* Test to test
* read and write properties to /home/
* directory from xml-file
*
*/
public class ClientProperties_1 {

	public static void main(String[] args) {

		ClientProperties_1 myTest = new ClientProperties_1();
		logger = Logger.getLogger("testLogger");
		myTest.add("/home/test/log4j");
	}
	
	public boolean isFileError(){
		return false;
	}
	
	public void test()throws IOException{
		File f2 = new File("/home/test2.txt");			
		
		InputStream baz = ClassLoader.getSystemResourceAsStream("/home/test/prod.xml");
		if (baz == null) {
			return;			
		}
		XmlFunctions.getXmlValue(Constants.XML_DECLARATION).serialize(f2, f2);
	}
	
	
	public void test2(){
		File f = new File("/home/test.txt");			
		if (f.exists() == false) {
			return;
		}
		System.out.println("test2");
		logger = Logger.getLogger("testLogger");
		logger.log(System.out, null, new String[]{"File test.txt exist, delete it if it does"});
		f.delete();
			
	}

}