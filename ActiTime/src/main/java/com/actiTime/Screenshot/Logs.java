package com.actiTime.Screenshot;

import org.apache.log4j.Logger;

public class Logs {
	
	  private static Logger Log = Logger.getLogger(Logs.class.getName());
		
	    public static void info (String message) {
	        Log.info(message);
	    }

}
