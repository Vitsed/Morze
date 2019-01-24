package com.vitsed;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GUI {

    private final JFrame frame;
    private final JPanel panel;
    private final JButton button;
    private final JTextField field;
    private final JLabel label;
    private final JButton morseBtn;

    private double width = 500;
    private double height = 500;
    private JButton showSizeBtn = new JButton("Morse");
    private JPanel sizePanel = new JPanel();
    private JTextArea textArea;
    private Scanner scanner = new Scanner(System.in);
    private Morze morse = new Morze();

    public GUI() {
        frame = new JFrame("Morse-App");
        field = new JTextField(15);
        morseBtn = new JButton("Morse");
        label = new JLabel("Type here: ");
        panel = new JPanel();
        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);
        textArea.setFont(new Font("sanserif", Font.BOLD, 24));
        button = new JButton("Add");
        panel.add(label);
        panel.add(field);
        panel.add(button);
        button.setVisible(false);
        panel.add(morseBtn);
        panel.add(textArea);
        frame.getContentPane().add(BorderLayout.NORTH, panel);

        morseBtn.addActionListener(event -> {
            String code = field.getText();
            textArea.setText(morse.wordToMorzeCode(code));
            textArea.repaint();
        });

//        showSizeBtn.addActionListener(event ->  {
//            width = frame.getWidth();
//            height = frame.getHeight();
//            System.out.printf("Width: %f%n", width);
//            System.out.printf("Height: %f%n", height);
//        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);


    }

}
