import java.util.Scanner;
class Fibwithrec
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=s.nextInt();
System.out.println("Fibonacci series using recursion");
Fiboni f1=new Fiboni();
for(int i=0;i<n;i++)
System.out.println(f1.fibon(i));
}
}
class Fiboni
{
public int fibon(int n)
{
if (n==0 || n==1)
return 1;
else
return fibon(n-1)+fibon(n-2);
}
}