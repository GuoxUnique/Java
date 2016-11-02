import java.util.Scanner;
public class IntBinary{
	public static void main(String args[]){
		System.out.println("Please input a int number");
		//Scanner scanner = new Scanner(System.in);
		int i = new Scanner(System.in).nextInt();  //读取从键盘输入的整数并存储，以回车换行为输入结束
		String result = Integer.toBinaryString(i);
		System.out.println(result);
	}
}