package com.crm.qa.util.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * ExceptionUtil contains utility methods to deal with exceptions
 * 
 * @author ANIL
 * 
 */
public class ExceptionUtil {
	
	/**
	 * Returns the string version of a {@link Throwable}
	 * 
	 * @param e
	 *            An instance of {@link Throwable}
	 * @return String
	 */
	
	public String stackTraceToString(Throwable e){
		{
			StringWriter stringWritter = new StringWriter();
			PrintWriter printWritter = new PrintWriter(stringWritter, true);
			e.printStackTrace(printWritter);
			printWritter.flush();
			stringWritter.flush();
			return stringWritter.toString();
		}
		
	}

}
