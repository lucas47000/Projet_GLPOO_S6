package interfaces.Console;

import java.io.IOException;

public class ClearConsole {
	
	public static void main(String[] Args){
		ClearConsole.clear();
	}
	
	static String penguinClearConsole = "clear"; 
	static String windowsClearConsole = "cls"; 
	 
	static String os = System.getProperty("os.name");
	
	public static void clear(){
		
		if(os.startsWith("Linux")){ 
			try {
				Runtime.getRuntime().exec(penguinClearConsole);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 
		else if(os.startsWith("Windows")){ 
			try {
				Runtime.getRuntime().exec(windowsClearConsole);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 
	}
	
}
