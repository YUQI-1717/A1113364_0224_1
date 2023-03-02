import java.util.*;

public class A1113364_0224_1 {
  public static void main (String[] argv){
   int number;

   System.out.print("請輸入任意整數");
   Scanner sc = new Scanner(System.in);
   number = sc.nextInt();

   if (number % 2 == 0){
   System.out.println(number+"為偶數");
   }else{ 
   System.out.println(number+"為奇數");
   }
  }
}  