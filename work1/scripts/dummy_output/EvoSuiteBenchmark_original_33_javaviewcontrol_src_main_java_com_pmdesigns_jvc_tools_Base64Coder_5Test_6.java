// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		  
	  
	    /**
	     * Test of encode method, of class com.pmdesigns.jvc.tools.Base64Coder
	     * after each call of encode method.
	     */
	    @Test
	    void testEncode(){
	        System.out.println("encode");
	        byte[] in = new byte[19];
	        byte[] out = new byte[21];
	        int i2 = 0, tmp = 0;
	        int len = in.length;
	        byte[] d = new byte[len];
	        Base64Coder.encode(in, 0, len, out, 0, len);
	        
	        for(int i = 0 ; i < len ; i++, i2 = 0 ){
	            if( ( (out[i]&0xff)>>>2 )!=0 || ( in[i] &0xff )!=0){
	                tmp += 0xFF;
	            }
	            d[i] = 0x1 ;
	        }
	        
	        byte[] result = new byte[i2];
	        for(int i = 0 ; i < i2 ; i++, i2 = d[i2]>>7, i+=8){
	        	result[i] = (byte)d[i2] & 0x07;
	        }
	        assertArrayEquals(d, result);
	        byte[] res = Base64Coder.decode(result);
	        assertArrayEquals(d, res);		
	    }
	    
	}