package moodle;

import java.util.List;
import java.util.ArrayList;

public class Student{
	private static int tam=1;
	private int id;
	private String name;
	private String email;
	private String password;
	// Lista de disciplinas do aluno
	List <Integer> subjects = new ArrayList<>();

	public Student(String nm, String em, String pswrd){
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
	// adiciona o id na lista de disciplinas do aluno
	public void addSubject(int i){
		subjects.add(i);
	}

}