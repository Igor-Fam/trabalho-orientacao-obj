package moodle;

import java.util.List;
import java.util.ArrayList;

public class Student{
	private static int tam=1;
	private int id;
	private String name;
	private String email;
	private String password;
	List <Integer> subjects = new ArrayList<>();

	public void setId(int i){
		id = i;
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

	public void setSenha(String pswrd){
		password = pswrd;
	}

	public String getPassword(){
		return password;
	}

	public void addSubject(int i){
		subjects.add(i);
	}

}