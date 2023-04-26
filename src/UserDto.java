
public class UserDto {
	
	private String name;
	private String gender;
	private int birth;
	private String inputId;
	private String inputPw;
	private String inputNick;
	
	public UserDto() {};
	
	public UserDto(String name, String gender, int birth, 
			String inputId, String inputPw, String inputNick) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.inputId = inputId;
		this.inputPw = inputPw;
		this.inputNick = inputNick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getInputId() {
		return inputId;
	}

	public void setInputId(String inputId) {
		this.inputId = inputId;
	}

	public String getInputPw() {
		return inputPw;
	}

	public void setInputPw(String inputPw) {
		this.inputPw = inputPw;
	}

	public String getInputNick() {
		return inputNick;
	}

	public void setInputNick(String inputNick) {
		this.inputNick = inputNick;
	}
	
	
	
	
	

}
