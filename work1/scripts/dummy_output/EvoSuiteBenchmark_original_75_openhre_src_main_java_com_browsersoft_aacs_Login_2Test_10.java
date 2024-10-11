package com.browsersoft.aacs;

	static String getSecurityLogFilePath();
} /* end class Login_2Test */

class UserInfoTest extends Login {

    String logPath_userInfoFile =
"com/browsersoft/aacs/TESTDB/userinfo/logFile_userinfo_test1.txt";
        
    public String logPath_userInfoFile() {
        return logPath_userInfoFile;
            }

    /**
* Tests the {@link Login#getSecurityLogFilePath()} method
* Asserts: does not throw any exceptions.
*/
    @Test
    public void testSimple() {
        //Logger, Level
        System.out.println("TEST");
        System.out.println("");
        
        //Logger,Level
        Logger.getRootLogger().setLevel(Level.ERROR);
        Logger.getRootLogger().setLevel(Level.INFO);
        Logger.getRootLogger().setLevel(Level.WARN);
        Logger.getRootLogger().setLevel(Logger.LOGGER_CONFIG);

        Logger logger = Logger.getLogger(Login.class.getName());

        //Logger.
        logger.debug("a");

        Iterator<String> it = logPath_userInfoFile.split("\\.")
               .iterator();
        if (it.hasNext()) {
            Level logLevel = logger.getLevel();
            logger.deprecate(logLevel);
            logger.setLevel(logLevel);
        }
        logger.warn("userinfo");

        it = logPath_userInfoFile.split("\\.")
               .iterator();
        while (it.hasNext()) {
            String path = it.next();
            if (path.startsWith("/") || path.startsWith("\\")) {
                continue;
            }
            try {
            StringTokenizer tokenizer = new StringTokenizer(path, "\\");
            if (tokenizer.countTokens() > 1) {
                String username = tokenizer.nextToken();
                logger.addDataSource(username);
            }
            } catch (Exception e) {
                System.out.println("Error with " + path);
                Logger.getLogger(UserInfo.class.getName()).error(e);
            }
        }
        logger.warn("");
        
        //Logger.
        logger.debug("");

        //System.out.println("");
        //System.out.println("getSecurityLogFilePath()");
        //getSecurityLogFilePath();
        logger.setLevel(Level.INFO);
        System.out.println("ok");
        //Logger.
        logger.info("");
        System.out.println("getSecurityLogFilePath()");
        getSecurityLogFilePath();
        logger.setLevel(Level.WARN);
        System.out.println("ok");
        logger.getLogger(UserInfo.class.getName()).setLevel(logger.getLevel());
        System.out.println("ok");
        //Logger.
        logger.warn("ok");
    }

}