public class MyDataTypes {
    //program giving example of data types
    public static void main(String[] args) {

        short number1 = 32_000; //stores whole numbers from range +/- 32767
        int number2 = 2000; //stores whole numbers from range +/- 32767
        long number3 = 9006009000L; //stores whole numbers from 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float number4 = 1.5000007F; //stores fraction numbers up to 7 decimals
        double number5 = 1.500000000000007; //stores fraction numbers up to 15 decimals

        //print our numbers to console
        System.out.println("our short data type value is" + number1);
        System.out.println("our int data type value is" + number2);
        System.out.println("our long data type value is" + number3);
        System.out.println("our float data type value is" + number4);
        System.out.println("our double data type value is" + number5);


        //boolean data type set to variable name "wet" and it's value is true
        boolean wet = true;

        if (wet == true) {

            System.out.println("Since our boolean data type is true, It be wet outside.");

        } else {
            System.out.println("It ain't wet out here.");
        }
    }
}


