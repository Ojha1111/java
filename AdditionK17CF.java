
int
class AdditionK17CF
{

int a,b,c;
public void get() 
{
AdditionK17CF obj1=new AdditionK17CF();
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
obj1.a=s.nextInt();
System.out.println("Enter another number");
obj1.b=s.nextInt();
obj1.c=obj1.a+obj1.b;
System.out.println("Sum is = "+ obj1.c);
}
public static void main(String []args)
{
AdditionK17CF obj2=new AdditionK17CF();
obj2.get();
}
}
