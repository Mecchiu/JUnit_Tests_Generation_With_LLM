
package mygrid.web;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class _FailResponseTest {
 private final _FailResponse _testObj;
    _FailResponseTest(constant.ClientType type, _FailResponse _testObj) {
        _this = _this;
        _this.testObj = _testObj;
    }
 @Test
 public void testResult() {
  assertEquals("_FailResponseTest", String.class, _testObj.getTypeDesc().getDeclarationClassName());
 }
 public void testResult(){
  _testObj.getTypeDesc().verify(javax.xml.namespace.QName.class).getDeclaredMethod(_FailResponse.class, javax.xml.namespace.QName.class).invoke(_testObj, "fail");
 }
    private static final long serialVersionUID = -Long.parseLong("3416690108164909849");
    private static final org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
      _FailResponse.class,
      true);
}