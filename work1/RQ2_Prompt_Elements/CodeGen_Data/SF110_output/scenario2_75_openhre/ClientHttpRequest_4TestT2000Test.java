// ClientHttpRequest_4Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
/**
		 * posts the requests to the server, with all the cookies and parameters that were added before (if any), and with cookies and parameters that are passed in the arguments
		 *
		 * @param _cookies request cookies
		 * @param _parameters request parameters
		 * @return input stream with the server response
		 * @throws IOException
		 * @see setParameters
		 */
		static InputStream post(String[] _cookies, Object[] _parameters) throws IOException {
				return post(_cookies, _parameters, null);
		}
    static void writeTo(File _file, ClientHttpRequest _httpRequest) throws IOException {
        OutputStream _os = ClientHttpRequest.getOutputStream(_httpRequest);
        InputStream _is = _httpRequest.getInputStream();
        try {
            _os.close();
            _is.close();
        }
        finally {
            _os = null;
            _is = null;
        }
    }

		/**
		 * posts the requests to the server, with all the cookies and parameters that were added before (if any), and with cookies and parameters that are passed in the arguments
		 *
		 * @param _file file to write the server response to
         * @param _httpRequest request
		 * @throws IOException
		 */
		static void post(File _file, ClientHttpRequest _httpRequest) throws IOException {

			FileOutputStream _outf = new FileOutputStream(_file, true);
			OutputStream _out = ClientHttpRequest.getOutputStream(_httpRequest);
			try {
				_out.write(_httpRequest._content, _httpRequest._contentLength);
			}
			finally {
				_out = ClientHttpRequest.closeOutputStream(_outf);
			}
		}

    static ClientHttpRequest.InputStream getInputStream(File _file) throws IOException {
        return ClientHttpRequest.getInputStream(_file, "test", "UTF-8");
    }

		/**
		 * posts the requests to the server, with all the cookies and parameters that were added before (if any), and with cookies and parameters that are passed in the arguments
		 *
		 * @param _cookies request cookies
		 * @param _parameters request parameters
		 * @param _encoding encoding
		 * @return input stream with the server response
		 * @throws IOException
		 */
		static ClientHttpRequest.InputStream getInputStream(String[] _cookies, Object[] _parameters, String _encoding) throws IOException {
				return ClientHttpRequest.getInputStream(_cookies, _parameters, _encoding);
		}

    static ClientHttpRequest.OutputStream getOutputStream(File _file) throws IOException {
        return ClientHttpRequest.getOutputStream(_file, "test", "UTF-8");
    }

		/**
		 * posts the requests to the server, with all the cookies and parameters that were added before (if any), and with cookies and parameters that are passed in the arguments
		 *
		 * @param _cookies request cookies
		 * @param _parameters request parameters
		 * @param _encoding encoding
		 * @return output stream for the server response
		 * @throws IOException
		 */
		static ClientHttpRequest.OutputStream getOutputStream(String[] _cookies, Object[] _parameters, String _encoding) throws IOException {
				return ClientHttpRequest.getOutputStream(_cookies, _parameters, _encoding);
		}


		/**
		 * post request parameters to the server and get response output stream
        *
        * @param _url url
        * @param _encoding encoding
        * @return stream of input stream
        * @throws IOException
        */
		static ClientHttpRequest.InputStream postParams(String _url, Map<String, Object> _params, String _encoding) throws IOException {
				return ClientHttpRequest.postParams(_url, _params, _encoding);
		}

		/**
		 * post request parameters to the server and get response stream that doesn't return response body
        *
        * @param _url url
        * @param _encoding encoding
        * @return stream of input stream
        * @throws IOException
        */
		static ClientHttpRequest.InputStream postParams(String _url, Map<String, Object> _params) throws IOException {
				return ClientHttpRequest.postParams(_url, _params);
		}

		/**
		 * post request parameters to the server and get response stream that doesn't return response body
        *
        * @param _url url
        * @param _encoding encoding
        * @return stream of input stream
        * @throws IOException
        */
		static ClientHttpRequest.InputStream postParams(URL _url, Map<String, Object> _params, Map<String, Object> _formParams) throws IOException {
				return ClientHttpRequest.postParams(_url, _params, _formParams);
		}

		/**
		 * post request parameters to the server and get response stream that doesn't return response body
        *
        * @param _url url
        * @param _encoding encoding
        * @return string
        * @throws IOException
        */
		static ClientHttpRequest.InputStream postParams(String _url, Map<String, Object> _params, Map<String, Object> _formParams) throws IOException {

            StringBuffer buffer = new StringBuffer();
            buffer.append("POST ");
            buffer.append(_url);

            if (null!= _params && _params.size() > 0) {
                buffer.append(";");
                for (Iterator<Map.Entry<String, Object>> it = _params.entrySet().iterator(); it.hasNext(); ) {
                    Map.Entry<String, Object> _param = it.next();
                    buffer.append('?');
                    buffer.append(_param.getKey());
                    buffer.append("=");
                    buffer.append(_param.getValue());
                    if (it.hasNext()) {
                        buffer.append("&");
                    }
                }
            }
            if (null!= _formParams &&! _formParams.isEmpty() & _params!= null) {
                // form params
                String form = "";
                for (Map.Entry<String, Object> _param : _formParams.entrySet()) {
                    form += (";param=" + _param.