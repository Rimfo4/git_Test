package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("호출!");
    }
}
public class EventExample01 extends JFrame {
    private JButton jButton = new JButton("버튼");

    public EventExample01(){
        setSize(500, 500);
        this.setLayout(null);
        jButton.setBounds(20, 20, 200, 200);
        jButton.addActionListener(new ListenerClass());
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventExample01();
    }
}
