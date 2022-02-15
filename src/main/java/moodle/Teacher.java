// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.ArrayList;

public class Teacher extends User{

	// Lista de disciplinas do professor
	ArrayList <String> subjects = new ArrayList<>();

	public Teacher(String usr, String nm, String pswrd){
		setUsername(usr);
		setName(nm);
		setPassword(pswrd);
		userType = 1;
	}

	public void addSubject(String i){
		subjects.add(i);
	}

	public ArrayList<String> getSubjects(){
		return subjects;
	}
}