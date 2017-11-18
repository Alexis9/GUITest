import java.util.Scanner;
public class CalculatorAlgorthm {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("请输入运算符：");
        String operato = s.nextLine();

        System.out.printf("a=");
        int a = s.nextInt();

        System.out.printf("b=");
        int b = s.nextInt();

        switch(operato) {
            case "+":
                System.out.println(a + operato + b +"=" +(a+b));
                break;
            case "-":
                System.out.println(a + operato + b +"=" +(a-b));
                break;
            case "*":
                System.out.println(a + operato + b +"=" +(a*b));
                break;
            case "/":
                System.out.println(a + operato + b +"=" +(a/b));
                break;
            default:
                System.out.println("无法识别该命令");
        }
    }
}
