import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class OpenFIle {

    public static void main(String[] args) {

        File file;

        Scanner inputFile;

        String fileName;

        fileName = JOptionPane.showInputDialog("Enter " + "the name of the File");
        //attempt to open file

        try{
            file = new File(fileName);
        inputFile = new Scanner(file);
        JOptionPane.showMessageDialog(null, "The file was found, displayed in TRY");



        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "The file was not found, displayed in CATCH");

        }
        JOptionPane.showMessageDialog(null, "Program has finished running. displayed after CATCH");







    }
}
