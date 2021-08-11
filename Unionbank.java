package jdbcBank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Unionbank {
	static final String DB_URL = "jdbc:mysql://localhost:3306/UnionBank";
	static final String USER = "root";
	static final String PASS = "root";
	

	public static void main(String[] args) throws SQLException
	{
			
		Connection c=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement s=c.createStatement();
				String sql = "create table customer_details" +
						"(id int not null auto_increment primary key, name varchar(50), age int not null)";
				s.executeUpdate(sql);
				System.out.println("****************WELCOME TO UNION BANK OF INDIA*************** ");
				System.out.println();
				System.out.println("Customer Details:");
				System.out.println();
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number of customers: ");
				int num = scan.nextInt();
			for(int i=0;i<num;i++)
			{
				Scanner scanner = new Scanner(System.in);
			System.out.println("Enter you name: ");
			String name = scanner.nextLine();
			System.out.println("Enter you age: ");
			int age = scanner.nextInt();
			
				sql = "insert into customer_details (name, age) values " + "( '" + name + " ',"+ age + ")";
				
						s.executeUpdate(sql);
				
				System.out.println("records inserted");
				
			}
			
			System.out.println("***********VISIT AGAIN**********");	
				scan.close();
				
	}
}
