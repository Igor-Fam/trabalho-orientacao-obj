// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher extends User{
	
	static Scanner read = new Scanner(System.in);
	// Lista de disciplinas do professor
	List <String> subjects = new ArrayList<>();

	public Teacher(String usr, String nm, String em, String pswrd){
		setUsername(usr);
		setName(nm);
		setEmail(em);
		setPassword(pswrd);
		userType = 1;
	}

	public void addSubject(String i){
		subjects.add(i);
	}

	public List<String> getSubjects(){
		return subjects;
	}
}