package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import moodle.*;

public class SubjectFiles {
    public static void writeSubject(moodle.Subject subject){
        Gson gson = new Gson();

        File f = new File("./Disciplinas/" + subject.getId() + ".json");
        if(f.isFile()){
            System.out.println("Id indisponivel!");
            return;
        }
        
        gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonSubject = gson.toJson(subject);   
        try{         
            FileWriter fileWriter = new FileWriter("./Disciplinas/" + subject.getId() + ".json");
            fileWriter.write(jsonSubject);
            fileWriter.flush();
            fileWriter.close();

        }catch(Exception e_){
            System.out.println("Arquivo nao encontrado!");
        }
        
    }

    public static Subject readSubject(String subjectId){
        Subject subject = new Subject();
        Gson gson = new Gson();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader("./Disciplinas/" + subjectId + ".json"));
            subject = gson.fromJson(fileReader, Subject.class);
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }
        return subject;
    }

    public static void deleteSubject(String subjectId){
        File file = new File("./Disciplinas/" + subjectId + ".json");
        file.delete();
    }

    public static void editSubject(Subject subject){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonSubject = gson.toJson(subject);   
        try{         
            FileWriter fileWriter = new FileWriter("./Disciplinas/" + subject.getId() + ".json");
            fileWriter.write(jsonSubject);
            fileWriter.flush();
            fileWriter.close();

        }catch(Exception e){
            System.out.println("Disciplina nao encontrada!");
        }

    }
}
