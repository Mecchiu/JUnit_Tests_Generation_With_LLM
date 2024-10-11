// ClientHttpRequest_7Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
/**
		* This class represents one unit test case of the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
		*
		* @throws IOException
		*/
		@Test
		public void testPost_BasicParameter() throws IOException {
				ClientHttpRequest request = new ClientHttpRequest();
				String[] formParams = Utils_7.generateParameter("name", "value");
				request.post(formParams);
				assertEquals(formParams[0], "name");
				assertEquals(formParams[1].toString(), "value");
				assertEquals(formParams.length, 2);
					}


		/**
		* This class contains a suite of test cases of the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
		*/
		public class ClientHttpRequest_7Test_Suite {
				 /**
				* This constant keeps a map of HTTP parameters with a particular name and parameters format.
				*/
				private Map<String, String> parameterMap = new HashMap<String, String>();
				/**
				* Test suite of parameters to be added as input values.
				*/
				private Map<String, String> inputParameterMap = new HashMap<String, String>();
				/**
				* Map with input form parameters (key values)
				*/
				private Map<String, String> inputFormParameterMap = new HashMap<String, String>();

				/**
				* Test suite of output values.
				*/
				private Map<String, String> outputParameterMap = new HashMap<String, String>();

				private String url = "http://someurl.to";
				/**
				* Default constructor for the {@link ClientHttpRequest_7Test_Suite} class.
				*/
				public ClientHttpRequest_7Test_Suite() {
				}


				/**
				 * This method adds a parameter with the name <i>id</i> with the
				 * specified value <i>value</i>.
				 *
				 * @param id parameter name.
				 * @param value parameter value.
				 * @see {@link ClientHttpRequest#addParameter(String,String)}
				 */
				public void parameterSet(String id, String value) {
					this.parameterMap.put(id, value);
					this.url += "/parameters/" + id;
					}

				/**
				 * This method adds an input form parameter with the name <i>id</i>
				 * and it contains the value (<i>value</i>) as input value.
				 *
				 * @param id parameter name.
				 * @param value parameter value.
				 * @see {@link ClientHttpRequest#addFormParameter(String,String)}
				 */
				public void inputFormParameterSet(String id, String value) {
					addFormParameter(id,value);
					this.inputFormParameterMap.put(id, value);
					}

				/**
				 * This method adds a output value with the name <i>id</i>.
				 *
				 * @param id parameter name.
				 * @see {@link ClientHttpRequest#addParameter(String,String)}
				 */
				public void outputValueSet(String id) {
					this.outputParameterMap.put(id, "value");
					}

				/**
				 * This ensures that the values of both the input and output form
				 * parameters are set.
				 *
				 * @param id parameter name.
				 * @param value parameter value.
				 * @see {@link ClientHttpRequest#addFormParameter(String,String)}
				 */
				private void addParamToMap(String id,String value) {
					addFormParameter(id,value);
					if(this.inputFormParameterMap.get(id) == null)
						this.inputFormParameterMap.put(id, "");
					}

				/**
				 * This method adds a form parameter with the name <i>id</i>.
				 * Note only the id is added the value as an attribute.
				 *
				 * @param id the name of the attribute value
				 * @param value the value to be stored in the map
				 * @see {@link ClientHttpRequest#addFormParameter(String,String)}
				 */
				private void addFormParameter(String id,String value) {
					this.parameterMap.put(id, value);
					this.url += "/formvalues/" + id + "=" + value;
					}

				/**
				 * This ensures that the values of both the input and output parameters
				 * are set.
				 *
				 * @param id the name of the attribute value
				 * @param value the value to be stored in the map
				 * @see {@link ClientHttpRequest#addParameter(String,String)}
				 */
				private void addParameterToMap(String id,String value) {
					addParamToMap(id, value);
					if(this.inputParameterMap.get(id) == null)
						this.inputParameterMap.put(id, "");
					}

				/**
				 * This method adds an input value with the name <i>id</i>
				 * and adds in the map.
				 *
				 * @param id the name of the attribute value
				 * @param value the value to be stored in the map
				 * @see {@link ClientHttpRequest#addParameter(String,String)}
				 */
				private void addInputParameterSet(String id,String value) {
					addParamToMap( id, value );
					this.inputParameterMap.put(id, value);
					}

                public Map<String, String> getInputParameterMap() {
                        return this.inputParameterMap;
                }


                public Map<String, String> getParamentersMap() {
                        return this.inputParameterMap;
                }


				public Map<String, String> getOutputParameterMap() {
					return this.outputParameterMap;
				}

		}
