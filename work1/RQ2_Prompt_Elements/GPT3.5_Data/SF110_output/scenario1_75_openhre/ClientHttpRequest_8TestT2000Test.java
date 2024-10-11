// ClientHttpRequest_8Test.java
package com.browsersoft.servlet.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * Test class of {@link ClientHttpRequest}.
 * It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
 */
class ClientHttpRequest_8Test {

    @Test
    void testPostWithOneParameter() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        InputStream response = request.post("name1", "value1");
        assertNotNull(response);
    }

    @Test
    void testPostWithTwoParameters() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        InputStream response = request.post("name1", "value1", "name2", "value2");
        assertNotNull(response);
    }

    @Test
    void testPostWithThreeParameters() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        InputStream response = request.post("name1", "value1", "name2", "value2", "name3", "value3");
        assertNotNull(response);
    }

    @Test
    void testPostWithFourParameters() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        InputStream response = request.post("name1", "value1", "name2", "value2", "name3", "value3", "name4", "value4");
        assertNotNull(response);
    }

    @Test
    void testPostWithNullParameter() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        InputStream response = request.post("name1", null, "name2", "value2", "name3", "value3", "name4", "value4");
        assertNotNull(response);
    }

    @Test
    void testPostWithEmptyParameter() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        InputStream response = request.post("name1", "", "name2", "value2", "name3", "value3", "name4", "value4");
        assertNotNull(response);
    }

    @Test
    void testPostWithFileParameter() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        File file = new File("test.txt");
        InputStream response = request.post("name1", "value1", "name2", "value2", "name3", "value3", "file", file);
        assertNotNull(response);
    }

    @Test
    void testPostWithMultipleFileParameters() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        File file1 = new File("test1.txt");
        File file2 = new File("test2.txt");
        InputStream response = request.post("name1", "value1", "name2", "value2", "file1", file1, "file2", file2);
        assertNotNull(response);
    }

    @Test
    void testPostWithCookieParameter() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        request.setCookie("name", "value");
        InputStream response = request.post("name1", "value1", "name2", "value2", "name3", "value3", "name4", "value4");
        assertNotNull(response);
    }

    @Test
    void testPostWithMultipleCookieParameters() throws IOException {
        ClientHttpRequest request = new ClientHttpRequest();
        request.setCookie("name1", "value1");
        request.setCookie("name2", "value2");
        InputStream response = request.post("name1", "value1", "name2", "value2", "name3", "value3", "name4", "value4");
        assertNotNull(response);
    }
}