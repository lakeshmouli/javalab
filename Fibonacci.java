import java.util.Scanner;
class Fibonacci
{
public static void main(String[ ] input)
{
int x,y;
x=Integer.parseInt(input[0]);
y=Integer.parseInt(input[1]);
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n: ");
int n=s.nextInt( );
int z[ ]=new int[n];
z[0]=x;
z[1]=y;
for(int i=2;i<n;i++)
{
z[i]=z[i-1]+z[i-2];
}
System.out.println("Fibonacciseries");
for(int i=0;i<n;i++)
{
System.out.println(z[i]);
}
}
}