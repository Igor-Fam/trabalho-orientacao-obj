package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import moodle.Admin;
import moodle.Student;
import moodle.Teacher;
import moodle.User;

public class Login {

    public static User authUser;

    public static ArrayList<Student> readStudents(){
        ArrayList<Student> students = new ArrayList<>();
        Gson gson = new Gson();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader("./Students.json"));
            students = gson.fromJson(fileReader, new TypeToken<ArrayList<Student>>(){}.getType());
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
            teachers = gson.fromJson(fileReader, new TypeToken<ArrayList<Teacher>>(){}.getType());
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
            admins = gson.fromJson(fileReader, new TypeToken<ArrayList<Admin>>(){}.getType());
        }catch(FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }

        return admins;
    }

    public static <T> void writeUser(User user){
        Gson gson = new Gson();
        ArrayList<User> users = new ArrayList<>();
        try{
            BufferedReader fileReader = new BufferedReader(new FileReader("./" + user.getClass().getSimpleName() + "s.json"));
            users = gson.fromJson(fileReader, new TypeToken<ArrayList<T>>(){}.getType());
            users.add(user);
        }catch(FileNotFoundException e){
            users.add(user);
        }

        if(!checkAvailableUsername(user)){
            System.out.println("Nome de usuario indisponivel!");
            return;
        }

        gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUsers = gson.toJson(users);   
        try{         
            FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
            fileWriter.write(jsonUsers);
            fileWriter.flush();
            fileWriter.close();

        }catch(Exception e){
            System.out.println("Arquivo nao encontrado!");
        }
    }

    public static void Authenticate(String usr, String pswrd){
        ArrayList<Student> students = readStudents();
        for (Student student : students) {
            //System.out.println(student.getUsername());
            if (student.getUsername().equals(usr)){
                if (student.verifyPassword(pswrd)){
                    Login.authUser = student;
                    System.out.println("Bem vindo(a), " + Login.authUser.getName() + "!");
                } else {
                    System.out.println("Senha invalida!");
                }
                return;
            }
        }
        ArrayList<Teacher> teachers = readTeachers();
        for (Teacher teacher : teachers) {
            //System.out.println(teacher.getUsername());
            if (teacher.getUsername().equals(usr)){
                if (teacher.verifyPassword(pswrd)){
                    Login.authUser = teacher;
                    System.out.println("Bem vindo(a), " + Login.authUser.getName() + "!");
                } else {
                    System.out.println("Senha invalida!");
                }
                return;
            }
        }
        ArrayList<Admin> admins = readAdmins();
        for (Admin admin : admins) {
            //System.out.println(admin.getUsername());
            if (admin.getUsername().equals(usr)){
                if (admin.verifyPassword(pswrd)){
                    Login.authUser = admin;
                    System.out.println("Bem vindo(a), " + Login.authUser.getName() + "!");
                } else {
                    System.out.println("Senha invalida!");
                }
                return;
            }
        }
        System.out.println("Nome de usuario invalido");
    }

    public static boolean checkAvailableUsername(User user){
        ArrayList<Student> students = readStudents();

        for (Student s : students) {
            if(s.getUsername().equals(user.getUsername()))
                return false;
        }
        ArrayList<Teacher> teachers = readTeachers();
        for (Teacher t : teachers) {
            if(t.getUsername().equals(user.getUsername()))
                return false;
        }
        ArrayList<Admin> admins = readAdmins();
        for (Admin a : admins) {
            if(a.getUsername().equals(user.getUsername()))
                return false;
        }

        return true;
    }

    public static void editUser(User user){
        int i;
        if(user.getClass().getSimpleName().equals("Student")){
            ArrayList<Student> users = readStudents();
            for (i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername().equals(user.getUsername())){
                    users.set(i, (Student)user); 
                    break;
                }
            }
            if(i == users.size()){
                System.out.println("Usuario nao encontrado!");
                return;
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonUsers = gson.toJson(users);   
            try{         
                FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
                fileWriter.write(jsonUsers);
                fileWriter.flush();
                fileWriter.close();

            }catch(Exception e){
                System.out.println("Arquivo nao encontrado!");
            }
        }
        if(user.getClass().getSimpleName().equals("Teacher")){
            ArrayList<Teacher> users = readTeachers();
            for (i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername().equals(user.getUsername())){
                    users.set(i, (Teacher)user); 
                    break;
                }
            }
            if(i == users.size()){
                System.out.println("Usuario nao encontrado!");
                return;
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonUsers = gson.toJson(users);   
            try{         
                FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
                fileWriter.write(jsonUsers);
                fileWriter.flush();
                fileWriter.close();

            }catch(Exception e){
                System.out.println("Arquivo nao encontrado!");
            }
        }
        if(user.getClass().getSimpleName().equals("Admin")){
            ArrayList<Admin> users = readAdmins();
            for (i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername().equals(user.getUsername())){
                    users.set(i, (Admin)user); 
                    break;
                }
            }
            if(i == users.size()){
                System.out.println("Usuario nao encontrado!");
                return;
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonUsers = gson.toJson(users);   
            try{         
                FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
                fileWriter.write(jsonUsers);
                fileWriter.flush();
                fileWriter.close();

            }catch(Exception e){
                System.out.println("Arquivo nao encontrado!");
            }
        }
    }

    public static void deleteUser(User user){
        int i;
        if(user.getClass().getSimpleName().equals("Student")){
            ArrayList<Student> users = readStudents();
            for (i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername().equals(user.getUsername())){
                    System.out.println("tira o " + i);
                    users.remove(i);
                    break;
                }
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonUsers = gson.toJson(users);   
            try{         
                FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
                fileWriter.write(jsonUsers);
                fileWriter.flush();
                fileWriter.close();

            }catch(Exception e){
                System.out.println("Arquivo nao encontrado!");
            }
        }
        if(user.getClass().getSimpleName().equals("Teacher")){
            ArrayList<Teacher> users = readTeachers();
            for (i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername().equals(user.getUsername())){
                    users.remove(i);
                    break;
                }
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonUsers = gson.toJson(users);   
            try{         
                FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
                fileWriter.write(jsonUsers);
                fileWriter.flush();
                fileWriter.close();

            }catch(Exception e){
                System.out.println("Arquivo nao encontrado!");
            }
        }
        if(user.getClass().getSimpleName().equals("Admin")){
            ArrayList<Admin> users = readAdmins();
            for (i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername().equals(user.getUsername())){
                    users.remove(i);
                    break;
                }
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonUsers = gson.toJson(users);   
            try{         
                FileWriter fileWriter = new FileWriter("./" + user.getClass().getSimpleName() + "s.json");
                fileWriter.write(jsonUsers);
                fileWriter.flush();
                fileWriter.close();

            }catch(Exception e){
                System.out.println("Arquivo nao encontrado!");
            }
        }
    }
}
