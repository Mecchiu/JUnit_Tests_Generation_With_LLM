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

	@Test
	void testAbort() {
		// TODO: test AACSLoginModule.abort()
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
		
	@Test
	void testHashCode() {
		// TODO: test AACSPrincipal.hashCode()
	}
}

// AACSRolePrincipal.java
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
 * and represents a Sample role.
 *
 * <p> Principals such as this <code>AACSRolePrincipal</code>
 * may be associated with a particular <code>Subject</code>
 * to augment that <code>Subject</code> with an additional
 * identity.  Refer to the <code>Subject</code> class for more information
 * on how to achieve this.  Authorization decisions can then be based upon
 * the Principals associated with a <code>Subject</code>.
 *
 * @version $Id: AACSRolePrincipal.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class AACSRolePrincipal implements Principal, java.io.Serializable {

    /**
     * @serial
     */
    private String name;

    /**
     * Create an AACSRolePrincipal with a Sample role name.
     *
     * <p>
     *
     * @param name the Sample role name for this user.
     *
     * @exception NullPointerException if the <code>name</code>
     *			is <code>null</code>.
     */
    public AACSRolePrincipal(String name) {
        if (name == null)
            throw new NullPointerException("illegal null input");

        this.name = name;
    }

    /**
     * Return the Sample role name for this <code>AACSRolePrincipal</code>.
     *
     * <p>
     *
     * @return the Sample role name for this <code>AACSRolePrincipal</code>
     */
    public String getName() {
        return name;
    }

    /**
     * Return a string representation of this <code>AACSRolePrincipal</code>.
     *
     * <p>
     *
     * @return a string representation of this <code>AACSRolePrincipal</code>.
     */
    public String toString() {
        return("AACSRolePrincipal:  " + name);
    }

    /**
     * Compares the specified Object with this <code>AACSRolePrincipal</code>
     * for equality.  Returns true if the given object is also a
     * <code>AACSRolePrincipal</code> and the two SamplePrincipals
     * have the same username.
     *
     * <p>
     *
     * @param o Object to be compared for equality with this
     *		<code>AACSRolePrincipal</code>.
     *
     * @return true if the specified Object is equal equal to this
     *		<code>AACSRolePrincipal</code>.
     */
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this == o)
            return true;

        if (!(o instanceof AACSRolePrincipal))
            return false;
        AACSRolePrincipal that = (AACSRolePrincipal)o;

        if (this.getName().equals(that.getName()))
            return true;
        return false;
    }

    /**
     * Return a hash code for this <code>AACSRolePrincipal</code>.
     *
     * <p>
     *
     * @return a hash code for this <code>AACSRolePrincipal</code>.
     */
    public int hashCode() {
        return name.hashCode();
    }
}

