// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
/**
		* Test of serialization of an instance.
		*/
    @Test
    void testSerialization() throws java.io.IOException {
        // fail response instance
        java.lang.String failResponse_value;
        failResponse_value = "";

        String expectedEncoding =
            System.lineSeparator() + "  _FailResponseTest(failResponse_value, org.apache.axis2.aspects.serviceloadbalancer.FailResponse )";
        String resultEncoding = (new _FailResponse(failResponse_value)).getTypeDesc().getEncoding();
        assertEquals(expectedEncoding, resultEncoding);
        // fail response instance --> new instance
       failResponse_value = "1234567890";
        expectedEncoding =
            System.lineSeparator() + "  _FailResponseTest(failResponse_value, org.apache.axis2.aspects.serviceloadbalancer.FailResponse )";
        resultEncoding = (new _FailResponse(failResponse_value)).getTypeDesc().getEncoding();
        assertEquals(expectedEncoding, resultEncoding);
    }
		// TODO add additional tests for custom fields

		/**
	 * Create field from JSON file
	 */
		private static void buildFromJSONFile(java.io.File jsonFile, org.apache.axis2.util.JavaSerializationFormat format) {

try {
/**
This section is reserved for testing purposes



  It may be deleted and then added back at any time.
	   */
	    System.out.println("Building From JSON file");
            
            java.io.BufferedReader in = null;
	        java.io.OutputStream out = null;
	        java.io.FileOutputStream outFile = null;
			  out = new java.io.FileOutputStream(jsonFile);//open OutputStream
					//from which we will open a FileInputStream
	        outFile = new java.io.FileOutputStream(jsonFile.getParent(), true);//open OutputStream
                in = new java.io.BufferedReader(new java.io.FileReader(jsonFile));// open a BufferedReader to
		    String nextLine = null;
		    StringBuilder linebuf = new StringBuilder();
		    String currentline = null;

		    //  this is a one line section, where as any other number
		    currentline = in.readLine();	        
		    while ((nextLine = in.readLine())!= null) {
			    linebuf.append(nextLine);
		    }

	if ((isFileSucceObjects(linebuf.toString())) && isSerializeSucce(linebuf.toString())) {

			    //  set up fileReader
		        java.io.File file = inFile;
					System.out.println("set up fileReader");
				//  create a BufferedReader from the file in this section
				in = new java.io.BufferedReader(in);
		        linebuf = new StringBuilder();
		        currentline = in.readLine();	        
		        while (currentline!= null) {
			    linebuf.append(currentline);
		        	currentline = in.readLine();       	        
				}	        

	     if ((isFileSucceObjects(linebuf.toString())) && isSerializeSucce(linebuf.toString())) {

		    outFile = new java.io.FileOutputStream(jsonFile.getParent(), true);//open OutputStream
					//open OutputStream to which we will create a FileOutputStream
					out = new java.io.OutputStreamWriter(outFile);//open OutputStreamWriter
				  	// create a BufferedWriter
					out = new java.io.BufferedWriter(out);// open BufferedWriter
					out.write(linebuf.toString());	                        
					int ch = out.read();	//read a character
					int temp;
					if (ch == '{')
	  	  	        linebuf = new StringBuilder(((String)jsonFile.read()).replace("{",""));
	  	  	        ch = JSONUtil.processJSON(linebuf, out); 

			    out.write(ch);

		if ((isFileSucceObjects(linebuf.toString())) && isSerializeSucce(linebuf.toString())) {   



					//  close the BufferedReader

					out.close();

					//  close the outputstream

					outFile.close();
				} 
			} else
			if ((linebuf.toString())!= null && isSerializeSucce(linebuf.toString())) {
			    int i_1 = linebuf.toString().indexOf("\\");

				if (i_1 == -1) {
					i_1 = linebuf.toString().length();
				}

				int i_2 = linebuf.toString().indexOf("{");

				if (i_2 == -1) {
					i_2 = linebuf.toString().indexOf('}');

					if (i_2 == -1) {
						i_2 = linebuf.toString().length();
					}
				}

				// now we have the index i_1, i_2
				i_1 = linebuf.toString().substring(0, i_1).toString();
				i_2 = linebuf.toString().substring(i_1 + 1, i_2).length();

				String retStr = new String(linebuf.toString().substring(i_1, i_2));
		      System.out.println("i_1 = " + i_1);
		      System.out.println("i_2 = " + i_2);
		      System.out.println("retStr = " + retStr);
				out.write(linebuf.toString());
			} else
			if (isFileSucceObjects(linebuf.toString())) {
			    out.write(linebuf.toString());
			} else
			if ((isFileSucceObjects()) && isFileSucce()) {
			    FileReader fr = new FileReader(jsonFile);
			    int ch = fr.read();
			    if (ch == "\\") {
			    boolean ch2 = false;
			    while (ch == '\\') {
			      ch2 = this.isFileSucceObjects(buf);
				}
			    if (ch2) {
			    	int ch3 = new String(buf).trim().length();
	  	  	        out.write(new String(buf));
			    }
			} else
			if ((isFileSucceObjects()) && isFileSucceObjects()) {
			    out.write(linebuf.toString());
			} else
			if ((isFileSucceObjects()) && isFileSucceObjects()) {
			    System.out.println("invalid json file -- cannot convert json");
		    }
			}
		
	}
	    in.close();   
            return; // this line is never reached -- so just return
		}
      private static boolean isFileSucceObjects(String jsonFile){
					return (jsonFile.indexOf("/") > -1)? true : false;
								}
       private static boolean isSerializeSucce(String jsonFile){
       return (jsonFile.indexOf("/") > -1)? true : false;
								}
}
