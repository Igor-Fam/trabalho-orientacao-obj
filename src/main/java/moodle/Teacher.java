// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher{
	
	static Scanner read = new Scanner(System.in);
	private static int tam=1;
	private int id;
	private String name;
	private String email;
	private String password;
	// Lista de disciplinas do professor
	List <Integer> subjects = new ArrayList<>();

	public Teacher(String nm, String em, String pswrd){
		id = tam;
		tam++;
		setName(nm);
		setEmail(em);
		setPassword(pswrd);
	}

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

	public void addSubject(int i){
		subjects.add(i);
	}

	public List<Integer> getList(){
		return subjects;
	}
}