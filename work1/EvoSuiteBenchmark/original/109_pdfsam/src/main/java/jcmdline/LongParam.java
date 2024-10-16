/*
 * LongParam.java
 *
 * Classes:
 *   public   LongParam
 *   
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is the Java jcmdline (command line management) package.
 *
 * The Initial Developer of the Original Code is Lynne Lawrence.
 * 
 * Portions created by the Initial Developer are Copyright (C) 2002
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):  Andrea Vacondio
 *
 * ***** END LICENSE BLOCK *****
 */
package jcmdline;
/**
 * Encapsulate a command line parameter whose value will be a signed
 * long in the same range as a java long.
 * @author a.vacondio
 *
 */
public class LongParam extends AbstractParameter {
	   /**
     * the default label that will represent option values for this Parameter
     * when displaying usage.  The following demonstrates a possible usage
     * excerpt for a LongParam option, where the option label is '&lt;n&gt;':
     * <pre>
     *    count &lt;n&gt;  Specifies the maximum number of files to be
     *               produced by this program.
     * </pre>
     * @see AbstractParameter#setOptionLabel(String) setOptionLabel()
     * @see "<i>LongParam.defaultOptionLabel</i> in 'strings' properties file"
     */
    public static final String DEFAULT_OPTION_LABEL = 
            Strings.get("LongParam.defaultOptionLabel");

    /**
     * the maximum acceptable number - defaults to Long.MAX_VALUE
     */
    protected long max = Long.MAX_VALUE;

    /**
     * the minimum acceptable number - defaults to Long.MIN_VALUE
     */
    protected long min = Long.MIN_VALUE;

    /**
     * constructor - creates single-valued, optional, public
     * parameter which will
     * accept an long between Long.MIN_VALUE and Long.MAX_VALUE.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @throws              IllegalArgumentException if <code>tag</code> 
     *                      or <desc> are invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     */
    public LongParam(String tag, String desc) {
        this(tag, desc, Long.MIN_VALUE, Long.MAX_VALUE, 
             OPTIONAL, SINGLE_VALUED, PUBLIC);
    }

    /**
     * constructor - creates single-valued, public parameter which will
     * accept an long between Long.MIN_VALUE and Long.MAX_VALUE, and
     * will be either optional or required, as specified.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @throws              IllegalArgumentException if any of the specified
     *                      parameters are invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     */
    public LongParam(String tag, String desc, boolean optional) {
        this(tag, desc, Long.MIN_VALUE, Long.MAX_VALUE, 
             optional, SINGLE_VALUED, PUBLIC);
    }

    /**
     * constructor - creates a public parameter which will
     * accept an long between Long.MIN_VALUE and Long.MAX_VALUE, and
     * will be either optional or required, and/or multi-valued, as specified.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @param multiValued   {@link Parameter#MULTI_VALUED MULTI_VALUED} if 
     *                      the parameter can accept multiple values, 
     *                      {@link Parameter#SINGLE_VALUED SINGLE_VALUED} 
     *                      if the parameter can contain only a single value
     * @throws              IllegalArgumentException if any of the specified
     *                      parameters are invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 Parameter#SINGLE_VALUED SINGLE_VALUED
     * @see                 Parameter#MULTI_VALUED MULTI_VALUED
     */
    public LongParam(String tag, 
                    String desc, 
                    boolean optional, 
                    boolean multiValued) {
        this(tag, desc, Long.MIN_VALUE, Long.MAX_VALUE, 
             optional, multiValued, PUBLIC);
    }

    /**
     * constructor - creates a parameter which will
     * accept an long between Long.MIN_VALUE and Long.MAX_VALUE, and
     * will be either optional or required, and/or multi-valued, as specified.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @param multiValued   {@link Parameter#MULTI_VALUED MULTI_VALUED} if 
     *                      the parameter can accept multiple values, 
     *                      {@link Parameter#SINGLE_VALUED SINGLE_VALUED} 
     *                      if the parameter can contain only a single value
     * @param hidden        {@link Parameter#HIDDEN HIDDEN} if parameter is 
     *                      not to be listed in the usage, 
     *                      {@link Parameter#PUBLIC PUBLIC} otherwise.
     * @throws              IllegalArgumentException if any of the specified
     *                      parameters are invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 Parameter#SINGLE_VALUED SINGLE_VALUED
     * @see                 Parameter#MULTI_VALUED MULTI_VALUED
     * @see                 Parameter#HIDDEN HIDDEN
     * @see                 Parameter#PUBLIC PUBLIC
     */
    public LongParam(String tag, 
                    String desc, 
                    boolean optional, 
                    boolean multiValued,
                    boolean hidden) {
        this(tag, desc, Long.MIN_VALUE, Long.MAX_VALUE, 
             optional, multiValued, hidden);
    }

