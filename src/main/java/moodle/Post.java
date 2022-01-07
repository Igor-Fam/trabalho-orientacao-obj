package moodle;


public class Post {
    private int id;
    private String title;
    private String date;
    private String text;
    
    public Post(int i, String tlte, String dt, String tx){
        setId(i);
        setTitle(tlte);
        setDate(dt);
        setText(tx);
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
