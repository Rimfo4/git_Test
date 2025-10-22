package Swing;

import javax.swing.*;

public class Component extends JFrame {
    public Component(){
        setSize(300,500);

        JLabel jLabel = new JLabel();
        jLabel.setText("Hello jeongMo");
        jLabel.setBounds(10,10,200,20);
        add(jLabel);

        JButton jButton = new JButton();
        jButton.setText("버튼이당");
        jButton.setBounds(10, 70, 200, 20);
        add(jButton);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("글 적기용 구간");
        jTextArea.append(" + 이것도 추가");
        jTextArea.setBounds(10, 100, 200, 20);
        add(jTextArea);

        JTextField jTextField = new JTextField();
        jTextField.setText("글자 필드");
        jTextField.setBounds(10, 400, 200, 20);
        add(jTextField);

        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setText("고르기 1");
        jCheckBox.setBounds(60, 130, 50, 20);
        add(jCheckBox);

        JCheckBox jCheckBox2 = new JCheckBox();
        jCheckBox2.setText("def");
        jCheckBox2.setBounds(10, 130, 50, 20);
        add(jCheckBox2);

        JCheckBox jCheckBox3 = new JCheckBox();
        jCheckBox3.setText("ghi");
        jCheckBox3.setBounds(110, 130, 50, 20);
        add(jCheckBox3);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton jRadioButton1 = new JRadioButton();
        jRadioButton1.setText("abc");
        buttonGroup.add(jRadioButton1);
        jRadioButton1.setBounds(10, 160, 50, 20);
        add(jRadioButton1);

        JRadioButton jRadioButton2 = new JRadioButton();
        jRadioButton2.setText("def");
        buttonGroup.add(jRadioButton2);
        jRadioButton2.setBounds(60, 160, 50, 20);
        add(jRadioButton2);

        JRadioButton jRadioButton3 = new JRadioButton();
        jRadioButton3.setText("ghi");
        buttonGroup.add(jRadioButton3);
        jRadioButton3.setBounds(110, 160, 50, 20);
        add(jRadioButton3);

        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Component();
    }
}
