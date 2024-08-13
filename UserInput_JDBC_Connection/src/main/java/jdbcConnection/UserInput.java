package jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UserInput {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr roll no:");
			int rollno = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter age:");
			int age =  sc.nextInt();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				Statement stmt=con.createStatement();
				
				String query = "Insert into student values('"+rollno + "','" + name + "','" + age+"')";
				stmt.execute(query);
				System.out.println("Query executed");
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e.toString());
			}
			
		}

	}

