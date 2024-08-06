import java.io.File;

public class FIleHandling {
   public static void main(String[] args) {
	try {
		File f1 = new File("abc.txt");
		if(f1.createNewFile()) {
			System.out.println(f1);
			System.out.println("New File Created");
			System.out.println("Can file exist"+f1.exists());
		}
	}catch(Exception e) {
		System.out.println(e);
	}
}

}
