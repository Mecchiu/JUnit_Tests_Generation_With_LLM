// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains one unit test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {
		/**
    * @throws JniInchiException
    * @see JniInchiWrapper#getInchiKey(String)
		 */
        @Test
        void getInchiKey( ) throws JniInchiException {
            String inchi = "123123-123456456789-1234564567890";
            assertEquals(0, inchi.hashCode(), inchi_hash);
            
            try {
                getInchiKey(inchipart.getText());
                fail(new IllegalArgumentException());
            } catch ( JniInchiException jinchi ) {
                String out = jinchi.getMessage();
                System.out.println("Out: " + out);
	            System.out.println( "out:" ); 
	            for (String s2 : out.split("\\r\\n?")) {
	            	StringTokenizer tokp = new StringTokenizer((s2 + "\r\n").substring(0,(s2.length()-1)), " ", true);
	            	String[] st0	= tokp.nextToken().split("\\'");
	            	String[] st1	= tokp.nextToken().split("\\\"");
	            	String s0 = st0[0];
                	String s1 = st1[0];
	                String out = s0.toUpperCase();
	                s0 = s1.toUpperCase();
	            	if(out.endsWith("-")) {
	            		out = "-" + out;
	            	}
				}
				System.out.println( "out:\n" + out ); 
			}
			System.out.println(inchi);
            String[] ids = getInchiKey(inchipart.getText());
            for (int k = 0; k < ids.length; k++) {
                System.out.println(ids[k]);
            }
		}
		//end

        @Test
        void addAtom( ) throws JniInchiException, NativeCodeException {
            assertNull(getInchiKey(inchipart.getText()));
            assertEquals(2, addAtom(inchipart.getText()).getConds().size());
            assertEquals(InchiKey.class, addAtom(inchipart.getText()).getConds().get(0));
            assertEquals(ByteList.class, addAtom(inchipart.getText()).getConds().get(1));
            assertEquals(2, addAtom(inchipart.getText()).getConds().size());
        }

        @Test
        void addBond( ) throws JniInchiException, NativeCodeException {
            assertNull(getInchiKey(inchipart.getText()));
            assertEquals(2, addBond(inchipart.getText()).getConds().size());
            assertEquals(InchiKey.class, addBond(inchipart.getText()).getConds().get(1));
            assertEquals(AtomArrayList.class, addBond(inchipart.getText()).getConds().get(2));
            assertEquals(2, addBond(inchipart.getText()).getConds().size());
        }

        @Test
        void addPolarity( ) throws JniInchiException, NativeCodeException {
            assertNull(getInchiKey(inchipart.getText()));
            assertEquals(2, addPolarity(inchipart.getText()).getConds().size());
            assertEquals(InchiKey.class, addPolarity(inchipart.getText()).getConds().get(1));
            assertEquals(AtomArrayList.class, addPolarity(inchipart.getText()).getConds().get(3));
            assertEquals(2, addPolarity(inchipart.getText()).getConds().size());
        }

        @Test
        void addToInChIs( ) throws JniInchiException, NativeCodeException {
            assertNull(getInchiKey(inchipart.getText()));
            try {
                addToInChIs( inchipart.getText() );
                fail(new IllegalArgumentException());
            } catch ( JvSystemException jvse ) {
                assertEquals(0, jvse.getStackTrace( ).get( 0 ).getClassName().indexOf( "net.sf.jniinchi.JniInchiWrapper_0Test" ) );
            }
            assertEquals( 1, addToInChIt(inchipart.getText()).getConds().size());
            assertTrue( getInchiKey( inchipart.getText() ).isEmpty() );
        }

	protected void addAtom(String p_Text) throws JniInchiException, NativeCodeException
	{
		//noop
    }

	protected void addBond(String p_Text) throws JniInchiException, NativeCodeException
	{
		//noop
    }

	public final Object addPolarity(String p_Text) throws JvSystemException, NativeCodeException
	{
		//noop
    }

    @Test
    public void test() throws JvSystemException, NativeCodeException
    {
    	assertEquals(0, addAtom(inchipart.getText()).getConds().size());
    	assertEquals(InchiKey.class, addPolarity(inchipart.getText()).getConds().get(0));
    	assertEquals(InchiList.class, addPolarity(inchipart.getText()).getConds().get(1));
        assertTrue( addToInChIt( inchipart.getText() ).getConds().size() >2);
        assertTrue( getInchiKey(inchipart.getText()).isEmpty() );
    }


}