package com.pmdesigns.jvc;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCRequestContext_0Test {

    @Test
    void testGetParam() {
        // Test case 1: Parameter exists
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getParameter("param1")).thenReturn("value1");
        JVCRequestContext context = new JVCRequestContext(request, null, null, null, null, null);
        assertEquals("value1", context.getParam("param1"));

        // Test case 2: Parameter does not exist
        when(request.getParameter("param2")).thenReturn(null);
        assertEquals(null, context.getParam("param2"));

        // Test case 3: Multipart content with binary value
        when(request.getAttribute("param3")).thenReturn("BINARY_VALUE");
        assertEquals("BINARY_VALUE", context.getParam("param3"));
    }
}
