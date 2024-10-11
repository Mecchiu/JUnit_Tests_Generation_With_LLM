```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCRequestContext_0Test {

    @Test
    void testGetParam() {
        // Test case 1: Parameter exists
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getParameter("param1")).thenReturn("value1");
        JVCRequestContext context = new JVCRequestContext(request, null, null, null, null, null);
        assertEquals("value1", context.getParam("param1"));

        // Test case 2: Parameter does not exist
        when(request.getParameter("param2")).thenReturn(null);
        assertEquals(null, context.getParam("param2"));

        // Test case 3: Multipart content with binary value
        when(request.getAttribute("param3")).thenReturn("BINARY_VALUE");
        assertEquals("BINARY_VALUE", context.getParam("param3"));
    }
}
```
```java
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public Map<String, String> getParamMap(String name) {
        Map<String, String> m = new HashMap<String, String>();
        String prefix = name + "[";
        int n = prefix.length();
        if (hasMultipartContent) {
            Enumeration<String> e = request.getAttributeNames();
            while (e.hasMoreElements()) {
                String key = e.nextElement();
                if (key.startsWith(prefix) && key.endsWith("]")) {
                    m.put(key.substring(n, key.length() - 1), getParam(key));
                }
            }
        } else {
            Map<String, String[]> pm = request.getParameterMap();
            for (String key : pm.keySet()) {
                if (key.startsWith(prefix) && key.endsWith("]")) {
                    m.put(key.substring(n, key.length() - 1), getParam(key));
                }
            }
        }
        return m;
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public String[] getParamValues(String name) {
        return request.getParameterValues(name);
    }

    public String[] getParamNames() {
        if (hasMultipartContent) {
            List<String> list = new ArrayList<String>();
            Enumeration<String> e = request.getAttributeNames();
            while (e.hasMoreElements()) {
                list.add(e.nextElement());
            }
            return list.toArray(new String[list.size()]);
        } else {
            Map<String, String[]> m = request.getParameterMap();
            String[] a = new String[m.size()];
            int i = 0;
            for (String key : m.keySet()) {
                a[i++] = key;
            }
            return a;
        }
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public void setAttribute(String name, Object value) {
        request.setAttribute(name, value);
    }

    public Object getAttribute(String name) {
        return request.getAttribute(name);
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public void setSessionAttr(String name, Object value) {
        if (request.getSession() == null)
            return;
        request.getSession().setAttribute(name, value);
    }

    public Object getSessionAttr(String name) {
        if (request.getSession() == null)
            return null;
        return request.getSession().getAttribute(name);
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public void setSessionAttr(String name, Object value) {
        if (request.getSession() == null)
            return;
        request.getSession().setAttribute(name, value);
    }

    public void removeSessionAttr(String name) {
        if (request.getSession() == null)
            return;
        request.getSession().removeAttribute(name);
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public Cookie getCookie(String name) {
        if (name == null)
            return null;
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            return null;
        for (Cookie c : cookies) {
            if (name.equals(c.getName()))
                return c;
        }
        return null;
    }

    public String[] getCookieNames() {
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            return new String[0];
        String[] a = new String[cookies.length];
        int i = 0;
        for (Cookie c : cookies) {
            a[i++] = c.getName();
        }
        return a;
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public void setCookie(Cookie cookie) {
        response.addCookie(cookie);
    }

    public Cookie getCookie(String name) {
        if (name == null)
            return null;
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            return null;
        for (Cookie c : cookies) {
            if (name.equals(c.getName()))
                return c;
        }
        return null;
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public void nonStandardResponse(int httpCode, String arg) {
        throw new NonStandardResponseException(httpCode, arg);
    }

    public void redirect(String path) {
        if (path.startsWith("/"))
            path = absPath(path);
        nonStandardResponse(HttpURLConnection.HTTP_MOVED_TEMP, path);
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public void sendBinaryResponse(InputStream in) {
        throw new BinaryResponseException(in);
    }

    public String absPath(String path) {
        return getContextPath() + (path.startsWith("/") ? path : "/" + path);
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name);
        }
    }

    public String makeLink(String anchor, String path) {
        return makeLink(anchor, path, "");
    }

    public String makeLink(String anchor, String path, String options) {
        if (path.startsWith("/"))
            path = absPath(path);
        return "<a href='" + path + "' " + options + ">" + anchor + "</a>";
    }
}
```
```java
import javax.servlet.http.*;

public class JVCRequestContext {

    public String getParam(String name) {
        if (hasMultipartContent) {
            Object o = request.getAttribute(name);
            return (o != null && o instanceof String) ? (String) o : BINARY_VALUE;
        } else {
            return request.getParameter(name