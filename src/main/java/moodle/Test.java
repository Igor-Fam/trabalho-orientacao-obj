// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private int id;
    private String title;
    List <Question> questions = new ArrayList<>();

    public Test(int i){
        id = i;
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
    
}
