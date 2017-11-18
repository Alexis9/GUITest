import javax.swing.JFrame;
 public class JFrameDemo {
    public static void main(String[] args){
        JFrame window1 = new JFrame();
        JFrame window2 = new JFrame("我的窗口");

        window1.setBounds(0,0,200,300);
        window2.setBounds(0,0,200,300);

        window1.setVisible(true);//设置窗口可见，默认情况下不可见
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置单机窗口关闭按钮式默认的操作位关闭窗口

        window2.setVisible(true);
        window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
