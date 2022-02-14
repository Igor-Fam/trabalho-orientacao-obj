// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import frame.*;


public class Subject{
	private static int tam=1;
	private int id;
	private String name;
	private String description;
	// Listas de Postagens e avaliacoes
	private List <Post> posts = new ArrayList<>();
	private List <Test> tests = new ArrayList<>();

	static Scanner read = new Scanner(System.in);
	
	public Subject(String nm, String desc){
		id = tam;
		tam++;
		setName(nm);
		setDescription(desc);
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

	// Cria uma nova postagem

	public void createPost(){
		Post pst = new Post();
		pst.setId(posts.size());
		new Create_post_frame(pst).setVisible(true);
		posts.add(pst);
	}


}