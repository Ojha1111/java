import java.io.*;
import java.util.*;

class MyclassK17CF
{

public static void main(String args[])throws IOException
{
//File f=new File("C:\\Users\\bholebaba\\Desktop\\ravi.txt");
//boolean x=f.createNewFile();
File f2=new File("C:\\Users\\bholebaba\\Desktop\\shivai.txt");
//boolean y= f.renameTo(f2);
//PrintWriter p =new PrintWriter(f2);
//p.print("My name is shivani.I do  not know abour my age");
//p.close();
Scanner s= new Scanner(f2);
while(s.hasNext())
System.out.println(s.nextLine());
s.close();

}
}