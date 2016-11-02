import java.util.Scanner;
public class IntBinary{
  public static void main(String[] args) {
    System.out.println("Please input a integer");
    int i = new Scanner(System.in).nextInt();
    String result = Integer.toBinaryString(i);
    System.out.println(result);
  }
}
