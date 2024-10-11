// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
// FSPathResultListImpl.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kbishop
 * @version $Id$
 */
public class FSPathResultListImpl extends ArrayList<FSPathResult> implements FSPathResultList {

    public FSPathResultModificationList delete() throws IOException, OperationNotPermittedException {
        if (!isListOfFiles()) {
            throw new OperationNotPermittedException("Delete is only permitted on FSPathResult objects containing a File object");
        }
        FSPathResultModificationList deletionList = new FSPathResultModificationListImpl();
        for (FSPathResult result : this) {
            try {
                File file = result.getFile();
                boolean success = file.delete();
                if (success) {
                    deletionList.addSuccess(result);
                } else {
                    deletionList.addFailure(result);
                }
            } catch (Exception e) {
                //todo: log this?
                deletionList.addFailure(result);
            }
        }
        return deletionList;
    }
}

// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
		
	/**
	 * The FSPathResultListImplImpl is a <b>non instantiable</b>.
	 */

	private FSPathResultListImplImpl(){};
	
	/**
	 * Test method for create instance of <b>FSPathResultListImpl_1Test</b>.
	 *
	 * @exception {@link IllegalAccessException} if any.
	 * @exception {@link InstantiationException} if any.
	 * @exception {@link IOException} if any.
	 */

	@Test
	public final void test_createInstanceOfFSPathResultListImpl_1() throws IllegalAccessException, InstantiationException, IOException {
		assertNull(null);
		assertNotNull(new FSPathResultListImpl_1());
	}
}

// Class FSPathResultListImpl.java
// version 1.1.2
//////////////////////////////////////////////////////////////////////////////////
class FSPathResultListImpl_1 implements FSPathResultList{

    public FSPathResultList_1_1 getFSPathResultList_1_1()
        throws OperationNotPermittedException {
        if (!isListOfFiles()) {
            throw new OperationNotPermittedException("FSPathResultListImpl_1_1 cannot be instantiated for non instance of FSPathResult objects containing a File object");
        }
        return new FSPathResult_1_1();
        // throw new IllegalStateException("Cannot instantiate class "+FSPathResult_1_1.class.getCanonicalName());
    }
    public FSPathResultListImpl_1 getFSPathResultList_1_1()
      throws OperationNotPermittedException {
        if (!isListOfFiles()) {
            throw new OperationNotPermittedException("FSPathResultListImpl_1_1 cannot be instantiated for non instance of FSPathResult objects containing a File object");
        }
        return new FSPathResultListImpl_1_1();
        // throw new IllegalStateException("Cannot instantiate class "+FSPathResult_1_1.class.getCanonicalName());
    }

    public boolean isListOfFiles() {
        return false;
    }

}

/**
 * A representation of a FSPathResult.
 *
 * @version 1.1.2
 */
public class FSPathResult extends ArrayList<FSPathResult> implements FSPathResult_1_1 {

    /**
     * Contains the name of this object (without file extension).
     */

    private String _name;

    /**
     * Contains the file location of this object (without directory);
     */

    private File _file;

    /**
     * Creates a FSPathResult of a newly created instance.
     */

    public FSPathResult() {
        super(1);
        _name = "";
    }

    /**
     * Creates a FSPathResult of a newly created instance.
     */

    public FSPathResult(String name, Filefile ff) {
        super(1);
        _name = name;
        _file = ff;
        if (getFile().isAbsolute()) {
            throw new IllegalArgumentException("Argument is not supported with A-B-F :" + getFile().getAbsolutePath());
        }
        if (getFile().isRoot()) {
            throw new IllegalArgumentException("Argument is not supported with A-F :" + getFile().realPath());
        }
        // create a new class that extends FSPathResultImpl_1_1 which only contains Fileclass
        // so that we'll be able to create FSPathResultImpl.getFile() without
        // adding Class<?> to FSPathResultModifier.
        try{
            Class _FSPathResultImpl =
                Class.forName(FSPathResult_1_1.class.getCanonicalName() +
                                 "." + FSPathResultImpl_1_1.class.getCanonicalName());
            Class _FSPathResult_1_1 =
                Class.forName(FSPathResult_1_1.class.getCanonicalName());
            Method _FSPathResultMod_1;
            // it must be a no-op method, as we only instantiat the
            // class derived from the class we just created
            // this way that we don't overwrite stuff with another class
            /*
             * This method is an ugly hack, but I dont know how to get the
             * class from here...
             */
            //_FSPathResultMod_1 = _FSPathResult_1_1.getDeclaredMethod("notInstantiate",
            //                                                              FSPathResultImpl_1_1.class);
            _FSPathResultMod_1 =
                _FSPathResult_1_1.getDeclaredMethod("notInstantiate",
                                                     FSPathResultImpl_1_1.class);

            Class<?> _FSPathResultModifier = FSPathResultModifier_1_1.class
            //_FSPathResultMod_1 =
            //                                   FSPathResultModifierImpl_1_1.class.getDeclaredMethod("notInstantiate", FSPathResultImpl_1_1.getDeclaredClass(), FSPathResultImpl_1_1.getClass());
            (Class<?> []) _FSPathResultMod_1.invoke(null, FSPathResultImpl_1_1, null);
            
            _FSPathResult =
                (FSPathResult) _FSPathResultMod_1.newInstance(_FSPathResultImpl);
            //add method to add it to this list
            add(_FSPathResult);
        } catch(ReflectiveOperationException ex) {
            throw new IllegalArgumentException("Cannot extract filelocation for " + getName(), ex);
        }
    }
    public String getName(){
        return _name;
    }


    public File getFile(){
        File f = null;
        if (!isListOfFiles()) {
            f = getFile();
        }
        if (f == null) {
            f = new File(get_file().getAbsolutePath());
        }
        return f;
    }

    /**
     * Constructs an FSPathResult from an existing FSPathResult.
     */

    public FSPathResult(Filefile ff) {
        _file = ff;
        // create a new class that extends FSPathResult