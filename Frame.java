import javax.swing.*;
import java.awt.*;

public class Frame{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Some text");
        JButton btn1 = new JButton("Click me!");
        JTextArea txtArea = new JTextArea();
        JTextField txtField = new JTextField(20);

        panel.setLayout(new BorderLayout());

        //panel에 추가
        panel.add(label, BorderLayout.NORTH);
        panel.add(btn1, BorderLayout.WEST);
        panel.add(txtArea, BorderLayout.CENTER);

        // 프레임에 panel 추가
        frame.add(panel);

        // 프레임 창 크기 조절
        frame.setResizable(false);

        // 프레임 제목
        frame.setTitle("720 * 640 프레임");

        // 프레임을 출력
        frame.setVisible(true);

        // 프레임 크기
        frame.setPreferredSize(new Dimension(840, 100));  // 선호(권장) 할 때 사용
        frame.setSize(720, 640);                          // 크기를 '강제로' 지정 할 때 사용

        // 프레임이 어디에 출력하는지(null 이라면 정중앙에 출력)
        frame.setLocationRelativeTo(null);

        //프레임을 닫을 때 프로그램 종료
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
