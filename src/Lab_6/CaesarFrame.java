package Lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Lab_6.Caesar;


public class CaesarFrame extends JFrame {
    private final JPanel p1, p2;
    private final JTextField f1, f2;
    private final JButton button;
    private final JComboBox combobox;

    Caesar cesar = new Caesar();

    public CaesarFrame(){
        //this.setVisible(true);
        this.setTitle("SwingLab");

        f1 = new JTextField(20);

        f1.setEnabled(true);



        f2 = new JTextField(20);
        Object chars[]=new Object[26];
        for(int i=(int)'A';i<=(int)'Z';i++)
            chars[i-(int)'A']=(char)i;
        combobox = new JComboBox(chars);

        p1 = new JPanel();
        p2 = new JPanel();

        button = new JButton();
        button.addActionListener(new OkButtonActionListener());
        button.setText("Code!");
        p1.add(combobox, BorderLayout.NORTH);
        p1.add(f1,BorderLayout.NORTH);
        p1.add(button, BorderLayout.NORTH);

        JLabel lab = new JLabel();
        lab.setText("Output");
        p2.add(lab, BorderLayout.SOUTH);
        p2.add(f2, BorderLayout.CENTER);

        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        this.setSize(400,110);



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class OkButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            Caesar caesar = new Caesar();
            f2.setText(caesar.caesarCode(f1.getText(),(char)combobox.getSelectedItem()));
        }

    }
}
