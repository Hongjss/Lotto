import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserDao dao = new UserDao();
		
		System.out.println("동행복권 LOTTO 6/45");
		
		while(true) {
			System.out.println("[1]회원가입 [2] 로그인 [3]");
		}
		
		

	}

}
