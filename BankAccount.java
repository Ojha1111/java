import java.util.Scanner;
class BankAccount
{
int balance;
public void deposit(int amt)
{
this.balance=this.balance+amt;
}
public int withdraw()
{
System.out.println("How much amt you want");
Scanner s=new Scanner(System.in);
int x=s.nextInt();
this.balance=this.balance-x;
return this.balance;
}
}
class TestBankAccount
{
public static void main(String args[])
{
BankAccount b=new BankAccount();
b.deposit(5000);
System.out.println("Account balance is"+b.balance);
b.deposit(3000);
System.out.println("Account balance is"+b.balance);
int bal=b.withdraw();
System.out.println("Account balance is"+bal);
}
}