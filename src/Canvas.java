import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel implements MouseListener{

    String c1 = "X";
    String c2 = "O";
    boolean color1 = false;

    public Canvas(){

        this.setBackground(Color.pink);
        addMouseListener((MouseListener) this);
        this.setPreferredSize(new Dimension(300, 300));

    }

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("CLICK!");
        System.out.println(e.getButton());
        if (e.getButton() == 1){
            if()
        }

    }

    public void O(){

    }

    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("CLICK!");
        System.out.println(e.getButton());
        if (e.getButton() == 1) {

            if (color1) {
                this.Set;
            } else {
                this.setToolTipText(c2);
            }
            color1 = !color1;
        }else{
            this.setBackground(Color.blue);
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("Pressed");

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
