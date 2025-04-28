import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener {

    Label message;
    public MouseEventDemo(){
       setTitle("Mouse Event Demo");
       setSize(400, 300);
       setLayout(null);
       message = new Label("Perform mouse events to see the mouse events");
       message.setBounds(50, 50, 200, 50);
       add(message);
       addMouseListener(this);
       setVisible(true);
    }




    @Override
    public void mouseClicked(MouseEvent me){
        message.setText("Mouse clicked at (" + me.getX() + "," + me.getY() + ")");
    }
    @Override
    public void mouseEntered(MouseEvent me){
        message.setText("Mouse entered at (" + me.getX() + "," + me.getY() + ")");
    }
    @Override
    public void mouseExited(MouseEvent me){

        message.setText("Mouse exited");


    }
    @Override
    public void mousePressed(MouseEvent me){

        message.setText("Mouse pressed");
    }
    @Override
    public void mouseReleased(MouseEvent me){

        message.setText("Mouse released");
    }


    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
