package moodle;

import java.util.ArrayList;

public abstract class User {
    protected String username;
    protected String name;
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

	public void setPassword(String pswrd){
		password = pswrd;
	}

	public boolean verifyPassword(String pswrd){
		return password.equals(pswrd);
	}
        
        public int getuserType(){
            return userType;
        }

	public abstract ArrayList<String> getSubjects();
        
        public abstract void addSubject(String str);
}
