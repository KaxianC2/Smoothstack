package day5;

import java.sql.Connection;

public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;

	private SampleSingleton(){
		//init values such as connection to an sql server
	}
	
	public static SampleSingleton getInstance() {
		if(instance==null);
		{
			instance = new SampleSingleton(); 
		}
		return instance;
	}

	
}

