// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import control.Login;
import control.SubjectFiles;
import frame.*;


public class Subject implements Listable{
	private String id;
	private String name;
	private String department;
	private String description;
	// Listas de Postagens e avaliacoes
	private List <Post> posts = new ArrayList<>();
	private List <Test> tests = new ArrayList<>();

	static Scanner read = new Scanner(System.in);
	
	public Subject(String id_, String nm, String desc){
		id = id_;
		setName(nm);
		setDescription(desc);
	}

	public Subject(){}

	public String getId(){
		return id;
	}

	public void setName(String n){
		name = n;
	}

	public String getTitle(){
		return name;
	}

	public String getSubtitle(){
		return department;
	}

	public void setDescription(String desc){
		description = desc;
	}

	public String getDescription(){
		return description;
	}

	public List <Test> getTests() {
		return tests;
	}

	public void setTests(List <Test> tests) {
		this.tests = tests;
	}

	public static void createSubject(){
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o id da disciplina:");
		String id = s.nextLine();
		System.out.println("Insira o nome da disciplina:");
		String nm = s.nextLine();
		System.out.println("Insira a descricao da disciplina:");
		String desc = s.nextLine();
        Subject nmSubject = new Subject(id,nm,desc);
        SubjectFiles.writeSubject(nmSubject);
    }

	// Cria uma nova postagem

	public void createPost(){
		Post pst = new Post();
		pst.setId(posts.size());
		new Create_post_frame(pst).setVisible(true);
		posts.add(pst);
		SubjectFiles.editSubject(this);
	}

	public ArrayList<Student> getStudents(){
		ArrayList<Student> students = Login.readStudents();
		for (Student student : students) {
			if(!student.subjects.contains(this.id)){
				students.remove(student);
			}
		}
		return students;
	}

}