package package_people;

public class PersonDetails {
    //our main method is in this class
    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;
        //creating object from class

        firstPerson = new Person();
        secondPerson = new Person();

        //set firstPerson object values
        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        //set secondPerson object values
        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2012;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        //print values
double monthlyRate = 0;
double adjustedRate = 0;
        firstPerson.display();
        System.out.println("Preliminary Insurance Rate: $" + firstPerson.getRate(monthlyRate));
        System.out.println("Adjusted Rate: $" + firstPerson.assumeGender(adjustedRate));
        System.out.println("Total Monthly Insurance Rate: $" + (firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate)));
        System.out.println();
        secondPerson.display();
        System.out.println("Preliminary Insurance Rate: $" + secondPerson.getRate(monthlyRate));
        System.out.println("Adjusted Rate: $" + secondPerson.assumeGender(adjustedRate));
        System.out.println("Total Monthly Insurance Rate: $" + (secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate)));
    }
}
