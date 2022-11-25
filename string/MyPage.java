package com.string;

import java.awt.*;
import javax.swing.*;

public class MyPage extends JFrame //Inheriting the Properties of JFrame
{
    static int x = 0, y = 0;
    static JLabel counter = new JLabel(x + " : " + y);
    private MyPage()
    {
        getContentPane().setBackground(Color.CYAN);
        setSize(700, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String [] rk)
    {
//Creating a JFrame

        MyPage p = new MyPage();

//Adding GUI Components in the Frame

        JLabel l = new JLabel("Sports Registration Page");
        l.setFont(new Font("Serif", Font.BOLD, 40));
        l.setForeground(Color.RED);
        l.setBounds(120, 30, 500, 100);
        p.add(l);

        Font f = new Font("Serif", Font.BOLD, 30);

        JLabel l1 = new JLabel("Name"); p.add(l1);
        l1.setFont(f); l1.setForeground(Color.BLUE);
        JTextField t1 = new JTextField(); p.add(t1);
        t1.setFont(f); t1.setForeground(Color.BLUE);
        p.add(l1); l1.setBounds(150, 120, 200, 30);
        p.add(t1); t1.setBounds(300, 120, 200, 40);

        String [] gen = {"Select", "Male", "Female"};
        JLabel l2 = new JLabel("Gender"); p.add(l2);
        l2.setFont(f); l2.setForeground(Color.BLUE);

        JComboBox <String> c1 = new JComboBox<>(gen); p.add(c1);
        c1.setFont(new Font("Serif", 2, 24)); c1.setForeground(Color.BLUE);
        p.add(l2); l2.setBounds(150, 180, 200, 30);
        p.add(c1); c1.setBounds(300, 180, 200, 40);

        JLabel l3 = new JLabel("Skills"); p.add(l3);
        l3.setFont(f); l3.setForeground(Color.BLUE);
        p.add(l3); l3.setBounds(150, 240, 200, 30);

        JCheckBox jc1 = new JCheckBox("Chess");
        p.add(jc1); jc1.setBounds(300, 240, 200, 30);
        jc1.setBackground(Color.CYAN);
        jc1.setForeground(Color.BLUE);
        jc1.setFont(new Font("Serif", 2, 24));
        JCheckBox jc2 = new JCheckBox("Badminton"); p.add(jc1);
        p.add(jc2); jc2.setBounds(300, 270, 200, 30); jc2.setBackground(Color.CYAN);
        jc2.setForeground(Color.BLUE);
        jc2.setFont(new Font("Serif", 2, 24));
        JCheckBox jc3 = new JCheckBox("Table Tenis"); p.add(jc1);
        p.add(jc3); jc3.setBounds(300, 300, 200, 30); jc3.setBackground(Color.CYAN);
        jc3.setForeground(Color.BLUE);
        jc3.setFont(new Font("Serif", 2, 24));
        JCheckBox jc4 = new JCheckBox("Volleyball"); p.add(jc1);
        p.add(jc4); jc4.setBounds(300, 330, 200, 30); jc4.setBackground(Color.CYAN);
        jc4.setForeground(Color.BLUE);
        jc4.setFont(new Font("Serif", 2, 24));

        JButton b1 = new JButton("Submit"); p.add(b1);
        b1.setBounds(250, 400, 80, 40);
        JButton b2 = new JButton("Reset"); p.add(b2);
        b2.setBounds(350, 400, 80, 40);

//Using Lambda Expressions to create a Listener (ActionListener) for Submit Button

        b1.addActionListener(
                ae -> {
                    if(ae.getActionCommand().equals("Submit"))
                    {
                        JOptionPane.showMessageDialog(null, "Registration Successful!");
                    }
                }
        );
//Using Lambda Expressions to create a Listener (ActionListener) for Reset Button
        b2.addActionListener(
                ae -> {
                    if(ae.getActionCommand().equals("Reset"))
                    {
                        t1.setText(null);
                        c1.setSelectedIndex(0);
                        jc1.setSelected(false);
                        jc2.setSelected(false);
                        jc3.setSelected(false);
                        jc4.setSelected(false);
                    }
                }
        );

        p.add(counter);
        counter.setBounds(620, 0, 80, 30);
        counter.setForeground(Color.BLACK);
        counter.setFont(new Font("Serif", 1, 20));

//Creating Thread to Update the Counter

        Thread td = new Thread( //Lambda to implement Runnable
                () -> {
                    while(true){
                        if(y == 59) { x++; y = 0; }
                        else y++;
                        counter.setText(x + " : " + y);
                        try{ Thread.sleep(1000); }
                        catch(Exception ex) {}
                    }

                }
        );
        td.start();

        p.setVisible(true);
    }
}