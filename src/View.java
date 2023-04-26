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
		UserDto dto = null;
		
		
		System.out.println("동행복권 LOTTO 6/45");
		
		while(true) {
			System.out.print("[1]회원가입 [2] 로그인 [3]당첨번호조회 [4]당첨번호 뽑기 [5]종료 >>");
			int select = sc.nextInt();
			
			if(select ==1) {//회원가입
				System.out.print("이름을 입력해주세요 >> ");
				String Name = sc.next();
				System.out.print("성별을 입력해주세요 >> ");
				String gender = sc.next();
				System.out.print("생년월일 6자리를 입력해주세요 >> ");
				int birth = sc.nextInt();
				System.out.print("새로운 아이디를 입력해주세요 >>");
				String newId = sc.next();
				System.out.print("새로운 비밀번호를 입력해주세요 >>");
				String newPw = sc.next();
				System.out.print("새로운 닉네임을 입력해주세요 >> ");
				String newNick = sc.next();
				
				dao.join(Name, gender, birth, newId, newPw, newNick);
				
				System.out.println("축하합니다! 가입이 완료되었습니다.");
				
			}else if(select ==2) {//로그인
				System.out.print("아이디를 입력해주세요 >>");
				String inputId = sc.next();
				System.out.print("비밀번호를 입력해주세요 >>");
				String inputPw = sc.next();
				
				dto = dao.login(inputId, inputPw);
				System.out.println("어서오세요 "+dto.getInputNick()+"님 환영합니다.");
				
				
			}else if(select ==3) {//당첨번호조회
				
				
				
			}else if(select == 4) {//당첨번호 뽑기
				
				
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
			
			
			
			
			
		}
		
		

	}

}
