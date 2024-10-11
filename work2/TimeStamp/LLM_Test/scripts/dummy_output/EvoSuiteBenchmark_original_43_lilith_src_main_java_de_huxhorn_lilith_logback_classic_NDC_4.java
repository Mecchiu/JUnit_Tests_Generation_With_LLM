// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains one unit test case for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		/**
		* test a valid message message.
		*/
    @Test
    public void testMessageMessage() {
        try {
            Message d = new Message( "d", "D" );
            Message m = new Message( "M", "M" );
            Message a = new Message();

            assertEquals( d, d );
            assertEquals( m, m );
            assertEquals( a, a );

            a.replace( d, a );

            assertEquals( d, a.getHeader() );
            assertEquals( m, a.getBody() );

            assertEquals( d.getHeader(), d.getHeader() );
            assertEquals( a.getHeader(), a.getHeader() );
            assertFalse( a.getBody()!= a.getHeader().getBody() );

            assertEquals( d.getHeader().getHeader(), a.getHeader().getHeader() );
        } catch ( Exception e ) {
            e.printStackTrace();
            fail( e.toString() );
        }
    }

}