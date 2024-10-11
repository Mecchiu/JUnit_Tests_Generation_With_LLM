package com.pmdesigns.jvc;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCRequestContext_2Test {

    @Test
    void testGetParamValues() {
        JVCRequestContext requestContext = createMockRequestContext();
        
        // Test case 1: Parameter with single value
        String[] values1 = requestContext.getParamValues("param1");
        assertEquals(1, values1.length);
        assertEquals("value1", values1[0]);
        
        // Test case 2: Parameter with multiple values
        String[] values2 = requestContext.getParamValues("param2");
        assertEquals(3, values2.length);
        assertEquals("value2", values2[0]);
        assertEquals("value3", values2[1]);
        assertEquals("value4", values2[2]);
        
        // Test case 3: Non-existent parameter
        String[] values3 = requestContext.getParamValues("nonexistent");
        assertNull(values3);
    }

    private JVCRequestContext createMockRequestContext() {
        // Create a mock JVCRequestContext for testing
        // You can customize this method to create a mock with specific parameter values
        return new JVCRequestContext(null, null, null, null, null, null);
    }
}
