// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {

    final static int TOK_EOF=-1;
    final static int TOK_NUMBER=-2;


    public final void UpdateLineColumn(char c) throws java.io.IOException {

    char c1,c2;
    c2=(int)c;
    if (TOK_EOF>0x80) {
        c1=(char)(((TOK_EOF & ~0x7F) >> 2) + ONE_LEVEL_2);
    }
    else {
        if (c1>=MIN_CHARACTER) {
            c1 -= (MIN_CHARACTER >> 2);
        }
        else {
            c1 = 0;
        }
    }
        
        if (c1 < 0) {
            c1 = 0;
        }
        c2=Character.toLowerCase(c);
    
        if (TOK_NUMBER<0 || TOK_NUMBER>=TOK_NUMBER) {
        
        if (TOK_NUMBER > TOK_EOF) {
        	UpdateLineColumn(c2);
        	c2=c1;
        }
//            if (c1 >= MIN_CHARACTER) {
//        	c = Character.toLowerCase((char)c1);
//                c2 = Character.toLowerCase(c);
//                assertEquals("L",new String(String.valueOf(c1,10)));
//                c1=c2;
//            }
                        
            //        UpdateLineColumn(c1);
        }
        c2 = Character.toUpperCase(c2);
        if (TOK_NUMBER<TOK_EOF) {
            UpdateLineColumn(c2);
        }
        
    }
        
		
		private final static char[] buffer = new char[256];
		
		static {
	
			/* initialize table of digits 1*/
			int value = 10;
			for(int i=value; i>=0; i--) {
				buffer[i]=(char)i;
			}
			
			/* initialize table of digits 2*/
			int value = 11;
			for(int i=value; i>=0; i--) {
				buffer[i]=(char)i;
			}
			
////		//Initialization
////			buffer[10]=10;
////			buffer[11]=11;
////			System.out.println(buffer+"");

		int i=20;
		while(i>=0) {
			buffer[i]=(char)i;
			i--;
		}
		buffer[buffer.length - 1]=(char)i;
			
//		/* initialize table of digits */
//		int value = 0;
//		for(int i=0; i<buffer.length; i++) {
//			value = value << 4;
//			value = value | buffer[i];
//			buffer[i]=(char)value;
//		}
		//System.out.println(buffer);
	}
}




// How it works: We fill the buf with zeros. Then we read from the
// stream and get the characters in the buffers.
// After each iteration, the result buffer contains
// a new char - either a 0 indicating end of line, or
// it contains the characters read from the stream.
// @Test
public void test() throws java.io.IOException {
		   
	long start = System.currentTimeMillis();
	int count=0;
	while (System.in.read()!= 0)
		count++;
	long end = System.currentTimeMillis();
	System.out.println((end-start));
}

}
