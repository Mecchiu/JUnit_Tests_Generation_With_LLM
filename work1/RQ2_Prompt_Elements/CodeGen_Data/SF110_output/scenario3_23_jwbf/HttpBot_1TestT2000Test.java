// HttpBot_1Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {
/**
		 * @param args
		 */
		public static void main(String[] args) {
	        String actionName = "dummy";
	        String uri = "http://www.wbs.org/";
	        Object result = new HttpBot().performAction(actionName);
	        System.out.println(result);
	    }
}
class HttpBot_2_01 {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
	        String actionName = "dummy";
	        String uri;
	        if (((uri = HttpBot.performAction(actionName)).indexOf("dummy://.net\") == -1))
	                System.out.println("Test failed to convert");
	}
}
class HttpBot_2_10 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String actionName = "dummy";
		String data = "text";
		String id = "jwbf";
		String uri = null;
		{
			String result = HttpBot.performAction(actionName, data);
			System.out.println(result);
			if ((uri = result.substring(4).split("/")[0]).indexOf("jwbf/")!= -1)
				System.out.println("Received ID \"jwbf\"");
		}
		get(uri, id, data, data);
	}
	/*
	 * Get all
	 */
//		public static void get(String id, String data) {
//	    HttpActionClient get = new HttpActionClient("");
//	    try {
//	        String uri = "http://www.wbs.net/";
//	 	     get.get(uri, id, data);
//	    } catch (ActionException e) {
//	        e.printStackTrace();
//	    }
//	}

	/*
	 * Get with ID
	 */
//	public static void get(String uri, String data, String id) {
//	    try {
//	        HttpActionClient get = new HttpActionClient("");
//                get.get(uri, id, data);
//    } catch (ActionException e) {
//        e.printStackTrace();
//    }
//}

	/*
	 * Post
	 */




	public static void main(String[] args) {
        String actionName = "dummy";
		String uri;
	    if (((uri = HttpBot.performAction(actionName,
		   				 "actionName=dummy&param=paramValue&actionName=dummy&param2=paramTwo&actionName=dummy&param3=paramThree")))
	    .indexOf("action=dummy") == -1){
       	  System.out.println("Test failed to convert");
	    }
		   	if (((uri = HttpBot.performAction(actionName,
		   				 "http://www.wbs.net/dummyAction" + "&actionName=dummy&param=paramValue&actionName=dummy&param2=paramTwo&actionName=dummy&actionName=dummy&param3=paramThree")))
	    	.indexOf("action=dummy")!=-1){
    	  System.out.println("Test failed to conatinet URI");
	    }
	}
}
