import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class KeyDemo extends JFrame implements KeyListener{
    JLabel messageLabel;
    JLabel statusLabel;
    JLabel typedLabel;

    public KeyDemo(){

        setTitle("Key Demo");
        setSize(400,800);
        setLayout(null);

        JLabel instructionsLabel = new JLabel("Press any key to see its status");
        add(instructionsLabel);

        messageLabel = new JLabel("No key events yet");
        messageLabel.setBounds(10, 10, 200, 200);
        add(messageLabel);

        statusLabel = new JLabel("Status: none");
        statusLabel.setBounds(10, 220, 200, 200);
        add(statusLabel);

        typedLabel = new JLabel("Typed key: none");
        typedLabel.setBounds(10, 240, 200, 200);
        add(typedLabel);

        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent ke){
        messageLabel.setText("Key pressed: " + ke.getKeyChar());
        statusLabel.setText("Status: KeyPressed");
    }

    @Override
    public void keyReleased(KeyEvent ke){
        messageLabel.setText("Key released: " + ke.getKeyChar());
        statusLabel.setText("Status: KeyReleased");
    }

    @Override
    public void keyTyped(KeyEvent ke){
            char c = ke.getKeyChar();
            typedLabel.setText("Typed key: " + c);
            statusLabel.setText("Status: KeyTyped");
    }


    public static void main(String[] args) {

        new KeyDemo();
    }



}
