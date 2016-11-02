import java.util.Scanner;
public class LongBinary{
	public static void main(String args[]){
		System.out.println("Please input a int number");
		//Scanner scanner = new Scanner(System.in);
		Long i = new Scanner(System.in).nextLong();  //读取从键盘输入的整数并存储，以回车换行为输入结束
		String result = Long.toBinaryString(i);
		System.out.println(result);
	}
}