import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class numGuess extends JFrame implements ActionListener {
    JButton button1,button2,button3;
    JTextField text1,text2;
    JLabel label1,label2;

    public numGuess() {
        Container c = getContentPane();
        label1 = new JLabel("输入一个整数");
        label2 = new JLabel("提         示");

        button1 = new JButton("开始");
        button1.addActionListener(this);

        button2 = new JButton("确定");
        button2.addActionListener(this);

        button3 = new JButton("清空");
        button3.addActionListener(this);

        text1 = new JTextField();
        text1.addActionListener(this);

        text2 = new JTextField();
        text2.addActionListener(this);

        label1.setBounds(20,70,100,30);
        label2.setBounds(20,170,100,30);
        button1.setBounds(20, 20, 150, 30);
        button2.setBounds(20, 120, 70, 30);
        button3.setBounds(140, 120, 70, 30);
        text1.setBounds(120, 70, 150, 30);
        text2.setBounds(120, 170, 150, 30);

        c.add(label1);
        c.add(label2);
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(text1);
        c.add(text2);

        setBounds(900,100,350,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("猜数游戏");
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == button1) {
            int num = (int) (Math.random() * 100) + 1;
            String guess = text1.getText();
            int guessnum = Integer.parseInt(guess);

            if (guessnum == num) {
                text2.setText("Bingo！");
            } else if (guessnum > num) {
                text2.setText("你猜的数大了！");
            } else {
                text2.setText("你猜的数小了！");
            }
        }
    }

    public static void main(String[] args) {
        new numGuess();

    }

}
