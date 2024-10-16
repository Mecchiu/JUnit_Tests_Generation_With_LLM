/*
 * $Id: FBTestGeneratedKeysBase.java 57004 2012-08-06 12:56:23Z mrotteveel $
 * 
 * Firebird Open Source J2EE Connector - JDBC Driver
 *
 * Distributable under LGPL license.
 * You may obtain a copy of the License at http://www.gnu.org/copyleft/lgpl.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * LGPL License for more details.
 *
 * This file was created by members of the firebird development team.
 * All individual contributions remain the Copyright (C) of those
 * individuals.  Contributors to this file are either listed here or
 * can be obtained from a CVS history command.
 *
 * All rights reserved.
 */
package org.firebirdsql.jdbc;

import java.sql.Connection;

import org.firebirdsql.common.FBTestBase;

import static org.firebirdsql.common.DdlHelper.*;
import static org.firebirdsql.common.JdbcResourceHelper.*;

/**
 * Test base for tests of retrieval of auto generated keys.
 * <p>
 * Defines the basic table structure for the test.
 * </p>
 * 
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
abstract class FBTestGeneratedKeysBase extends FBTestBase {

    private static final String DROP_TABLE = "DROP TABLE TABLE_WITH_TRIGGER";
    private static final String CREATE_TABLE = "CREATE TABLE TABLE_WITH_TRIGGER (\n"
                + " ID Integer NOT NULL,\n" 
                + " TEXT Varchar(200),\n"
                + " \"quote_column\" INTEGER DEFAULT 2,\n"
                + " CONSTRAINT PK_TABLE_WITH_TRIGGER_1 PRIMARY KEY (ID)\n" 
                + ")";
    private static final String DROP_SEQUENCE = "DROP GENERATOR GEN_TABLE_WITH_TRIGGER_ID";
    private static final String CREATE_SEQUENCE = "CREATE GENERATOR GEN_TABLE_WITH_TRIGGER_ID";
    private static final String INIT_SEQUENCE = "SET GENERATOR GEN_TABLE_WITH_TRIGGER_ID TO 512";
    private static final String DROP_TRIGGER = "DROP TRIGGER TABLE_WITH_TRIGGER_BI";
    private static final String CREATE_TRIGGER = "CREATE TRIGGER TABLE_WITH_TRIGGER_BI FOR TABLE_WITH_TRIGGER ACTIVE\n" + 
        		"BEFORE INSERT POSITION 0\n" + 
        		"AS\n" + 
        		"DECLARE VARIABLE tmp DECIMAL(18,0);\n" + 
        		"BEGIN\n" + 
        		"  IF (NEW.ID IS NULL) THEN\n" + 
        		"    NEW.ID = GEN_ID(GEN_TABLE_WITH_TRIGGER_ID, 1);\n" + 
        		"  ELSE\n" + 
        		"  BEGIN\n" + 
        		"    tmp = GEN_ID(GEN_TABLE_WITH_TRIGGER_ID, 0);\n" + 
        		"    if (tmp < new.ID) then\n" + 
        		"      tmp = GEN_ID(GEN_TABLE_WITH_TRIGGER_ID, new.ID-tmp);\n" + 
        		"  END\n" + 
        		"END";

    public FBTestGeneratedKeysBase(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
        
        Connection con = getConnectionViaDriverManager();
        try {
            executeDropTable(con, DROP_TRIGGER);
            executeDropTable(con, DROP_SEQUENCE);
            executeDropTable(con, DROP_TABLE);
            
            executeCreateTable(con, CREATE_TABLE);
            executeCreateTable(con, CREATE_SEQUENCE);
            executeCreateTable(con, INIT_SEQUENCE);
            executeCreateTable(con, CREATE_TRIGGER);
        } finally {
            closeQuietly(con);
        }
    }

    public void tearDown() throws Exception {
        Connection con = getConnectionViaDriverManager();
        try {
            executeDropTable(con, DROP_TRIGGER);
            executeDropTable(con, DROP_SEQUENCE);
            executeDropTable(con, DROP_TABLE);
        } finally {
            closeQuietly(con);
            super.tearDown();
        }
    }

}