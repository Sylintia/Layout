import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel implements MouseListener{


    final int SIZE = 100;
    Color c1 = Color.red;
    Color c2 = Color.green;
    Window myWindow;

    //boolean color1 = false;

    public Canvas(Window win){
        myWindow = win;
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.setBackground(Color.pink);
        addMouseListener(this);
        this.setSize(new Dimension(SIZE,SIZE));

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

     //   mouseClicked(g);

        //Check if last clicked
        if(myWindow.getLC() == this){
            g.setColor(Color.cyan);
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICK!");
        System.out.println(e.getButton());
        //   boolean mouseClicked;
        if (e.getButton() == 1) {
            if (myWindow.isRed()) {
                this.setBackground(c1);
            } else {
                this.setBackground(c2);
            }
            // Object g = null;
            // paint(paintComponent(Graphics g));
            myWindow.changeRed();
        } else {
            this.setBackground(Color.blue);
        }

        if(myWindow.getLC() != null){
            myWindow.getLC().repaint();
        }
        myWindow.setLC(this);
        repaint();
    }

   /* @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        repaint();
    }*/

  /*  @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("CLICK!");
        System.out.println(e.getButton());
        if (e.getButton() == 1) {

            if (myWindow.isRed()) {
                this.setBackground(c1);
            } else {
                this.setBackground(c2);
            }
            myWindow.changeRed();
        }else{
            this.setBackground(Color.blue);
        }
        repaint();
    }*/

    @Override
    public void mousePressed(MouseEvent e) {

       // System.out.println("Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