// AACSRolePrincipalTest.java
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
* Test class of {@link AACSRolePrincipal}.
* It contains ten unit test cases for the {@link AACSRolePrincipal#hashCode()} method.
*/
class AACSRolePrincipalTest {
		
	@Test
	void testHashCode() {
		// TODO: test AACSRolePrincipal.hashCode()
	}
}

// Login.java
package com.browsersoft.aacs;

import java.util.*;
import java.io.IOException;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;

/**
 * <p> This class is a simple implementation of the <code>Login</code>
 * interface.
 *
 * <p> This implementation assumes the following:
 *
 * <ul>
 * <li> The user has a username and password.
 * <li> The user has a role.
 * <li> The user's password is stored in a file.
 * <li> The filename is passed to the constructor.
 * <li> The file is formatted as follows:
 *	<ul>
 *	<li> Each line contains a single user's entry.
 *	<li> The user's username is the first token on each line.
 *	<li> The user's password is the second token on each line.
 *	<li> The user's role is the third token on each line.
 *	</ul>
 * </ul>
 *
 * <p> This class also implements the <code>java.io.Serializable</code>
 * interface.  This is required if the <code>Login</code> object is
 * stored in a <code>Subject</code> that might be accessed across
 * a network connection.
 *
 * @version $Id: Login.java,v 1.1 2006/11/06 19:52:19 grodecki Exp $
 */
public class Login implements java.io.Serializable {

    /**
     * @serial
     */
    private String filename;

    /**
     * @serial
     */
    private String username;

    /**
     * @serial
     */
    private char[] password;

    /**
     * @serial
     */
    private String role;

    /**
     * Create a Login object with a filename.
     *
     * <p>
     *
     * @param filename the name of the file containing user information.
     *
     * @exception IOException if the filename cannot be accessed.
     */
    public Login(String filename) throws IOException {
        this.filename = filename;
    }

    /**
     * Authenticate a <code>Subject</code> (phase 1).
     *
     * <p> This method populates the <code>Subject</code>
     * with relevant Principals and credentials.
     *
     * <p>
     *
     * @param subject the <code>Subject</code> to be authenticated.
     * @param callbackHandler a <code>CallbackHandler</code> for communicating
     *			with the end user (prompting for usernames and
     *			passwords, for example).
     *
     * @return true in all cases since this <code>LoginModule</code>
     *		should not be ignored.
     *
     * @exception LoginException if the authentication fails.
     *
     * @exception IOException if an input or output error occurs.
     *
     * @exception UnsupportedCallbackException if the implementation of
     *			this <code>LoginModule</code> does not support
     *			one or more of the <code>Callback</code>s
     *			specified in the <code>callbackHandler</code>
     *			argument.
     */
    public boolean authenticate(Subject subject, CallbackHandler callbackHandler)
        throws LoginException {

        // prompt for a user name and password
        if (callbackHandler == null)
            throw new LoginException("Error: no CallbackHandler available " +
                "to garner authentication information from the user");

        Callback[] callbacks = new Callback[2];
        callbacks[0] = new NameCallback("user name: ");
        callbacks[1] = new PasswordCallback("password: ", false);

        try {
            callbackHandler.handle(callbacks);
            username = ((NameCallback)callbacks[0]).getName();
            char[] tmpPassword = ((PasswordCallback)callbacks[1]).getPassword();
            if (tmpPassword == null) {
                // treat a NULL password as an empty password
                tmpPassword = new char[0];
            }
            password = new char[tmpPassword.length];
            System.arraycopy(tmpPassword, 0,
                password, 0, tmpPassword.length);
            ((PasswordCallback)callbacks[1]).clearPassword();

        } catch (java.io.IOException ioe) {
            throw new LoginException(ioe.toString());
        } catch (UnsupportedCallbackException uce) {
            throw new LoginException("Error: " + uce.getCallback().toString() +
                " not available to garner authentication information " +
                "from the user");
        }

        // print debugging information
        if (debug) {
            System.out.println("\t\t[SampleLoginModule] " +
                "user entered user name: " +
                username);
            System.out.print("\t\t[SampleLoginModule] " +
                "user entered password: ");
            for (int i = 0; i < password.length; i++)
                System.out.print(password[i]);
            System.out.println();
        }

        // verify the username/password
        boolean usernameCorrect = false;
        boolean passwordCorrect = false;
        boolean roleCorrect = false;
        try {
            BufferedReader in
                = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                String user = tokenizer.nextToken();
                String pass = tokenizer.nextToken();
                String role = tokenizer.nextToken();
                if (debug) {
                    System.out.println("\t\t[SampleLoginModule] " +
                        "authenticating user: " + user);
                    System.out.println("\t\t[SampleLoginModule] " +
                        "authenticating password: " + pass);
                    System.out.println("\t\t[SampleLoginModule] " +
                        "authenticating role: " + role);
                }
                if (user.equals(username)) {
                    usernameCorrect = true;
                    if (pass.equals(new String(password))) {
                        passwordCorrect = true;
                        this.role = role;
                        roleCorrect = true;
                        break;
                    }
                }
