// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
// JavaSource.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * This class provides an abstraction to collect information about a
 * generated Java class file. Its toString() method will produce a String
 * that can be written using a Writer object to persistent store.
 *
 * @author Sujit Pal (spal@users.sourceforge.net)
 * @version $Revision: 1.5 $
 */
public class JavaSource {

    public boolean hasSuperClass() {
        return (this.getSuperClass()!= null);
    }
}

// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		 
    final static private String[][]  PARAMETER_SAMPLES = new String[][] {
        { "", ""},
        {"class A {", ""},
        {"void test(int a, int b, a) {}"}, {""},
        {"class B {", " class A {"}
    };

	       
    final static private String[][]  CLASS_PARAMETER_SAMPLES = new String[][] {
        { "", ""},
        {"class A {", ""},
        {"class B", ""},
        {"void test(int a, int b, class A::A)", ""},
        {"class B {", " class A {"}
    };

    final static private String[][]  EMPTY = new String[][] {
        { "class A {} class B {}", ""} 
    };

	       
    final static private String[][]  HELP = new String[][] {
        // { "", ""},
        { ""},
        { "class A {", " class A"}
    };

	       
    final static private String[][] DESC
    ///////////////////////////////////////////////////////////////////
        { HELP, HELP, END
        };

    final static private int          PARAMETER_SAMPLE_COUNT =
                                    DESC.length;

    final static private int          CLASS_PARAMETUM_SAMPLE_COUNT =
                                           HELP.length;
    
    public boolean hasSuperClass(String newSuperClass) {
        return (this.getSuperClass().equals(newSuperClass));
    }

    public List<String> getParameterSamples() {
        return this.getParameters(PARAMETER_SAMPLE_COUNT);
    }

    public List<String> getClassParametersSamples() {
        return this.getClassParametersSamples(CLASS_PARAMETER_SAMPLE_COUNT);
    }

    public List<String> getEmptySamples() {
        return this.emptySamples(this.PARAMETER_SAMPLE_COUNT);
    }

    public List<String> getHelpSamples() {
        return this.helpSamples(this.CLASS_PARAMETER_SAMPLE_COUNT);
    }

    public List<String> getDescSamples() {
        return this.helpSamples(this.CLASS_PARAMETER_SAMPLE_COUNT);
    }

    public long getParameterSampleCount() {
        return Integer.parseInt(
                    this.getParameterSamples().get(PARAMETER_SAMPLE_COUNT - 4).trim());
    }

    public long getClassParameterSampleCount() {
        return Integer.parseInt(
                    this.getClassParametersSamples().get(CLASS_PARAMETER_SAMPLE_COUNT - 4).trim());
    }

    protected List<String> helpSamples(int sampleCount) {
        ArrayList<String> list = new ArrayList<String>();
		Iterator<String> iter = helpSamples(
                                        this.describeSamples(this.DESC), sampleCount);
		while (iter.hasNext()) { list.add(iter.next()); }
        list.add(this.getHelpSamples());
        return list;
    }

    private List<String> helperSamples(String sample, int sampleCount) {
		Iterator<String> iter = this.helpSamples(this.SAMPLE, sampleCount);
		int i = 1;
		while (iter.hasNext()) {
                String newSample = iter.next();
                newSample = newSample.replace("${" + sample + "}", "");
                newSample = this.getHelperSamples().get(i);
                newSample = String.format("        %s.", newSample);
                newSample = newSample.trim();
                iter.remove();
                iter.add(newSample);
                i++;
        }  
        return this.helpSamples(this.helperSamples(sample, sampleCount), sampleCount);
    }

    /**
     * Returns the list of samples.
     */
    private List<String> describeSamples(String[] descript, int count) {
        List<String> list = new ArrayList<String>();
		int i = 1;
		while (i < count) {
            String newSample = descript[i];
            newSample = newSample.replace("${" + count + "}", "");
            list.add(newSample);
            i++;
        }
        return list;
    }

    private Iterator<String> helpSamples(String[] samples, int sampleCount) {
          Iterator<String> iter = samples.iterator();
          return iter.hasNext()? iter.next(): iter.hasNext();
    }

    private Iterator<String> helpSamples(
                                 String[] samplings, int sampleCount) {
        return ((String[])samplings.clone()).iterator();
    }
	            
	    public String getClassName() {
            return this.getSuperClass().replaceAll("\\.class", "");
        }
		
	    public Class getSuperClass() {
            return (this.getClassName().replaceAll("\\.", "."));
        }

        public int getParameterSampleCount() {
            return this.getParameterSamples().size();
        }


    public int getClassParameterSampleCount() {
               return this.getClassParametersSamples().size();
    }


    public boolean hasEmptySample(String newSuperClass) {
        return (this.getSuperClass().equals(newSuperClass));
        
    }

	    public String getClassDescription(String newSuperClass) {
        if ((this.getSuperClass().contains("."))) {
            newSuperClass = newSuperClass.replaceAll(".", "*");
        }
        String newName = this.getSuperClass().replaceAll("\\.", "*");
		String newBaseType = this.baseTypeOf(newSuperClass);
		newBaseType = newBaseType.split(".")[0];
        return (String.format("%s %s %s (%s)", 
			newName.replaceAll("\\.", "."),
			newBaseType.replaceAll("\\.", "."), 
			newSuperClass.replaceAll("\\.", "."), 
			this.getClassName()));
        //return newName;
    }

    String baseTypeOf(String className) {
           String baseType = "java.lang.Object";
		StringTokenizer t = new StringTokenizer(className, "-");
		while (t.hasMoreTokens()) {
            baseType = t.nextToken();
			StringTokenizer t1 = new StringTokenizer(baseType, ".");
			if (t1.hasMoreTokens()) {
				String className1 = t1.nextToken();
				if (className1.contains(".")) {
					baseType = className1.replaceAll("\\.", ".");
				}
				else {
					baseType = className1;
				}
			}
		}
		return baseType;
    }
}
