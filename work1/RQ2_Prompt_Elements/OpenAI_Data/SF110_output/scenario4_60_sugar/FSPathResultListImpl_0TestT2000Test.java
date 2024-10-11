// FSPathResultListImpl_0Test.java
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {

	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* <br/>
	* This test case is designed to test the {@link FSPathResultListImpl#each(Callback)} method
	* when the {@link FSPathResultListImpl} contains a single {@link FSPathResult} object.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method is expected to call the
	* {@link Callback#call(FSPathResult)} method of the {@link Callback} object passed to it.
	* <br/>
	* The {@link Callback#call(FSPathResult)} method is expected to return a {@link FSPathResult}
	* object which is then added to the {@link FSPathResultListImpl} object.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method is expected to return the
	* {@link FSPathResultListImpl} object.
	* <br/>
	* The {@link FSPathResultListImpl#size()} method is expected to return 1.
	* <br/>
	* The {@link FSPathResultListImpl#get(int)} method is expected to return a {@link FSPathResult}
	* object which is equal to the {@link FSPathResult} object returned by the
	* {@link Callback#call(FSPathResult)} method.
	* <br/>
	* The {@link FSPathResult#getFile()} method is expected to return a {@link File} object
	* which is equal to the {@link File} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getValue()} method is expected to return a {@link String} object
	* which is equal to the {@link String} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getType()} method is expected to return a {@link Class} object
	* which is equal to the {@link Class} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPath()} method is expected to return a {@link String} object
	* which is equal to the {@link String} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method.
	* <br/>
	* The {@link FSPathResult#getPathType()} method is expected to return a {@link FSPathType} object
	* which is equal to the {@link FSPathType} object passed to the {@link Callback#call(FSPathResult)}
	* method