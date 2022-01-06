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

    public void setTitle(String t){
        title = t;
    }

    public void setDate(String dt){
        date=dt;
    }
    
    public void setText(String tx){
        text=tx;
    }


}
