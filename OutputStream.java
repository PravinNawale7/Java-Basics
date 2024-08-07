import java.io.*;
public class OutputStream {
public static void main(String[] args) {
	try {
		FileOutputStream f1 = new FileOutputStream("G:\\Programs\\Eclipse\\Java Program\\Java-Basics\\abc.txt",true);
		String s = "Hello World";
		char ch[] =s.toCharArray();
		for(int i=0;i<s.length();i++) {
			f1.write(ch[i]);
		}
		System.out.println("Write Sucessfully");
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
}

}
