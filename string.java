class StringTest
{
public static void main(String args[])
{
String s1= new String();
s1="hello";
String s2 = new String("world");
char c[]={'d','e','a','r'};
String s3=new String(c);
String s4 =new String(c,1,2);
byte b[]={87,89,67,69,68,73,76};
String s5 =new String(b);
String s6 =new String(b,2,3);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
System.out.println(s1.length());
System.out.println(s1+s2);
System.out.println(s1.concat(s2));
System.out.println(s1.charAt(1));
char d[]=s1.toCharArray();
for(char k:d)
{
System.out.println(k+",");
}
System.out.println();
char f[]=new char[10];
s1.getChar(1,3,f,0);
for(char k:f)
{
System.out.println(k+",");
}
}
}
