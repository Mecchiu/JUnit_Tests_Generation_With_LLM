/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package dk.statsbiblioteket.summa.common.util;

import dk.statsbiblioteket.util.qa.QAInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.rmi.RMISecurityManager;
import java.security.Permission;

/**
 * Security-related methods.
 */
@QAInfo(level = QAInfo.Level.NORMAL,
        state = QAInfo.State.QA_NEEDED,
        author = "te")
public class Security {
    private static Log log = LogFactory.getLog(Security.class);

    /**
     * Creates an allow-all if no manager is present.
     */
    @SuppressWarnings("ObjectToString")
    public static void checkSecurityManager() {
        if (System.getSecurityManager() == null) {
            log.info("No security manager found. Setting allow-all security manager");
            System.setSecurityManager(new RMISecurityManager() {
                @Override
                public void checkPermission(Permission perm) {
                    // Do nothing (allow all)
/*                    if (log.isTraceEnabled()) {
                        log.trace("checkPermission(" + perm + ") called");
                    }*/
                }
                @Override
                public void checkPermission(Permission perm, Object context) {
                    // Do nothing (allow all)
/*                    if (log.isTraceEnabled()) {
                        log.trace("checkPermission(" + perm + ", " + context
                                  + ") called");
                    }*/
                }
            });
        } else {
            log.debug("SecurityManager '" + System.getSecurityManager() + "' present");
        }
    }
}

