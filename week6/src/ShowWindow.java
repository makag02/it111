import javax.swing. *;



public class ShowWindow {

    public static void main(String[] args) {
        //declare vars
        //make vars constant

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        //create window
        JFrame window = new JFrame();
        window.setTitle("My SImple Window");

        //set size of window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //close and exit window/program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display window
        window.setVisible(true);
    }
}
