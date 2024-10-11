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

    int pos;
    int maxLength;
    int pos_set;
    int count;

    /**
     * Constructor for SimpleCharStream_1Test.
     */
    public SimpleCharStream_1Test(int maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Test method for 
     * {@link com.pmdesigns.jvc.tools.SimpleCharStream#readChar()}
     */
    @Test
    public void test1() {
        SimpleCharStream s = new SimpleCharStream();

        System.setIn(new SystemReader("hello",true));
        assertEquals(s.readChar(),
            s.readChar());

        System.setIn(new SystemReader("world"));
        assertEquals(s.readChar(),
            s.readChar());

        System.setIn(new SystemReader("hello world"));
        assertEquals(s.readChar(),
            s.readChar());

        s.pos = 0;
        s.pos_set = 0;
        s.count = 1;
        
        System.setIn(new SystemReader(""));
        assertEquals(s.readChar(),
            s.readChar());
        
        try {
            assertThrows(CharacterNotFoundException.class,
                s.readChar());
        } catch (CharacterNotFoundException e) {
            //ok
        }

        System.setIn(new SystemReader(""));
        assertEquals(null,s.readChar());

        s.pos = 1;
        s.pos_set = 1;
        s.count = 2;
        
        System.setIn(new SystemReader(""));
        assertEquals(null,s.readChar());

        int position = 0;
        do {
            position++;
        } while(s.pos < position - this.maxLength + 1);

        assertEquals(this.pos,position);
        assertEquals(this.pos_set,position - this.maxLength + 1);

        System.setIn(new SystemReader(""));
        assertEquals(this.pos,position);

    }

}