    /**
     * constructor - creates a single-valued, optional, public, parameter 
     * that will accept an long between the specifed minimum and maximum
     * values.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param min           the minimum acceptable value
     * @param max           the maximum acceptable value
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setMin(int) setMin()
     * @see                 #setMax(int) setMax()
     */
    public LongParam(String tag, String desc, long min, long max) {
        this(tag, desc, min, max, OPTIONAL, SINGLE_VALUED, PUBLIC);
    }

    /**
     * constructor - creates a single-valued, public parameter 
     * that will accept an long between the specifed minimum and maximum
     * values, and which is required or optional, as specified.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param min           the minimum acceptable value
     * @param max           the maximum acceptable value
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setMin(int) setMin()
     * @see                 #setMax(int) setMax()
     * @see                 Parameter#OPTIONAL OPTIONAL
     * @see                 Parameter#REQUIRED REQUIRED
     */
    public LongParam(String tag, 
                    String desc, 
                    long min, 
                    long max, 
                    boolean optional) {
        this(tag, desc, min, max, optional, SINGLE_VALUED, PUBLIC);
    }

    /**
     * constructor - creates a public parameter 
     * that will accept an long between the specifed minimum and maximum
     * values, and which is required or optional and/or multi-valued, 
     * as specified.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param min           the minimum acceptable value
     * @param max           the maximum acceptable value
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @param multiValued   {@link Parameter#MULTI_VALUED MULTI_VALUED} if 
     *                      the parameter can accept multiple values, 
     *                      {@link Parameter#SINGLE_VALUED SINGLE_VALUED} 
     *                      if the parameter can contain only a single value
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setMin(int) setMin()
     * @see                 #setMax(int) setMax()
     * @see                 Parameter#OPTIONAL OPTIONAL
     * @see                 Parameter#REQUIRED REQUIRED
     * @see                 Parameter#SINGLE_VALUED SINGLE_VALUED
     * @see                 Parameter#MULTI_VALUED MULTI_VALUED
     */
    public LongParam(String tag, 
                    String desc, 
                    long min, 
                    long max, 
                    boolean optional,
                    boolean multiValued) {
        this(tag, desc, min, max, optional, multiValued, PUBLIC);
    }

    /**
     * constructor - creates a parameter 
     * that will accept an long between the specifed minimum and maximum
     * values, and for which all other options are specified.
     *
     * @param tag           a unique identifier for this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param min           the minimum acceptable value
     * @param max           the maximum acceptable value
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @param multiValued   {@link Parameter#MULTI_VALUED MULTI_VALUED} if 
     *                      the parameter can accept multiple values, 
     *                      {@link Parameter#SINGLE_VALUED SINGLE_VALUED} 
     *                      if the parameter can contain only a single value
     * @param hidden        {@link Parameter#HIDDEN HIDDEN} if parameter is 
     *                      not to be listed in the usage, 
     *                      {@link Parameter#PUBLIC PUBLIC} otherwise.
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setMin(int) setMin()
     * @see                 #setMax(int) setMax()
     * @see                 Parameter#OPTIONAL OPTIONAL
     * @see                 Parameter#REQUIRED REQUIRED
     * @see                 Parameter#SINGLE_VALUED SINGLE_VALUED
     * @see                 Parameter#MULTI_VALUED MULTI_VALUED
     * @see                 Parameter#HIDDEN HIDDEN
     * @see                 Parameter#PUBLIC PUBLIC
     */
    public LongParam(String tag, 
                    String desc, 
                    long min, 
                    long max, 
                    boolean optional,
                    boolean multiValued,
                    boolean hidden) {
        this.setTag(tag);
        this.setMin(min);
        this.setMax(max);
        this.setDesc(desc);
        this.setOptional(optional);
        this.setMultiValued(multiValued);
        this.setHidden(hidden);
        this.setOptionLabel(DEFAULT_OPTION_LABEL);
    }

