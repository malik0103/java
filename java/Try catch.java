import java.util.*;
 public class ThrowsDemo {
 public int division(int a, int b) throws ArithmeticException{
 int rs;
 rs=a/b;
 return (rs);
 }
 public static void main(String[] args){
 ThrowsDemo T = new ThrowsDemo();
 int rs = 0;
 Scanner Input  = new Scanner(System.in);
 System.out.println("Enter the first number");
 int a = Input.nextInt();
 System.out.println("Enter the second number");
 int b = Input.nextInt();
 try{
 rs =T.division(a,b);
 }
 catch(ArithmeticException Ex){
 System.out.println("\n\t ERROR:"+Ex.getMessage());
 }
 finally{
 System.out.println("Result : "+rs);
 }
 }
}