import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class ShowWindow2 {

    public static void main(String[] args) {
        //declare vars
        //make vars constant

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        //get screensize of user's monitor/calculate window position so it's in dead center of screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width -WINDOW_WIDTH) / 2;
        int y = (screenSize.height - WINDOW_HEIGHT) / 2;


        //create window
        JFrame window = new JFrame();
        window.setTitle("My Simple Window");
        //so i can position label?
        window.setLayout(null);

        //create jlabel objects
        JLabel myLabel = new JLabel();
        JLabel myLabel2 = new JLabel();

        //create jTextField objects
        JTextField myTextField = new JTextField();
        JTextField myTextField2 = new JTextField();
        

        //set size of window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //close and exit window/program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //color window
        window.getContentPane().setBackground(Color.GREEN);
        window.setLocation(x, y);

        //set text/dimension of label
        myLabel.setText("Label 1");
        myLabel.setBounds(20, 5, 100, 20);
        myLabel2.setText("Label 2");
        myLabel2.setBounds(20, 60, 100, 25);

        //set font of label
        myLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        myLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));

        //add label to window
        window.getContentPane().add(myLabel);
        window.getContentPane().add(myLabel2);

        //set dimension of text field
        myTextField.setBounds(20, 35, 100, 20);
        myTextField2.setBounds(20, 90, 100, 20);

        //add text field to window
        window.getContentPane().add(myTextField);
        window.getContentPane().add(myTextField2);
        //display window
        window.setVisible(true);
    }
}
