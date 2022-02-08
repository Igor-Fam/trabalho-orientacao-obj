package moodle;

public abstract class User {
    protected int id;
	protected String name;
	protected String email;
	protected String password;
    protected int userType;
    protected static int tam=1;

    public void setId(int i){
		id = i;
	}

	public int getId(){
		return id;
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

	public String getPassword(){
		return password;
	}
}
