class RegisterDataBase
  {
    String user_first_name;
    String user_last_name;
    String user_phonenumber;
    String password;
    String confirm_password;

    public RegisterDataBase(String user_first_name, String user_last_name, String user_phonenumber, String password,
			String confirm_password) {
		super();
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_phonenumber = user_phonenumber;
		this.password = password;
		this.confirm_password = confirm_password;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public String getUser_phonenumber() {
		return user_phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	@Override
	public String toString() {
		return " [user_first_name=" + user_first_name + ", user_phonenumber=" + user_phonenumber
				+ ", confirm_password=" + confirm_password + "]";
	}
  }