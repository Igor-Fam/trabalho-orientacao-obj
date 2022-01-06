package moodle;

public class Question {

    private String statement;
    private String [] alternatives = new String [4];
    private int correctAnswer;

    public void setStatement(String s){
        statement = s;
    }

    public void setAlternatives(String [] a){
        alternatives = a;
    }

    public void setCorrectAnswer(int c){
        correctAnswer = c;
    }

    public String getStatement(){
        return statement;
    }

    public String [] getAlternatives(){
        return alternatives;
    }

    public boolean answerQuestion(int a){
        if(a == correctAnswer){
            return true;
        } else {
            return false;
        }
    }

}
