// ClientHttpRequest_6Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {

		@Test
		public void testPOSTStringObjectCleansCache() throws Exception {
			newClientHttpRequestWithCache("key", 42).post("name", 123);
		}
	}

	// End of client tests.

	private ClientHttpRequest newClientHttpRequestWithCache(String name, Object value) throws IOException {
        // Create a random key and file.
        File key = new RandomClientHttpRequestCache().createKey("MyCache");

		ClientHttpRequest res = new ClientHttpRequest();
		String postParam = res.post("TestParameter", value, "name1", key.getAbsolutePath());
		assertEquals(postParam, 42);
		return res;
	}
}

final class RandomClientHttpRequestCache implements ClientHttpRequestCache {

    private final Map<String, Map<String, String>> cache;

    public RandomClientHttpRequestCache() {
        this.cache=new HashMap<>();
    }

    @Override
    public InputStream getInputStreamForKey(String key) {
        return new FileInputStream(key.endsWith(".json")? key : "MyCache"+key+".json");
    }

    @Override
    public String getKeyForPath(String path) {
        return "MyCache"+path.endsWith(".json")?path:path.substring(0, path.lastIndexOf("."));
    }

    @Override
    public OutputStream getOutputStreamForKey(String key) throws IOException {
      return new OutputStream() {

        @Override
        public void write(int b) throws IOException {

        }

        @Override
        public void close() throws IOException {

        }
      };
    }

    @Override
    public void deleteKeyForPath(String key) throws IOException {
      File file = getKeyFileForPath(key);
      if (file.exists()) {
        file.delete();
      }
    }

    @Override
    public void clearKeys() {
      cache.clear();
    }

    @Override
    public void putKeyForPath(String key, String value) throws IOException {
      File file = getKeyFileForPath(key);
      putKeyIntoCache(key, value, file.getPath(), file.getPath());
    }

    private void putKeyIntoCache(String key, String value, String name1, String name2) throws IOException {
      Map<String, String> map = cache.get(name1);
      if (map == null) {
        map = new HashMap<>();
        cache.put(name1, map);
      }
      map.put(name2, value);
    }

    private File getKeyFileForPath(String path) {
      File file = null;
      keyPathFor(path);
      if (path.endsWith(".json")) {
        file = new File(String.format("MyCache%s%s.json", path.substring(0, path.length()-2), path.substring(path.length()-1))
        );
      }
      else {
        file = new File(String.format("MyCache%s", path));
      }
      return file;
    }

    private void keyPathFor(String path) {
      if (path.endsWith(".json")){
        path = path.substring(0, path.length()-2);
        path = path.substring(0, path.length()-1);
      }
    }

    /**
     * Get key for a file that was previously created by the cache.
     * @param path file path being requested
     * @return key for a file that was previously created by the cache
     */
    public String getKeyFileForPath(String path) {
        if (cache.containsKey(path)) {
            File file = cache.get(path).get("");
            return file.getPath();
        }
        return null;
    }

    @Override
    public Map<String, String> getCachedKeys() {
        return new HashMap<>(cache);
    }
}
