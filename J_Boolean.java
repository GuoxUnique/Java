public class J_Boolean{
  public static void main(String[] args) {
    int month = 8;
    int day = 1;
    if ((month == 8) || (++day<15))  //条件类遵循“短路规则”
      System.out.println("Month=" + month + ",Day=" + day);
    if ((month==8) | (++day<15))     //逻辑类不遵循“短路规则”
      System.out.println("Month=" + month + ",Day=" + day);
  }
}
