// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {
		
	private final long time = System.currentTimeMillis();
	

	@Test
    public javax.xml.namespace.QName getTypeDesc() {
        return _ProgressResponse.typeDesc;
    }

        private float duration;
        
        public float getDuration() {
            return duration;
        }
        
        public void setDuration(float _duration) {
            duration = _duration;
        }
}