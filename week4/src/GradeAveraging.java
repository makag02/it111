import java.sql.SQLOutput;
import java.util.Scanner;


//program to average an input of 5 grades
public class GradeAveraging {

    //main method
    public static void main (String[] args){
    //ask user to input grade
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        //while loop for our user input
        while (counter<=5) {
            System.out.println("Please enter your " + counter + " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } //end while loop

        //create variables for our message and letter grade
        String message;
        char letterGrade;

        counter -=1;

        //average out the 5 inputs
        average = total / counter;

        //print message to output to show the GPA
        System.out.println("You have earned an average grade of " + average + " after providing us with " +
                counter + " grades");


        //nested if statements to determine what our grade is
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

        //final message displaying letter grade and message
        System.out.println("Your letter grade is: " + letterGrade + ". " + message);




    }
}
