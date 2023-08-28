package onlinequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton Rules, back;
    //JTextField tfname;
    String name;

    Login(String name) {
        this.name = name;

        //for Background and Frame
        getContentPane().setBackground(Color.white);//CYAN
        setLayout(null);
        // Heading 
        
        JLabel heading1 = new JLabel("Hello,"+name+" Now You are on   Online Quizz Main  Page ");
        heading1.setBounds(50, 10, 1500, 50);
        heading1.setFont(new Font("Viner Hand ITC", Font.BOLD, 50));
        heading1.setForeground(new Color(0, 200, 0));
        add(heading1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/5.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 750);//600,450
        add(image);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Icons/5.png"));
        JLabel secimage = new JLabel(i2);
        secimage.setBounds(0, 0, 2500, 750);//600,450
        add(secimage);

        //For Heading 
        JLabel heading = new JLabel("ONLINE QUIZZ");
        heading.setBounds(500, 90, 850, 85);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 80));
        heading.setForeground(new Color(255, 102, 0));
        add(heading);

     

        //for Rules Button
        Rules = new JButton("RULES");
        Rules.setBounds(600, 300, 220, 80);
        Rules.setBackground(new Color(30, 144, 254));
        Rules.setForeground(Color.WHITE);
        Rules.setFont(new Font("Times New Roman", Font.BOLD, 48));
        Rules.addActionListener(this);
        add(Rules);

        //for BACK Button
        back = new JButton("BACK");
        back.setBounds(600, 430, 220, 80);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman", Font.BOLD, 48));
        back.addActionListener(this);
        add(back);

        // First Frame 
        setSize(1540, 850);
        setLocation(0, 0);
        setVisible(true);
    }
// ACTION TAKES

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Rules) {
            //String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            new signin();
        }
    }
// main method

    public static void main(String args[]) {
        new Login("user");
    }
}