abstract class Shape {
 abstract void numberOfSides(); 
}
 class Rectangle extends Shape{
 void numberOfSides(){
 System.out.println("Number of Side of Rectangle is : 4");
 }
 }
 class Triangle extends Shape{
 void numberOfSides(){
 }
 }
 System.out.println("Number of Side is : 3");
 class Hexagon extends Shape{
 void numberOfSides(){
 System.out.println("Number of Side of Hexagon is : 6");       
} 
}
 public class Shapedemo{
 public static void main (String[] args){
 Rectangle s1 = new Rectangle();
 s1.numberOfSides();
 Triangle s2 = new Triangle();
 s2.numberOfSides();
 Hexagon s3 = new Hexagon();
 s3.numberOfSides();
 }
 }