
public class UserDto {
	
	private String Name;
	private String Gender;
	private int birth;
	private String InputId;
	private String InputPw;
	private String InputNick;
	
	public UserDto(String name, String gender, int birth, 
			String inputId, String inputPw, String inputNick) {
		super();
		Name = name;
		Gender = gender;
		this.birth = birth;
		InputId = inputId;
		InputPw = inputPw;
		InputNick = inputNick;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getInputId() {
		return InputId;
	}

	public void setInputId(String inputId) {
		InputId = inputId;
	}

	public String getInputPw() {
		return InputPw;
	}

	public void setInputPw(String inputPw) {
		InputPw = inputPw;
	}

	public String getInputNick() {
		return InputNick;
	}

	public void setInputNick(String inputNick) {
		InputNick = inputNick;
	}
	
	
	
	
	

}
