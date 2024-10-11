// LoggerFactoryTest.java
package de.paragon.explorer.util;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LoggerFactory}.
* It contains one unit test case for the {@link LoggerFactory#make()} method.
*/
class LoggerFactoryTest {
		// LoggerFactoryTest.java
    /**
     * erstellt Test f�r LoggerFactory.
     */
    @Test
    void test() {

	String[] strings = {"Log4J:"};
	String[] arrays = {"Loger:", "Logging:", "LOGGER:", "LOG:" };
	Logger logger = LoggerFactory.make();

	Logger[] loggers = new Logger[strings.length];
	Logger[] loggers2 = new Logger[arrayes.length];

        for (int i=0; i < strings.length; i++) {
            if (logger.isInfoEnabled()){
                loggers[i] = LoggerFactory.make();
                loggers[i].info(strings[i]);
            } else {
                if (logger.isWarnEnabled()){
                    loggers[i] = LoggerFactory.make();
                    loggers[i].warn(strings[i]);
                } else {
                    if (logger.isErrorEnabled()){
                        loggers[i] = LoggerFactory.make();
                        loggers[i].error(strings[i]);
                    } else {
                        if (logger.isFatalEnabled()){
                            loggers[i] = LoggerFactory.make();
                            loggers[i].error(strings[i]);
                        }
                    }
                }
            }
            
        }

        loggers2 = LoggerFactory.make();

        for (int i=0; i < strings.length; i++) {
            if (strings[i].equals("LoggerFactory.make()")){
                System.out.println("test for strings [logger]: " + strings[i]);
            }

            if (strings[i].equals("LoggerFactory.make()")){
                System.out.println("test for strings [logger2]: " + strings[i]);
            }
            
            if (logger.isWarnEnabled()){
                assertEquals(loggers[i],loggers2[i]);
            } else {
                assertEquals(logger,loggers[i]);

            }
        }

	for (int i=strings.length; i < strings.length * 2; i++) {
            System.out.println("test for arrays [logger]: " + arrays[i - strings.length]);
            assertNull(strings[i - strings.length]);
	}

	System.out.println("Logging: Log4J: " + (logger.isInfoEnabled()));

	// TODO: Error handling
//	assertEquals("LoggerFactoryTest.test()", strings[0]);

    }

}