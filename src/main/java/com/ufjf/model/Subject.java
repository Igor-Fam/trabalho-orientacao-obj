// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package com.ufjf.model;

import com.ufjf.controller.Login;
import com.ufjf.controller.SubjectFiles;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import com.ufjf.view.*;


public class Subject implements Listable{
	private String id;
	private String name;
        private String department;
	// Listas de Postagens e avaliacoes
	private List <Post> posts = new ArrayList<>();
	private List <Test> tests = new ArrayList<>();

	static Scanner read = new Scanner(System.in);
	
	public Subject(String id_, String nm, String dp){
		id = id_;
		setName(nm);
        department=dp;
	}

	public Subject(){}

	public String getId(){
		return id;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public List <Test> getTests() {
		return tests;
	}

	public void setTests(List <Test> tests) {
		this.tests = tests;
	}
        
        public List <Post> getPosts(){
            return posts;
        }
        
        public String getTitle(){
		return name;
	}

	public String getSubtitle(){
		return department;
	}
           
        @Override
        public String toString(){
            return this.name;
        }
        
	// Cria uma nova postagem

	public void createPost(){
            Post pst = new Post();
            new Create_post_frame(pst).setVisible(true);
            posts.add(pst);
            SubjectFiles.editSubject(this);
	}

        public void createTest(){
            Test tst = new Test(tests.size());
            new Create_test_frame(tst,this).setVisible(true);
        }
        
        public ArrayList<Student> getStudents(){
            ArrayList<Student> students = Login.readStudents();
            ArrayList<Student> f_students = new ArrayList<>();
            for (Student student : students) {
                if(student.subjects.contains(this.id)){
                    f_students.add(student);
                }
            }
            return f_students;
        }
        
        public ArrayList<Teacher> getTeachers(){
            ArrayList<Teacher> teachers = Login.readTeachers();
            ArrayList<Teacher> f_teachers = new ArrayList<>();
            for (Teacher teacher : teachers) {
                if(teacher.subjects.contains(this.id)){
                    f_teachers.add(teacher);
                }
            }
            return f_teachers;
        }

}