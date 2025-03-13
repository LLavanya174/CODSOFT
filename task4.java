import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class task4{
    private static final Scanner scanner=new Scanner(System.in);
    private static int score=0;
    private static boolean answered=false;
    private static final int TIME_LIMIT=10;
    static class Question{
        String question;
        String []options;
        char correctAnswer;
        Question(String question,String[] options,char correctAnswer){
            this.question=question;
            this.options=options;
            this.correctAnswer=correctAnswer;
        }
    }
    public static void main(String[] args) {
        Question[] questions = { 
            new Question("Which of these is a wrapper class in Java?", 
                new String[]{"A. int", "B. Integer", "C. float", "D. Double"}, 'B'),  // ← Add a comma here
            new Question("Which keyword is used to inherit a class in Java?", 
                new String[]{"A. super", "B. extends", "C. implements", "D. import"}, 'B') 
        };
        
        System.out.println("Welcome to the java quiz challenge");
        System.out.println("You are having the time limit of"+TIME_LIMIT +" seconds to answer the question");
        for(Question q: questions){
            askQuestion(q);
        }
        System.out.println("The Quiz is over now your final score is: "+ score + "/"+questions.length);
    }
    private static void askQuestion(Question question){
        System.out.println("\n"+ question.question);
        for(String option: question.options){
            System.out.println(option);
        }
       answered = false;
        Timer timer=new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                if(!answered){
                    System.out.println("\nTime's up! Moving to the next questions.");
                }
                answered=true;
            }
        },TIME_LIMIT*1000);
        System.out.print("Enter your answer (A/B/C/D):");
        String userAnswer=scanner.next().toUpperCase();
        timer.cancel();
        if(!answered){
            if(userAnswer.length()==1&&userAnswer.charAt(0)==question.correctAnswer){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong correct answer: "+ question.correctAnswer);
            }
        }
        answered=true;
    }
}
