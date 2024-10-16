/*
 * Created on 30-Oct-2008
 * Copyright (C) 2008 by Andrea Vacondio.
 *
 *
 * This library is provided under dual licenses.
 * You may choose the terms of the Lesser General Public License version 2.1 or the General Public License version 2
 * License at your discretion.
 * 
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * version 2.1 of the License.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 * 
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation; 
 * either version 2 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program; 
 * if not, write to the Free Software Foundation, Inc., 
 *  59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package org.pdfsam.console.business.dto.commands;

import java.io.File;

import org.pdfsam.console.business.dto.PdfFile;

/**
 * Decrypt parsed command dto filled by parsing service and used by worker service
 * @author Andrea Vacondio
 *
 */
public class DecryptParsedCommand extends AbstractParsedCommand {

	private static final long serialVersionUID = -8763522845338987001L;

	public static final String F_ARG = "f";
	public static final String P_ARG = "p";
	public static final String O_ARG = "o";
	
	private File outputFile;	
	private PdfFile[] inputFileList;
	private String outputFilesPrefix = "";

	public DecryptParsedCommand() {
		super();
	}

	/**
	 * @param inputFileList
	 * @param outputFile
	 * @param outputFilesPrefix
	 */
	public DecryptParsedCommand(PdfFile[] inputFileList, File outputFile, String outputFilesPrefix) {
		super();
		this.inputFileList = inputFileList;
		this.outputFile = outputFile;
		this.outputFilesPrefix = outputFilesPrefix;
	}

	/**
	 * @param inputFileList
	 * @param outputFile
	 * @param outputFilesPrefix
	 * @deprecated use the constructor without the logFile parameter
	 */
	public DecryptParsedCommand(PdfFile[] inputFileList, File outputFile, String outputFilesPrefix, boolean overwrite, boolean compress, File logFile, char outputPdfVersion) {
		super(overwrite, compress, logFile, outputPdfVersion);
		this.inputFileList = inputFileList;
		this.outputFile = outputFile;
		this.outputFilesPrefix = outputFilesPrefix;
	}

	public DecryptParsedCommand(PdfFile[] inputFileList, File outputFile, String outputFilesPrefix, boolean overwrite, boolean compress, char outputPdfVersion) {
		super(overwrite, compress, outputPdfVersion);
		this.inputFileList = inputFileList;
		this.outputFile = outputFile;
		this.outputFilesPrefix = outputFilesPrefix;
	}
	/**
	 * @return the outputFile
	 */
	public File getOutputFile() {
		return outputFile;
	}

	/**
	 * @param outputFile the outputFile to set
	 */
	public void setOutputFile(File outputFile) {
		this.outputFile = outputFile;
	}

	/**
	 * @return the inputFileList
	 */
	public PdfFile[] getInputFileList() {
		return inputFileList;
	}

	/**
	 * @param inputFileList the inputFileList to set
	 */
	public void setInputFileList(PdfFile[] inputFileList) {
		this.inputFileList = inputFileList;
	}

	/**
	 * @return the outputFilesPrefix
	 */
	public String getOutputFilesPrefix() {
		return outputFilesPrefix;
	}

	/**
	 * @param outputFilesPrefix the outputFilesPrefix to set
	 */
	public void setOutputFilesPrefix(String outputFilesPrefix) {
		this.outputFilesPrefix = outputFilesPrefix;
	}

	public String getCommand() {		
		return COMMAND_DECRYPT;
	}

	public String toString(){
		StringBuffer retVal = new StringBuffer();
		retVal.append(super.toString());
		retVal.append((outputFile== null)?"":"[outputDir="+outputFile.getAbsolutePath()+"]");
		if(inputFileList != null){
			for(int i = 0; i<inputFileList.length; i++){
				retVal.append((inputFileList[i]== null)?"":"[inputFileList["+i+"]="+inputFileList[i].getFile().getAbsolutePath()+"]");				
			}
		}
		retVal.append("[outputFilesPrefix="+outputFilesPrefix+"]");
		retVal.append("[command="+getCommand()+"]");
		return retVal.toString();
	}
}
