import java.util.Scanner;
import java.util.io*;
class Convert
{
public static void main(String[]args)
{
int arr1[]=new int[10];
Scanner s=new Scanner(System.in);
double ar[]=new double[10];
System.out.println("enter ten double values");
for (int i=0;i<=10;i++)
{
ar[i] =s.nextDouble();
}
Convert c =new Convert();
int ar1[] = new int[10];
ar1=c.double_To_Int(ar);
System.out.println("Array after conversion");
for (int i=0;i<10;i++)

{
System.out.println(ar1[i]);
}
}
public int[] double_To_Int(double ar[])
{
ar1[i]=new int[10];
for (int i=0;i<10;i++)
{
 ar1[i]=(int)(ar[i]);
}
return ar1;
}
}
