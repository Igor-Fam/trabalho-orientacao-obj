// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Test implements Listable{
    private int id;
    private String title;
    private String date;
    List <Question> questions = new ArrayList<>();

    public Test(int i){
        id = i;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        date = dtf.format(now);

    }

    public void addQuestion(String stat, String [] alts, int ca){
        questions.add(new Question(stat, alts, ca));
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public Question getQuestion(int i){
        return questions.get(i);
    }
    
    @Override
    public String toString(){
        return this.title;
    }

    public void setDate(String t){
        date = t;
    }

    public String getSubtitle(){
        return date;
    }
    
}
