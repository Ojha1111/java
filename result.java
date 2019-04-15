import java.util.Scanner;
class result
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter how many course you have studied");
n=s.nextInt();
int om[]=new int[n];
int mm[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter obtained marks in"+(i+1));
om[i]=s.nextInt();
System.out.println("Enter maximum marks in"+(i+1));
mm[i]=s.nextInt();
}
int tom=0,tmm=0;
for(int i=0;i<n;i++)
{
tom=tom+om[i];
tmm=tmm+mm[i];
}
int per=(tom*100)/tmm;
System.out.println("Your presentise is"+per);
}
}