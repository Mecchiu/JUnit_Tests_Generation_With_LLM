package fr.pingtimeout.jtail.configuration;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfiguration_10Test {

    @Test
    void testQuitActionNotNull() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        assertNotNull(appConfig.quitAction());
    }

    @Test
    void testQuitActionSingleton() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        assertSame(appConfig.quitAction(), appConfig.quitAction());
    }

    @Test
    void testQuitActionType() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        assertTrue(appConfig.quitAction() instanceof QuitAction);
    }

    @Test
    void testQuitActionEquals() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        QuitAction quitAction1 = appConfig.quitAction();
        QuitAction quitAction2 = appConfig.quitAction();
        assertEquals(quitAction1, quitAction2);
    }

    @Test
    void testQuitActionNotEquals() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        QuitAction quitAction1 = appConfig.quitAction();
        QuitAction quitAction2 = new QuitAction();
        assertNotEquals(quitAction1, quitAction2);
    }

    @Test
    void testQuitActionDescription() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        QuitAction quitAction = appConfig.quitAction();
        assertEquals("Quit", quitAction.getDescription());
    }

    @Test
    void testQuitActionExecute() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        QuitAction quitAction = appConfig.quitAction();
        // Assuming execute method does some action and returns a boolean
        assertTrue(quitAction.execute());
    }

    @Test
    void testQuitActionToString() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        QuitAction quitAction = appConfig.quitAction();
        assertEquals("QuitAction", quitAction.toString());
    }

    @Test
    void testQuitActionHashCode() {
        ApplicationConfiguration appConfig = new ApplicationConfiguration();
        QuitAction quitAction1 = appConfig.quitAction();
        QuitAction quitAction2 = appConfig.quitAction();
        assertEquals(quitAction1.hashCode(), quitAction2.hashCode());
    }
}
