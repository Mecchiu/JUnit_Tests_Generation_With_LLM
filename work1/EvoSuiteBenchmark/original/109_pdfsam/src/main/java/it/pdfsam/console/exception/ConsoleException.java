/*
 * Created on 02-April-2007
 * Copyright (C) 2006 by Andrea Vacondio.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation; 
 * either version 2 of the License.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program; 
 * if not, write to the Free Software Foundation, Inc., 
 *  59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package it.pdfsam.console.exception;
/**
 * Generic console Exception
 * @author Andrea Vacondio
 */
public class ConsoleException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -302708377322354896L;
    private String error_msg; 

    public ConsoleException() {
        super();
        error_msg = "GenericConsoleException";
    }

    public ConsoleException(String message) {
        super(message);
        error_msg = message;
    }
    
    public ConsoleException(Exception e) {
        super(e);
        error_msg = e.getMessage();
    }

    public String toString(){
        return error_msg;
    }
}
