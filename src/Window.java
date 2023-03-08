import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private boolean red = false;

    public Window() {
        this.setTitle("Fun with layouts");
        final int SIZE = 100;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layout manager
        JPanel multiPanel = new JPanel();
        GridLayout layout = new GridLayout(3,3);
        multiPanel.setLayout(layout);

       /* this.setLayout(new GridLayout(3, 3));
        for(int i = 0; i<3*3; i++){
            this.add(new Canvas());
        }*/

        //add squares
        multiPanel.add(new Canvas());
        multiPanel.add(new Canvas());

        this.getContentPane().add(multiPanel);
        this.pack();
        this.setVisible(true);
    }

    //Get / Set

    public boolean isRed(){
        return red;
    }

    public void changeRed(){
        this.red = !this.red;
    }

}
