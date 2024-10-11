// ParamsUrlToolsTest.java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParamsUrlTools}.
* It contains one unit test case for the {@link ParamsUrlTools#getPairParams(String)} method.
*/
class ParamsUrlToolsTest {

	/**
	* Tests the parameter string handling functionality
	*/
	@Test
	public void testParamsString() {
		try {
			List<NameValuePair> expectedResult = new ArrayList<NameValuePair>();
			expectedResult.add(new BasicNameValuePair("first_value", "val1"));
			expectedResult.add(new BasicNameValuePair("second_param1", "val2"));
			expectedResult.add(new BasicNameValuePair("third_param", "val3"));
			
			List<NameValuePair> actualResult = new ArrayList<NameValuePair>();
			

			// test first case parameter string handling functionality
			String params = "first_param=value1&second_param=value2&third_param=value3&second_val1=val1&";
			params = params.replaceAll("\\+", "@");
			params = params.replaceAll("\\{", "@");
			params = params.replaceAll("\\}", " ");
			params = "&first_val1=value1&second_val2=value2&third_val=value3&second_val=+value+val1&second_param1=value2&third_param=value3&second_val=+value+val2%20&third_param1=+value+val3%60&second_val=+value+val3&third_val=%20&";

			URI url = new URI("http://gatai.uol.com");
	    	List<NameValuePair> nvps = new ParamsUrlTools().getPairParams(params);
	    	assertEquals(expectedResult.size(), nvps.size());
	    	System.out.println(url);
	    	for (int i = 0; i < expectedResult.size(); i++) {
	    		System.out.println(i + " -- " + nvps.get(i).getName() + " - " + nvps.get(i).getValue());
	    	}
	    	System.out.println("******");
			
			// test second case parameter string handling functionality
			actualResult = new ParamsUrlTools().getPairParams(params);
			assertEquals(expectedResult.size(), actualResult.size());
			for (int i = 0; i < expectedResult.size(); i++) {
				System.out.println(i + " -- " + actualResult.get(i).getName() + " - " + actualResult.get(i).getValue());
			}
	    	assertEquals(url, actualResult.get(0).getURI());
	    	
	    }
	    catch(Exception e) {
	     	System.err.println("Error while converting string : " + e);
	    }
			
	}
	
}

// Main with JUnit
public class ParamsUrlToolsTest_JUnit {

	public static void main(String[] args) {
		JFrame app = new JFrame();
		app.setSize((int)(5.0 * 9.0/12.0), (int)(5.0 * 7.0/8.0));
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		String params1 = "first_param=value1&second_param=value2&third_param=value3&second_val1=val1&";
	
		URI url1 = new URI(params1);
		JFrame app1 = new JFrame(url1);
		app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		String params2 = "first__param=value1&second__param=value2&third__param=value3&second_val1=val1&";
		
		URIParamUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> parameters = instance.getPairParams(params2);

		for (int i = 0; i < parameters.size(); i++) {
			String keyValue = parameters.get(i).getName();
			if (keyValue.indexOf("params.param=") > 0)
				keyValue = keyValue.split("params.param=")[1];
			System.out.println(keyValue + ": " + parameters.get(i).getValue());
		}
		
		JFrame app2 = new JFrame(url1);
		app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app2.getContentPane().setBackground(new java.awt.Color(0, 0, 128));
        	app2.setSize(400, 300);
        	app2.setLocationRelativeTo(null);
        	app2.setVisible(true);

	}
}
