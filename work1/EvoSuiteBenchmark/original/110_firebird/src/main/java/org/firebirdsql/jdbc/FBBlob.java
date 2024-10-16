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

package org.firebirdsql.jdbc;

import java.io.*;
import java.sql.*;
import java.util.*;

import org.firebirdsql.gds.*;
import org.firebirdsql.gds.impl.GDSHelper;

/**
 * The representation (mapping) in
 * the Java<sup><font size=-2>TM</font></sup> programming
 * language of an SQL
 * <code>BLOB</code> value.  An SQL <code>BLOB</code> is a built-in type
 * that stores a Binary Large Object as a column value in a row of
 * a database table. The driver implements <code>Blob</code> using
 * an SQL <code>locator(BLOB)</code>, which means that a
 * <code>Blob</code> object contains a logical pointer to the
 * SQL <code>BLOB</code> data rather than the data itself.
 * A <code>Blob</code> object is valid for the duration of the
 * transaction in which is was created.
 *
 * <P>Methods in the interfaces {@link java.sql.ResultSet},
 * {@link java.sql.CallableStatement}, and {@link java.sql.PreparedStatement}, such as
 * <code>getBlob</code> and <code>setBlob</code> allow a programmer to
 * access an SQL <code>BLOB</code> value.
 * The <code>Blob</code> interface provides methods for getting the
 * length of an SQL <code>BLOB</code> (Binary Large Object) value,
 * for materializing a <code>BLOB</code> value on the client, and for
 * determining the position of a pattern of bytes within a
 * <code>BLOB</code> value.
 *<P>
 * This class is new in the JDBC 2.0 API.
 * @since 1.2
 */

public class FBBlob implements FirebirdBlob, Synchronizable {
    
    public static final boolean SEGMENTED = true;
    public static final int READ_FULLY_BUFFER_SIZE = 16 * 1024;

    /**
     * bufferlength is the size of the buffer for blob input and output streams,
     * also used for the BufferedInputStream/BufferedOutputStream wrappers.
     *
     */
    int bufferlength;

    boolean isNew;
    long blob_id;
    GDSHelper gdsHelper;
    private FBObjectListener.BlobListener blobListener;

    Collection<FBBlobInputStream> inputStreams = Collections.synchronizedSet(new HashSet<FBBlobInputStream>());
    private FBBlobOutputStream blobOut = null;

    private FBBlob(GDSHelper c, boolean isNew, FBObjectListener.BlobListener blobListener) {
        this.gdsHelper = c;
        this.isNew = isNew;
        this.bufferlength = c.getBlobBufferLength();
        this.blobListener = blobListener;
    }

    /**
     * Create new Blob instance. This constructor creates new fresh Blob, only
     * writing to the Blob is allowed.
     * 
     * @param c connection that will be used to write data to blob.
     */
    public FBBlob(GDSHelper c, FBObjectListener.BlobListener blobListener) {
        this(c, true, blobListener);
    }
    
    public FBBlob(GDSHelper c) {
        this(c, null);
    }

    /**
     * Create instance of this class to access existing Blob.
     * 
     * @param c connection that will be used to access Blob.
     * 
     * @param blob_id ID of the Blob.
     */
    public FBBlob(GDSHelper c, long blob_id, FBObjectListener.BlobListener blobListener) {
        this(c, false, blobListener);
        this.blob_id = blob_id;
    }
    
    public FBBlob(GDSHelper c, long blob_id) {
        this(c, blob_id, null);
    }

    
    /**
     * Get synchronization object that will be used to synchronize multithreaded
     * access to the database.
     * 
     * @return object that will be used for synchronization.
     */
    public Object getSynchronizationObject() {
        return gdsHelper;
    }

    /**
     * Close this Blob object. This method closes all open input streams.
     * 
     * @throws IOException if at least one of the stream raised an exception
     * when closed.
     */
    public void close() throws IOException {
        Object syncObject = getSynchronizationObject();
        synchronized(syncObject) {

            IOException error = null;
            
            for (FBBlobInputStream blobIS : inputStreams) {
                try {
                    blobIS.close();
                } catch(IOException ex) {
                    error = ex;
                }
            }
            inputStreams.clear();

            if (error != null)
                throw error;
        }
    }