    /**
     * constructor - creates a single-valued, optional, public,
     * number parameter whose value must be one of the specified values.
     *
     * @param tag           the tag associated with this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param acceptableValues  the acceptable values for the parameter
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setAcceptablesLongValues(int[]) setAcceptableIntValues()
     */
    public LongParam(String tag, String desc, long[] acceptableValues) {
        this(tag, desc, acceptableValues, OPTIONAL, SINGLE_VALUED, PUBLIC);
    }

    /**
     * constructor - creates a single-valued, public,
     * number parameter whose value must be one of the specified values,
     * and which is required or optional, as specified.
     *
     * @param tag           the tag associated with this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param acceptableValues  the acceptable values for the parameter
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setAcceptablesLongValues(int[]) setAcceptableIntValues()
     * @see                 Parameter#OPTIONAL OPTIONAL
     * @see                 Parameter#REQUIRED REQUIRED
     */
    public LongParam(String tag, 
                    String desc, 
                    long[] acceptableValues,
                    boolean optional) {
        this(tag, desc, acceptableValues, optional, SINGLE_VALUED, PUBLIC);
    }

    /**
     * constructor - creates a public
     * number parameter whose value must be one of the specified values,
     * and which is required or optional and/or multi-valued, as specified.
     *
     * @param tag           the tag associated with this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param acceptableValues  the acceptable values for the parameter
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @param multiValued   {@link Parameter#MULTI_VALUED MULTI_VALUED} if 
     *                      the parameter can accept multiple values, 
     *                      {@link Parameter#SINGLE_VALUED SINGLE_VALUED} 
     *                      if the parameter can contain only a single value
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setAcceptablesLongValues(int[]) setAcceptableIntValues()
     * @see                 Parameter#OPTIONAL OPTIONAL
     * @see                 Parameter#REQUIRED REQUIRED
     * @see                 Parameter#SINGLE_VALUED SINGLE_VALUED
     * @see                 Parameter#MULTI_VALUED MULTI_VALUED
     */
    public LongParam(String tag, 
                    String desc, 
                    long[] acceptableValues,
                    boolean optional,
                    boolean multiValued) {
        this(tag, desc, acceptableValues, optional, multiValued, PUBLIC);
    }

    /**
     * constructor - creates a 
     * number parameter whose value must be one of the specified values,
     * and all of whose other options are specified.
     *
     * @param tag           the tag associated with this parameter
     * @param desc          a description of the parameter, suitable for display
     *                      in a usage statement
     * @param acceptableValues  the acceptable values for the parameter
     * @param optional      {@link Parameter#OPTIONAL OPTIONAL} if 
     *                      optional, 
     *                      {@link Parameter#REQUIRED REQUIRED} if required
     * @param multiValued   {@link Parameter#MULTI_VALUED MULTI_VALUED} if 
     *                      the parameter can accept multiple values, 
     *                      {@link Parameter#SINGLE_VALUED SINGLE_VALUED} 
     *                      if the parameter can contain only a single value
     * @param hidden        {@link Parameter#HIDDEN HIDDEN} if parameter is 
     *                      not to be listed in the usage, 
     *                      {@link Parameter#PUBLIC PUBLIC} otherwise.
     * @throws              IllegalArgumentException if any parameter is 
     *                      invalid.
     * @see                 AbstractParameter#setTag(String) setTag()
     * @see                 AbstractParameter#setDesc(String) setDesc()
     * @see                 #setAcceptablesLongValues(int[]) setAcceptableIntValues()
     * @see                 Parameter#OPTIONAL OPTIONAL
     * @see                 Parameter#REQUIRED REQUIRED
     * @see                 Parameter#SINGLE_VALUED SINGLE_VALUED
     * @see                 Parameter#MULTI_VALUED MULTI_VALUED
     * @see                 Parameter#HIDDEN HIDDEN
     * @see                 Parameter#PUBLIC PUBLIC
     */
    public LongParam(String tag, 
                    String desc, 
                    long[] acceptableValues,
                    boolean optional,
                    boolean multiValued,
                    boolean hidden) {
        this.setTag(tag);
        this.setAcceptablesLongValues(acceptableValues);
        this.setDesc(desc);
        this.setOptional(optional);
        this.setMultiValued(multiValued);
        this.setHidden(hidden);
        this.setOptionLabel(DEFAULT_OPTION_LABEL);
    }

