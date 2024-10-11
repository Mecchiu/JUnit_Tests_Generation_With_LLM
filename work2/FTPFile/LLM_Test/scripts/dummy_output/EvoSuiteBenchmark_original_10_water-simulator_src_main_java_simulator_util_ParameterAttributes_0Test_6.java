
package simulator.util;
import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ParameterAttributes_0Test {
 private static final Long serialVersionUID = Long.parseLong("1385803357442368984");
 static public final Logger logger = Logger.getLogger(ParameterAttributes.class);
 @Test
 public final void testValueFor() {
  ParameterParameters params = new ParameterParameters(10.0, 0.0, 0.0);
  float sum = params.valueFor(0);
  float[] fArray = new float[10];
  for (float f : fArray) {
   sum = sum + f;
  }
  assertEquals(sum, 3.0 + 7.0);
 }
}