// Here's an example of how you can test the ClientHttpRequest class using JUnit 5:

@Test
void testPostWithCookiesAndParameters() throws IOException {
    // create a new instance of ClientHttpRequest
    ClientHttpRequest request = new ClientHttpRequest();

    // create a map of cookies to be included in the request
    Map<String, String> cookies = new HashMap<>();
    cookies.put("session_id", "123456789");

    // create a map of parameters to be included in the request
    Map<String, String> parameters = new HashMap<>();
    parameters.put("username", "john_doe");
    parameters.put("password", "password123");

    // send the POST request and get the response as an InputStream
    InputStream response = request.post(cookies, parameters);

    // assert that the response is not null
    assertNotNull(response);

    // assert that the response contains the expected data
    // (this will depend on the server-side implementation)
    // ...
}

// You can add more test cases to cover different scenarios and edge cases.