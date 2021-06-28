package models.logs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//Seriously why do I have to import 3 things so get the date. Java = superflous objects everywhere
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public final class Log {

	private static final Log instance = new Log();
	
	public String logname = "JMusicHub.log";
	private static File logFile;
	
	public static Log getInstance(){
		return instance;
	}

	
	public void createLogFile(){

		Log.logFile = new File(logname);
		try{
			if(logFile.createNewFile()){
				//New file made
				System.err.println("INFO: Creating new log file");	
			}
		}catch(IOException e){
			System.err.println("ERROR: Cannot create log file");
			System.exit(1);
		}
	}
	
	public Log() {
		this.createLogFile();
	}
	
	public static void log(String message){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
	    String ts = dtf.format(now);  
	    String line = ts + " : "+ message;;
	    
		try{
			FileWriter out = new FileWriter(Log.logFile, true);
			out.write(line.toCharArray());
			out.close();
		}catch(IOException e){
			System.err.println("ERROR: Could not write to log file");
		}
	}
	
	

}
