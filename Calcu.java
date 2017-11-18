import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calcu extends JFrame implements ActionListener{
    JLabel L1,L2,L3,L4;
    JTextField j1,j2,j3,j4;
    JButton b1,b2;

    public Calcu() {
        setTitle("本窗体使用绝对布局"); // 设置该窗体的标题
        setLayout(null); // 使该窗体取消布局管理器设置
        setBounds(200, 200, 500, 500); // 绝对定位窗体的位置与大小
        Container c = getContentPane(); // 创建容器对象
        b1 = new JButton("计算"); // 创建按钮
        b2 = new JButton("清空");
        j1 = new JTextField(30);//创建文本框
        j2 = new JTextField(30);
        j3 = new JTextField(30);
        j4 = new JTextField(30);
        L1 = new JLabel("请输入一个数：");//创建提示
        L2 = new JLabel("请输入一个运算符：");
        L3 = new JLabel("请输入一个数：");
        L4 = new JLabel("结果：");
        b1.setBounds(140, 250, 80, 30); // 设置按钮的位置与大小
        b2.setBounds(260,250,80,30);
        j1.setBounds(200,50,100,30);//设置文本框的位置与大小
        j2.setBounds(200,100,100,30);
        j3.setBounds(200,150,100,30);
        j4.setBounds(200,200,100,30);
        L1.setBounds(80,50,300,30);//设置提示语句的位置
        L2.setBounds(80,100,300,30);
        L3.setBounds(80,150,300,30);
        L4.setBounds(80,200,300,30);
        c.add(b1); // 将按钮添加到容器中
        c.add(b2);
        c.add(j1);//将文本框添加到容器
        c.add(j2);
        c.add(j3);
        c.add(j4);
        c.add(L1);//将提示符添加到容器
        c.add(L2);
        c.add(L3);
        c.add(L4);
        b1.addActionListener(this);//添加监听器
        b2.addActionListener(this);
        j3.addActionListener(this);
        setVisible(true); // 使窗体可见
        // 设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calcu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int oprator1 = Integer.parseInt(j1.getText());
        int oprator2 = Integer.parseInt(j3.getText());
        if(e.getSource()==b1|e.getSource()==j3)
        {
            if(j2.getText().equals("+"))
                j4.setText(oprator1+"+"+oprator2+"="+(oprator1+oprator2));
            if(j2.getText().equals("-"))
                j4.setText(oprator1+"-"+oprator2+"="+(oprator1-oprator2));
            if(j2.getText().equals("*"))
                j4.setText(oprator1+"*"+oprator2+"="+(oprator1*oprator2));
            if(j2.getText().equals("/"))
                j4.setText(oprator1+"/"+oprator2+"="+(oprator1/oprator2));
        }

        if(e.getActionCommand().equals("清空"))
        {
            j1.setText("");
            j2.setText("");
            j3.setText("");
            j4.setText("");
        }
    }

}
