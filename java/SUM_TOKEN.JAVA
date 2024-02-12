import java.util.*;
 public class main {
 public static void main(String[] args){
 Scanner sc  = new Scanner(System.in);
 System.out.println("Ener the sequence of letter with space between the and press enter");
 String digit = sc.nextLine();
 StringTokenizer token = new StringTokenizer(digit);
 int dig=0,sum=0;
 System.out.println("Enter the digits are");
 while(token.hasMoreTokens()){
 String s =token.nextToken();
 dig = Integer.parseInt(s);
 System.out.print(dig+"");
 sum=sum+dig;
 }
 System.out.println();
 System.out.println("Sum is :"+sum);
}
 }