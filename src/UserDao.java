import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	String Name;
	String Gender;
	int birth;
	String InputId;
	String InputPw;
	String InputNick;
	
	UserDto dto = null;  
	
	public void getConn() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "D_HJS";
			String pw = "1853";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void close() {
		
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
	public int join(String NewName, String NewGender, int Newbirth, String NewId, String NewPw, String NewNick) {
		
		getConn();
		
		int result = 0;
		
		try {
			String sql = "insert into MEMBER values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, NewName);
			pstm.setString(2, NewGender);
			pstm.setInt(3, Newbirth);
			pstm.setString(4, NewId);
			pstm.setString(5, NewPw);
			pstm.setString(6, NewNick);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류!");
			e.printStackTrace();
		}
		
		close();
		
		return result;
	}
	
	public UserDto login(String InputId, String InputPw) {
		
		getConn();
		
		
		try {
			
			String sql = "select * from MEMBER where 아이디 = ? and 비밀번호 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, InputId);
			pstm.setString(2, InputPw);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				dto.setName(rs.getString("이름"));
				dto.setGender(rs.getString("성별"));
				dto.setBirth(rs.getInt("생년월일"));
				dto.setInputId(rs.getString("아이디"));
				dto.setInputPw(rs.getString("비밀번호"));
				dto.setInputNick(rs.getString("닉네임"));
			}
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류!");
			e.printStackTrace();
		}
		
		close();
		return dto;
	}
	
	public ArrayList<UserDto> UserList() {
		getConn();
		ArrayList<UserDto> userList = new ArrayList<>();
		
		String sql = "select * from MEMBER";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery(); //쿼리 실행문
		
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				
				UserDto dto = new UserDto( Name, Gender, birth, InputId, InputPw,InputNick); 
				userList.add(dto);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		close();
		return userList;
	}
	

}
