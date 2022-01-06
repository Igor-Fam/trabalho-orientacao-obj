package moodle;

import java.util.List;
import java.util.ArrayList;

public class Subject{
	private static int tam=1;
	private int id;
	private String name;
	private String description;
	private List <Post> posts = new ArrayList<>();
	private List <Test> tests = new ArrayList<>();


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
}