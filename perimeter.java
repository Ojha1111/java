import java.util.Scanner;
class Triangle
{
public static void main(String[]args)
{
  try
    {
      double x,y,z,t,s,m;
      Scanner s=new Scanner(System.in);
      x=s.nextInt();
      y=s.nextInt();
      z=s.nextInt();
      if(x+y > z)
      {
      t =x+y+z;
      System.out.println("the perimeter of the triangle s"+t);
      }
      else if(y+z > x)
      {
      s =x+y+z;
      System.out.println("the perimeter of the triangle s"+s);

      }
      else if(z+x > y)
      {

      m =x+y+z;
      System.out.println("the perimeter of the triangle s"+m);
      }
} 
catch(Exception e)
   {
    System.out.println("Sorry please cheack your side");
  }
throw(InvalidintegerException )
{
 System.out.println("Sorry please input a valid key");
}
}