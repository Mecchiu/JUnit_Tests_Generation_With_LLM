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

    @Test
    void Test(){
			
        ParamterBean param = new ParameterBean();
		
        assertNull(param.searchParameter);
		
        param.searchParameters=this.getTestParameters();
        
        assertTrue(this.testParameterSize(param));
		
        param.searchParameters=new Object();

    }
	
    private List<ParameterBean> getTestParameters(){
    		
        List<ParameterBean>  result = new ArrayList<ParameterBean>();
    		
        SearchParameter searchParameter = parameterv0.iterator().next();
    		
        ParameterBean param = new ParameterBean();
        param.searchParameter = searchParameter;
        
        result.add(param);

        return result;
    }
	
    /**
* Tests the {@link ParameterBean#size()} method
 * 
* @throws Exception
*/
    private boolean testParameterSize(ParamterBean param){
        HashSet <ParameterBean> set = new HashSet <ParameterBean>();
        set.add(param);
        return (set.size() == param.searchParameters.size());
    }

}
