import java.util.Scanner; 
public abstract class A{
   public void demo() {
     int x=10
      System.out.println("A is"+x);
   }
}

class B extends A {
   public void demo() {
   int x=20;
      System.out.println("B is"+x);
   }
}

public class Test {

   public static void main(String args[]) {
      A a = new A();   
      A b = new B();   

      a.demo();   
      b.demo();   
   }