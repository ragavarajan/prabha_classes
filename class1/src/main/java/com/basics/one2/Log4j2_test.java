package com.basics.one2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2_test {
//Maven: https://logging.apache.org/log4j/2.x/maven-artifacts.html
	
	
	private static Logger logit = LogManager.getLogger(Log4j2_test.class);
	public static void main(String[] args) {
		
		
		
		System.out.println("starting");
		
		logit.trace("level1");
		logit.debug("level2");
		logit.info("level3");
		logit.warn("level4");
		logit.error("level5");
		logit.fatal("level6");
		
		System.out.println("end");
		
		
	}
	
	

}
