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
     * Test case name
				*@return the test name
     */
    public String getTestName() {
        return "ParamsUrlToolsTest";
    }

    /**
     * Test case of {@link ParamsUrlTools#getPairParams(String)} test.
				*@param params String
				*@return List<NameValuePair>
     */
    public List<NameValuePair> getPairParams(String params) {
        List<NameValuePair> returnList = new ArrayList<NameValuePair>();
        for (NameValuePair pair : params.split("&")) {
            System.out.println("Param: " + pair.getKey() + "=");
            List<NameValuePair> subPairs = pair.getValue().split(";");

            returnList.addAll(
                    subPairs);

            String firstKeyVal = subPairs.get(0).getKey();
            int keyIndex = firstKeyVal.indexOf("=");
            returnList.add(new BasicNameValuePair(firstKeyVal.substring(0, keyIndex),
                subPairs.get(0).getValue()));
            returnList.add(
                new BasicNameValuePair(firstKeyVal.substring(keyIndex + 1),
                subPairs.get(1).getValue()));
        }
        return returnList;
    }

    /**
     * Test method of {@link ParamsUrlTools#splitUrl(String, JFrame)} test.
				*@param params String url starting with? &? &
     */
    @Test
    public void testUrlSplitParams(String params) {
        assertEquals("", params);
		String[] parts = params.split("?");
        assertNotNull(parts);
        assertEquals(2, parts.length);

        int start = 2;
        uriParams = parts[start];
        start++;
        uriParams += "_host";
        uriParams += parts[start];
        start++;
        uriParams += "_port";
        uriParams += parts[start];
        urlParams = parts[start];
        start++;
        uriParams += "_path";
        uriParams += parts[start];
        start++;
        uriParams += _checkedUrl;
        uriParams += parts[start];

        assertTrue("Param: " + uriParams + " should be 'http://"
                + uriParams + "'", uriParams.startsWith("http"));

        List<NameValuePair> pairlist = getPairParams(uriParams);
        assertEquals("Should do: "+pairlist, 2, pairlist.size());
        pairlist.remove(pairlist.size() - 1);
        assertEquals("Should do: "+pairlist, 6, pairlist.size());

        String firstUrl = uriParams.removeFirst();
        int endIndex = firstUrl.indexOf("?");
        String firstParam = firstUrl.substring(endIndex + 1);
        List<NameValuePair> tmpPkv = splitUrl(firstUrl,
                new JFrame()).get(firstParam);
        NameValuePair firstParamPair = (NameValuePair) tmpPkv.get(0);
        String firstPkvStr = firstParamPair.getKey();
        firstPkvStr = firstPkvStr.substring(0, firstPkvStr.indexOf("="));
        assertEquals("Url: "+firstUrl+
                " URL Params: "+firstUrlParams+
                " Url: "+firstUrl+_checkedUrl,_checkedUrl,firstUrl.getBytes());

        List<NameValuePair> tmpParamPair = (List<NameValuePair>) tmpPkv
               .get(1);
        List<String> lastParamPairs = new ArrayList<String>();
}
}