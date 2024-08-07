package filehandling;

import java.io.FileInputStream;
public class InputStreamReadFile {
	public static void main(String[] args) {
		try {
		int i;
      FileInputStream f1 = new FileInputStream("G:/Programs/Eclipse/Java Program/Java-Basics/abc.txt");
      do {
    	  i=f1.read();
    	  if(i!=-1) {
    		  System.out.print((char)i);
    		  
    	  }
      }while(i!=-1);
	}catch(Exception e) {
		System.out.println(e);
	}
	
	}
}
