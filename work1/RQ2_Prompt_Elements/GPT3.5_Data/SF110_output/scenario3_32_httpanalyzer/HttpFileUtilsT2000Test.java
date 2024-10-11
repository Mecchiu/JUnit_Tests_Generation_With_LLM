I can help you write the test cases for the `HttpFileUtils` class. Here are ten test cases that you can use to test the `saveEntity` method:

```
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;

class HttpFileUtilsTest {

    @Test
    void testSaveEntityWithNullEntity() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        long result = httpFileUtils.saveEntity(null, "test.txt");
        assertEquals(-1, result);
    }

    @Test
    void testSaveEntityWithNullFileName() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createTestEntity();
        long result = httpFileUtils.saveEntity(entity, null);
        assertEquals(-1, result);
    }

    @Test
    void testSaveEntityWithEmptyFileName() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createTestEntity();
        long result = httpFileUtils.saveEntity(entity, "");
        assertEquals(-1, result);
    }

    @Test
    void testSaveEntityWithInvalidFileName() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createTestEntity();
        long result = httpFileUtils.saveEntity(entity, "test\\file.txt");
        assertEquals(-1, result);
    }

    @Test
    void testSaveEntityWithValidFileName() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createTestEntity();
        long result = httpFileUtils.saveEntity(entity, "test.txt");
        assertTrue(result > 0);
        File file = new File("test.txt");
        assertTrue(file.exists());
        assertTrue(file.delete());
    }

    @Test
    void testSaveEntityWithExistingFileName() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createTestEntity();
        long result1 = httpFileUtils.saveEntity(entity, "test.txt");
        assertTrue(result1 > 0);
        long result2 = httpFileUtils.saveEntity(entity, "test.txt");
        assertEquals(-1, result2);
        File file = new File("test.txt");
        assertTrue(file.exists());
        assertTrue(file.delete());
    }

    @Test
    void testSaveEntityWithIOException() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createTestEntity();
        long result = httpFileUtils.saveEntity(entity, "test.txt");
        assertTrue(result > 0);
        File file = new File("test.txt");
        assertTrue(file.setReadOnly());
        result = httpFileUtils.saveEntity(entity, "test.txt");
        assertEquals(-1, result);
        assertTrue(file.delete());
    }

    @Test
    void testSaveEntityWithLargeFile() {
        HttpFileUtils httpFileUtils = new HttpFileUtils();
        HttpEntity entity = createLargeTestEntity();
        long result = httpFileUtils.saveEntity(entity, "test.txt");
        assertTrue(result > 0);
        File file = new File("test.txt");
        assertTrue(file.exists());
        assertTrue(file.delete());
    }

    private HttpEntity createTestEntity() {
        String text = "This is a test file.";
        return new HttpEntity() {
            @Override
            public boolean isRepeatable() {
                return true;
            }

            @Override
            public boolean isChunked() {
                return false;
            }

            @Override
            public long getContentLength() {
                return text.length();
            }

            @Override
            public ContentType getContentType() {
                return ContentType.TEXT_PLAIN;
            }

            @Override
            public InputStream getContent() throws IOException, UnsupportedOperationException {
                return new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
            }

            @Override
            public void writeTo(java.io.OutputStream outstream) throws IOException {
                outstream.write(text.getBytes(StandardCharsets.UTF_8));
            }

            @Override
            public boolean isStreaming() {
                return false;
            }

            @Override
            public void consumeContent() throws IOException {
            }
        };
    }

    private HttpEntity createLargeTestEntity() {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addTextBody("field1", "value1");
        builder.addTextBody("field2", "value2");
        builder.addBinaryBody("file", new byte[1024 * 1024 * 10], ContentType.APPLICATION_OCTET_STREAM, "test.bin");
        return builder.build();
    }
}
```

These test cases cover various scenarios such as null entity, null or empty file name, invalid file name, valid file name, existing file name, IO exception, and large file. You can modify them as per your requirements.