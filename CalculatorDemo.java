import java.awt.*;
import javax.swing.*;
public class CalculatorDemo extends JDialog {
    public void Calculator(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JPanel Panel1 = new JPanel(new FlowLayout());
        JPanel Panel2 = new JPanel(new FlowLayout());
        JPanel Panel3 = new JPanel(new FlowLayout());
        JPanel Panel4 = new JPanel(new FlowLayout());
        JPanel Panel5 = new JPanel(new FlowLayout());

        JLabel label1 = new JLabel("第一个数 ：");
        JTextField text1 = new JTextField(10);
        Panel1.add(label1);
        Panel1.add(text1);

        JLabel label2 = new JLabel("选择运算符：");
        JRadioButton radio1 = new JRadioButton("加");
        JRadioButton radio2 = new JRadioButton("减");
        JRadioButton radio3 = new JRadioButton("乘");
        JRadioButton radio4 = new JRadioButton("除");
        Panel2.add(label2);
        Panel2.add(radio1);
        Panel2.add(radio2);
        Panel2.add(radio3);
        Panel2.add(radio4);

        JLabel label3 = new JLabel("第二个数 ：");
        JTextField text2 = new JTextField(10);
        Panel3.add(label3);
        Panel3.add(text2);

        JButton button = new JButton("Action");
        Panel4.add(button);

        JLabel label5 = new JLabel("运算结果：");
        JTextField text3 = new JTextField(10);
        Panel5.add(label5);
        Panel5.add(text3);

        container.add(Panel1);
        container.add(Panel2);
        container.add(Panel3);
        container.add(Panel4);
        container.add(Panel5);


        setTitle("简易计算器框架");
        setSize(265,230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        CalculatorDemo c = new CalculatorDemo();
        c.Calculator();
    }

}
