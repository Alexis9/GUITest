import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class game_numGuess extends JFrame implements ActionListener {
    JLabel label_input, label_prompt;
    JTextField text_guess, text_result;
    JButton button_start, button_ok, button_clear,button_again;
    int num_Random = 0;


    public  game_numGuess() {
        Container c = getContentPane();
        label_input = new JLabel("输入你的答案");
        label_prompt = new JLabel("提         示");
        text_guess = new JTextField();
        text_result = new JTextField();
        button_start = new JButton("获取一个随机数");
        button_ok = new JButton("确定");
        button_clear = new JButton("清空");
        button_again= new JButton("再猜一次");

        button_start.addActionListener(this);
        button_clear.addActionListener(this);
        button_ok.addActionListener(this);
        text_guess.addActionListener(this);

        button_start.setBounds(120, 20, 150, 30);
        label_input.setBounds(20, 70, 100, 30);
        text_guess.setBounds(120, 70, 150, 30);
        button_ok.setBounds(300, 70, 100, 30);
        label_prompt.setBounds(20, 120, 100, 30);
        text_result.setBounds(120, 120, 150, 30);
        button_again.setBounds(300, 120, 100, 30);
        button_clear.setBounds(150, 170, 100, 30);

        c.add(label_input);
        c.add(label_prompt);
        c.add(text_guess);
        c.add(text_result);
        c.add(button_clear);
        c.add(button_ok);
        c.add(button_start);
        c.add(button_again);

        setBounds(900, 100, 500, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("猜数游戏");
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == button_start){
            num_Random = (int)(Math.random()*100)+1;
        }
        if(e.getSource() == button_ok|e.getSource() == text_guess){
           int num_guess = Integer.parseInt(text_guess.getText());

            if(num_guess == num_Random ){
                text_result.setText("Bingo!");
            }
            else if(num_guess > num_Random){
                text_result.setText("再小一点");
            }
            else  if (num_guess < num_Random){
                text_result.setText("再大一点");
            }
        }
        if(e.getSource() == button_clear){
            text_result.setText("");
            text_guess.setText("");
        }

    }

    public static void main(String[] args) {
        new game_numGuess();

    }
}


