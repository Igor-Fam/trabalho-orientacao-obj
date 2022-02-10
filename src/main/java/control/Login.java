package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import moodle.*;

public class Login {

    public static ArrayList<Student> readStudents(){
        ArrayList<Student> students = new ArrayList<>();
        Gson gson = new Gson();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader("./Students.json"));
            students.add(gson.fromJson(fileReader, Student.class));
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }

        return students;
    }

    public static ArrayList<Teacher> readTeachers(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        Gson gson = new Gson();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader("./Teachers.json"));
            teachers.add(gson.fromJson(fileReader, Teacher.class));
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }

        return teachers;
    }

    public static ArrayList<Admin> readAdmins(){
        ArrayList<Admin> admins = new ArrayList<>();
        Gson gson = new Gson();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader("./Admins.json"));
            admins.add(gson.fromJson(fileReader, Admin.class));
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }

        return admins;
    }

    public static void writeUser(String type, User user){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUser = gson.toJson(user);   
        try{         
            FileWriter fileWriter = new FileWriter("./" + type + "s.json", true);
            fileWriter.write(jsonUser);
            fileWriter.flush();
            fileWriter.close();

        }catch(Exception e){
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
