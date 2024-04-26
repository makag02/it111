import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeAveraging {


    public static void main (String[] args){
    //ask user to input grade
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        while (counter<=5) {
            System.out.println("Please enter your " + counter + " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } //end while loop

        String message;
        char letterGrade;

        counter -=1;

        average = total / counter;

        System.out.println("You have earned an average grade of " + average + " after providing us with " +
                counter + " grades");

        if (average >= 90 && average <=100){
            letterGrade = 'A';
            message = "Excellent work!";
        }   else if (average >= 80 && average < 90){
                letterGrade = 'B';
                message = "Solid work!";

        }   else if (average >= 70 && average < 80){
                letterGrade = 'C';
                message = "You are average!";

        }   else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "Study more!";

        }   else if (average >= 80 && average < 90) {
                letterGrade = 'B';
                message = "Solid work!";

        }   else {
            letterGrade = 'F';
            message = "You are failing!";
        }

        System.out.println("Your letter grade is: " + letterGrade + ". " + message);




    }
}