    /**
     * This method frees the <code>Blob</code> object and releases the resources that 
     * it holds. The object is invalid once the <code>free</code>
     * method is called.
     *<p>
     * After <code>free</code> has been called, any attempt to invoke a
     * method other than <code>free</code> will result in a <code>SQLException</code> 
     * being thrown.  If <code>free</code> is called multiple times, the subsequent
     * calls to <code>free</code> are treated as a no-op.
     *<p>
     * 
     * @throws SQLException if an error occurs releasing
     * the Blob's resources
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @since 1.6
     */
    public void free() throws SQLException {
        try {
            close();
        } catch(IOException ex) {
            throw new FBSQLException(ex);
        }
    }

    /**
     * Returns an <code>InputStream</code> object that contains a partial <code>Blob</code> value, 
     * starting  with the byte specified by pos, which is length bytes in length.
     *
     * @param pos the offset to the first byte of the partial value to be retrieved.
     *  The first byte in the <code>Blob</code> is at position 1
     * @param length the length in bytes of the partial value to be retrieved
     * @return <code>InputStream</code> through which the partial <code>Blob</code> value can be read.
     * @throws SQLException if pos is less than 1 or if pos is greater than the number of bytes
     * in the <code>Blob</code> or if pos + length is greater than the number of bytes 
     * in the <code>Blob</code>
     *
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @since 1.6
     */
    public InputStream getBinaryStream(long pos, long length)
            throws SQLException {
        throw new FBDriverNotCapableException();
    }

    /**
     * Get information about this Blob. This method should be considered as 
     * temporary because it provides access to low-level API. More information
     * on how to use the API can be found in "API Guide".
     * 
     * @param items items in which we are interested.
     * @param buffer_length buffer where information will be stored.
     * 
     * @return array of bytes containing information about this Blob.
     * 
     * @throws SQLException if something went wrong.
     */
    public byte[] getInfo(byte[] items, int buffer_length) throws SQLException {
        
        Object syncObject = getSynchronizationObject();
        
        synchronized(syncObject) {
            try {
                if (blobListener != null)
                    blobListener.executionStarted(this);
                
                IscBlobHandle blob = gdsHelper.openBlob(blob_id, SEGMENTED);
                try {
                    return gdsHelper.getBlobInfo(blob, items, buffer_length);
                } finally {
                    gdsHelper.closeBlob(blob);
                }
                
            } catch(GDSException ex) {
                throw new FBSQLException(ex);
            } finally {
                if (blobListener != null)
                    blobListener.executionCompleted(this);
            }
        }
    }

   public static final byte[] BLOB_LENGTH_REQUEST = new byte[]{ISCConstants.isc_info_blob_total_length};
    
  /**
   * Returns the number of bytes in the <code>BLOB</code> value
   * designated by this <code>Blob</code> object.
   * @return length of the <code>BLOB</code> in bytes
   * @exception SQLException if there is an error accessing the
   * length of the <code>BLOB</code>
   * @since 1.2
   * @see <a href="package-summary.html#2.0 API">What Is in the JDBC 2.0 API</a>
   */
    public long length() throws SQLException {
        byte[] info = getInfo(BLOB_LENGTH_REQUEST, 20);
            
        return interpretLength(info, 0);
    }

    /**
     * Interpret BLOB length from buffer.
     * 
     * @param info server response.
     * @param position where to start interpreting.
     * 
     * @return length of the blob.
     * 
     * @throws SQLException if length cannot be interpreted.
     */            
    public static long interpretLength(GDSHelper gdsHelper, byte[] info, int position) throws SQLException { 
                
        if (info[position] != ISCConstants.isc_info_blob_total_length)
            throw new FBSQLException("Length is not available.");
            
        int dataLength = gdsHelper.iscVaxInteger(info, position + 1, 2);
            
        return gdsHelper.iscVaxInteger(info, position + 3, dataLength);
    }
    
