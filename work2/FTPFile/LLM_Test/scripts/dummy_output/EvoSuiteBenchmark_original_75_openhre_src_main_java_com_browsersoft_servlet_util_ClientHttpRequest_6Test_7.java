// ClientHttpRequest_6Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
		private ClientHttpRequest request;
		private String url;
		/**
		 * constructor
		 *
		 * @param url
		 */
		public ClientHttpRequest_6Test(String url) {
			super();
			this.url = url;
		}
}