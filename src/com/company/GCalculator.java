package com.company;

import javax.swing.*;

public class GCalculator extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton a7Button;
    private JButton a8Button;

    public GCalculator(){
        super("Calculator");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
}
