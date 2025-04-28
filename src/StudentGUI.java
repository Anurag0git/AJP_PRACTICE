import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGUI extends JFrame implements ActionListener {
    JTextField marks1;
    JTextField marks2;
    JTextField marks3;
    JTextField marks4;
    JLabel grade;
    public StudentGUI() {

        JLabel namelbl = new JLabel("Enter the name of the student");
        JTextField name = new JTextField();

        JLabel sub1 = new JLabel("Subject 1");
        marks1 = new JTextField();

        JLabel sub2 = new JLabel("Subject 2");
        marks2 = new JTextField();

        JLabel sub3 = new JLabel("Subject 3");
        marks3 = new JTextField();

        JLabel sub4 = new JLabel("Subject 4");
        marks4 = new JTextField();

        setTitle("Student GUI");
        setSize(400, 400);
        setLayout(null);

        namelbl.setBounds(10, 10, 200, 20);
        name.setBounds(100, 40, 200, 20);

        sub1.setBounds(10, 70, 200, 20);
        marks1.setBounds(100, 100, 200, 20);

        sub2.setBounds(10, 130, 200, 20);
        marks2.setBounds(100, 160, 200, 20);

        sub3.setBounds(10, 190, 200, 20);
        marks3.setBounds(100, 210, 200, 20);

        sub4.setBounds(10, 240, 200, 20);
        marks4.setBounds(100, 270, 200, 20);



        JButton calculate = new JButton("Calculate");
        calculate.setBounds(150, 300, 120, 20 );
        calculate.addActionListener(this);

        grade= new JLabel("");
        grade.setBounds(150, 330, 80, 20);


        add(grade);
        add(name);
        add(marks1);
        add(marks2);
        add(marks3);
        add(marks4);
        add(calculate);
        add(namelbl);
        add(sub1);
        add(sub2);
        add(sub3);
        add(sub4);


        setVisible(true);
    }









    @Override
    public void actionPerformed(ActionEvent ae){
        int m1 = Integer.parseInt(marks1.getText());
        int m2 = Integer.parseInt(marks2.getText());
        int m3 = Integer.parseInt(marks3.getText());
        int m4 = Integer.parseInt(marks4.getText());

        int total = m1 + m2 + m3 + m4;
        double percent = total / 4.0;

        if(percent >=90) grade.setText("A " + percent + "%");
        else if(percent >=80) grade.setText("B "+ percent + "%");
        else if(percent >=70) grade.setText("C "+ percent + "%");
        else if(percent >=60) grade.setText("D "+ percent + "%");
        else if(percent >=50) grade.setText("E "+ percent + "%");
        else if(percent >=40) grade.setText("F "+ percent + "%");
        else grade.setText("Fail "+ percent + "%");

    }

    public static void main(String[] args) {
        new StudentGUI();
    }

}
