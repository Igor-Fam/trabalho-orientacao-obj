package moodle;

import java.util.Scanner;

public class Moodle {
    public static void main(String[] args) {
        Question q = new Question();
        q.setStatement("Enunciado Enunciado Enunciado Enunciado Enunciado Enunciado ");
        String [] alts = {"correta", "errada 1", "errada 2", "errada 3"};
        q.setAlternatives(alts);
        q.setCorrectAnswer(1);
        System.out.println(q.getStatement());
        System.out.println();
        String [] options = q.getAlternatives();
        for(int i  = 0; i < 4; i++){
            System.out.println((i+1) + ") " + options[i]);
        }
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(q.answerQuestion(a));
        s.close();
    }
    
}
