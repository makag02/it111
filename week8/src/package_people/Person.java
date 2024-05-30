package package_people;

public class Person {

    //this file doesn't have a main method
    //instance field
    String name;

    char gender;

    int age;

    int car;

    boolean violations;

    double creditScore;


    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Vehicle Year: " +car);
        System.out.println("Traffic Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);

    }

    public double getRate(double monthlyRate){
        if(violations == true && creditScore <= 700){
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
    return monthlyRate;

    }

  public double assumeGender (double adjustedRate){
        if(gender == 'M' && age <= 25){
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
  }


}
