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
static JFrame createFrame() {
			JFrame frame = new JFrame("ParamsUrlToolsTest-frame");
			listTests();
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			return frame;
		}

		/**
     * Test method for {@link ParamsUrlTools#getPairParams(String)} method.
     */
	@Test

    public void testParamsUrlTools() {
				List<NameValuePair> pairParams = new ArrayList<NameValuePair>();
				pairParams.add(new BasicNameValuePair("p1", "pp1"));
				pairParams.add(new BasicNameValuePair("p2", "pp2"));
				pairParams.add(new BasicNameValuePair("p3", "pp3"));
				
				List<NameValuePair> params = getPairParams("");
				
				assertFalse(params.isEmpty());
				assertEquals(params.get(0).getName(), "p1");
				assertEquals(params.get(1).getName(), "p2");
				assertEquals(params.get(2).getName(), "p3");
				assertTrue(params.get(0).getValue().getClass().equals(String.class));
				assertTrue(params.get(1).getValue().getClass().equals(String.class));
				assertTrue(params.get(2).getValue().getClass().equals(String.class));
				
				params.add(new BasicNameValuePair("z", "pp4"));
				params.add(new BasicNameValuePair("z", "pp6"));
				
				assertFalse(params.isEmpty());
				params.clear();
				
				pairParams.add(new BasicNameValuePair("z", "zzz"));
				params.add(new BasicNameValuePair("z", "zzz"));
				
				assertFalse(params.isEmpty());
				params.clear();
				
				pairParams.add(new BasicNameValuePair("y", "zzz"));
				params.add(new BasicNameValuePair("z", "pp2"));
				
				assertFalse(params.isEmpty());
				
				pairParams.add(new BasicNameValuePair("x", "pp1"));
				
				params.add(new BasicNameValuePair("y", "pp3"));
				
				List<NameValuePair> listParams = new ArrayList<NameValuePair>();
				listParams.add(new BasicNameValuePair("x", "pp5"));
				listParams.add(new BasicNameValuePair("z", "zzz"));
				listParams.add(new BasicNameValuePair("y", "pp6"));
				
				
				assertTrue(new ParamsUrlTools().getPairParams((String)params.get(0)).equals(pairParams));
				if(listParams.size() > 0) {
					assertTrue(listParams.get(0).getName().equals(pairParams.get(0).getName()));
				}
				
				assertTrue(new ParamsUrlTools().getPairParams((String)params.get(1)).equals(pairParams));
				if(listParams.size() > 1) {
					assertTrue(listParams.get(1).getName().equals(pairParams.get(1).getName()));
				}
				if(listParams.size() > 2) {
					assertTrue(listParams.get(2).getName().equals(pairParams.get(2).getName()));
				}
				if(listParams.size() > 3) {
					assertTrue(listParams.get(3).getName().equals(pairParams.get(3).getName()));
				}
			}
		
    @Test
		public void testReplace() throws URISyntaxException {
			// We test with 3 parameters
			List<NameValuePair> params = getPairParams("a", "b");
			String rept = new ParamsUrlTools()
			.replace("b", "y", params);
			List<String> list = new ArrayList<String>();
			list.add("b");
			list.add("a");
			list.add("y");
			assertEquals(rept, "b", list);
		}
}
