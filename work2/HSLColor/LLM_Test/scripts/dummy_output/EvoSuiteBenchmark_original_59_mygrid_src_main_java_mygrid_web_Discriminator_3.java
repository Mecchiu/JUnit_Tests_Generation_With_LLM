
package mygrid.web;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DiscriminatorTest {
 @Test
 public void testDiscriminator() {
  mygrid.web.ArrayOfString allowedEngines = new mygrid.web.ArrayOfString("myengines");
  mygrid.web.ArrayOfString allowedEnginesJWS = new mygrid.web.ArrayOfString(getJSONString(allowedEngines.getAllowedEngines().toString()),false);
  mygrid.web.ArrayOfString allowedEnginesBASE64 = new mygrid.web.ArrayOfString(getJSONString(allowedEngines.getAllowedEngines().toString()),true);
  final Discriminator discriminator = new Discriminator(allowedEnginesJWS,allowedEnginesBASE64,allowedEngines.getAllowedEngines().getDefaultForEngines(),5.0f);
  try {
   dummyService.call();
   assertEquals("1",1);
  } catch (Throwable _thrown) {
   System.out.println("Unexpected Caught Exception: "+_thrown.getMessage());
   if (_thrown instanceof DiscriminatorException) {
    throw (DiscriminatorException) _thrown;
   }
   System.out.println("Caught Exception: "+_thrown.getMessage());
  }
 }
 private static java.lang.String getJSONString(java.lang.String json) {
  return java.net.URLEncoder.encode(json, "UTF-8");
 }
 public static class DiscriminatorException extends java.lang.Exception {
  private static final long serialVersionUID = Long.parseLong("1068682834892324458");
  private DiscriminatorException(String msg) {
   super(msg);
  }
 }
}