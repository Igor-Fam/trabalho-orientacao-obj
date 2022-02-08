// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.List;
import java.util.ArrayList;

public class Student extends User{
	// Lista de disciplinas do aluno
	List <Integer> subjects = new ArrayList<>();

	public Student(String nm, String em, String pswrd){
		id = tam;
		tam++;
		setName(nm);
		setEmail(em);
		setPassword(pswrd);
		userType = 0;
	}

	// adiciona o id na lista de disciplinas do aluno
	public void addSubject(int i){
		subjects.add(i);
	}

	public List<Integer> getSubjects(){
		return subjects;
	}

}