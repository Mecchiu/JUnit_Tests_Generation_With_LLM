// AACSLoginModuleTest.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSLoginModule}.
* It contains ten unit test cases for the {@link AACSLoginModule#abort()} method.
*/
class AACSLoginModuleTest {

	/**
	* Test case for the {@link AACSLoginModule#abort()} method.
	* It tests the case when the LoginContext's overall authentication failed.
	*
	* @exception LoginException if the abort fails.
	*/
	@Test
	public void testAbort() throws LoginException {
		// TODO: implement this test case
	}
}

// AACSPrincipal.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents a user.
 *
 * <p> Principals such as this <code>AACSPrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @version $Id: AACSPrincipal.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class AACSPrincipal implements Principal, java.io.Serializable {

    /**
     * @serial
     */
    private String name;

    /**
     * Create an AACSPrincipal with a Sample username.
     *
     * <p>
     *
     * @param name the Sample username for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *			is <code>null</code>.
     */
    public AACSPrincipal(String name) {
	if (name == null)
	    throw new NullPointerException("illegal null input");

	this.name = name;
    }

    /**
     * Return the Sample username for this <code>AACSPrincipal</code>.
     *
     * <p>
     *
     * @return the Sample username for this <code>AACSPrincipal</code>
     */
    public String getName() {
	return name;
    }

    /**
     * Return a string representation of this <code>AACSPrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>AACSPrincipal</code>.
     */
    public String toString() {
	return("AACSPrincipal:  " + name);
    }

    /**
     * Compares the specified Object with this <code>AACSPrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>AACSPrincipal</code> and the two SamplePrincipals
     * have the same username.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *		<code>AACSPrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *		<code>AACSPrincipal</code>.
     */
    public boolean equals(Object o) {
	if (o == null)
	    return false;

        if (this == o)
            return true;
 
        if (!(o instanceof AACSPrincipal))
            return false;
        AACSPrincipal that = (AACSPrincipal)o;

	if (this.getName().equals(that.getName()))
	    return true;
	return false;
    }
 
    /**
     * Return a hash code for this <code>AACSPrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>AACSPrincipal</code>.
     */
    public int hashCode() {
	return name.hashCode();
    }
}

// AACSPrincipalTest.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AACSPrincipal}.
* It contains ten unit test cases for the {@link AACSPrincipal#hashCode()} method.
*/
class AACSPrincipalTest {
		
	/**
	* Test case for the {@link AACSPrincipal#hashCode()} method.
	* It tests the case when the hash code for this <code>AACSPrincipal</code>.
	*
	* @return a hash code for this <code>AACSPrincipal</code>.
	*/
	@Test
	public void testHashCode() {
		// TODO: implement this test case
	}
}

// AACSUnauthenticatedIdentity.java
package com.browsersoft.jaas;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import com.browsersoft.aacs.Login;
import com.browsersoft.aacs.User;

/**
 * <p> This class implements the <code>Principal</code> interface
 * and represents an unauthenticated user.
 *
 * <p> Principals such as this <code>AACSUnauthenticatedIdentity</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @version $Id: AACSUnauthenticatedIdentity.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class AACSUnauthenticatedIdentity implements Principal, java.io.Serializable {

    /**
     * @serial
     */
    private String name;

    /**
     * Create an AACSUnauthenticatedIdentity with a Sample username.
     *
     * <p>
     *
     * @param name the Sample username for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *			is <code>null</code>.
     */
    public AACSUnauthenticatedIdentity(String name) {
	if (name == null)
	    throw new NullPointerException("illegal null input");

	this.name = name;
    }

    /**
     * Return the Sample username for this <code>AACSUnauthenticatedIdentity</code>.
     *
     * <p>
     *
     * @return the Sample username for this <code>AACSUnauthenticatedIdentity</code>
     */
    public String getName() {
	return name;
    }

    /**
     * Return a string representation of this <code>AACSUnauthenticatedIdentity</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>AACSUnauthenticatedIdentity</code>.
     */
    public String toString() {
	return("AACSUnauthent