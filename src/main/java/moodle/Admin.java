package moodle;

import java.io.File;
import java.util.ArrayList;

public class Admin extends User{
    public Admin(String usr, String nm, String em, String pswrd){
		setUsername(usr);
		setName(nm);
		setEmail(em);
		setPassword(pswrd);
		userType = 2;
	}
	
	public ArrayList<String> getSubjects(){
		File folder = new File("./Disciplinas");
		File[] files = folder.listFiles();
		ArrayList<String> subjects = new ArrayList<String>();
		for (File file : files) {
			if (file.isFile()) {
				subjects.add(file.getName());
			}
		}
		return subjects;
	}
}