// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;


public class Post {
    private int id;
    private String title;
    private String date;
    private String text;
    

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

    public void setDate(String dt){
        date=dt;
    }

    public String getDate(){
        return date;
    }
    
    public void setText(String tx){
        text=tx;
    }

    public String getText(){
        return text;
    }

}
