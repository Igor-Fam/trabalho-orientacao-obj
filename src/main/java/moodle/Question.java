// Erick Peterman Mendes - 202065557C
// Igor Miranda Fam - 202065563C


package moodle;

public class Question {

    private String statement;
    private String [] alternatives = new String [4];
    private int correctAnswer;


    public Question(String stat, String [] alts, int ca){
        statement = stat;
        alternatives = alts;
        correctAnswer = ca;
    }

    public void setStatement(String s){
        statement = s;
    }

    public void setAlternative(String a, int i){
        alternatives[i] = a;
    }

    public void setCorrectAnswer(int c){
        correctAnswer = c;
    }

    public String getStatement(){
        return statement;
    }

    public String getAlternative(int i){
        return alternatives[i];
    }

    public boolean answerQuestion(int a){
        if(a == correctAnswer){
            return true;
        } else {
            return false;
        }
    }

}
