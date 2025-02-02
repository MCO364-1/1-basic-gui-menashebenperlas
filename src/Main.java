import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("Calculator");
        window.setSize(800, 600);
        window.setLayout(new BorderLayout());

        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        window.add(text1, BorderLayout.NORTH);
        window.add(text2, BorderLayout.SOUTH);

        JButton pressMeButton = new JButton("Click To Add");
        window.add(pressMeButton, BorderLayout.CENTER);

        JLabel label = new JLabel("     ");
        window.add(label , BorderLayout.WEST);

        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pressMeButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String one  = text1.getText();
                String two  = text2.getText();
                int sum  = Integer.parseInt(one) + Integer.parseInt(two);

                label.setText("Sum: " + sum);
            }
        });
    }
}