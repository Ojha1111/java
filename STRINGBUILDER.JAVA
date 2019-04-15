import java.io.*
class indexOfdemo
{
public static void main(String args[])
{




Stringbuilding sb=new Stringbuilder();
System.out.println(sb.capacity());
 
Stringbuilding sb=new Stringbuilder(65);
System.out.println(sb.capacity());

Stringbuilding sb=new Stringbuilder("A");
System.out.println(sb.capacity());
Stringbuilding sb=new Stringbuilder('A');
System.out.println(sb.capacity());

}
}