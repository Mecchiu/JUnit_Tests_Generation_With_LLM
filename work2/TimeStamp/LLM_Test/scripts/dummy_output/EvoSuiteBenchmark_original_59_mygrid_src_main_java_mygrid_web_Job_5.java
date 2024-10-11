// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		Object __xclass = null;
		Object __xclass_ref = null;
		
		ArrayOfDependency _dependencies = new ArrayOfDependency();

	ArrayOfContextElement _context =  new ArrayOfContextElement();

	/**
	 * Get a Serializable object from an instance
	 *
	 * @see mygrid.web.Job#getTypeDesc() 
	 */
	@Override
	public java.lang.Object getField(java.lang.String fieldName,
						   java.lang.Object caller) throws java.lang.Exception {

	 
		try{

			if (caller.getClass().equals(mygrid.web.Job.class)){


				return super.getField(fieldName, caller);
			}
		}
		catch(java.lang.SecurityException _ex){
			// Not allowed to call super.get(fieldName, caller) if calling outside of a class
		}


		if ("dependencies".equals(fieldName) || "context".equals(fieldName)){

			if (caller.getClass().equals(mygrid.web.ArrayOfDeploymentItem.class)){


				return super.getField(fieldName, caller);
			}
		}
		else if ("discrimators".equals(fieldName)){


			return super.getField(fieldName, caller);
		}
	  
		throw new java.lang.IllegalArgumentException("Cannot get a field from a java object"+
											 " of class com.blazemeter.webservice.engine.jaxrs.mygrid.jaxb.job.JobTest$JobTest");
	}

	/**
	* Get a Object from an Instance
	*
	* @see com.blazemeter.webservice.engine.jaxrs.mygrid.jaxb.job.Job#getDependencies() 
	*/
	@Override
	public javax.xml.namespace.QName getItem() throws java.lang.Exception {

		try{

			return super.getItem();
		}
		catch(java.lang.SecurityException _ex){
			// Not allowed to call super.get(item) if calling outside of a class
		}


		ArrayOfDependency _dependencies = new ArrayOfDependency();

	        if (caller.getClass()!= null && caller.getClass()!= cls) {
	      
			// Returned object is not the instance of our class
			throw new java.lang.IllegalArgumentException("The class argument should\n"
																  "never be cast but was of Class: "+
																  caller.getClass().getName()
																 .toString()
																  + ".\n\n"
																  + "You need to cast it to be of the\n"
																  "class that calls to a method of this " +
																  "class.");
		}

		if ("dependencies".equals(fieldName)){

			return _dependencies;
		}
		else if ("context".equals(fieldName)){

			return _context;
		}

		throw new java.lang.IllegalArgumentException("Cannot get a field from a java object"+
											 " of class com.blazemeter.webservice.engine.jaxrs.mygrid.jaxb.job.JobTest$JobTest");
		
	}

	
}