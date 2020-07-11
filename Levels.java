package finalgame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Levels extends JFrame {

    private JButton Easy = new JButton("Easy");
    private JButton Medium = new JButton("Medium");
    private JButton Hard = new JButton("Hard");
    private JButton back = new JButton("Back");
    private ImageIcon image = new ImageIcon(getClass().getResource("1575887.jpg"));
    private JLabel lbl = new JLabel(image);
    private Container con = this.getContentPane();
    private JPanel pnl = new JPanel();

    public Levels() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setTitle("Brick Breaker");
        this.setBounds(0, 0, d.width, d.height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Easy.setBounds((d.width / 2) - 100, (d.height / 2) - 200, 200, 50);
        Easy.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
        Easy.setForeground(Color.BLACK);
        Easy.setBorderPainted(false);
        Easy.setBackground(Color.LIGHT_GRAY);

        Medium.setBounds((d.width / 2) - 100, (d.height / 2) - 100, 200, 50);
        Medium.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
        Medium.setForeground(Color.BLACK);
        Medium.setBorderPainted(false);
        Medium.setBackground(Color.LIGHT_GRAY);

        Hard.setBounds((d.width / 2) - 100, (d.height / 2), 200, 50);
        Hard.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
        Hard.setForeground(Color.BLACK);
        Hard.setBorderPainted(false);
        Hard.setBackground(Color.LIGHT_GRAY);

        back.setBounds((d.width / 2) - 100, (d.height / 2) + 100, 200, 50);
        back.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
        back.setForeground(Color.BLACK);
        back.setBorderPainted(false);
        back.setBackground(Color.LIGHT_GRAY);

        pnl.add(lbl);
        con.add(Easy);
        con.add(Medium);
        con.add(Hard);
        con.add(back);
        con.add(pnl, BorderLayout.CENTER);

        Easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visible();
                GameFrame feasy = new GameFrame(3, 5);
                feasy.setVisible(true);
            }
        }
        );

        Medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visible();
                GameFrame feasy = new GameFrame(5, 6);
                feasy.setVisible(true);
            }
        }
        );

        Hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visible();
                GameFrame feasy = new GameFrame(7, 8);
                feasy.setVisible(true);
            }
        }
        );

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Finalgame.newgame.setVisible(true);
                visible();
            }
        }
        );
    }

    public void visible() {
        NewGame.level.setVisible(false);
    }
}
