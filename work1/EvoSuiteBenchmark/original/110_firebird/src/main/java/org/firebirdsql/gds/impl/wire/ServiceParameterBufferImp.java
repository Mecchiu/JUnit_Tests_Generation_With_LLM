/*
 * Firebird Open Source J2ee connector - jdbc driver
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
package org.firebirdsql.gds.impl.wire;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.firebirdsql.gds.ISCConstants;
import org.firebirdsql.gds.ServiceParameterBuffer;

/**
 * ngds implementation for ServiceParameterBuffer.
 */
class ServiceParameterBufferImp extends ParameterBufferBase implements
        ServiceParameterBuffer {

    /* (non-Javadoc)
     * @see org.firebirdsql.gds.Xdrable#getLength()
     */
    public int getLength() {
        return super.getLength() + 1;
    }
    /* (non-Javadoc)
     * @see org.firebirdsql.gds.Xdrable#write(org.firebirdsql.gds.XdrOutputStream)
     */
    public void write(XdrOutputStream outputStream) throws IOException {
        outputStream.write(ISCConstants.isc_spb_current_version);
        super.write(outputStream);
    }
    
    public byte[] toByteArray() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrOutputStream outputStream = new XdrOutputStream(out);
        
        write(outputStream);
        
        outputStream.flush();
        out.flush();
        
        return out.toByteArray();
    }

}