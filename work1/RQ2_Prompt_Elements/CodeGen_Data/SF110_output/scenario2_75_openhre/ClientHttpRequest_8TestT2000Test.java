// ClientHttpRequest_8Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_8Test {
protected String path;
		protected Object[] parameters;
		protected String cookie;
		protected String response;
		protected String[] formdata;
		protected Map<String, String> header;
		protected byte[] file;

		/**
		 * Create test object and return it.
		 */
        public static ClientHttpRequest_8Test create() {
			final ClientHttpRequest p = new ClientHttpRequest_8Test().newInstance();
			return p;
		}

		/**
		 * Initialize this object after the constructor call.
		 */
        protected void setParameters(final String path, final Object[] parameters) {
			this.path = path;
			this.parameters = parameters;
		}

        /**
         * Constructor for serialized instance.
         */
        public ClientHttpRequest_8Test() {
        }

        /**
         * Initialize instance after the constructor call.
         *
         * @param path to add post parameters
         * @param parameters to add post parameters
         */
		protected void setParameters(final String path, final Object[] parameters) {
			this.path = path;
			this.parameters = parameters;
		}

        /**
         * Constructor for serialized instance.
         *
         * @param parameters parameters to add post parameters
         */
		protected void setParameters(final Object[] parameters) {
			this.parameters = parameters;
		}

        /**
         * Constructor for serialized instance.
         *
         * @param path to add post parameters
         * @param filename name of the file for POST parameters
         * @param parameters parameters of the file
         * @param file file to add post parameters
         */
		protected void setParameters(final String path, final String filename, final Object[] parameters, final String file) {
			this.path = path;
			this.file = new Random(System.currentTimeMillis()).nextInt() == 0? new ObjectInputStream(new FileInputStream(filename)).readObject() : file;
			this.parameters = parameters;
			this.response = new String();
		}

		/**
		 * Constructor for serialized instance.
		 *
		 * @param path to add post parameters
		 * @param parameters parameters to add post parameters	
		 * @param filename name of the file for POST parameters
		 * @param cookie cookies
		 * @param response response to the request
		 * @param formdata form data
		 * @param header header
		 * @param responseToCookie response to the cookie
		 * @param fis body stream
		 * @param file file
		 * @param header header
		 * @param response response to the request
		 */
		protected void setParameters(String path, Object[] parameters, String filename, String cookie, String response, Object[] formdata, String header,String responseToCookie, File fis, Object[] file, String header,String response) {
			this.path = path;
			this.parameters = parameters;
			this.cookie = cookie;
			this.response = response;
			this.formdata = formdata;
			this.header = header;
			this.file = fis.toByteArray();
			this.responseToCookie = responseToCookie;
		}
}