import javax.swing.*;
import java.awt.*;
public class DialogDemo extends JDialog{
    JTextField text;//文本框对象
    JButton button;//按钮对象
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;//4个复选框对象
    JRadioButton radio1,radio2;//2个单选按钮对象
    ButtonGroup group;//单选框按钮组对象，用作单选按钮的容器
    JComboBox comboBox;//组合框对象
    JTextArea area;//文本区对象

    public DialogDemo(){
        this.init();
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    public void init(){
        setLayout(new FlowLayout());//设置布局

        add(new JLabel("姓 名："));//给对话框添加标签对象
        text =  new JTextField(10);//创建文本框对象
        add(text);//给对话框添加文本框对象
        add(new JLabel("按钮："));
        button = new JButton("确定");//创建按钮对象
        add(button);//给对话框添加上“确定”按钮

        add(new Label("爱 好："));
        checkBox1 = new  JCheckBox("音乐");//创建复选框对象
        checkBox2 = new JCheckBox("旅游");
        checkBox3 = new JCheckBox("篮球");
        checkBox4 = new JCheckBox("游泳");
        add(checkBox1);//添加复选框对象
        add(checkBox2);
        add(checkBox3);
        add(checkBox4);

        add(new Label("性 别："));
        group = new ButtonGroup();//创建单选按钮组对象
        radio1 = new JRadioButton("男");//创建两个单选按钮对象
        radio2 = new JRadioButton("女");
        group.add(radio1);//将两个单选按钮对象添加到单选按钮组中
        group.add(radio2);
        add(radio1);//将单选按钮组添加到对话框
        add(radio2);

        add(new JLabel("下拉列表："));////给对话框添加"下拉列表"标签
        comboBox = new JComboBox();//创建组合框对象
        comboBox.addItem("音乐天地");//创建三个组合框项目对象
        comboBox.addItem("武术天地");
        comboBox.addItem("象棋乐园");
        add(comboBox);//将组合框添加到对话框

        add(new Label("文本区："));
        area = new JTextArea(6,12);//创建文本区对象
        add(new JScrollPane(area));//将文本区对象添加到对话框
    }

    public static void main(String[] args){
        DialogDemo dia = new DialogDemo();
        dia.setBounds(100,100,310,260);
        dia.setTitle("我的对话框 ");
    }
}
