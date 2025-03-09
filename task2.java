import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects");
        int numsub=sc.nextInt();
        int marks[]=new int[numsub];
        int totalmarks=0;
        for(int i=0;i<numsub;i++){
            System.out.println("Enter the marks for the subject "+(i+1)+" out of 100 marks");
            marks[i]=sc.nextInt();
            totalmarks=totalmarks+marks[i];
        }
        double average=(double)totalmarks/numsub;
        char grade;
        if(average>90){
            grade='A';
        }
        else if(average>=80){
            grade='B';
        }
        else if(average>=70){
            grade='C';
        }
        else if(average>=60){
            grade='D';
        }
        else{
            grade='E';
        }
        System.out.println("The result for the exams");
        System.out.println("The total marks obtained: " + totalmarks);
        System.out.println("The average of the result: " + average );
        System.out.println("The grade is : " + grade);
    }
}
