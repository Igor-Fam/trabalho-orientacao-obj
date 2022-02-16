// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.model;

import com.ufjf.controller.Login;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends User{
	
	static Scanner read = new Scanner(System.in);
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
                Login.editUser(this);
	}

	public ArrayList<String> getSubjects(){
		return subjects;
	}
        
        @Override
        public String toString(){
            return this.name;
        }
}