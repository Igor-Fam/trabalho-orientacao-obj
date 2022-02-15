// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends User{
	// Lista de disciplinas do aluno
	ArrayList <String> subjects = new ArrayList<>();
	HashMap<String, HashMap<Integer, Float>> marks = new HashMap<>();

	public Student(String usr, String nm, String pswrd){
		setUsername(usr);
		setName(nm);
		setPassword(pswrd);
		userType = 0;
	}

	// adiciona o id na lista de disciplinas do aluno
	public void addSubject(String subject){
		subjects.add(subject);
		marks.put(subject, new HashMap<>());
	}

	public ArrayList<String> getSubjects(){
		return subjects;
	}
        
        public void addNota(String subj, int test, int nota){
            marks.put(subj, new HashMap(test,nota));
        }

}