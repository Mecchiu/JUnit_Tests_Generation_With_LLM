// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {
		
	@org.junit.jupiter.api.Test
    @java.lang.SuppressWarnings("all")
    public void _ProgressTest(){
	switch(org.apache.axis.description.OperationDefinition.getDescriptor().getNamespaceUri()){
	case "http://mygrid.web#":
	case "http://mygrid.web/common":
	case "http://mygrid.web/common":
	case "http://mygrid.web/common.xml":
	case "http://mygrid.web/common.xsd":
	case "http://mygrid.web/common.xsd#":
		switch(org.apache.axis.description.OperationDefinition.getDescriptor().getName()){
			case "startJob":
			case "startJob0": 
			case "startJob1": 
				switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
				case org.apache.axis.description.OperationDesc.MODE_INLINE:
				case org.apache.axis.description.OperationDesc.MODE_LAZY:
				case org.apache.axis.description.OperationDesc.MODE_POST:;
					break;
				}
				break;
			case "getStatus0":
			case "getStatus0":
				switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
				case org.apache.axis.description.OperationDesc.MODE_INLINE:
				case org.apache.axis.description.OperationDesc.MODE_LAZY:
				case org.apache.axis.description.OperationDesc.MODE_POST:;
					break;
				}
				break;
			case "updateStatus0":
			case "updateStatus0":
			case "updateJob0": 
			case "updateJob1": 
				switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
				case org.apache.axis.description.OperationDesc.MODE_INLINE:
				case org.apache.axis.description.OperationDesc.MODE_LAZY:
				case org.apache.axis.description.OperationDesc.MODE_POST:;
					break;
				}
				break;
			case "getJobsBySubscription0":
			case "getJobsBySubscription0":
				switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
				case org.apache.axis.description.OperationDesc.MODE_INLINE:
				case org.apache.axis.description.OperationDesc.MODE_LAZY:
				case org.apache.axis.description.OperationDesc.MODE_POST:;
					break;
				}
				break;
			default:
				break;
			}
		}
	}

	@org.junit.jupiter.api.Test
    @java.lang.SuppressWarnings("all")
    public void _ProgressTestJAXB(){
	switch(org.apache.axis.description.OperationDefinition.getDescriptor().getNamespaceUri()){
	case "http://mygrid.web#":
	case "http://mygrid.web/common":
		switch(org.apache.axis.description.OperationDefinition.getDescriptor().getName()){
		case "startJob0": 
		case "startJob1": 
			switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
			case org.apache.axis.description.OperationDesc.MODE_INLINE:
			case org.apache.axis.description.OperationDesc.MODE_LAZY:
			case org.apache.axis.description.OperationDesc.MODE_POST:;
				break;
			default:
				break;
			}
			break;
		case "getStatus0": 
		case "getStatus0":
			switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
			case org.apache.axis.description.OperationDesc.MODE_INLINE:
			case org.apache.axis.description.OperationDesc.MODE_LAZY:
			case org.apache.axis.description.OperationDesc.MODE_POST:;
				break;
			default:
				break;
			}
			break;
		case "updateStatus0": 
		case "updateStatus0":
		case "updateJob0": 
		case "updateJob1": 
			switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
			case org.apache.axis.description.OperationDesc.MODE_INLINE:
			case org.apache.axis.description.OperationDesc.MODE_LAZY:
			case org.apache.axis.description.OperationDesc.MODE_POST:;
				break;
			default:
				break;
			}
			break;
		case "getJobsBySubscription0":
		case "getJobsBySubscription0":
			switch(org.apache.axis.description.OperationDefinition.getDescriptor().getAccessMode()) {
			case org.apache.axis.description.OperationDesc.MODE_INLINE:
			case org.apache.axis.description.OperationDesc.MODE_LAZY:
			case org.apache.axis.description.OperationDesc.MODE_POST:;
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}
    }
}