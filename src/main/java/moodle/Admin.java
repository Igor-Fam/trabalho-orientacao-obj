package moodle;

public class Admin extends User{
    public Admin(String usr, String nm, String em, String pswrd){
		setUsername(usr);
		setName(nm);
		setEmail(em);
		setPassword(pswrd);
		userType = 2;
	}
}
