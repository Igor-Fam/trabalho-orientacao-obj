// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.ArrayList;
import java.util.Scanner;

public class Moodle {

    static Scanner read = new Scanner(System.in);

    // Listas que armazenam os estudantes, professores e disciplinas

    static ArrayList <Admin> admins = new ArrayList<>();
    static ArrayList <Teacher> teachers = new ArrayList<>();
    static ArrayList <Student> students = new ArrayList<>();
    static ArrayList <User> users = new ArrayList<>();
    static ArrayList <Subject> subjects = new ArrayList<>();
    
    public static void main(String[] args) {
        
        /* Subject.createSubject();
        SubjectFiles.readSubject("q");
        SubjectFiles.deleteSubject("q"); */
/*         Question q = new Question();
        q.setStatement("Enunciado Enunciado Enunciado Enunciado Enunciado Enunciado ");
        String [] alts = {"correta", "errada 1", "errada 2", "errada 3"};
        q.setAlternatives(alts);
        q.setCorrectAnswer(1);
        System.out.println(q.getStatement());
        System.out.println();
        String [] options = q.getAlternatives();
        for(int i  = 0; i < 4; i++){
            System.out.println((i+1) + ") " + options[i]);
        }
        int a = read.nextInt();
        System.out.println(q.answerQuestion(a));
        read.close(); */
        
        /* for(int i = 0; i<10; i++){
            User student = new Student("usuario"+i, "usuario", "usuario@usuario.com", ""+i);
            Login.writeUser(student);
        }
        for(int i = 10; i<20; i++){
            User student = new Teacher("usuario"+i, "usuario", "usuario@usuario.com", ""+i);
            Login.writeUser(student);
        }
        for(int i = 20; i<30; i++){
            User student = new Admin("usuario"+i, "usuario", "usuario@usuario.com", ""+i);
            Login.writeUser(student);
        }
        while(true){
            String nome = read.nextLine();
            String senha = read.nextLine();
            Login.Authenticate(nome, senha);
        } */
        //students = Login.readStudents();

        //System.out.println(students.get(0).email);
        //System.out.println(teachers.get(0).email);
        
    }
    
}
