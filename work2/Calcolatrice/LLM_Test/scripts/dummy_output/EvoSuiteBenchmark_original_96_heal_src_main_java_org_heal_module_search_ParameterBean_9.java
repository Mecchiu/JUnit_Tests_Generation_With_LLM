// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains one unit test case for the {@link ParameterBean#size()} method.
*/
class ParameterBeanTest {
		
    /**
     * Initializes a new {@link ParameterBeanTest} instance.
     */
    ParameterBeanTest(){}

    /**
     * Checks if tableList is not empty.
     *
     * @return boolean
     */
    private boolean tableListNotEmpty() {
        return this.getTableList().size() > 0;
    }

    /**
     * Check if tableList contain the expected number of test table names.
     *
     * @return boolean
     */
    boolean tableNotFoundInTableList() {
        
	return this.tableNotFound(this.getTableList().iterator().next());
    }

    /**
     * Searches for the table node where the keywordString is in the value returned
     * by {@link ParameterBean#getTableList()}. Returns null if the keyword
     * is not registered in the table.
     *
     * @param searchString
     *
     * @return boolean
     */
    boolean findTable(String searchString, boolean createIfExists) {
        ParameterBean pb = null;
        boolean result = false;

        pb = this.findTable(searchString, createIfExists);

        if (pb!= null) {
            result = true;
        }

        return result;
    }

    /**
     * Searches for the table node where the keywordString is in the value returned
     * by {@link ParameterBean#getTableList()}. Returns null if the keyword
     * is not registered in the table.
     *
     * @param searchString
     * @param createIfExists
     *
     * @return ParameterNode
     */
    private ParameterBean findTable(String searchString, boolean createIfExists) {
        int position = this.getTableList().indexOf(searchString);

        if (position >= 0) {
            return this.createParameterBean(position, createIfExists);
        }
        else {
            return null;
        }
    }

    /**
     * Checks if the table not found in the tableList.
     * @param name
     * @param createIfExists
     *
     * @return boolean
     */
    private boolean tableNotFound(int position, boolean createIfExists) {
        ParameterBean pb = null;
        boolean result = false;

        pb = this.findTable(this.getTableList().get(position), createIfExists);

        if (pb!= null) {
            result = true;
        }

        return result;
    }

    /**
     * Makes a new {@link ParameterBean} {@link Builder} for the {@link ParameterBeanTest}.
     *
     * @return ParameterBean
     */
    private Builder createParameterBean() {
        return new ParameterBeanTest.ParameterBean(this);
    }

	public void setParmaretString(String paramrT);
}