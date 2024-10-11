// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains one unit test case for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {

    /**
     * Test of the getTypeDesc method, of class $mygrid.web._Fail.
     */
    @Test
    public void testGetTypeDesc() {
	if (!(mygrid.web._Fail instanceof org.apache.axis.encoding.SerializerDeserializer) ) {
	    fail("This is not a serialized data format. try to deserialize it");
	}
        _Fail instance = (org.apache.axis.encoding.serializer.SerializerDeserializer)mygrid.web._Fail.class.newInstance();
        org.apache.axis.encoding.Deserializer deserializer = instance.getDeserializer(_javaType, org.apache.axis.encoding.Deserializer.class);
        org.apache.axis.encoding.Serializer serializer = instance.getSerializer(_javaType, org.apache.axis.encoding.Serializer.class);
        try {
            org.apache.axis.encoding.Deserializer deserializer2 = serializer.getDeserializer(org.apache.axis.encoding.Deserializer.class);
            org.apache.axis.encoding.Serializer getSerializer = deserializer.getSerializer(org.apache.axis.encoding.Serializer.class);
            java.lang.String expected = "test";
            
            try {
                org.apache.axis.encoding.SerializerDeserializer result = getSerDe(serializer,deserializer,expected);
//                String val = result.getVal();
//                String val = getDeserializer(deserializer2,string, String.class);
//                java.lang.String val = result.getVal();
                assertEquals("test", expected);
            } catch (org.apache.axis2.AxisFault e) {
                assertEquals(org.apache.axis2.AxisFault.class, e.getFaultType());
                e.printStackTrace();
            }

            try {
                java.lang.String expected2 = "my_array_1";
                org.apache.axis2.util.JavaUtils.javaToC(expected2,string);
                org.apache.axis2.util.JavaUtils.javaToC(expected,string);
            } catch (org.apache.axis2.AxisFault e) {
                assertEquals(org.apache.axis2.AxisFault.class, e.getFaultType());
                assertEquals(org.apache.axis2.AxisFault.class, e.getFaultString());
                e.printStackTrace();
            }
            assertEquals(expected, string);
        } catch (java.lang.Throwable e) {
            fail("Error checking for serialisation or deserialization");
        }
    }

    /**
     * Sets up the test fixture.
     */
    private void setup(mygrid.web._Fail instanceToTest) throws java.lang.Exception {
        
//    	try {
				String expected = "My Array 1";
				java.io.Serializable val = org.apache.axis2.util.JavaUtils.
								getSerializable(_javaType);
				instanceToTest.setJob(val);
//    	} catch (org.apache.axis2.AxisFault fault) {
//    	}
    }

    protected org.apache.axis2.util.JavaUtils.javaToC(java.lang.String _javaType, java.lang.String _javaType2, java.lang.String _javaType3, long _l4, long _l3)  throws org.apache.axis2.AxisFault {
		try {
			org.apache.axis2.util.JavaUtils.javaToC("string", string, "string", string, long);
			//_javaType1 = ""+true;
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			failed = true;
			fail(e.getMessage());
		}
		
    	try {
	    		org.apache.axis2.util.JavaUtils.javaToC("my_array_1", string, "my_array_1", string, long);
	    		//_javaType2 = ""+false;
		} catch (java.lang.Exception e) {
		}
		
    	
    	try {
		    	java.lang.Object val = org.apache.axis2.util.JavaUtils.
								getSerializable(_javaType);
		    	java.lang.String s=val.getClass().getName();
		    	System.out.println("s = " + s);
		       
		    	String s1 = s==null?"null":s.substring(s.length()-1);
		    	System.out.println(s1);
				java.lang.String s2 = org.apache.axis2.util.JavaUtils.convertToString(s1, org.apache.axis2.Context.toString(val));
		        String s3 = org.apache.axis2.util.JavaUtils.javaToC(s2, "", "", string, long);
		        String s4 = s2+";";
		        
	        	fail(s3);
		    } catch (java.lang.Exception e) {
		        throw e;
		    }
		    
			if(!failed) {
				assertNotNull(string);
				assertNotNull(string);
			} else {
				fail("org.apache.axis2.util.JavaUtils.javaToC failed");
			}
		
    	}
		return "";
	}
    }

}
