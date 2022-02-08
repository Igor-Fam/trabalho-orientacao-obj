// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Moodle {

    static Scanner read = new Scanner(System.in);

    // Listas que armazenam os estudantes, professores e disciplinas

    static List <User> users = new ArrayList<>();
    static List <User> usersRead = new ArrayList<>();
    static List <Subject> subjects = new ArrayList<>();

    public static void main(String[] args) {
        
        // Teste

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
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            User student = new Student("igro", "igro@igro.com", "12354");
            User teacher = new Teacher("jula", "jula@jula.com", "12354");
            users.add(student);
            users.add(teacher);

            String jsonUser = gson.toJson(users);
            
            FileWriter fileWriter = new FileWriter("./Users.json");
            fileWriter.write(jsonUser);
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader("./Users.json");

            usersRead = gson.fromJson(fileReader, new TypeToken<List<User>>(){}.getType());

            System.out.println(usersRead.toString());

        }catch(Exception e){
            System.out.println("Arquivo nao encontrado!");
        }

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
        ((Teacher)users.get(teacherId)).addSubject(nmSubject.getId());
    }
}
