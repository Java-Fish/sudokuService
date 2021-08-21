package com.javaFish;

import com.javaFish.util.Game;

import javax.swing.*;
import java.awt.event.*;

public class StartProgramWithGui extends JDialog {
    private JPanel pane_Main;
    private JButton button_New;
    private JButton button_Close;
    private JTextField textField_InputSudokuToSolve;

    public StartProgramWithGui() {
        setContentPane(pane_Main);
        setModal(true);
        getRootPane().setDefaultButton(button_New);

        button_New.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        button_Close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        pane_Main.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        textField_InputSudokuToSolve.setText("0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0 0 5 0 0 0 7 1 2 0");
        String inputString = textField_InputSudokuToSolve.getText();
        String[] args = new String[inputString.length()];
        for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) != ' '){
                args[i] = String.valueOf(inputString.charAt(i));

            }
        }
        Game.generateField(args);
        //dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        StartProgramWithGui dialog = new StartProgramWithGui();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
