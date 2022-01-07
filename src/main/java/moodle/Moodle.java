package moodle;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Moodle {

    static Scanner read = new Scanner(System.in);

    // Listas que armazenam os estudantes, professores e disciplinas

    List <Student> students = new ArrayList<>();
    List <Teacher> teachers = new ArrayList<>();
    List <Subject> subjects = new ArrayList<>();

    public static void main(String[] args) {
        
        // Teste

        Question q = new Question();
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
        read.close();
    }
    
    // Funcao utilizada pra criar uma nova disciplina
    public void createSubject(int teacherId){
		System.out.println("Insira o nome da disciplina:");
		String nm = read.nextLine();
		System.out.println("Insira a descricao da disciplina:");
		String desc = read.nextLine();
        Subject nmSubject = new Subject(nm,desc);
        subjects.add(nmSubject);
        
        // Adiciona o Id da nova disciplina a lista do Professor
        (teachers.get(teacherId)).addSubject(nmSubject.getId());
    }
}
