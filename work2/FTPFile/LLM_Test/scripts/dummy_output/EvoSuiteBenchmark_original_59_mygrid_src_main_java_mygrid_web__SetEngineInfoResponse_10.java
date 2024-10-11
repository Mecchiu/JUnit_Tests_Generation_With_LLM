
package mygrid.web;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class _SetEngineInfoResponseTest {
  private static final long serialVersionUID = -Long.parseLong("144889097830281288");
    @Test
    public void testGetTypeDesc() {
        assertEquals(org.apache.axis.description.TypeDesc.valueOf("" + org.apache.axis.description.TypeDesc.ANY), org.apache.axis.soap.SOAPEnvelope.getTypeDesc().newInstance());
    }
}