    /**
     * Interpret BLOB length from buffer.
     * 
     * @param info server response.
     * @param position where to start interpreting.
     * 
     * @return length of the blob.
     * 
     * @throws SQLException if length cannot be interpreted.
     */            
    long interpretLength(byte[] info, int position) throws SQLException { 
       return interpretLength(gdsHelper, info, position);
    }

    /**
     * Check if blob is segmented. 
     * 
     * @return <code>true</code> if this blob is segmented, 
     * otherwise <code>false</code>
     * 
     * @throws SQLException if something went wrong.
     */
    public boolean isSegmented() throws SQLException {
        byte[] info = getInfo(
            new byte[] {ISCConstants.isc_info_blob_type}, 20);

        if (info[0] != ISCConstants.isc_info_blob_type)
            throw new FBSQLException("Cannot determine BLOB type");

        int dataLength = gdsHelper.iscVaxInteger(info, 1, 2);

        int type = gdsHelper.iscVaxInteger(info, 3, dataLength);

        return type == ISCConstants.isc_bpb_type_segmented;
    }

    /**
     * Detach this blob. This method creates new instance of the same blob 
     * database object that is not under result set control. When result set
     * is closed, all associated resources are also released, including open
     * blob streams. This method creates an new instance of blob object with
     * the same blob ID that can be used even when result set is closed.
     * <p>
     * Note, detached blob will not remember the stream position of this object.
     * This means that you cannot start reading data from the blob, then detach
     * it, and then continue reading. Reading from detached blob will begin at
     * the blob start.
     * 
     * @return instance of {@link FBBlob} that is not under result set control.
     * 
     * @throws SQLException if Blob cannot be detached.
     */    
    public FirebirdBlob detach() throws SQLException {
        return new FBBlob(gdsHelper, blob_id, blobListener);
    }

  /**
   * Returns as an array of bytes, part or all of the <code>BLOB</code>
   * value that this <code>Blob</code> object designates.  The byte
   * array contains up to <code>length</code> consecutive bytes
   * starting at position <code>pos</code>.
   * @param pos the ordinal position of the first byte in the
   * <code>BLOB</code> value to be extracted; the first byte is at
   * position 1
   * @param length the number of consecutive bytes to be copied
   * @return a byte array containing up to <code>length</code>
   * consecutive bytes from the <code>BLOB</code> value designated
   * by this <code>Blob</code> object, starting with the
   * byte at position <code>pos</code>
   * @exception SQLException if there is an error accessing the
   * <code>BLOB</code>
   * @since 1.2
   * @see <a href="package-summary.html#2.0 API">What Is in the JDBC 2.0 API</a>
   */
    public byte[] getBytes(long pos, int length) throws SQLException{
        
        if (pos < 1)
            throw new FBSQLException("Blob position should be >= 1");
        
        if (pos > Integer.MAX_VALUE)
            throw new FBSQLException("Blob position is limited to 2^31 - 1 " + 
                "due to isc_seek_blob limitations.",
                FBSQLException.SQL_STATE_INVALID_ARG_VALUE);
        
        Object syncObject = getSynchronizationObject();
        synchronized(syncObject) {
            if (blobListener != null)
                blobListener.executionStarted(this);
            
            try {
                FirebirdBlob.BlobInputStream in = 
                    (FirebirdBlob.BlobInputStream)getBinaryStream();
                    
                try {
                    byte[] result = new byte[length];
                    
                    if (pos != 1)
                        in.seek((int)pos - 1);
                    
                    in.readFully(result);
                    
                    return result;
                } finally {
                    in.close();
                }
                
            } catch(IOException ex) {
                throw new FBSQLException(ex);                    
            } finally {
                if (blobListener != null)
                    blobListener.executionCompleted(this);
            }
        }
     }


  /**
   * Retrieves the <code>BLOB</code> designated by this
   * <code>Blob</code> instance as a stream.
   * @return a stream containing the <code>BLOB</code> data
   * @exception SQLException if there is an error accessing the
   * <code>BLOB</code>
   * @since 1.2
   * @see <a href="package-summary.html#2.0 API">What Is in the JDBC 2.0 API</a>
   */
    public InputStream getBinaryStream () throws SQLException {
        
        Object syncObject = getSynchronizationObject();
        synchronized(syncObject) {
            FBBlobInputStream blobstream = new FBBlobInputStream(this);
            inputStreams.add(blobstream);
            return blobstream;
        }
    }

