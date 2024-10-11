// QuickServer_1Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#getVersionNo()} method.
*/
class QuickServer_1Test {
		/**
		 * Sets the numerical version of the library.
		 *
		 * @since 1.2
		 */
		public static final String VERSION = "1.4.8";


}
/**
* Test class of {@link QuickServer_1Test}
*/
//public class QuickServer_2Test {
//	/**
//	* Set the numerical version of the library.
//	*
//	* @since 1.2
//	*/
//	public static final String VERSION = "1.4.8";
//
//}
//
////quickServer.
//
//@Test
public class QuickServer_1Test {
	/**
	* Set the numerical version of the library.
	*
	* @since 1.2
	*/
	public static final String VERSION = "1.4.8";
	
	public static void main(String[] args)	{
		try {
			System.out.println("Starting server");
			String version = null;
			double versionDouble;
			//try {
			
			try {
			String userInput = System.console().readLine("Enter Server Version: ");
			version = version.concat(new String(System.console().readLine()));
			}
			catch(Exception e) {
				System.out.println("Invalid Server Version:" + e);
				System.exit(1);
			}
			try{
				versionDouble = Double.parseDouble(version); 
				}
			catch(Exception e){
				System.out.println("Server Version number Invalid:" + e);
				System.exit(1);
			}

			if(version.equals(VERSION)){
				System.out.println("Server Version OK!");
			}
			else{
				System.out.println("Server Version Not the same:" + version);
				System.exit(1);
			}
			
			}
			catch( NumberFormatException e ){
				System.out.println("Invalid Server Version:" + e);
				System.exit(1);
			}			
		}
		catch(Throwable e) {
			e.printStackTrace();
			}
	}
}