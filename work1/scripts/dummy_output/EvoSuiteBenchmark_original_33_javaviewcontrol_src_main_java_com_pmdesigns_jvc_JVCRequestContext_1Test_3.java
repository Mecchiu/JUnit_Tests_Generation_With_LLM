package com.pmdesigns.jvc;
public static class JVCRequestContext_1Test_1 extends TestBase { 
            @Test
            void testGetParamMap() throws Exception {
                final InputStream urlInputStream=getClass().getResourceAsStream("/jvc/jvcfileupload.html");
                Map<String, String> res=JVCRequestContext.getParamMap(urlInputStream);
                assertNotNull("should get a non-null Map", res); 
                List<Map.Entry<String, String>> entries=res.entrySet();
                assertNotNull("result should not be null", entries);
                assertNotEmpty("should have entries", entries);
                assertTrue("all entries are Map's", entries.get(0).getKey().equals("x"));
                assertTrue("all entries are Map's", entries.get(0).getValue().equals("1"));
                assertTrue("all entries are Map's ",entries.get(1).getKey().equals("y"));
                assertTrue("all entries are Map's ",entries.get(1).getValue().equals("2"));
                assertTrue("all entries are Map's with link", entries.get(2).getKey().equals("link"));
                assertTrue("all entries are Map's with link", entries.get(2).getValue().equals("true"));
            }
            @Test
			void testGetParamMap_2() throws Exception {
                final InputStream urlInputStream=getClass().getResourceAsStream("/jvc/jvcfileupload.html");
                Map<String, String> res=JVCRequestContext.getParamMap(urlInputStream);
                assertNotNull(" should not have a result.", res);
                assertTrue("should contain keys",res.keySet().size() >= 1); 
                assertTrue("should contain values",res.values().size() >= 1);
                assertTrue("should contain the key in the first", res.keySet().iterator().next().equals("x"));
                assertTrue("should contain the key in the second", res.values().iterator().next().equals("1"));
            }
}