  /**
   * Determines the byte position at which the specified byte
   * <code>pattern</code> begins within the <code>BLOB</code>
   * value that this <code>Blob</code> object represents.  The
   * search for <code>pattern</code> begins at position
   * <code>start</code>.
   * @param pattern the byte array for which to search
   * @param start the position at which to begin searching; the
   *        first position is 1
   * @return the position at which the pattern appears, else -1
   * @exception SQLException if there is an error accessing the
   * <code>BLOB</code>
   * @since 1.2
   * @see <a href="package-summary.html#2.0 API">What Is in the JDBC 2.0 API</a>
   */
    public long position(byte pattern[], long start) throws SQLException {
        throw new FBDriverNotCapableException();
    }


  /**
   * Determines the byte position in the <code>BLOB</code> value
   * designated by this <code>Blob</code> object at which
   * <code>pattern</code> begins.  The search begins at position
   * <code>start</code>.
   * @param pattern the <code>Blob</code> object designating
   * the <code>BLOB</code> value for which to search
   * @param start the position in the <code>BLOB</code> value
   *        at which to begin searching; the first position is 1
   * @return the position at which the pattern begins, else -1
   * @exception SQLException if there is an error accessing the
   * <code>BLOB</code>
   * @since 1.2
   * @see <a href="package-summary.html#2.0 API">What Is in the JDBC 2.0 API</a>
   */
    public long position(Blob pattern, long start) throws SQLException {
        throw new FBDriverNotCapableException();
    }


    //jdbc 3.0 additions

    /**
     * <b>This operation is not currently supported</b>
     * Truncate this <code>Blob</code> to a given length. 
     *
     * @param param1 The length to truncate this Blob to 
     * @exception java.sql.SQLException this operation is not supported     
     * */
    public void truncate(long param1) throws SQLException {
        throw new FBDriverNotCapableException();
    }

    /**
     * <b>This operation is not currently supported</b>
     * Writes all or part of the given byte array to the BLOB value that this 
     * <code>Blob</code> object represents and returns the number of bytes 
     * written.
     *
     * @param param1 The position at which to start writing 
     * @param param2 The array of bytes to be written 
     * @return the number of bytes written 
     * @exception java.sql.SQLException because this operation is not supported 
     */
    public int setBytes(long param1, byte[] param2) throws SQLException {
        throw new FBDriverNotCapableException();
    }

    /**
     * <b>This operation is not currently supported</b>
     * Writes all or part of the given byte array to the BLOB value that this 
     * <code>Blob</code> object represents and returns the number of bytes 
     * written.
     *
     * @param param1 The position at which to start writing 
     * @param param2 The array of bytes to be written 
     * @param param3 the offset into the byte array at which to start reading 
     * the bytes to be set 
     * @param param4 the number of bytes to be written to the BLOB value from 
     * the byte array   
     * @return the number of bytes written 
     * @exception java.sql.SQLException because this operation is not supported 
     */
    public int setBytes(long param1, byte[] param2, int param3, int param4) throws SQLException {
        throw new FBDriverNotCapableException();
    }

    /**
     * Retrieves a stream that can be used to write to the BLOB value that 
     * this Blob object represents. The stream begins at position pos. 
     *
     * @param pos The position in the blob to start writing.
     * @return OuputStream to write to.
     * @exception java.sql.SQLException if a database access error occurs 
     */
    public OutputStream setBinaryStream(long pos) throws SQLException {
        
        if (blobListener != null)
            blobListener.executionStarted(this);
        
        if (blobOut != null) 
            throw new FBSQLException("Only one blob output stream open at a time!");

        if (pos < 1) 
            throw new FBSQLException(
                    "You can't start before the beginning of the blob",
                    FBSQLException.SQL_STATE_INVALID_ARG_VALUE);

        if ((isNew) && (pos > 1)) 
            throw new FBSQLException(
                    "Previous value was null, you must start at position 1",
                    FBSQLException.SQL_STATE_INVALID_ARG_VALUE);

        blobOut = new FBBlobOutputStream(this);
        if (pos > 1) {
            //copy pos bytes from input to output
            //implement this later
            throw new FBDriverNotCapableException("Offset start positions are not yet supported.");
        }
        
        return blobOut;
    }


