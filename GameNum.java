import java.util.Scanner;

public class GameNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1;//产生一个0~100的随机整数
		int guess = 0;

		while(guess!=num) 
		{
			System.out.println("请输入你要猜的整数：");
			guess = sc.nextInt();
		if (guess>num)
			System.out.println("你猜的数大了");
	    else if (guess<num)
			System.out.println("你猜的数小了");
		}
		System.out.println("哇，你猜对了！");
}
}