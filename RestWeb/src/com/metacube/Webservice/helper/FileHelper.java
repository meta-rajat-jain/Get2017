package com.metacube.Webservice.helper;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */


import java.io.File;

/**
 * The Class FileHelper.
 */
public class FileHelper {

	/** The file. */
	private File file;
	
	/**
	 * Instantiates a new file helper.
	 *
	 * @param fileName the file name
	 */
	public FileHelper(String fileName) {
		
	file =  new File(fileName);
	
	}
	
	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public File getFile(){
		return file;
	}
}
