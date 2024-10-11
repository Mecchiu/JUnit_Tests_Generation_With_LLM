package httpanalyzer;
java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParamsUrlTools_0Test {

    @Test
    void testGetPairParams_EmptyParams() {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        List<NameValuePair> result = paramsUrlTools.getPairParams("");
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetPairParams_SingleParam() {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        List<NameValuePair> result = paramsUrlTools.getPairParams("key1=value1");
        assertEquals(1, result.size());
        assertEquals("key1", result.get(0).getName());
        assertEquals("value1", result.get(0).getValue());
    }

    @Test
    void testGetPairParams_MultipleParams() {
        ParamsUrlTools paramsUrlTools = new ParamsUrlTools();
        List<NameValuePair> result = paramsUrlTools.getPairParams("key1=value1&key2=value2&key3=value3");
        assertEquals(3, result.size());
        assertEquals("key1", result.get(0).getName());
        assertEquals("value1", result.get(0).getValue());
        assertEquals("key2", result.get(1).getName());
        assertEquals("value2", result.get(1).getValue());
        assertEquals("key3", result.get(2).getName());
        assertEquals("value3", result.get(2).getValue());
    }

    // Add more test cases as needed
}
