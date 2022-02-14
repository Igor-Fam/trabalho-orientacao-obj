// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Student extends User{
	// Lista de disciplinas do aluno
	List <String> subjects = new ArrayList<>();
	HashMap<String, HashMap<Integer, Integer>> marks = new HashMap<>();

	public Student(String usr, String nm, String em, String pswrd){
		setUsername(usr);
		setName(nm);
		setEmail(em);
		setPassword(pswrd);
		userType = 0;
	}

	// adiciona o id na lista de disciplinas do aluno
	public void addSubject(String subject){
		subjects.add(subject);
		marks.put(subject, new HashMap<>());
	}

	public List<String> getSubjects(){
		return subjects;
	}

}