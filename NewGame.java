package finalgame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewGame extends JFrame {

    private JButton newgame = new JButton("Start Game");
    private JButton HallOfFame = new JButton("Hall Of Fame");
    private JButton back = new JButton("Back");
    private ImageIcon image = new ImageIcon(getClass().getResource("1575887.jpg"));
    private JLabel lbl = new JLabel(image);
    private Container con = this.getContentPane();
    private JLabel brik = new JLabel("Brick Breaker");
    private JPanel pnl = new JPanel();
    public static Levels level = new Levels();

    public NewGame() {
        init();
    }

    public static void visible() {
        level.setVisible(true);
        Finalgame.newgame.setVisible(false);
    }

    public void init() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Font font = new Font("Snap ITC", Font.BOLD, 100);
        this.setTitle("Brick Breaker");
        this.setBounds(0, 0, d.width, d.height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        con.setLayout(new BorderLayout());

        newgame.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visible();
            }
        }
        );

        HallOfFame.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HallOfFame h = new HallOfFame();
                h.setVisible(true);
            }
        }
        );

        newgame.setBounds((d.width / 2) - 110, (d.height / 2) - 30, 270, 50);
        newgame.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
        newgame.setForeground(Color.black);
        newgame.setBorderPainted(false);
        newgame.setBackground(Color.LIGHT_GRAY);

        HallOfFame.setBounds((d.width / 2) - 110, (d.height / 2) + 70, 270, 50);
        HallOfFame.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
        HallOfFame.setForeground(Color.black);
        HallOfFame.setBorderPainted(false);
        HallOfFame.setBackground(Color.LIGHT_GRAY);

        brik.setFont(font);
        brik.setForeground(Color.WHITE);
        brik.setBounds((d.width / 2) - 400, d.height / 4 - (d.height / 6), 1000, 200);

        pnl.add(lbl);
        con.add(newgame);
        con.add(HallOfFame);
        con.add(brik);
        con.add(pnl, BorderLayout.CENTER);
    }
}
