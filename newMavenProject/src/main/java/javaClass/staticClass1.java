package javaClass;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger; 

public class staticClass1 extends StaticClass{
	private static final Logger logger = LogManager.getLogger(staticClass1.class); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  BasicConfigurator.configure();  
			  logger.info("Hello world");  
			  logger.warn("we are in logger info mode"); 
		}
		catch(Exception e) {
			
		}

//		StaticClass obj = new StaticClass();	
		System.out.println(year);
		func();
		System.out.println(year);

	}
}
