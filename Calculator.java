import java.awt.*;
import javax.swing.*;
import  java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField text1,text2,text3;
    JButton button1,button2;
    JRadioButton radio1,radio2,radio3,radio4;
    ButtonGroup group;
    JLabel label1,label2,label3;


    public Calculator() {
        this.init();
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    void init(){
        setLayout(new FlowLayout());

        label1 = new JLabel("第一个数：");
        text1 =  new JTextField(10);
        add(label1);
        add(text1);

        label2 = new JLabel("运算符：");
        group = new ButtonGroup();
        radio1 = new JRadioButton("加");
        radio2 = new JRadioButton("减");
        radio3 = new JRadioButton("乘");
        radio4 = new JRadioButton("除");
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        add(radio1);
        add(radio2);
        add(radio3);
        add(radio4);

        label3 = new JLabel("第二个数：");
        text2 =  new JTextField(10);
        add(label2);
        add(text2);

        button1 = new JButton("计算");
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("清空");
        add(button2);
        button2.addActionListener(this);

        label3 = new JLabel("结果：");
        text3 =  new JTextField(10);
        add(label3);
        add(text3);
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator(){};
        calculator.setBounds(100,100,210,200);
        calculator.setTitle("两个整数的计算器");
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(text1.getText());
        int b = Integer.parseInt(text2.getText());

        if(e.getSource() == button1){
            if(radio1.isSelected()){
                text3.setText(a+"+"+b+"="+(a+b));
            }
            else if(radio2.isSelected()){
                text3.setText(a+"-"+b+"="+(a-b));
            }
            else if(radio3.isSelected()){
                text3.setText(a+"*"+b+"="+(a*b));
            }
            else if(radio4.isSelected()){
                text3.setText(a+"/"+b+"="+(a/b));
            }
        }
        if(e.getActionCommand().equals("清空")){
            text1.setText("");
            text2.setText("");
            text3.setText("");
        }
    }


}