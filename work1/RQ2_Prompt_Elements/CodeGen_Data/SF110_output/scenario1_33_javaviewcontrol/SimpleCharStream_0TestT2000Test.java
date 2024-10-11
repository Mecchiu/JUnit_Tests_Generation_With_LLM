// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {

	private char buftoken7;
	
	private int state;
	
    /**
     * Set the {@link #state} field to a known value.
     * <p>
     * @see #state
     */
    public void setState( int s ) {
        state = s;
    }

        
	/** Constructor. */
    public SimpleCharStream_0Test() {
    }

    /**
     * Method corresponding to the {@link #beginToken} method.
     * <p>
     * @param  beginType  A token indicating the end of the input stream.
     * @param  beginLine  The line number of the first character of the input stream.
     * @param  beginColumn The column number of the first character of the input stream.
     * @see #beginToken
     */
    public void beginToken( Token beginType, int beginLine, int beginColumn ) {
    }

    /**
     * Method corresponding to the {@link #endToken} method.
     * <p>
     * @param  endType  A token indicating the end of the input stream.
     * @param  endLine  The line number of the last character of the input stream.
     * @param  endColumn The column number of the last character of the input stream.
     * @see #endToken
     */
    public void endToken( Token endType, int endLine, int endColumn ) {
    }

    /**
     * Returns the size of unread characters that can still be dequeued.
     * In this method we must unqueue any buffered characters.
     * <p>
     * @return  The size of unread characters.
     */
    public int unread() throws java.io.IOException {
        return ((buftoken7 =''));
    }

    

 //

    private void test()
        throws java.io.IOException {
        SimpleCharStream char_in = new SimpleCharStream( new StringReader("") );

        try {
            // A loop that does not complete until end of file is reached:
            while ( state!= 0 ) {
                char c;
                int match_capture;
                int len = char_in.in_char();

                if( len == -1 ) {
                    throw new java.io.IOException();
                }
                
                if( state == 0 ) {
                    //
                }

                switch( state ) {
                    default:
                    // fall through
                    case 0:
                    continue;

                    case 1:
                    //
                    match_capture = char_in.beginToken();
                    break;

                    case 2:
                    //
                    match_capture = char_in.endToken();
                    break;
                }
            
                // We need one more char
                c = char_in.readChar();
                this.buftoken7 = c;
                
                if( match_capture == -1 ) {
                    boolean ok = char_in.available() >= 10;
                    
                    if(!ok ) {
                        System.err.println( "Unexpected end of input" );
                        exit_jvca( 1 );
                    }

                    if( char_in.available() < 10 ) {
                        int ch;
                        while(char_in.available() < 10 && ( ch = char_in.read() ) > -1 ){
                            System.err.println( ch );
                        }
                    }

                    break;
                }
                int i = 0;
                if( match_capture == 1 ) {
                    i += 1;
                }
                if( match_capture == 2 ) {
                    i += 10;
                }
                if( c == '\u00A0') {
                    i += 3;
                }
                if( c == '\u1680' && char_in.available() < 15 ) {
                    int  ch = c;
                    
                    if( char_in.available() < 10 ) {
                        int  ch2 = char_in.read();
                        tst_buftoken7( ch, ch2 );
                    }

                    int ch3 = char_in.peek();
                    if( ch3 == -1 ) {
                        throw new java.io.IOException();
                    }
                    
                    ch = ch3;
                    i += 5;
                    if( char_in.available() < 15 ) {
                        int ch4 = char_in.read();
                        tst_buftoken7( ch, ch4 );
                    }

                    ch = ch3;
                    i += 5;
                    ch = char_in.read();
                    tst_buftoken7( ch, ch );
                }
                if( match_capture == 3 ) {
                    i += 7;
                }
                if( match_capture == 4 ) {
                    i += 13;
                }
            }

        }catch( java.io.IOException ioe ) {
            exit_jvca( 1 );
        }catch( Throwable t ) {
            exit_jvca( 1 );
        }

    }


    static void tst_buftoken7( int ch, int ch2) {
        assertTrue( "Invalid character", ( ch == ch2 )?
                                      "Invalid character: \"" + 
                                                ch + "\", was \"" + ch2 + "\"" :
                                        "Invalid character: \"" +
                                              ch + ", " + ch2 + "\"" );
    }

    /**
     * Method responsible of exiting with the appropriate return value:
     * <P>
     * @param  error    The error code.
     */
    private void exit_jvca( int error ) {
        System.exit( error );
    }
}
