package moodle;

public abstract class User {
    protected String username;
	protected String name;
	protected String email;
	protected String password;
    protected int userType;

    public User(){
        
    }

    public void setUsername(String s){
		username = s;
	}

	public String getUsername(){
		return username;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String em){
		email = em;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String pswrd){
		password = pswrd;
	}

	public boolean verifyPassword(String pswrd){
		return password.equals(pswrd);
	}
}
