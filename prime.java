import java.util.Scanner;
public class prime
{
public static void main(String[ ] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Starting Number :");
int start = sc.nextInt();
System.out.println("Enter Ending Number:");
int end=sc.nextInt();
System.out.println("prime number between "+start+" and "+end+"are:");
int count;
for(int i=start ;i<=end ;i++)
{
count = 0;
for(int j =1; j <= i ;j++)
{
if(i%j==0)
count=count+1;
}
if (count==2)
System.out .println(i);
}
sc.close();
}
}