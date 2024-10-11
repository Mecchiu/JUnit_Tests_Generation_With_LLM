package com.pmdesigns.jvc;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCRequestContext_3Test {

    @Test
    void testGetAttribute_Null() {
        JVCRequestContext context = new JVCRequestContext(null, null, null, null, null, null);
        assertNull(context.getAttribute("test"));
    }

    @Test
    void testGetAttribute_NotNull() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getAttribute("test")).thenReturn("value");

        JVCRequestContext context = new JVCRequestContext(request, null, null, null, null, null);
        assertEquals("value", context.getAttribute("test"));
    }

    @Test
    void testGetAttribute_FileUpload() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        byte[] data = {0, 1, 2};
        when(request.getAttribute("test")).thenReturn(data);

        JVCRequestContext context = new JVCRequestContext(request, null, null, null, null, null);
        assertArrayEquals(data, (byte[]) context.getAttribute("test"));
    }
}
