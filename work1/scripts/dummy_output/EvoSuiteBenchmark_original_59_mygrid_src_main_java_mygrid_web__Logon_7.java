// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
		
    private final java.lang.String CLUSTER_URL;
    private final java.lang.String USER;
    private final java.lang.String PASSWORD;
	

	/**
	 * This is tested:
	 * <ul>
	 * <li>Using default type and name</li>
	 * <li>Using empty string for CLUSTER URL</li>
	 * <li>Using null for USER</li>
	 * <li>Using null for PASSWORD</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_EmptyCLUSTERURL_NoNameTakesPrevention() {
	    assertEquals(null, _Logon.getTypeDesc());
    }

	
	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the default type and name</li>
	 * <li>Using empty string for CLUSTER URL</li>
	 * <li>Using null for USER</li>
	 * <li>Using null for PASSWORD</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_DefaultCT_EmptyCLUSTERURL_NoNameTakesPrevention_NoName() {
	    assertEquals(null, _Logon.getTypeDesc());
    }


	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the default type and name</li>
	 * <li>Using empty string for CLUSTER URL</li>
	 * <li>Using null for USER</li>
	 * <li>Using an input string for PASSWORD</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_DefaultCT_InvalidCT_EmptySTRING() {
	    assertEquals(java.util.HashMap.class, _Logon.getTypeDesc());
    }


	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the default type and name</li>
	 * <li>Using empty string for CLUSTER URL</li>
	 * <li>Using an input type for a user</li>
	 * <li>Using a input password for the password</li>
	 * </ul>
	 *
	 *  @preverifer [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_DefaultCT_InvalidCT_EmptyType() {
	    assertEquals(java.util.HashMap.class, _Logon.getTypeDesc());
    }


	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the default name and type</li>
	 * <li>Using empty string for cluster URL</li>
	 * <li>Using null for USER</li>
	 * <li>Using null for PASSWORD</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_DefaultCT_EmptyTType_EmptyUSER_NULL_NullPass() {
	    assertEquals(java.util.HashMap.class, _Logon.getTypeDesc());
    }

	
	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the default name and type</li>
	 * <li>Using empty string for cluster URL</li>
	 * <li>Using an input type for a user</li>
	 * <li>Using an input password for the password</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_DefaultCT_InvalidCT_EmptyTType_EmptyUSER() {
	    assertEquals(java.util.HashMap.class, _Logon.getTypeDesc());
    }
    
	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the default name and type</li>
	 * <li>Using empty string for cluster URL</li>
	 * <li>Using an input type for a user</li>
	 * <li>Using an input password for the password</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomType_DefaultTCT_InvalidTCT_EmptyType() {
	    assertEquals(java.util.HashMap.class, _Logon.getTypeDesc());
    }


	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the empty string for user</li>
	 * <li>Using an empty string for password</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomName_EmptyNullName() {
	    assertEquals(java.lang.String.class, _Logon.getName(java.lang.String.class));
    }


	/**
	 * This is tested:
	 * <ul>
	 * <li>Using the empty string for password</li>
	 * </ul>
	 *
	 *  @preverifier [no description]{org.junit.Test}
	 */
	@Test
	public void getCustomName_EmptyNullString() {
	    assertEquals(null, _Logon.getName(java.lang.String.class));
    }
    }