    //package methods

    /**
     * Get the identifier for this <code>Blob</code>
     *
     * @return This <code>Blob</code>'s identifier
     * @throws SQLException if a database access error occurs
     */
    public long getBlobId() throws SQLException {
        if (isNew) 
            throw new FBSQLException("No Blob ID is available in new Blob object.");

        return blob_id;
    }
    
    void setBlobId(long blob_id) {
        this.blob_id = blob_id;
        this.isNew = false;
    }

    public void copyBytes(byte[] bytes, int pos, int len) throws SQLException {
        OutputStream out = setBinaryStream(1);
        try {
            try {
                out.write(bytes, pos, len);
            } finally {
                out.close();
            }
        } catch(IOException ex) {
            throw new FBSQLException(ex);
        }
    }
    
    /**
     * Copy the contents of an <code>InputStream</code> into this Blob.
     *
     * @param inputStream the stream from which data will be copied
     * @param length The maximum number of bytes to read from the InputStream
     * @throws SQLException if a database access error occurs
     */
    public void copyStream(InputStream inputStream, int length) throws SQLException {
        OutputStream os = setBinaryStream(1);
        byte[] buffer = new byte[Math.min(bufferlength, length)];
        int chunk;
        try {
            while (length >0) {
                chunk =inputStream.read(buffer, 0, ((length<bufferlength) ? length:bufferlength));
                if (chunk == -1)
                    break;
                os.write(buffer, 0, chunk);
                length -= chunk;
            }
            os.flush();
            os.close();
        }
        catch (IOException ioe) {
            throw new FBSQLException(ioe);
        }
    }
    
    /**
     * Copy the contents of an <code>InputStream</code> into this Blob. Unlike 
     * the {@link #copyStream(InputStream, int)} method, this one copies bytes
     * until the EOF is reached.
     *
     * @param inputStream the stream from which data will be copied
     * @throws SQLException if a database access error occurs
     */
    public void copyStream(InputStream inputStream) throws SQLException {
        OutputStream os = setBinaryStream(1);
        try {
            int chunk = 0;
            byte[] buffer = new byte[bufferlength];

            while((chunk = inputStream.read(buffer)) != -1)
                os.write(buffer, 0, chunk);
            
            os.flush();
            os.close();
        }
        catch (IOException ioe) {
            throw new FBSQLException(ioe);
        }
    }

    /**
     * Copy data from a character stream into this Blob.
     *
     * @param inputStream the source of data to copy
     * @param length The maximum number of bytes to copy
     * @param encoding The encoding used in the character stream
     */
    public void copyCharacterStream(Reader inputStream, int length, String encoding) throws SQLException {
        OutputStream os = setBinaryStream(1);
        try {
            
            OutputStreamWriter osw;
            if (encoding != null)
                osw = new OutputStreamWriter(os, encoding);
            else
                osw = new OutputStreamWriter(os);
            
            char[] buffer = new char[Math.min(bufferlength, length)];
            int chunk;
            try {
                while (length >0) {
                    chunk =inputStream.read(buffer, 0, ((length<bufferlength) ? length:bufferlength));
                    if (chunk == -1)
                        break;
                    osw.write(buffer, 0, chunk);                
                    length -= chunk;
                }
                osw.flush();
                os.flush();
                os.close();
            }
            catch (IOException ioe) {
                throw new FBSQLException(ioe);
            }
        } catch(UnsupportedEncodingException ex) {
            throw new FBSQLException("Cannot set character stream because " +
                "the unsupported encoding is detected in the JVM: " +
                encoding + ". Please report this to the driver developers."
            );
        }
    }


}


