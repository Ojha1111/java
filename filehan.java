import java.io.*;
class TestFile
{
public static void main(String args[]) throws IOException
{
File f=new File("C:\\Users\\bholebaba\\Desktop\\intelij idea\\java");
if(f.createNewFile())
{
System.out.println("file exist");

}else
{
System.out.println("file already exist");
}

}

}