    /**
     * Sets the minimum acceptable value for the parameter's value.
     * <P>
     * If both <code>acceptableValues</code> and/or a minimum or maximum
     * limit for the parameter value are specified, a valid value must 
     * satisfy <b>all</b> of the constraints.
     *
     * @param min       the minimum acceptable value
     * @throws          IllegalArgumentException if <code>min</code> is
     *                  greater than <code>max</code>
     */
    public void setMin(long min) {
        if (min > max) {
            throw new IllegalArgumentException(Strings.get(
                    "LongParam.maxLessThanMin", new Object[] { tag }));
        }
        this.min = min;
    }

    /**
     * Gets the value of the LongParam as in int.  If the LongParam is 
     * multi-valued, only the first value is returned.
     *
     * @return              the value as an int
     * @throws              RuntimeException if the value of the LongParam
     *                      has not been set.
     * @see Parameter#isSet()
     */
    public long longValue() {
        if (!set) {
            throw new RuntimeException(Strings.get(
                    "LongParam.valueNotSet", new Object[] { tag }));
        }
        return Long.parseLong((String)values.get(0));
    }

    /**
     * Gets the values of the LongParam as an int array.  Note that if the
     * LongParam has no values, an empty array is returned.
     *
     * @return              an array of int values
     * @see Parameter#isSet()
     */
    public long[] longValues() {
    	long[] vals = new long[values.size()];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Long.parseLong((String)values.get(i));
        }
        return vals;
    }

    /**
     * gets minimum acceptable value for the parameter's value
     *
     * @return              the minimum acceptable value
     */
    public long getMin() {
        return min;
    }

    /**
     * Sets the maximum acceptable value for the parameter.
     * <P>
     * If both <code>acceptableValues</code> and/or a minimum or maximum
     * limit for the parameter value are specified, a valid value must 
     * satisfy <b>all</b> of the constraints.
     *
     * @param max       the maximum acceptable value 
     * @throws          IllegalArgumentException if <code>min</code> is
     *                  greater than <code>max</code>
     */
    public void setMax(long max) {
        if (min > max) {
            throw new IllegalArgumentException(Strings.get(
                    "LongParam.maxLessThanMin", new Object[] { tag }));
        }
        this.max = max;
    }

    /**
     * gets the maximum acceptable value for the parameter
     *
     * @return              the maximum acceptable value
     */
    public long getMax() {
        return max;
    }

    /**
     * Sets the acceptable values for this parameter.
     * <P>
     * If both <code>acceptableValues</code> and/or a minimum or maximum
     * limit for the parameter value are specified, a valid value must 
     * satisfy <b>all</b> of the constraints.
     *
     * @param acceptableValues  An array of acceptable long values that
     *                          the parameter's values must match.  If null,
     *                          the parameter's values can be any long.
     */
    public void setAcceptablesLongValues(long[] longValues) {
        String[] sValues = new String[longValues.length];
        for (int i = 0; i < longValues.length; i++) {
            sValues[i] = Long.toString(longValues[i]);
        }
        setAcceptableValues(sValues);
    }

    /**
     * gets the acceptable values for this parameter
     *
     * @return              The acceptable values for this parameter.  If no
     *                      acceptable values have been specified, this 
     *                      method returns null.
     */
    public long[] getAcceptableLongValues() {
        String[] sValues = getAcceptableValues();
        long[] longValues = new long[sValues.length];
        for (int i = 0; i < sValues.length; i++) {
            longValues[i] = Long.parseLong(sValues[i]);
        }
        return longValues;
    }

    /**
     * Validates a prospective value with regards to the minimum and maximum
     * values and the acceptableValues called by add/setValue(s)().
     *
     * @param val           the prospective value to validate
     * @throws              CmdLineException if 
     *                      <code>value</code> is not valid with regard to 
     #                      the minimum and
     *                      maximum values, and the acceptableValues.
     */
    public void validateValue(String val) throws CmdLineException {

        // Strip off any leading 0s before calling 
        // AbstractParameter.validateValue() because the Strings we sent 
        // as acceptable values were without.
        int offset = 0;
        while (val.startsWith("0", offset)) {
            offset++;
        }
        super.validateValue(val.substring(offset));

        CmdLineException exception = new CmdLineException(Strings.get(
                "LongParam.validValues",
                new Object[] { tag,
                               new Long(min),
                               new Long(max) }));
        long longVal = 0;
        try {
        	longVal = Long.parseLong(val);
        } catch (NumberFormatException e) {
            throw exception;
        }
        if (longVal < min || longVal > max) {
            throw exception;
        }
    }
}
