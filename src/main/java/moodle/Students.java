package moodle;

import java.util.List;
import java.util.ArrayList;

public class Students{

	private int id;
	private String name;
	private String email;
	private String password;
	List <Integer> subjects = new ArrayList<Integer>();

	public void setId(int i){
		id = i;
	}

	public void setName(String n){
		name = n;
	}

	public void setEmail(String em){
		email = em;
	}

	public void setSenha(String pswrd){
		password = pswrd;
	}

	public void addSubject(int sid){
		subjects.add(sid);
	}

}