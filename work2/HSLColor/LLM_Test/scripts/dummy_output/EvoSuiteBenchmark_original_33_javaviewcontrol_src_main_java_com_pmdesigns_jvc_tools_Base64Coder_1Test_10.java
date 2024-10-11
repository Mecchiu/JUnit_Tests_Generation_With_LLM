// Base64Coder_1Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_1Test {
		 
/*
  unit test for encode(byte[])
*/
    @Test
    public void encode(){
        String s = "";
        s=null;
        byte[] array1 = new byte[32];
        byte[] array2 = new byte[32];
        s = new byte[0];
        try {
            s = new byte[256];
        }
        catch (RuntimeException e){}


        array1 =s.getBytes();
        System.out.println("\n\n\n Test Case 1:");

        byte[] array3 = {(byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0,(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1,(byte) 1, (byte) 2, (byte) 4, (byte) 7, (byte) 8};
        boolean flag1=true;
        s = new byte[array3.length];
        System.arraycopy(array3, 0, (byte[]) s, 0, array3.length);
        System.out.println(s);
        System.out.println("\n\n\n Test Case 2:");
        String s1 = null;
        s1 = null;
        array1 = new byte[32];
        System.out.print(encode(array1));
        System.out.println("\n\n\n Test Case 3:");

        array1 =s.getBytes();

        System.arraycopy(array1, array1.length - 20, (byte[])array1, 16, array1.length - array1.length + 20);
        System.out.println("\n\n\n Test Case 4:");

        array1 =s1.getBytes();

        System.arraycopy(array1, array1.length - 20, (byte[])array1, 11, array1.length - array1.length + 20);

        System.out.println(encodeString(s));

    }
}