// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains one unit test case for the {@link Main#getTestMolecule()} method.
*/
class MainTest {
/**
		 * Provide test structure.
		 *
		 * @return
		 * @throws IOException
		 */
	public static JniInchiStructure getTestMolecule() throws IOException {
         inchi.InchiFactory.setDebuggerType(InchiLogger.UNKNOWN);
        assertNotNull("Inchi logger is null!", log);
        return new JniInchiStructure(new NullLogger(log));

	}
}

//Logger.java
class NullLogger implements Logger{

    private ConsoleAppender consoleAppender;

    public NullLogger(Logger parent) {
        consoleAppender = new ConsoleAppender();
        consoleAppender.setLayout(new PatternLayout());
        consoleAppender.activateOptions();
        parent.addChild(consoleAppender);
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    @Override
    public boolean isFatalEnabled() {
        return true;
    }

    /** {@inheritDoc} */
    @Override
    public Logger getParent() {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Logger getLogger(String name) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean requiresLayout() {
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public Logger setName(String name) {
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isTimingEnabled() {
        return false;
    }

    @Override
    public void printTimingInfo() {
        //do nothing
    }

    /** {@inheritDoc} */
    @Override
    public boolean isResourceDebugEnabled() {
        return false;
    }
}

class TestLogger extends NullLogger {

    public TestLogger() {
        this(new NullLogger());
    }

    public TestLogger(Logger parent) {
        super(parent);
    }

    @Override
    public boolean isDebugEnabled() {
        //do nothing
    }
}

class TestConsoleAppender extends ConsoleAppender {

    public TestConsoleAppender() {
        setLayout(new PatternLayout("%d %-5p %c - %m%n"));
        setOutputStream(log.getOutputStream());
    }
}

class TestNullAppender extends ConsoleAppender {

    public TestNullAppender() {
        setLayout(new PatternLayout("%d %-5p %c - %m%n"));
        setOutputStream(log.getOutputStream());
    }
    /** {@inheritDoc} */
    @Override
    public boolean isInfoEnabled() {
        return false;
    }
    /** {@inheritDoc} */
    @Override
    public boolean isEnabledFor(int level) {
        return level == Level.INFO.intValue();
    }
    /** {@inheritDoc} */
    @Override
    public void printInfo(String message) {
        //do nothing
    }
}

class TestConsoleAppender extends ConsoleAppender implements Logger {

    public static void setConsoleHandler(String logname) {
        //DO nothing
    }

    private final javax.servlet.ServletConfig config = new javax.servlet.ServletConfig() {
        public String getServletName() {
            return null;
        }

        public javax.servlet.Servlet getServletContext() {
            return null;
        }
    };

    public TestConsoleAppender() {
        Logger root = (SimpleLogger) Logger.getRootLogger();
        setOutputStream(log.getOutputStream());
        setLayout(new PatternLayout("%d %-5p %c - %m%n"));

        ConsoleAppender consoleAppender = new TestConsoleAppender();
        //consoleAppender.config = config.duplicate();
        root.addChild(consoleAppender);

	}
    /** {@inheritDoc} */
    @Override
    public boolean isDebugEnabled() {
        return false;
    }
    /** {@inheritDoc} */
    @Override
    public void printDebug(String message) {
        //do nothing
    }

    /** {@inheritDoc} */
    @Override
    public boolean isResourceDebugEnabled() {
        return false;
    }
    /** {@inheritDoc} */
    @Override
    public final String getResourceDescription(String name) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean requiresLayout() {
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public final String getName() {
        return null;
    }
}
