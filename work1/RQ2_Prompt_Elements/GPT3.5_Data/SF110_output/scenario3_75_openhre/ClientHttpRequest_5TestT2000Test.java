// Test case 1: Test sending a POST request with a single parameter
@Test
void testPostWithSingleParameter() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    InputStream response = request.post("param1", "value1");
    assertNotNull(response);
}

// Test case 2: Test sending a POST request with multiple parameters
@Test
void testPostWithMultipleParameters() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("param1", "value1");
    parameters.put("param2", "value2");
    InputStream response = request.post(parameters);
    assertNotNull(response);
}

// Test case 3: Test sending a POST request with a file parameter
@Test
void testPostWithFileParameter() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    File file = new File("test.txt");
    InputStream inputStream = new FileInputStream(file);
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("file", inputStream);
    InputStream response = request.post(parameters);
    assertNotNull(response);
}

// Test case 4: Test sending a POST request with cookies
@Test
void testPostWithCookies() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("param1", "value1");
    parameters.put("param2", "value2");
    Map<String, String> cookies = new HashMap<>();
    cookies.put("cookie1", "value1");
    cookies.put("cookie2", "value2");
    InputStream response = request.post(parameters, cookies);
    assertNotNull(response);
}

// Test case 5: Test sending a POST request with a null parameter
@Test
void testPostWithNullParameter() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    InputStream response = request.post("param1", null);
    assertNotNull(response);
}

// Test case 6: Test sending a POST request with an empty parameter
@Test
void testPostWithEmptyParameter() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    InputStream response = request.post("param1", "");
    assertNotNull(response);
}

// Test case 7: Test sending a POST request with a null parameter map
@Test
void testPostWithNullParameterMap() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    InputStream response = request.post(null);
    assertNotNull(response);
}

// Test case 8: Test sending a POST request with an empty parameter map
@Test
void testPostWithEmptyParameterMap() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    Map<String, Object> parameters = new HashMap<>();
    InputStream response = request.post(parameters);
    assertNotNull(response);
}

// Test case 9: Test sending a POST request with a null cookie map
@Test
void testPostWithNullCookieMap() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    Map<String, Object> parameters = new HashMap<>();
    InputStream response = request.post(parameters, null);
    assertNotNull(response);
}

// Test case 10: Test sending a POST request with an empty cookie map
@Test
void testPostWithEmptyCookieMap() throws IOException {
    ClientHttpRequest request = new ClientHttpRequest();
    Map<String, Object> parameters = new HashMap<>();
    Map<String, String> cookies = new HashMap<>();
    InputStream response = request.post(parameters, cookies);
    assertNotNull(response);
}