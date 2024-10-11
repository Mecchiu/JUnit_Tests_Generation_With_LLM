// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {

	@Test
	void testOpenStream() throws MalformedURLException, IOException {
		URL url = new URL("http://www.eteks.com/");
		Content content = new URLContent(url);
		InputStream stream = content.openStream();
		assertNotNull(stream);
		stream.close();
	}
}

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;

/**
 * URL content for files, images...
 *
 * @author Emmanuel Puybaret
 */
public class URLContent implements Content {

    /**
     * Returns an InputStream on the URL content.
     *
     * @throws IOException if URL stream can't be opened.
     */
    public InputStream openStream() throws IOException {
        return url.openStream();
    }
}

// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
	@Test
	void testOpenStream() throws MalformedURLException, IOException {
		URL url = new URL("http://www.eteks.com/");
		Content content = new URLContent(url);
		InputStream stream = content.openStream();
		assertNotNull(stream);
		stream.close();
	}
}

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;

/**
 * URL content for files, images...
 *
 * @author Emmanuel Puybaret
 */
public class URLContent implements Content {

    /**
     * Returns an InputStream on the URL content.
     *
     * @throws IOException if URL stream can't be opened.
     */
    public InputStream openStream() throws IOException {
        return url.openStream();
    }
}

// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
	@Test
	void testOpenStream() throws MalformedURLException, IOException {
		URL url = new URL("http://www.eteks.com/");
		Content content = new URLContent(url);
		InputStream stream = content.openStream();
		assertNotNull(stream);
		stream.close();
	}
}

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;

/**
 * URL content for files, images...
 *
 * @author Emmanuel Puybaret
 */
public class URLContent implements Content {

    /**
     * Returns an InputStream on the URL content.
     *
     * @throws IOException if URL stream can't be opened.
     */
    public InputStream openStream() throws IOException {
        return url.openStream();
    }
}

// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
	@Test
	void testOpenStream() throws MalformedURLException, IOException {
		URL url = new URL("http://www.eteks.com/");
		Content content = new URLContent(url);
		InputStream stream = content.openStream();
		assertNotNull(stream);
		stream.close();
	}
}

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;

/**
 * URL content for files, images...
 *
 * @author Emmanuel Puybaret
 */
public class URLContent implements Content {

    /**
     * Returns an InputStream on the URL content.
     *
     * @throws IOException if URL stream can't be opened.
     */
    public InputStream openStream() throws IOException {
        return url.openStream();
    }
}

// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
	@Test
	void testOpenStream() throws MalformedURLException, IOException {
		URL url = new URL("http://www.eteks.com/");
		Content content = new URLContent(url);
		InputStream stream = content.openStream();
		assertNotNull(stream);
		stream.close();
	}
}

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;

/**
 * URL content for files, images...
 *
 * @author Emmanuel Puybaret
 */
public class URLContent implements Content {

    /**
     * Returns an InputStream on the URL content.
     *
     * @throws IOException if URL stream can't be opened.
     */
    public InputStream openStream() throws IOException {
        return url.openStream();
    }
}

// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
